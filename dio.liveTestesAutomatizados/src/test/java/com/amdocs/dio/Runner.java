package com.amdocs.dio;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","html:target/cucumber.html"},
        features = "src/test/resources/com.amdocs.dio/FizzBuzz.feature"
)
public class Runner {

}
