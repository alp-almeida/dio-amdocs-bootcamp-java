package com.amdocs.dio;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import java.util.List;

import static org.junit.Assert.*;

public class FizzBuzzStepDef {
    private int number;
    private String answer;
    private int lenght;
    private List<String> out;

    @Given("the user selected the number {int}")
    public void selectNumber(int number){
        this.number = number;
    }

    @When("the user clicked the FizzBuzz button")
    public void FizzBuzz(){
        answer = FizzBuzz.render(number);
    }

    @Then("the program prints {word}")
    public void checkAnswer(String expected){
        assertEquals(expected,answer);
    }

}
