package com.beecow.actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.beecow.ui.EditPageUI;

import Common.CommonFunctions;

public class EditPageActions extends CommonFunctions{

	public EditPageActions(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
//	public String getProductNameValue() throws InterruptedException {		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		waitForElemenVisible(EditPageUI.PRODUCTNAME_TXT);
//		Thread.sleep(1000);
//		return js.executeScript("return $('input#name').val()").toString();	
//	}
	
	public String getProductNameValue() throws InterruptedException {		
		return getTextJquerry(EditPageUI.PRODUCTNAME_TXTJ);
	}
	
//	public void inputDiscountValue(String value) throws InterruptedException {		
//		inputJquerry(EditPageUI.DISCOUNT_J, value);
//	}
	
	public void setDiscountValue(String value) {
		waitForElemenVisible(EditPageUI.DISCOUNT); // Why this code is fail
		inputElement(EditPageUI.DISCOUNT, value);

	}
	
	public String getComboBox1Value() {
		waitForElemenVisible(EditPageUI.CATEGORY1_CBX_TXT);
		return getTextElement(EditPageUI.CATEGORY1_CBX_TXT);
	}
	
	public String getComboBox2Value() {
		waitForElemenVisible(EditPageUI.CATEGORY2_CBX_TXT);
		return getTextElement(EditPageUI.CATEGORY2_CBX_TXT);
	}	

	public String getComboBox3Value() {
		waitForElemenVisible(EditPageUI.CATEGORY3_CBX_TXT);
		return getTextElement(EditPageUI.CATEGORY3_CBX_TXT);
	}
	
	
	public String getQuantityValue() {
		waitForElemenVisible(EditPageUI.QUANTITY_TXT);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js.executeScript("return $('input[formcontrolname=\"totalItem\"]').val()").toString();	
	}
	
	public String getPriceValue() {
		waitForElemenVisible(EditPageUI.ORIGINALPRICE_TXT);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js.executeScript("return $('input#original-price').val()").toString();	
	}
	
	public String getWeightValue() {
		waitForElemenVisible(EditPageUI.WEIGHT_TXT);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js.executeScript("return $('input[formcontrolname=\"weight\"]').val()").toString();	
	}
	
	public String getWidthValue() {
		waitForElemenVisible(EditPageUI.WIDTH_TXT);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js.executeScript("return $('input[formcontrolname=\"width\"]').val()").toString();	
	}
	
	public String getLengthValue() {
		waitForElemenVisible(EditPageUI.LENGTH_TXT);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js.executeScript("return $('input[formcontrolname=\"length\"]').val()").toString();	
	}	
	
	public String getHeightValue() throws InterruptedException {
		waitForElemenVisible(EditPageUI.HEIGHT_TXT);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js.executeScript("return $('input[formcontrolname=\"height\"]').val()").toString();	
	}
	
	
	public void clickEditQuantitySpan() {
		waitForElemenVisible(EditPageUI.EDITQUANTITY_SPAN);
		clickToElement(EditPageUI.EDITQUANTITY_SPAN);		
	}
	
	public void setQuantityInput(String value) {
		waitForElemenVisible(EditPageUI.EDITQUANTITY_TXT);
		clearElement(EditPageUI.EDITQUANTITY_TXT);	
		inputElement(EditPageUI.EDITQUANTITY_TXT, value);
	}
	
	public void clickConfirmBtn() {
		waitForElemenVisible(EditPageUI.EDITQUANTITYCONFIRM_BTN);
		clickToElement(EditPageUI.EDITQUANTITYCONFIRM_BTN);		
	}
	
	public void clickUpdateBtn() {
		waitForElemenVisible(EditPageUI.EDITUPDATE_BTN);
		clickToElement(EditPageUI.EDITUPDATE_BTN);		
	}
	
	public String getUpdateSuccessMsg() {
		waitForElemenVisible(EditPageUI.UPDATESUCCESS_MSG);
		return getTextElement(EditPageUI.UPDATESUCCESS_MSG);
	}
	
	public ViewProductPageActions clickViewProduct() {
		waitForElemenVisible(EditPageUI.VIEWPRODUCT_BTN);
		clickToElement(EditPageUI.VIEWPRODUCT_BTN);
		return PageFactory.initElements(driver, ViewProductPageActions.class);
	}

	public void clickDeleteButton() {
		waitForElemenVisible(EditPageUI.DELETE_BTN);
		clickToElement(EditPageUI.DELETE_BTN);		
	}
	
	public void clickConfirmDeleteButton() {
		waitForElemenVisible(EditPageUI.DELETECONFIRM_BTN);
		clickToElement(EditPageUI.DELETECONFIRM_BTN);		
	}

}
