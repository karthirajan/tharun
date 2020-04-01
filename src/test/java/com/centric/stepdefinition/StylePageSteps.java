package com.centric.stepdefinition;

import com.centric.objectrepository.HomePage;
import com.centric.objectrepository.PopupPage;
import com.centric.objectrepository.StylePage;
import com.centric.resources.Commonactions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StylePageSteps {

	Commonactions ca=new Commonactions();
	StylePage sp=new StylePage();
	PopupPage pup=new PopupPage();

	@When("User create New season with mandatory deatails for season creation {string},{string},{string}")
	public void user_create_New_season_with_mandatory_deatails_for_season_creation(String a,String b, String c) throws InterruptedException {
		Thread.sleep(2000);
		ca.click(sp.getNew_season_Btn());
		ca.insertText(pup.getSeason_Value(), a);
		ca.insertText(pup.getCode_Value(), b);
		ca.insertText(pup.getDescription_Value(), c);
		ca.click(pup.getSave_and_go_Btn());
		Thread.sleep(2000);

	}

	@Then("Click New Brand")
	public void click_New_Brand() throws Throwable 
	{
		Thread.sleep(2000);
		ca.jsScrollPageDown(sp.getNew_season_Btn());
		ca.click(sp.getNew_season_Btn());
		Thread.sleep(1000);
	}

	@And("Create Brand by providing valid and mandatory data {string},{string},{string}")
	public void create_Brand_by_providing_valid_and_mandatory_data(String a,String b, String c) throws Throwable {
		Thread.sleep(2000);
		ca.insertText(pup.getBrand_Value(), a);
		ca.insertText(pup.getBrand_code_Value(), b);
		ca.insertText(pup.getBrand_description_Value(), c);
	}

	@Then("Save the New Brand which was created")
	public void save_the_New_Brand_which_was_created() throws InterruptedException {
		Thread.sleep(2000);
		ca.click(pup.getSave_and_go_Btn());  
		Thread.sleep(2000);
	}

	@Then("Click New department by providing valid data  {string},{string},{string}")
	public void click_New_department_by_providing_valid_data(String a,String b, String c) throws Throwable {
		Thread.sleep(2000);
		ca.jsScrollPageDown(sp.getNew_season_Btn());
		ca.click(sp.getNew_season_Btn());
		Thread.sleep(2000);
		ca.insertText(pup.getBrand_Value(), a);
		ca.insertText(pup.getBrand_code_Value(), b);
		ca.insertText(pup.getBrand_description_Value(), c);
	}

	@Then("Save the New department which was created")
	public void save_the_New_department_which_was_created() throws InterruptedException {
		Thread.sleep(2000);
		ca.click(pup.getSave_and_go_Btn());  
		Thread.sleep(2000);
	}

	@Then("Click New collection")
	public void click_New_collection() throws Throwable {
		ca.jsScrollPageDown(sp.getNew_season_Btn());
		ca.click(sp.getNew_season_Btn());
		Thread.sleep(2000);
	}

	@Then("Create collection by providing valida and mandatory details {string},{string},{string}")
	public void create_collection_by_providing_valida_and_mandatory_details(String a,String b, String c) throws InterruptedException {
		Thread.sleep(2000);
		ca.insertText(pup.getBrand_Value(), a);
		ca.insertText(pup.getBrand_code_Value(), b);
		ca.insertText(pup.getBrand_description_Value(), c);

	}

	@Then("Save the collection which was created")
	public void save_the_collection_which_was_created() throws InterruptedException {
		ca.click(pup.getSave_and_go_Btn()); 
		Thread.sleep(2000);
	}

	@Then("Click New style")
	public void click_New_style() throws Throwable {
		ca.jsScrollPageDown(sp.getNew_season_Btn());
		ca.click(sp.getNew_season_Btn());
		Thread.sleep(2000);

	}
	
	@Then("Create Style followed by its style Type {string}")
	public void create_Style_followed_by_its_style_Type(String a) throws InterruptedException {
		Thread.sleep(2000);
		ca.insertText(pup.getStyle_type_Value(), a);
		//ca.insertText(pup.getTemplate_Value(), "apparel");
		//ca.insertText(pup.getShape_Value(), "ssgd");
		//ca.insertText(pup.getTheme_code_Value(),"sgfg");
		//ca.insertText(pup.getSstyle_Value(), "fhgvahvmZXV");
	
			ca.click(pup.getSave_and_go_Btn());	
			Thread.sleep(3000);
		
	      
	      
	}
	HomePage hp=new HomePage();

	@Then("select the image from the avilable resource")
	public void select_the_image_from_the_avilable_resource() throws Throwable {
		try {
		ca.click(sp.getImg_icon());
		}catch(Exception e) {
			ca.click(hp.getStyleBtn());
			
				ca.jsScrollPageDown(sp.getUpload_Btn());
			ca.click(sp.getImg_icon());
		
		}
		    ca.click(sp.getUpload_Btn());
		
		ca.click(sp.getSelect_img_Btn());
		ca.click(sp.getSave_img_Btn());
		Thread.sleep(4000);
	      
	      
	}




}
