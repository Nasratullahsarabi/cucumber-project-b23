package org.cydeo.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
                  glue = "org/cydeo/step_definations"
                 ,features = "@target/rerun.txt"
                  )
public class FailedTestRunner {
}
