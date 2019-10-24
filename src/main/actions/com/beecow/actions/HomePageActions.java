package com.beecow.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.beecow.ui.CreateProductPageUI;
//import com.bankguru.actions.HomePage;
import com.beecow.ui.HomePageUI;

import BeeCow.BeeCow.CreateProductScript;
import Common.CommonFunctions;

public class HomePageActions extends CommonFunctions {

	public HomePageActions(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void clickKenhBanHangLBL() {
		waitForElemenVisible(HomePageUI.KENHBANHANG_LBL);
		clickToElement(HomePageUI.KENHBANHANG_LBL);
	}

	public CreateProductPageActions clickDangSanPhamMoiLBL() {
		waitForElemenVisible(HomePageUI.DANGSANPHAMMOI_BOX);
		clickToElement(HomePageUI.DANGSANPHAMMOI_BOX);
		return PageFactory.initElements(driver, CreateProductPageActions.class);
	}
	
	public void closePopUp() {
		waitForElemenVisible(CreateProductPageUI.POPUP_BD);
//		waitForElemenVisible(CreateProductPageUI.POPUP_CLOSE_BTN);
		clickToElement(CreateProductPageUI.POPUP_CLOSE_BTN);
	}

//	public String getProductNameLBL() {
//		waitForElemenVisible(HomePageUI.PRODUCTNAME_LBL);
//		return getTextElement(HomePageUI.PRODUCTNAME_LBL).trim().toLowerCase();
//	}
	
	public String getProductNameLBL() {
		String dynamicLocator = String.format(HomePageUI.PRODUCTNAME_LBL, CreateProductScript.productName.toLowerCase());	
		waitForElemenVisible(dynamicLocator);
		return getTextElement(dynamicLocator).trim().toLowerCase();
	}

	public String getProductPriceLBL() {
		String dynamicLocator = String.format(HomePageUI.PRODUCTPRICE_LBL, CreateProductScript.productName.toLowerCase());
		waitForElemenVisible(dynamicLocator);
		return getTextElement(dynamicLocator).trim().toLowerCase();
	}
	
	public EditPageActions clickEditBtn() {
		String dynamicLocator = String.format(HomePageUI.EDIT_BTN, CreateProductScript.productName.toLowerCase());	
		waitForElemenVisible(dynamicLocator);
		clickToElement(dynamicLocator);
		return PageFactory.initElements(driver, EditPageActions.class);
	}

}
