package com.beecow.actions;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.beecow.ui.CreateProductPageUI;

import Common.CommonFunctions;

public class CreateProductPageActions extends CommonFunctions {

	public CreateProductPageActions(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}



	public String getHomePageURL() {
		waitForElemenVisible(CreateProductPageUI.DANG_BTN);
		return driver.getCurrentUrl();
	}

	public void clearAllField() {
		waitForElemenVisible(CreateProductPageUI.PRODUCTNAME_TXT);
//		clearElement(CreateProductPageUI.UPLOADIMG_BTN);
		clearElement(CreateProductPageUI.PRODUCTNAME_TXT);
//		clearElement(CreateProductPageUI.CATEGORY2_CBX);
//		clearElement(CreateProductPageUI.DESCRIPTIONPRODUCT_TXT);
		clearElement(CreateProductPageUI.QUANTITY_TXT);
		clearElement(CreateProductPageUI.ORIGINALPRICE_TXT);
		clearElement(CreateProductPageUI.WEIGHT_TXT);
		clearElement(CreateProductPageUI.WIDTH_TXT);
		clearElement(CreateProductPageUI.LENGTH_TXT);
		clearElement(CreateProductPageUI.HEIGHT_TXT);
	}

	public void clickButtonDang() {
		waitForElemenVisible(CreateProductPageUI.DANG_BTN);
		clickToElement(CreateProductPageUI.DANG_BTN);

	}

	public String getUploadingErrorMsg() {
		waitForElemenVisible(CreateProductPageUI.UPLOADIMG_MSG);
		return getTextElement(CreateProductPageUI.UPLOADIMG_MSG);
	}

	public String getProductNameErrorMsg() {
		waitForElemenVisible(CreateProductPageUI.PRODUCTNAME_MSG);
		return getTextElement(CreateProductPageUI.PRODUCTNAME_MSG);
	}

	public String getCategoryErrorMsg() {
		waitForElemenVisible(CreateProductPageUI.CATEGORY1_MSG);
		return getTextElement(CreateProductPageUI.CATEGORY1_MSG);
	}

	public String getDescriptionErrorMsg() {
		waitForElemenVisible(CreateProductPageUI.DESCRIPTIONPRODUCT_MSG);
		return getTextElement(CreateProductPageUI.DESCRIPTIONPRODUCT_MSG);
	}

	public String getQuantityErrorMsg() {
		waitForElemenVisible(CreateProductPageUI.QUANTITY_MSG);
		return getTextElement(CreateProductPageUI.QUANTITY_MSG);
	}

	public String getPriceErrorMsg() {
		waitForElemenVisible(CreateProductPageUI.ORIGINALPRICE_MSG);
		return getTextElement(CreateProductPageUI.ORIGINALPRICE_MSG);
	}

	public String getWeightErrorMsg() {
		waitForElemenVisible(CreateProductPageUI.WEIGHT_MSG);
		return getTextElement(CreateProductPageUI.WEIGHT_MSG);
	}

	public String getWidthErrorMsg() {
		waitForElemenVisible(CreateProductPageUI.WIDTH_MSG);
		return getTextElement(CreateProductPageUI.WIDTH_MSG);
	}

	public String getLengthErrorMsg() {
		waitForElemenVisible(CreateProductPageUI.LENGTH_MSG);
		return getTextElement(CreateProductPageUI.LENGTH_MSG);
	}

	public String getHeightErrorMsg() {
		waitForElemenVisible(CreateProductPageUI.HEIGHT_MSG);
		return getTextElement(CreateProductPageUI.HEIGHT_MSG);
	}

	public void uploadImage() throws InterruptedException, AWTException {
//		waitForElemenVisible(CreateProductPageUI.UPLOADIMG_BTN);  //Why this code is fail
		inputElement(CreateProductPageUI.UPLOADIMG_BTN,
				"D:\\Development_Automation\\Selenium_Offline_02( Blackbox Solution Center)\\Maven Project\\POM_Framework_BeeCow\\BeeCow\\images\\download.jpeg");

	}

	public void setProductName(String value) {
		waitForElemenVisible(CreateProductPageUI.PRODUCTNAME_TXT); // Why this code is fail
		inputElement(CreateProductPageUI.PRODUCTNAME_TXT, value);

	}

