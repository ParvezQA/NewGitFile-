package com.ebay.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class My_GoogleSearch {
	WebDriver driver;
	
	@Given("I am on  google homepage")
	public void i_am_on_google_homepage() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	   
	}

	@When("I enter search {string}")
	public void i_enter_search(String string) {
		WebElement searchBox;
		searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys(string);
	  
	}

	@Then("I click search button")
	public void i_click_search_button() {
		WebElement searchBtn;
		 searchBtn= driver.findElement(By.name("btnK"));
		 searchBtn.click();
	    
	}

	@Then("I receive search result")
	public void i_receive_search_result() {
	  
	}


}
