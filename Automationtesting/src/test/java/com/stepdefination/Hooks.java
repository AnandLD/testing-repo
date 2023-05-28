package com.stepdefination;

import io.cucumber.java.AfterStep;
import org.junit.After;
import org.junit.Before;

public class Hooks {

    @Before
    public void precondition(){

        System.out.println("Execution started");

    }

    @After
    public void postcondition(){

        System.out.println("Execution ended");
    }

    @AfterStep
    public void step(){


    }

}
