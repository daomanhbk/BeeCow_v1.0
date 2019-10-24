package com.beecow.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.beecow.ui.HomePageUI;
import com.beecow.ui.LogInPageUI;

import Common.CommonFunctions;

public class LogInPageActions extends CommonFunctions {

	public LogInPageActions(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void clickDangNhap() {
		waitForElemenVisible(LogInPageUI.DANGNHAP_BTN);
		clickToElement(LogInPageUI.DANGNHAP_BTN);
	}

	public void inputUserName(String value) {
		waitForElemenVisible(LogInPageUI.USERNAME_TXT);
		inputElement(LogInPageUI.USERNAME_TXT, value);
	}

	public void inputPassword(String value) {
		waitForElemenVisible(LogInPageUI.MATKHAU_TXT);
		inputElement(LogInPageUI.MATKHAU_TXT, value);
	}

	public void clickDangNhapForm() {
		waitForElemenVisible(LogInPageUI.DANGNHAPFORM_BTN);
		clickToElement(LogInPageUI.DANGNHAPFORM_BTN);
	}
	
	public String getPhoneEmailErrorMessage() {
		waitForElemenVisible(LogInPageUI.PHONE_EMAIL_ERRORMESSAGE_LBL);
		return getTextElement(LogInPageUI.PHONE_EMAIL_ERRORMESSAGE_LBL);
	}

	public String getLogInErrorMessage() {
		waitForElemenVisible(LogInPageUI.LOGIN_ERRORMESSAGE_LBL);
		return getTextElement(LogInPageUI.LOGIN_ERRORMESSAGE_LBL);
	}
	
	public String getUserName() {
//		waitForElemenVisible(LogInPageUI.USERNAME_LBL);
		waitForElemenInvisible(LogInPageUI.DANGNHAPFORM_BTN);
		return getTextElement(HomePageUI.USERNAME_LBL);
	}
	
	public HomePageActions clickDangNhapF() {
		waitForElemenVisible(LogInPageUI.DANGNHAPFORM_BTN);		
		clickToElement(LogInPageUI.DANGNHAPFORM_BTN);
		return PageFactory.initElements(driver, HomePageActions.class);
	}
}
