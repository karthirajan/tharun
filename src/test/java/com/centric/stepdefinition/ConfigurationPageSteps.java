package com.centric.stepdefinition;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.centric.objectrepository.ConfigurationPage;
import com.centric.objectrepository.PopupPage;
import com.centric.resources.Commonactions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ConfigurationPageSteps extends Commonactions {
	
	Commonactions ca=new Commonactions();
	ConfigurationPage cp=new ConfigurationPage();
	PopupPage pp=new PopupPage();
	static String style1,style2,style3,style4=null;
	
	@When("User creates style type {string},{string},{string},{string}")
	public void user_creates_style_type(String A, String B, String C, String D) throws Throwable {
		style1=A;
		style2=B;
		style3=C;
		style4=D;
		ca.eleToBeClickable();
		ca.click(cp.getStyle_Types());
		Commonactions.jsWaitForPageLoad();
		Thread.sleep(1000);
	//	ca.click(driver.findElement(By.xpath("(//span[contains(@class,'fullScreen')])[3]")));
          colourAndSize(A);
          onlyColours(B);
          onlySize(C);
          noDatas(D);
          
  		System.out.println("style type created successfully");
  		System.out.println("checkbox clicked successfully");
	//	ca.click(driver.findElement(By.xpath("//span[@title='Exit Full Screen']")));
		
	}
	
	@When("User fill the style type attributes fields")
	public void user_fill_the_style_type_attributes_fields() throws Throwable {
		Thread.sleep(1000);
		ca.click(cp.getStyle_Type_DataSheets());
		Thread.sleep(1000);
		try{
		ca.click(cp.getStyle_Type_DataSheets_RefreshBtn());
		}catch(Exception e){
			
		}
		Thread.sleep(1000);
		//ca.click(driver.findElement(By.xpath("(//span[contains(@class,'fullScreen')])[3]")));
		List<WebElement> nRows = driver.findElements(By.xpath("((//div[contains(@class,'TDS')])/div[@class='csiDialogScroll']//table)//tr[@data-csi-act='ViewSelect']"));
		int i = nRows.size();
		for (int j = 1; j <=i; j++) {
			Thread.sleep(1000);
			WebElement text = driver.findElement(By.xpath("((((//div[contains(@class,'TDS')])/div[@class='csiDialogScroll']//table)//tr[@data-csi-act='ViewSelect'])["+j+"]/td)[1]"));
			//String s = String.valueOf(j);
			//style=null;
			String text2 = text.getText();
			System.out.println("text is :"+text2);
			
			if(text2.equals(style1)){
			for (int j2 = 1; j2 <= 12; j2++) {
				if(j2<=5){
			    Thread.sleep(1000);
				ca.clickjs(driver.findElement(By.xpath("(//tr["+j+"]//div[@data-csi-act='TDSMap:Child:Config:0']/input[@tabindex='0'])["+j2+"]")));
				//ca.eleToBeClickable(cp.getStyle_Colour());
				}else{
					Thread.sleep(1000);
					ca.clickjs(driver.findElement(By.xpath("(//span[text()='+']/parent::div)[3]")));
					Thread.sleep(1000);
					ca.clickjs(driver.findElement(By.xpath("(//tr["+j+"]//div[@data-csi-act='TDSMap:Child:Config:0']/input[@tabindex='0'])["+j2+"]")));
				
				}
			}
			for(int k=0; k < 8; k++){
				ca.clickjs(driver.findElement(By.xpath("(//span[text()='-']/parent::div)[3]")));
			}
			}else if(text2.equals(style2)){
				for (int j2 = 1; j2 <= 12; j2++) {

					if(j2<=5){
						Thread.sleep(1000);
					ca.clickjs(driver.findElement(By.xpath("(//tr["+j+"]//div[@data-csi-act='TDSMap:Child:Config:0']/input[@tabindex='0'])["+j2+"]")));
					//ca.eleToBeclickjsable(cp.getStyle_Colour());
					}else{
						Thread.sleep(1000);
						ca.clickjs(driver.findElement(By.xpath("(//span[text()='+']/parent::div)[3]")));
						Thread.sleep(1000);
						ca.clickjs(driver.findElement(By.xpath("(//tr["+j+"]//div[@data-csi-act='TDSMap:Child:Config:0']/input[@tabindex='0'])["+j2+"]")));
						
					}
				
				}for(int k=0; k < 8; k++){
					ca.clickjs(driver.findElement(By.xpath("(//span[text()='-']/parent::div)[3]")));
				}
				}else if(text2.equals(style3)){
					for (int j2 = 1; j2 <= 12; j2++) {

						if(j2<=5){
						Thread.sleep(1000);
						ca.clickjs(driver.findElement(By.xpath("(//tr["+j+"]//div[@data-csi-act='TDSMap:Child:Config:0']/input[@tabindex='0'])["+j2+"]")));
						//ca.eleToBeclickjsable(cp.getStyle_Colour());
						}else{
							Thread.sleep(1000);
							ca.clickjs(driver.findElement(By.xpath("(//span[text()='+']/parent::div)[3]")));
							Thread.sleep(1000);
							ca.clickjs(driver.findElement(By.xpath("(//tr["+j+"]//div[@data-csi-act='TDSMap:Child:Config:0']/input[@tabindex='0'])["+j2+"]")));
						}
					
					}
					for(int k=0; k < 8; k++){
						ca.clickjs(driver.findElement(By.xpath("(//span[text()='-']/parent::div)[3]")));
					}
					}else if(text2.equals(style4)){
						for (int j2 = 1; j2 <= 12; j2++) {

							if(j2<=5){
								Thread.sleep(1000);
							ca.clickjs(driver.findElement(By.xpath("(//tr["+j+"]//div[@data-csi-act='TDSMap:Child:Config:0']/input[@tabindex='0'])["+j2+"]")));
							//ca.eleToBeclickjsable(cp.getStyle_Colour());
							}else{
								Thread.sleep(1000);
								ca.clickjs(driver.findElement(By.xpath("(//span[text()='+']/parent::div)[3]")));
								Thread.sleep(1000);
								ca.clickjs(driver.findElement(By.xpath("(//tr["+j+"]//div[@data-csi-act='TDSMap:Child:Config:0']/input[@tabindex='0'])["+j2+"]")));
							}
						
						}
						for(int k=0; k < 8; k++){
							ca.clickjs(driver.findElement(By.xpath("(//span[text()='-']/parent::div)[3]")));
						}
						}else{
			}
				System.out.println("name doesn't matched");
			}
			
		
		System.out.println("style type attributes created successfully");
		System.out.println("checkbox clicked successfully");
		}
		//ca.clickjs(driver.findElement(By.xpath("//span[@title='Exit Full Screen']")));
		
	
	
	@When("User creates material type {string},{string},{string}")
	public void user_creates_material_type(String A, String B, String C) throws Throwable {
		ca.click(cp.getMaterial_Types());
		//ca.click(driver.findElement(By.xpath("(//span[contains(@class,'fullScreen')])[3]")));
		standaloneMaterial(A);
		structureMaterial(B);
		toolMaterial(C);
		
		System.out.println("material type created successfully");
		System.out.println("checkbox clicked successfully");
		//ca.click(driver.findElement(By.xpath("//span[@title='Exit Full Screen']")));
	}
	
	@When("User creates BOM type {string},{string}")
	public void user_creates_BOM_type(String A, String B) throws Throwable {
	   
		

		
		
		Thread.sleep(1000);
		ca.click(cp.getBOM_Types());
		ca.eleToBeClickable();
		Thread.sleep(1000);
		ca.click(cp.getNew_BOM_Type_Btn());
		Thread.sleep(1000);
		ca.insertText(pp.getBOM_Type_Value(), A);
		ca.eleToBeClickable();
		ca.click(pp.getConfig_save_Btn());
		ca.eleToBeClickable();
		ca.clickjs(cp.getBOM_FilterQuotesByColor());
		ca.eleToBeClickable();
		ca.clickjs(cp.getBOM_LockThemePlacementList());
		ca.eleToBeClickable();
		ca.clickjs(cp.getBOM_expose());
		ca.eleToBeClickable();
		ca.clickjs(pp.getOK_Btn());
		ca.eleToBeClickable();
		ca.clickjs(cp.getBOM_AutPlaceTracking());
		Thread.sleep(1000);
		getActive();
		
		ca.eleToBeClickable();
		Thread.sleep(1000);
		ca.click(cp.getNew_materialBOM_Type_Btn());
		Thread.sleep(1000);
		ca.insertText(pp.getBOM_Type_Value(), B);
		ca.eleToBeClickable();
		ca.click(pp.getConfig_save_Btn());
		ca.eleToBeClickable();
		ca.clickjs(cp.getMaterial_BOM_FilterQuotesByColor());
		ca.eleToBeClickable();
		ca.clickjs(cp.getMaterialBOM_expose());
		ca.eleToBeClickable();
		ca.clickjs(pp.getOK_Btn());
		Thread.sleep(1000);
		getActive();
		Thread.sleep(1000);
		
		System.out.println("style & material BOM created successfully");
		System.out.println("checkbox clicked successfully");
		
	}
	
	@When("User creates size chart type {string},{string},{string},{string}")
	public void user_creates_size_chart_type(String All, String List, String Value, String Tolerance) throws Throwable {
		

		
		
		ca.eleToBeClickable();
		ca.click(cp.getSizeChart_Types());
		
		ca.eleToBeClickable();
		Thread.sleep(1000);
		ca.click(cp.getNew_sizeChart_Types_Btn());
		Thread.sleep(1000);
		ca.insertText(pp.getSizeChart_Type_Value(), All);
		ca.eleToBeClickable();
		ca.click(pp.getConfig_save_Btn());
		ca.eleToBeClickable();
		ca.clickjs(cp.getSizeChart_Tolerance());
		ca.eleToBeClickable();
		ca.clickjs(cp.getSizeChart_DimensionValues());
		ca.eleToBeClickable();
		ca.clickjs(cp.getSizeChart_DimensionList());
		Thread.sleep(1000);
		//getActive();
		
		
		ca.eleToBeClickable();
		Thread.sleep(1000);
		ca.click(cp.getNew_sizeChart_Types_Btn());
		Thread.sleep(1000);
		ca.insertText(pp.getSizeChart_Type_Value(), List);
		ca.eleToBeClickable();
		Thread.sleep(1000);
		ca.click(pp.getConfig_save_Btn());
		ca.eleToBeClickable();
		Thread.sleep(1000);
		ca.clickjs(cp.getSizeChart_DimensionList());
		Thread.sleep(1000);
		//getActive();
		
		
		ca.eleToBeClickable();
		Thread.sleep(1000);
		ca.click(cp.getNew_sizeChart_Types_Btn());
		Thread.sleep(1000);
		ca.insertText(pp.getSizeChart_Type_Value(), Value);
		ca.eleToBeClickable();
		ca.click(pp.getConfig_save_Btn());
		ca.eleToBeClickable();
		Thread.sleep(1000);
		ca.clickjs(cp.getSizeChart_DimensionValues());
		Thread.sleep(1000);
		//getActive();
		
		
		ca.eleToBeClickable();
		Thread.sleep(1000);
		ca.click(cp.getNew_sizeChart_Types_Btn());
		Thread.sleep(1000);
		ca.insertText(pp.getSizeChart_Type_Value(), Tolerance);
		ca.eleToBeClickable();
		ca.click(pp.getConfig_save_Btn());
		ca.eleToBeClickable();
		Thread.sleep(1000);
		ca.clickjs(cp.getSizeChart_Tolerance());
		Thread.sleep(1000);
		//getActive();
		getSizeActive();
		Thread.sleep(1000);
		
		System.out.println("size chart created successfully");
		System.out.println("checkbox clicked successfully");
	}
	
	
	@When("User creates spec type {string},{string}")
	public void user_creates_spec_type(String A,String B) throws Throwable {
	    
		ca.eleToBeClickable();
		ca.click(cp.getSpec_Types());
		ca.eleToBeClickable();
		Thread.sleep(1000);
		ca.click(cp.getNew_spec_type_Btn());
		Thread.sleep(1000);
		ca.insertText(pp.getSpec_Type_Value(), A);
		ca.eleToBeClickable();
		ca.click(pp.getConfig_cancel_Btn());

		
	
		
		ca.eleToBeClickable();
		Thread.sleep(1000);
		ca.click(cp.getNew_spec_type_Btn());
		Thread.sleep(1000);
		ca.insertText(pp.getSpec_Type_Value(), B);
		ca.eleToBeClickable();
		ca.click(pp.getConfig_cancel_Btn());
		ca.eleToBeClickable();
		ca.clickjs(cp.getSpec_EnableA());
		Thread.sleep(1000);
		ca.eleToBeClickable();
		ca.clickjs(cp.getSpec_EnableB());
		Thread.sleep(1000);
		getSpecActive();
		Thread.sleep(1000);
		
		System.out.println("spec type created successfully");
		System.out.println("checkbox clicked successfully");
		
	}
	
	@When("User creates test type {string},{string}")
	public void user_creates_test_type(String A,String B) throws Throwable {
		

	    
		ca.eleToBeClickable();
		Thread.sleep(1000);
		ca.click(cp.getTest_Types());
		ca.eleToBeClickable();
		ca.click(cp.getNew_test_type_Btn());
		Thread.sleep(1000);
		ca.insertText(pp.getTest_Type_Value(), A);
		ca.eleToBeClickable();
		ca.click(pp.getConfig_save_Btn());
		Thread.sleep(1000);
		
		
		ca.eleToBeClickable();
		Thread.sleep(1000);
		ca.click(cp.getNew_test_type_Btn());
		Thread.sleep(1000);
		ca.insertText(pp.getTest_Type_Value(), B);
		ca.eleToBeClickable();
		ca.click(pp.getConfig_save_Btn());
		ca.eleToBeClickable();
		getSpecActive();
		Thread.sleep(1000);
		
		System.out.println("test type created successfully");
		System.out.println("checkbox clicked successfully");
		
		
	}
	
	
	@When("User performing delete action on test type")
	public void user_performing_delete_action_on_test_type() throws Throwable {
	    
		List<WebElement> actives = driver.findElements(By.xpath("(//span[@data-csi-act='Delete'])"));
        for (int i = 0; i < actives.size(); i++) {
        
        	if(i==actives.size()-1){
        		
        	int j = 1+i;
        		System.out.println(i+"&"+j);
        		Thread.sleep(1000);
        		ca.clickjs(driver.findElement(By.xpath("(//span[@data-csi-act='Delete'])["+j+"]")));
        		break;
        	}
        
			
		}
        
        ca.click(pp.getDelete_Btn());
        
		
		System.out.println("deleted successfully");
		
		
	}
	
	@When("User creates inspection type {string},{string},{string},{string},{string}")
	public void user_creates_inspection_type(String arg1, String arg2, String arg3, String arg4, String arg5) throws Throwable {
		
		ca.eleToBeClickable();
		ca.click(cp.getInsp_Types());
		ca.eleToBeClickable();
		Thread.sleep(1000);
		ca.click(cp.getNew_InspTypes_Btn());
		Thread.sleep(1000);
		ca.insertText(pp.getConfig_InspectionType_Value(), arg1);
		ca.eleToBeClickable();
		ca.click(pp.getConfig_save_Btn());
		Thread.sleep(1000);
		

		ca.eleToBeClickable();
		Thread.sleep(1000);
		ca.click(cp.getNew_InspTypes_Btn());
		Thread.sleep(1000);
		ca.insertText(pp.getConfig_InspectionType_Value(), arg2);
		ca.eleToBeClickable();
		ca.click(pp.getConfig_inspection_DropDown());
		ca.eleToBeClickable();
		ca.clickjs(driver.findElement(By.xpath("((//div[@data-csi-automation='field-FinalInspectionSectionSubtype-Form-LinkingType'])[2]/div)[3]")));
		ca.eleToBeClickable();
		ca.click(pp.getConfig_save_Btn());
		Thread.sleep(1000);
		
		ca.eleToBeClickable();
		Thread.sleep(1000);
		ca.click(cp.getNew_InspTypes_Btn());
		Thread.sleep(1000);
		ca.insertText(pp.getConfig_InspectionType_Value(), arg3);
		ca.eleToBeClickable();
		ca.click(pp.getConfig_inspection_DropDown());
		ca.eleToBeClickable();
		ca.clickjs(driver.findElement(By.xpath("((//div[@data-csi-automation='field-FinalInspectionSectionSubtype-Form-LinkingType'])[2]/div)[4]")));
		ca.eleToBeClickable();
		ca.click(pp.getConfig_save_Btn());
		Thread.sleep(1000);
		
		ca.eleToBeClickable();
		Thread.sleep(1000);
		ca.click(cp.getNew_InspTypes_Btn());
		Thread.sleep(1000);
		ca.insertText(pp.getConfig_InspectionType_Value(), arg4);
		ca.eleToBeClickable();
		ca.click(pp.getConfig_inspection_DropDown());
		ca.eleToBeClickable();
		ca.clickjs(driver.findElement(By.xpath("((//div[@data-csi-automation='field-FinalInspectionSectionSubtype-Form-LinkingType'])[2]/div)[5]")));
		ca.eleToBeClickable();
		ca.click(pp.getConfig_save_Btn());
		Thread.sleep(1000);
		
		ca.eleToBeClickable();
		Thread.sleep(1000);
		ca.click(cp.getNew_InspTypes_Btn());
		Thread.sleep(1000);
		ca.insertText(pp.getConfig_InspectionType_Value(), arg5);
		ca.eleToBeClickable();
		ca.click(pp.getConfig_inspection_DropDown());
		ca.eleToBeClickable();
		ca.clickjs(driver.findElement(By.xpath("((//div[@data-csi-automation='field-FinalInspectionSectionSubtype-Form-LinkingType'])[2]/div)[6]")));
		ca.eleToBeClickable();
		ca.click(pp.getConfig_save_Btn());
		Thread.sleep(1000);
		ca.eleToBeClickable();
		
		getInspectionActive();
		
		System.out.println("inspection type created successfully");
		System.out.println("checkbox clicked successfully");
	   
	}

	@When("User creates contractual documents {string},{string},{string},{string},{string}")
	public void user_creates_contractual_documents(String arg1, String arg2, String arg3, String arg4, String arg5) throws Throwable {
		
		try{
			Thread.sleep(1000);
			ca.eleToBeClickable();
			ca.clickjs(driver.findElement(By.xpath("(//span[contains(@class,'RightIcon')]/parent::div)[3]")));
		}catch(Exception e){
<<<<<<< HEAD
=======
			
>>>>>>> 3cd4d177db99f6bc232bf1d4c7cca65cd36aac0a
		}
		
		Thread.sleep(1000);
		ca.eleToBeClickable();
		ca.clickjs(cp.getContract_Types());
		ca.eleToBeClickable();
		Thread.sleep(1000);
		ca.clickjs(cp.getNew_contractTypes_Btn());
		Thread.sleep(1000);
		ca.insertText(pp.getConfig_contractType_Value(), arg1);
		ca.eleToBeClickable();
		ca.click(pp.getConfig_save_Btn());
		Thread.sleep(1000);
		ca.clickjs(cp.getContrct_HED());
		ca.eleToBeClickable();
		Thread.sleep(1000);
		ca.clickjs(cp.getContrct_RA());
		ca.eleToBeClickable();
		Thread.sleep(1000);
		ca.clickjs(cp.getContrct_HRD());
		ca.eleToBeClickable();
		
		
		Thread.sleep(1000);
		ca.click(cp.getNew_contractTypes_Btn());
		Thread.sleep(1000);
		ca.insertText(pp.getConfig_contractType_Value(), arg2);
		ca.eleToBeClickable();
		ca.click(pp.getConfig_save_Btn());
		Thread.sleep(1000);
		
		
		Thread.sleep(1000);
		ca.click(cp.getNew_contractTypes_Btn());
		Thread.sleep(1000);
		ca.insertText(pp.getConfig_contractType_Value(), arg3);
		ca.eleToBeClickable();
		ca.click(pp.getConfig_save_Btn());
		Thread.sleep(1000);
		ca.eleToBeClickable();
		ca.clickjs(cp.getContrct_RA());
		ca.eleToBeClickable();
		
		
		Thread.sleep(1000);
		ca.click(cp.getNew_contractTypes_Btn());
		Thread.sleep(1000);
		ca.insertText(pp.getConfig_contractType_Value(), arg4);
		ca.eleToBeClickable();
		ca.click(pp.getConfig_save_Btn());
		Thread.sleep(1000);
		ca.eleToBeClickable();
		ca.clickjs(cp.getContrct_HED());
		ca.eleToBeClickable();
		Thread.sleep(1000);
		ca.clickjs(cp.getContrct_RA());
		ca.eleToBeClickable();
		
		
		Thread.sleep(1000);
		ca.click(cp.getNew_contractTypes_Btn());
		Thread.sleep(1000);
		ca.insertText(pp.getConfig_contractType_Value(), arg5);
		ca.eleToBeClickable();
		ca.click(pp.getConfig_save_Btn());
		Thread.sleep(1000);
		ca.eleToBeClickable();
		ca.clickjs(cp.getContrct_HED());
		ca.eleToBeClickable();
		Thread.sleep(1000);
		ca.clickjs(cp.getContrct_RA());
		ca.eleToBeClickable();
		Thread.sleep(1000);
		ca.clickjs(cp.getContrct_HRD());
		ca.eleToBeClickable();
		Thread.sleep(1000);
		ca.clickjs(cp.getContrct_RPOR());
		ca.eleToBeClickable();
		

		getInspectionActive();
		
		System.out.println("contractual document type created successfully");
		System.out.println("checkbox clicked successfully");
		
		
	    
	}
	
	@When("User creates LookUp items {string}")
	public void user_creates_LookUp_items(String arg1) throws Throwable {
	    
		ca.eleToBeClickable();
		ca.click(cp.getLookUp_Types());
		ca.eleToBeClickable();
		ca.click(cp.getNew_LookUp_Btn());
		ca.eleToBeClickable();
		ca.insertText(pp.getConfig_lookUp_Value(), arg1);
		ca.eleToBeClickable();
		ca.click(pp.getConfig_save_Btn());
		ca.eleToBeClickable();
		getActive();
		
	}

	@When("User creates theme master {string},{string},{string},{string}")
	public void user_creates_theme_master(String arg1, String arg2, String arg3, String arg4) throws Throwable {
		
		try{
			Thread.sleep(1000);
			ca.eleToBeClickable();
			ca.clickjs(driver.findElement(By.xpath("(//span[contains(@class,'RightIcon')]/parent::div)[3]")));
		}catch(Exception e){
			
		}
		
		ca.eleToBeClickable();
		ca.click(cp.getTheme_Types());
		ca.eleToBeClickable();
		Thread.sleep(1000);
		ca.click(cp.getNew_theme_Btn());
		Thread.sleep(1000);
		ca.insertText(pp.getConfig_themeType_Value(), arg1);
		ca.eleToBeClickable();
		ca.click(pp.getConfig_theme_DropDown());
		ca.eleToBeClickable();
		ca.clickjs(driver.findElement(By.xpath("((//div[@data-csi-automation='field-ThemeMasterSubtype-Form-ThemeToSeason'])[2]/div)[5]")));
		ca.eleToBeClickable();
		ca.click(pp.getConfig_save_Btn());
		Thread.sleep(1000);
		
		ca.eleToBeClickable();
		ca.click(cp.getTheme_Types());
		ca.eleToBeClickable();
		Thread.sleep(1000);
		ca.click(cp.getNew_theme_Btn());
		Thread.sleep(1000);
		ca.insertText(pp.getConfig_themeType_Value(), arg2);
		ca.eleToBeClickable();
		ca.click(pp.getConfig_theme_DropDown());
		ca.eleToBeClickable();
		ca.clickjs(driver.findElement(By.xpath("((//div[@data-csi-automation='field-ThemeMasterSubtype-Form-ThemeToSeason'])[2]/div)[4]")));
		ca.eleToBeClickable();
		ca.click(pp.getConfig_save_Btn());
		Thread.sleep(1000);
		
		ca.eleToBeClickable();
		ca.click(cp.getTheme_Types());
		ca.eleToBeClickable();
		Thread.sleep(1000);
		ca.click(cp.getNew_theme_Btn());
		Thread.sleep(1000);
		ca.insertText(pp.getConfig_themeType_Value(), arg3);
		ca.eleToBeClickable();
		ca.click(pp.getConfig_theme_DropDown());
		ca.eleToBeClickable();
		ca.clickjs(driver.findElement(By.xpath("((//div[@data-csi-automation='field-ThemeMasterSubtype-Form-ThemeToSeason'])[2]/div)[3]")));
		ca.eleToBeClickable();
		ca.click(pp.getConfig_save_Btn());
		Thread.sleep(1000);
		
		ca.eleToBeClickable();
		ca.click(cp.getTheme_Types());
		ca.eleToBeClickable();
		Thread.sleep(1000);
		ca.click(cp.getNew_theme_Btn());
		Thread.sleep(1000);
		ca.insertText(pp.getConfig_themeType_Value(), arg4);
		ca.eleToBeClickable();
		ca.click(pp.getConfig_theme_DropDown());
		ca.eleToBeClickable();
		ca.clickjs(driver.findElement(By.xpath("((//div[@data-csi-automation='field-ThemeMasterSubtype-Form-ThemeToSeason'])[2]/div)[4]")));
		ca.eleToBeClickable();
		ca.click(driver.findElement(By.xpath("//input[@name='AllowMaterialVariationPerColorway']")));
		ca.eleToBeClickable();
		ca.click(pp.getConfig_save_Btn());
		Thread.sleep(1000);
		
		getSizeActive();
		
		System.out.println("theme master type created successfully");
		System.out.println("checkbox clicked successfully");
		
	    
	}

	
	@Then("validate and accept the alert")
	public void validate_and_accept_the_alert() throws Throwable {
	    
		Commonactions.waitForAlert(driver);
		
	}
	
	public void colourAndSize(String value) throws Throwable {
		
		ca.eleToBeClickable();
		ca.click(cp.getNew_styleType_Btn());
		Commonactions.jsWaitForPageLoad();
		Thread.sleep(1000);
		ca.insertText(pp.getConfig_styleType_ValueA(), value);
		ca.click(pp.getConfig_save_Btn());
		Commonactions.jsWaitForPageLoad();
		ca.eleToBeClickable();
		ca.clickjs(cp.getStyle_Colour());
		ca.eleToBeClickable();
		ca.clickjs(cp.getStyle_Active());
		Thread.sleep(1000);
		for(int i=0; i < 8; i++){
			ca.clickjs(driver.findElement(By.xpath("(//span[text()='+']/parent::div)[2]")));
		}
		ca.clickjs(cp.getStyle_Brands());
		ca.eleToBeClickable();
		ca.clickjs(cp.getStyle_Features());
		ca.eleToBeClickable();
		ca.clickjs(cp.getStyle_Functions());
		ca.eleToBeClickable();
		ca.clickjs(cp.getStyle_InAssortment());
		ca.eleToBeClickable();
		ca.clickjs(cp.getStyle_IsAssortment());
		ca.eleToBeClickable();
		ca.clickjs(cp.getStyle_EnableSKU());
		Thread.sleep(1000);
		for(int i=0; i < 7; i++){
			ca.clickjs(driver.findElement(By.xpath("(//span[text()='-']/parent::div)[2]")));
		}
		ca.eleToBeClickable();
		ca.clickjs(cp.getStyle_EnableStyle());
		ca.eleToBeClickable();
		ca.clickjs(cp.getStyle_Size());
		ca.eleToBeClickable();
		ca.clickjs(cp.getStyle_Validate_MCM());
		ca.eleToBeClickable();
		ca.clickjs(cp.getStyle_Reference_Img());
		ca.eleToBeClickable();
		ca.clickjs(cp.getStyle_Allow_ColourSpec());
		Thread.sleep(1000);

		ca.clickjs(driver.findElement(By.xpath("(//span[text()='-']/parent::div)[2]")));
	}
	
	public void onlyColours(String value) throws Throwable {
		
		ca.eleToBeClickable();
		Commonactions.jsWaitForPageLoad();
		ca.click(cp.getNew_styleType_Btn());
		Commonactions.jsWaitForPageLoad();
		Thread.sleep(1000);
		ca.insertText(pp.getConfig_styleType_ValueB(), value);
		Commonactions.jsWaitForPageLoad();
		ca.click(pp.getConfig_save_Btn());
		Commonactions.jsWaitForPageLoad();
		Thread.sleep(1000);
		ca.clickjs(cp.getStyle_Colour());
		ca.eleToBeClickable();
		ca.clickjs(cp.getStyle_Active());
		Thread.sleep(1000);
		for(int i=0; i < 8; i++){
			ca.clickjs(driver.findElement(By.xpath("(//span[text()='+']/parent::div)[2]")));
		}
		ca.clickjs(cp.getStyle_Brands());
		ca.eleToBeClickable();
		ca.clickjs(cp.getStyle_Features());
		ca.eleToBeClickable();
		ca.clickjs(cp.getStyle_Functions());
		ca.eleToBeClickable();
		ca.clickjs(cp.getStyle_InAssortment());
		ca.eleToBeClickable();
		ca.clickjs(cp.getStyle_IsAssortment());
		ca.eleToBeClickable();
		ca.clickjs(cp.getStyle_EnableSKU());
		Thread.sleep(1000);
		for(int i=0; i < 7; i++){
			ca.clickjs(driver.findElement(By.xpath("(//span[text()='-']/parent::div)[2]")));
		}
		ca.eleToBeClickable();
		ca.clickjs(cp.getStyle_EnableStyle());
		ca.eleToBeClickable();
		ca.click(cp.getStyle_Validate_MCM());
		ca.eleToBeClickable();
		ca.clickjs(cp.getStyle_Reference_Img());
		ca.eleToBeClickable();
		ca.clickjs(cp.getStyle_Allow_ColourSpec());
		Thread.sleep(1000);
		ca.clickjs(driver.findElement(By.xpath("(//span[text()='-']/parent::div)[2]")));
	}
	
	public void onlySize(String value) throws Throwable {
		
		ca.eleToBeClickable();
		Commonactions.jsWaitForPageLoad();
		ca.click(cp.getNew_styleType_Btn());
		Commonactions.jsWaitForPageLoad();
		Thread.sleep(1000);
		ca.insertText(pp.getConfig_styleType_ValueB(), value);
		Commonactions.jsWaitForPageLoad();
		ca.click(pp.getConfig_save_Btn());
		Commonactions.jsWaitForPageLoad();
		Thread.sleep(1000);
		ca.clickjs(cp.getStyle_Active());
		Thread.sleep(1000);
		for(int i=0; i < 8; i++){
			ca.clickjs(driver.findElement(By.xpath("(//span[text()='+']/parent::div)[2]")));
		}
		ca.clickjs(cp.getStyle_Brands());
		ca.eleToBeClickable();
		ca.clickjs(cp.getStyle_Features());
		ca.eleToBeClickable();
		ca.clickjs(cp.getStyle_Functions());
		ca.eleToBeClickable();
		ca.clickjs(cp.getStyle_InAssortment());
		ca.eleToBeClickable();
		ca.clickjs(cp.getStyle_IsAssortment());
		ca.eleToBeClickable();
		ca.clickjs(cp.getStyle_EnableSKU());
		Thread.sleep(1000);
		for(int i=0; i < 7; i++){
			ca.clickjs(driver.findElement(By.xpath("(//span[text()='-']/parent::div)[2]")));
		}
		ca.eleToBeClickable();
		ca.clickjs(cp.getStyle_EnableStyle());
		ca.eleToBeClickable();
		ca.clickjs(cp.getStyle_Size());
		Thread.sleep(1000);
		ca.clickjs(driver.findElement(By.xpath("(//span[text()='-']/parent::div)[2]")));
	}
	
	public void noDatas(String value) throws Throwable {
		
		ca.eleToBeClickable();
		Commonactions.jsWaitForPageLoad();
		ca.click(cp.getNew_styleType_Btn());
		Commonactions.jsWaitForPageLoad();
		Thread.sleep(1000);
		ca.insertText(pp.getConfig_styleType_ValueB(), value);
		Commonactions.jsWaitForPageLoad();
		ca.click(pp.getConfig_save_Btn());
		Commonactions.jsWaitForPageLoad();
		Thread.sleep(1000);
		ca.clickjs(cp.getStyle_Active());

	}
	
	public void standaloneMaterial(String value) throws Throwable {
		
		Thread.sleep(1000);
		ca.eleToBeClickable();
		ca.click(cp.getNew_material_TypeBtn());
		Thread.sleep(1000);
		ca.insertText(pp.getConfig_materialType_ValueA(), value);
		ca.click(pp.getConfig_material_DropDown());
		ca.clickjs(driver.findElement(By.xpath("((//div[@data-csi-automation='field-MaterialType-Form-MaterialUsage'])[2]/div)[3]")));
        ca.click(pp.getConfig_save_Btn());
        materialCheckBoxes();
		
	}
	
	public void structureMaterial(String value) throws Throwable {
		
		Thread.sleep(1000);
		ca.eleToBeClickable();
		ca.click(cp.getNew_material_TypeBtn());
		Thread.sleep(1000);
		ca.insertText(pp.getConfig_materialType_ValueB(), value);
		Thread.sleep(1000);
		ca.click(pp.getConfig_material_DropDown());
		Thread.sleep(1000);
		ca.clickjs(driver.findElement(By.xpath("((//div[@data-csi-automation='field-MaterialType-Form-MaterialUsage'])[2]/div)[4]")));
        ca.click(pp.getConfig_save_Btn());
        materialCheckBoxes();
		
	}
	
	public void toolMaterial(String value) throws Throwable {
		
		Thread.sleep(1000);
		ca.eleToBeClickable();
		ca.click(cp.getNew_material_TypeBtn());
		Thread.sleep(1000);
		ca.insertText(pp.getConfig_materialType_ValueB(), value);
		Thread.sleep(1000);
		ca.click(pp.getConfig_material_DropDown());
		Thread.sleep(1000);
		ca.clickjs(driver.findElement(By.xpath("((//div[@data-csi-automation='field-MaterialType-Form-MaterialUsage'])[2]/div)[5]")));
        ca.click(pp.getConfig_save_Btn());
        materialCheckBoxes();
		
	}
	
	public void materialCheckBoxes() throws Throwable {

		Thread.sleep(1000);
		ca.clickjs(cp.getMaterial_Colour());
		ca.eleToBeClickable();
		ca.clickjs(cp.getMaterial_Active());
		Thread.sleep(1000);
		for(int i=0; i < 9; i++){
			ca.clickjs(driver.findElement(By.xpath("//div[contains(@class,'Material')]//span[text()='+']/parent::div")));
		}
		ca.clickjs(cp.getMaterial_BOM());
		ca.eleToBeClickable();
		ca.clickjs(cp.getMaterial_Routing());
		ca.eleToBeClickable();
		ca.clickjs(cp.getMaterial_DataSheet());
		ca.eleToBeClickable();
		ca.clickjs(cp.getMaterial_TestRun());
		Thread.sleep(1000);
		for(int i=0; i < 7; i++){
			ca.clickjs(driver.findElement(By.xpath("//div[contains(@class,'Material')]//span[text()='-']/parent::div")));
		}
		ca.clickjs(cp.getMaterial_Highest_Cost());
		ca.eleToBeClickable();
		ca.clickjs(cp.getMaterial_Default_Season());
		ca.eleToBeClickable();
		ca.clickjs(cp.getMaterial_EnableSKU());
		ca.eleToBeClickable();
		ca.clickjs(cp.getMaterial_Size());
		ca.eleToBeClickable();
		ca.clickjs(cp.getMaterial_Allow_Coloured());
		Thread.sleep(1000);
		ca.clickjs(driver.findElement(By.xpath("//div[contains(@class,'Material')]//span[text()='-']/parent::div")));
		ca.clickjs(driver.findElement(By.xpath("//div[contains(@class,'Material')]//span[text()='-']/parent::div")));

	}
	
	// int j;
	
	public void getActive() throws Throwable {
		
		List<WebElement> actives = driver.findElements(By.xpath("(//div[@data-csi-act='Active:Child:SetupSettings:0']/input[@tabindex='0'])"));
        for (int i = 0; i < actives.size(); i++) {
        
        	if(i==actives.size()-1){
        		
        	int j = 1+i;
        		System.out.println(i+"&"+j);
        		Thread.sleep(1000);
        		ca.clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='Active:Child:SetupSettings:0']/input[@tabindex='0'])["+j+"]")));
        		break;
        	}
        
			
		}
		
		
	}
	
  public void getSizeActive() throws Throwable{
	  List<WebElement> actives = driver.findElements(By.xpath("(//div[@data-csi-act='Active:Child:SetupSettings:0']/input[@tabindex='0'])"));
	  int i=actives.size();
	  System.out.println("size :"+i);
    int  j=i-1;
    int  k=i-2;
    int  l=i-3;
		  ca.clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='Active:Child:SetupSettings:0']/input[@tabindex='0'])["+i+"]")));
		  Thread.sleep(1000);
		  ca.clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='Active:Child:SetupSettings:0']/input[@tabindex='0'])["+j+"]")));
		  Thread.sleep(1000);
		  ca.clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='Active:Child:SetupSettings:0']/input[@tabindex='0'])["+k+"]")));
		  Thread.sleep(1000);
		  ca.clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='Active:Child:SetupSettings:0']/input[@tabindex='0'])["+l+"]")));
		  
	  
	  
  }
  
  public void getInspectionActive() throws Throwable{
	  List<WebElement> actives = driver.findElements(By.xpath("(//div[@data-csi-act='Active:Child:SetupSettings:0']/input[@tabindex='0'])"));
	  int i=actives.size();
	  System.out.println("size :"+i);
    int  j=i-1;
    int  k=i-2;
    int  l=i-3;
    int  m=i-4;
	try{
		ca.eleToBeClickable();
		ca.jsScrollPageDown(driver.findElement(By.xpath("(//div[@data-csi-act='Active:Child:SetupSettings:0']/input[@tabindex='0'])["+i+"]")));
		
	}catch (Exception e) {
		// TODO: handle exception
		
	}
    
		  ca.clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='Active:Child:SetupSettings:0']/input[@tabindex='0'])["+i+"]")));
		  Thread.sleep(1000);
		  ca.clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='Active:Child:SetupSettings:0']/input[@tabindex='0'])["+j+"]")));
		  Thread.sleep(1000);
		  ca.clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='Active:Child:SetupSettings:0']/input[@tabindex='0'])["+k+"]")));
		  Thread.sleep(1000);
		  ca.clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='Active:Child:SetupSettings:0']/input[@tabindex='0'])["+l+"]")));
		  Thread.sleep(1000);
		  ca.clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='Active:Child:SetupSettings:0']/input[@tabindex='0'])["+m+"]")));
		  
	  
	  
  }
  
  public void getSpecActive() throws Throwable{
	  List<WebElement> actives = driver.findElements(By.xpath("(//div[@data-csi-act='Active:Child:SetupSettings:0']/input[@tabindex='0'])"));
	  int i=actives.size();
	  System.out.println("size :"+i);
    int  j=i-1;
    int  k=i-2;
    int  l=i-3;
    int  m=i-4;
		  ca.clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='Active:Child:SetupSettings:0']/input[@tabindex='0'])["+i+"]")));
		  Thread.sleep(1000);
		  ca.clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='Active:Child:SetupSettings:0']/input[@tabindex='0'])["+j+"]")));

		  
	  
	  
  }
		

}
