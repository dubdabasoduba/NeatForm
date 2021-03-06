package com.nerdstone.neatformcore.views.containers

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.LinearLayout
import com.nerdstone.neatformcore.domain.data.DataActionListener
import com.nerdstone.neatformcore.domain.model.NFormViewData
import com.nerdstone.neatformcore.domain.model.NFormViewDetails
import com.nerdstone.neatformcore.domain.model.NFormViewProperty
import com.nerdstone.neatformcore.domain.view.NFormView
import com.nerdstone.neatformcore.domain.view.RootView
import com.nerdstone.neatformcore.domain.view.RulesHandler
import com.nerdstone.neatformcore.utils.ViewUtils
import com.nerdstone.neatformcore.views.builders.MultiChoiceCheckBoxViewBuilder
import com.nerdstone.neatformcore.views.handlers.ViewDispatcher

class MultiChoiceCheckBox : LinearLayout, NFormView {

    override lateinit var viewProperties: NFormViewProperty
    override var dataActionListener: DataActionListener? = null
    override val viewBuilder = MultiChoiceCheckBoxViewBuilder(this)
    override val viewDetails = NFormViewDetails(this)
    override val viewData get() = NFormViewData()
    override val nFormRootView get() = this.parent as RootView

    init {
        orientation = VERTICAL
    }

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)

    override fun initView(
        viewProperty: NFormViewProperty,
        viewDispatcher: ViewDispatcher
    ): NFormView {
        ViewUtils.setupView(this, viewProperty, viewDispatcher)
        return this
    }

    override fun setOnDataPassListener(dataActionListener: DataActionListener) {
        if (this.dataActionListener == null) this.dataActionListener = dataActionListener
    }

    override fun mapViewIdToName(rulesHandler: RulesHandler) {
        id = View.generateViewId()
        rulesHandler.viewIdsMap[this.viewProperties.name] = id
    }

    override fun setVisibility(visibility: Int) {
        super.setVisibility(visibility)
        resetValueWhenHidden()
    }

    override fun resetValueWhenHidden() {
        if (visibility == View.GONE) {
            viewBuilder.resetCheckBoxValues()
        }
    }
}