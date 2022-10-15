package com.sddevops.selenium2_maven.eclipse;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class JulieTest {
	private WebDriver webDriver;	
  @Test
//  public void f() {
//  }
  
  public void findByName() {
	  //Load republic poly website as a new page
	  webDriver.navigate().to("https://www.rp.edu.sg/");
	  
	  //Assert the title to check that we are indeed in the correct website
//	  Assert.assertEquals(webDriver.get(string), "Home");
	  //String Text = webDriver.findElement(By.name("keywords")).getText();
	  String Text = webDriver.findElement(By.name("keywords")).getAttribute("content");
	  //Assert.assertEquals(webDriver.findElement(By.name("keywords")).getAttribute(),"keywords");
	  Assert.assertEquals(webDriver.findElement(By.name("keywords")).getAttribute("content"),"Republic Polytechnic, Republic Poly, RP, Problem-based Learning, Discover, Transform, Achieve, Internships, International, Applied Science, Engineering, Hospitality, Infocomm, Sports, Health and Leisure, Technology for the Arts, Management and Communication");
	  
	  
	  //System.out.println("title: "+webDriver.getText());
	  System.out.println("title: "+Text);
	  
	  //Retrieve explore now button using it's class name and click on it
//	  webDriver.findElement(By.className("green-btn")).click();

	  //Assert the new title to check that the title contain RP360 and the button had successfully bring us to the new page
	  Assert.assertTrue(Text.contains("Republic Polytechnic"));
//	  System.out.println("new title: "+webDriver.getAttribute());
	  System.out.println("Hello:"+Text);

  }
  @Test
  
  public void findById() {
	  //Load republic poly website as a new page
	  webDriver.navigate().to("https://www.rp.edu.sg/");
	  
	  //Assert the title to check that we are indeed in the correct website
//	  Assert.assertEquals(webDriver.get(string), "Home");
	  String Text = webDriver.findElement(By.id("content")).getAttribute("role");
	  Assert.assertEquals(webDriver.findElement(By.id("content")).getAttribute("role"),"toolbar");
	  
	  
	  //System.out.println("title: "+webDriver.getText());
	  System.out.println("Role: "+Text);
	  
	  //Retrieve explore now button using it's class name and click on it
//	  webDriver.findElement(By.className("green-btn")).click();

	  //Assert the new title to check that the title contain RP360 and the button had successfully bring us to the new page
//	  Assert.assertTrue(webDriver.getTitle().contains("toolbar"));
	  Assert.assertTrue(Text.contains("toolbar"));
//	  System.out.println("new title: "+webDriver.getTitle());
	  System.out.println("Hellooo:"+Text);

  }
  

  
@Test

  public void findByClassName() {

	  webDriver.navigate().to("https://www.rp.edu.sg/");
	  

	  List<WebElement> allChoices = webDriver.findElements(By.className("hover"));
	  
	  allChoices.size();
	  
	  Assert.assertEquals(allChoices.size(),20);
	  
	  System.out.println("All Choices:" + allChoices.size());


  }
  
  
  
  @BeforeTest
  public void beforeTest() {
	  //System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\chromedriver.exe");
	  System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Admin1\\\\Desktop\\\\chrome driver version 106\\\\chromedriver.exe");
	  webDriver = new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
	  webDriver.quit();	
  }

}
