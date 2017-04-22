package com.example.jhipster.cucumber.stepdefs;

import com.example.jhipster.Microservice2App;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = Microservice2App.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
