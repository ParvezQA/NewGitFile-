package com.ebay.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EbaySearch {
	WebDriver driver;
	@Given("I am on ebay homepage")
	public void i_am_on_ebay_homepage() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	}

	@When("I enter the search {string}")
	public void i_enter_the_search(String string) {
		WebElement searchBox;
		searchBox = driver.findElement(By.id("gh-ac"));
		searchBox.sendKeys(string);
		
	   

	}

	@Then("I click on ebay search button")
	public void i_click_on_ebay_search_button() {
		WebElement searchBtn;
		 searchBtn= driver.findElement(By.id("gh-btn"));
		 searchBtn.click();
	   
	}

	@Then("I receive related search result")
	public void i_receive_related_search_result() {
		WebElement searchRslt;
		searchRslt= driver.findElement(By.xpath("//h1[@class='srp-controls__count-heading']"));
		String result=searchRslt.getText();
		System.out.println("**************");
		System.out.println(result);
		
		
		System.out.println("****************");
		driver.quit();
	   
	}



}
