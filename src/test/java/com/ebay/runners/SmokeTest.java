package com.ebay.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features= "Features" ,
		
		glue= "com.ebay.steps"
		
		
		
		
		
		)





public class SmokeTest  extends AbstractTestNGCucumberTests{

}
