package com.orangehrm.runners;

import org.junit.runner.RunWith;

import com.orangehrm.utils.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/SauceDemo.feature",
glue={"com/orangehrm/steps"},monochrome=true)
	

public class SauceDemoRunner {


}