	public void selectCombobox1(String valueSelect) {
		//
		selectComboboxSpecial(CreateProductPageUI.CATEGORY1_CBX_BTN, CreateProductPageUI.CATEGORY1_CBX_LST,
				valueSelect);
	}
	
	public String getCombobox1Value() {
		waitForElemenVisible(CreateProductPageUI.CATEGORY1_CBX_BTN);
		return getTextElement(CreateProductPageUI.CATEGORY1_CBX_BTN);
	}

	public void selectCombobox2(String valueSelect) {
//		waitForElemenVisible(CreateProductPageUI.CATEGORY2_CBX_BTN);
		selectComboboxSpecial(CreateProductPageUI.CATEGORY2_CBX_BTN, CreateProductPageUI.CATEGORY2_CBX_LST,
				valueSelect);
	}
	
	public String getCombobox2Value() {
		waitForElemenVisible(CreateProductPageUI.CATEGORY2_CBX_BTN);
		return getTextElement(CreateProductPageUI.CATEGORY2_CBX_BTN);
	}

	public boolean checkCombobox3IsAvailable() {
		try {
			waitForElemenVisible(CreateProductPageUI.CATEGORY3_CBX_BTN);
			return true;
		} catch (TimeoutException e) {
			return false;
		}

	}

	public void selectCombobox3(String valueSelect) {
		selectComboboxSpecial(CreateProductPageUI.CATEGORY3_CBX_BTN, CreateProductPageUI.CATEGORY3_CBX_LST,
				valueSelect);
	}
	
	public String getCombobox3Value() {
		waitForElemenVisible(CreateProductPageUI.CATEGORY3_CBX_BTN);
		return getTextElement(CreateProductPageUI.CATEGORY3_CBX_BTN);
	}

	public void selectComboboxSpecial(String locatorButton, String locatorList, String valueSelect) {
		WebElement dropdown = driver.findElement(By.xpath(locatorButton));
		dropdown.click();
		List<WebElement> list = driver.findElements(By.xpath(locatorList));
		int i = 0;
		int j = Integer.parseInt(valueSelect);
		for (WebElement element : list) {
			if (i == j) {
				element.click();
				break;
			}
			i = i + 1;
		}

	}

	public void setDescriptionProduct(String value) {
		waitForElemenVisible(CreateProductPageUI.DESCRIPTIONPRODUCT_TXT);
		inputElement(CreateProductPageUI.DESCRIPTIONPRODUCT_TXT, value);
	}

	public void setQuantity(String value) {
		waitForElemenVisible(CreateProductPageUI.QUANTITY_TXT);
		inputElement(CreateProductPageUI.QUANTITY_TXT, value);
	}

	public void setPrice(String value) {
		waitForElemenVisible(CreateProductPageUI.ORIGINALPRICE_TXT);
		inputElement(CreateProductPageUI.ORIGINALPRICE_TXT, value);
	}

	public void setWeight(String value) {
		waitForElemenVisible(CreateProductPageUI.WEIGHT_TXT);
		inputElement(CreateProductPageUI.WEIGHT_TXT, value);
	}

	public void setWidth(String value) {
		waitForElemenVisible(CreateProductPageUI.WIDTH_TXT);
		inputElement(CreateProductPageUI.WIDTH_TXT, value);
	}

	public void setLength(String value) {
		waitForElemenVisible(CreateProductPageUI.LENGTH_TXT);
		inputElement(CreateProductPageUI.LENGTH_TXT, value);
	}

	public void setHeight(String value) {
		waitForElemenVisible(CreateProductPageUI.HEIGHT_TXT);
		inputElement(CreateProductPageUI.HEIGHT_TXT, value);
	}

	public String getSuccessMsg() {
		waitForElemenVisible(CreateProductPageUI.SUCCESS_MSG);
		return getTextElement(CreateProductPageUI.SUCCESS_MSG);
	}

	public void clickViewListBtn() {
		waitForElemenVisible(CreateProductPageUI.VIEWLIST_BTN);
		clickToElement(CreateProductPageUI.VIEWLIST_BTN);

	}

}
