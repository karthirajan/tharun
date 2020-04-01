package com.centric.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.centric.objectrepository.ConfigurationPage;
import com.centric.objectrepository.HomePage;
import com.centric.objectrepository.PopupPage;
import com.centric.resources.Commonactions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomePageSteps extends Commonactions {
	
	Commonactions ca=new Commonactions();
	HomePage hp=new HomePage();
	
	@Given("User selects language {string}")
	public void user_selects_language(String a) throws Throwable {
		Commonactions.jsWaitForPageLoad(); 
		driver.findElement(By.xpath("//span[contains(@data-csi-automation,'PageUser')]")).isDisplayed();
				Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[contains(@data-csi-automation,'PageUser')]")).click();
	   SelectLanguage(a); 
	 //  ca.screenCapture("C:\\Users\\yuvar\\eclipse-workspace\\Centric\\target\\screenshots");
	}
	

    public static void SelectLanguage(String Language) throws InterruptedException {
              for (int i = 0; i < 250; i++) {
           WebElement dr = driver.findElement(By.xpath("(//td[@class='csiHeadingColumn']//td[contains(@data-csi-heading,'')])[9]"));
           Thread.sleep(100);          
           dr.click();
                Actions a = new Actions(driver);
              for (int j = 0; j <= i; j++) {
            	  Thread.sleep(100);
             a.sendKeys(Keys.DOWN).build().perform();
            // Thread.sleep(300);
                         }

                a.sendKeys(Keys.TAB).build().perform();
             //   Thread.sleep(300);
            if (dr.getText().equalsIgnoreCase(Language)) {
                    break;
                      }
                  Thread.sleep(500);
                     }
               System.out.println(Language + "Language selected");
                   Thread.sleep(500);
                 driver.findElement(By.xpath("//span[contains(text(),'Defaults')]")).click();
               Thread.sleep(500);
              driver.findElement(By.xpath("//span[contains(text(),'User Profile')]")).click();
             Thread.sleep(500);
                   driver.navigate().refresh();
                   Thread.sleep(300);
}
	
	@Given("Click style tab and get the listed season name in the style tab")
	public void click_style_tab_and_get_the_listed_season_name_in_the_style_tab() throws Throwable {
		Commonactions.jsWaitForPageLoad(); 
	    ca.click(hp.getStyleBtn());   
	}

	
	@Then("Go to homepage")
	public void go_to_homepage() throws Throwable {
		ca.jsWaitForPageLoad();
	     ca.click(hp.getUser_homeBtn()); 
	      
	}
	
ConfigurationPage cp = new ConfigurationPage();
PopupPage pp = new PopupPage();
	
	@Given("User Click on setup icon")
	public void user_Click_on_setup_icon() throws Throwable {
		Commonactions.jsWaitForPageLoad();
		Thread.sleep(3000);
		ca.jsWaitForPageLoad();
		try{
			Commonactions.jsWaitForPageLoad();
		ca.click(hp.getUser_setupBtn());
		}catch(Exception e){
			e.printStackTrace();
		}
		
		Thread.sleep(2000);
		ca.click(cp.getUser_config());
		Commonactions.jsWaitForPageLoad();
		ca.eleToBeClickable();
		ca.click(cp.getUser_TypeConfig());
		ca.jsWaitForPageLoad();
		
	}
	
	@Then("User click on update cnfiguration")
	public void user_click_on_update_cnfiguration() throws Throwable {
	    
		ca.click(hp.getUser_settingsBtn());
		ca.click(hp.getUpdate_config());
		ca.click(pp.getUpdate_fullUpdateConfiguration());
		ca.click(pp.getUpdate_Run_Btn());
	}
}
