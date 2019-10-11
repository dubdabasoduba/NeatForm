package com.nerdstone.neatformcore.robolectric.utils

object TestConstants {
    private const val SAMPLE_DIR = "sample/"
    const val SAMPLE_ONE_FORM_FILE = SAMPLE_DIR + "sample_one_form.json"
    const val SAMPLE_JSON =
        """
        {
          "form": "Profile",
          "is_multi_step": true,
          "rules_file": "rules/yml/sample_one_form_rules.yml",
          "count": 1,
          "steps": [
            {
              "title": "Test and counselling",
              "step_number": 1,
              "fields": [
                {
                  "name": "adult",
                  "type": "edit_text",
                  "properties": {
                    "hint": "This is an adult",
                    "type": "name",
                    "text": "Catch me if you can"
                  },
                  "meta_data": {
                    "openmrs_entity": "",
                    "openmrs_entity_id": "",
                    "openmrs_entity_parent": ""
                  },
                  "validation": "length() < 8; !contains(@)",
                  "subjects": "age:number, child:text",
                  "required_status": "True:please add username"
                },
                {
                  "name": "age",
                  "type": "edit_text",
                  "properties": {
                    "hint": "Enter your age (will be multiplied by 10)",
                    "type": "name",
                    "padding": "8"
                  },
                  "meta_data": {
                    "openmrs_entity": "",
                    "openmrs_entity_id": "",
                    "openmrs_entity_parent": ""
                  },
                  "required_status": "yes:Please add age"
                },
                {
                  "name": "child",
                  "type": "edit_text",
                  "properties": {
                    "hint": "I am a child",
                    "type": "name"
                  },
                  "meta_data": {
                    "openmrs_entity": "",
                    "openmrs_entity_id": "",
                    "openmrs_entity_parent": ""
                  },
                  "required_status": "yes:Please add age",
                  "subjects": "age:number, adult:text, email_subscription:map"
                },
                {
                  "name": "email_subscription",
                  "type": "checkbox",
                  "properties": {
                    "text": "Subscribe to email notifications"
                  },
                  "required_status": "yes:Please specify if you want subscription",
                  "subjects": "age:number"
                },
                {
                  "name": "gender",
                  "type": "spinner",
                  "properties": {
                    "text": "Choose your gender"
                  },
                  "options": [
                    {
                      "name": "none",
                      "text": "Select gender"
                    },
                    {
                      "name": "female",
                      "text": "Female",
                      "meta_data": {
                        "openmrs_entity": "",
                        "openmrs_entity_id": "A123390123123",
                        "openmrs_entity_parent": ""
                      }
                    },
                    {
                      "name": "male",
                      "text": "Male",
                      "meta_data": {
                        "openmrs_entity": "",
                        "openmrs_entity_id": "S8918313",
                        "openmrs_entity_parent": ""
                      }
                    }
                  ],
                  "subjects": "email_subscription:map",
                  "required_status": "yes:Please specify your gender"
                },
                {
                  "name": "choose_language",
                  "type": "multi_choice_checkbox",
                  "properties": {
                    "text": "Pick the languages you are proficient in."
                  },
                  "options": [
                    {
                      "name": "eng",
                      "text": "English",
                      "meta_data": {
                        "openmrs_entity": "",
                        "openmrs_entity_id": "A123123123123",
                        "openmrs_entity_parent": ""
                      }
                    },
                    {
                      "name": "french",
                      "text": "French",
                      "meta_data": {
                        "openmrs_entity": "",
                        "openmrs_entity_id": "A123123123123",
                        "openmrs_entity_parent": ""
                      }
                    },
                    {
                      "name": "kisw",
                      "text": "Kiswahili",
                      "meta_data": {
                        "openmrs_entity": "",
                        "openmrs_entity_id": "A123123123123",
                        "openmrs_entity_parent": ""
                      }
                    },
                    {
                      "name": "need_help",
                      "text": "Help me choose",
                      "is_exclusive": true,
                      "meta_data": {
                        "openmrs_entity": "",
                        "openmrs_entity_id": "A918928912",
                        "openmrs_entity_parent": ""
                      }
                    },
                    {
                      "name": "none",
                      "text": "None of the above",
                      "is_exclusive": true,
                      "meta_data": {
                        "openmrs_entity": "",
                        "openmrs_entity_id": "A123123123123",
                        "openmrs_entity_parent": ""
                      }
                    }
                  ],
                  "required_status": "yes:Please specify your languages",
                  "subjects": "email_subscription:map, gender:text"
                },
                {
                  "name": "language_none",
                  "type": "edit_text",
                  "properties": {
                    "hint": "Specify your language",
                    "type": "name"
                  },
                  "meta_data": {
                    "openmrs_entity": "",
                    "openmrs_entity_id": "",
                    "openmrs_entity_parent": ""
                  },
                  "required_status": "true:Please specify language",
                  "subjects": "choose_language:map"
                },
                {
                  "name": "wiki_contribution",
                  "type": "radio_group",
                  "properties": {
                    "text": "Have you ever contributed to or written a page in the Wiki?"
                  },
                  "options": [
                    {
                      "name": "yes",
                      "text": "Yes"
                    },
                    {
                      "name": "no",
                      "text": "No"
                    },
                    {
                      "name": "dont_know",
                      "text": "Don't know"
                    }
                  ],
                  "required_status": "yes:Wiki contribution field is required.",
                  "subjects": "email_subscription:map, gender:text"
                },
                {
                  "name": "wiki_contribution_yes",
                  "type": "edit_text",
                  "properties": {
                    "hint": "What was your contribution?",
                    "type": "name"
                  },
                  "required_status": "true:Please specify your contributions",
                  "subjects": "wiki_contribution:map"
                }
              ]
            }
          ]
        }
    """
}
