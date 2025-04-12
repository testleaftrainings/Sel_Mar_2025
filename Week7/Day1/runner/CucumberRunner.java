package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import stepdefinition.BaseClass;

@CucumberOptions(features={"src/test/java/feature"},

glue={"stepdefinition"},
publish=true,tags="@sanity")



public class CucumberRunner extends BaseClass{

}
