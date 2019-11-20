package com.nerdstone.neatformcore.robolectric.utils

import android.support.v7.widget.AppCompatEditText
import com.nerdstone.neatformcore.TestNeatFormApp
import com.nerdstone.neatformcore.utils.ViewUtils
import io.mockk.mockkObject
import io.mockk.spyk
import io.mockk.unmockkAll
import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.RuntimeEnvironment
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(application = TestNeatFormApp::class)
class `Test View Utils with Robolectric` {

    @Before
    fun `Before doing anything else`() {
        mockkObject(ViewUtils)
    }


    @Test
    fun `Should append red asterisk at the end of EditText hint`() {
        val mockEditText =
            spyk(AppCompatEditText(RuntimeEnvironment.systemContext), recordPrivateCalls = false)
        mockEditText.hint = "Am a required hint"
        val originalHintLength = mockEditText.hint.toString().length
        mockEditText.hint = ViewUtils.addRedAsteriskSuffix(mockEditText.hint.toString())
        val finalHintLength = mockEditText.hint.toString().length
        Assert.assertEquals(originalHintLength + 2, finalHintLength)
        Assert.assertTrue(mockEditText.hint.toString().endsWith("*"))
    }

    @After
    fun `After everything else`() {
        unmockkAll()
    }
}