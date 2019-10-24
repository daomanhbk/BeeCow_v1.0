package com.beecow.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.beecow.ui.ViewProductPageUI;

import Common.CommonFunctions;

public class ViewProductPageActions extends CommonFunctions {
	public ViewProductPageActions(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	///////////// For the last Test Case (They should belong to a new Page)
	public String getProductNameLBL() {
		waitForElemenVisible(ViewProductPageUI.PRODUCTNAME_LBL);
		return getTextElement(ViewProductPageUI.PRODUCTNAME_LBL).trim().toLowerCase();
	}

//	public String getProductPriceLBL() {
//		waitForElemenVisible(ViewProductPageUI.PRODUCTPRICE_LBL);
//		return getTextElement(ViewProductPageUI.PRODUCTPRICE_LBL).trim().toLowerCase();
//	}

	public String getLabelLBL() {
		waitForElemenVisible(ViewProductPageUI.LABEL_LBL);
		return getTextElement(ViewProductPageUI.LABEL_LBL);
	}
	
	public String getProductPriceLBL(String value) {
		String dynamicLocator = String.format(ViewProductPageUI.PRODUCTPRICE_LBL, value);	
		waitForElemenVisible(dynamicLocator);
		return getTextElement(dynamicLocator).trim().toLowerCase();
	}

	public EditPageActions clickEditBtn() {
		waitForElemenVisible(ViewProductPageUI.EDIT_BTN);
		clickToElement(ViewProductPageUI.EDIT_BTN);
		return PageFactory.initElements(driver, EditPageActions.class);
	}

}
