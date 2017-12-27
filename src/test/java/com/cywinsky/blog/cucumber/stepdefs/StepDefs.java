package com.cywinsky.blog.cucumber.stepdefs;

import com.cywinsky.blog.WeirdologApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = WeirdologApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
