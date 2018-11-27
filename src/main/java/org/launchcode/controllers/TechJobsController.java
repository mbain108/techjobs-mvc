package org.launchcode.controllers;

import java.util.HashMap;
import org.springframework.web.bind.annotation.ModelAttribute;

public class TechJobsController {

    static HashMap<String, String> actionChoices = new java.util.HashMap<>();

    public TechJobsController() {

        actionChoices.put("search", "Search");
        actionChoices.put("list", "List");
    }

    @ModelAttribute("actions")
    public static HashMap<String, String>getActionChoices() {

        return actionChoices;
    }
}