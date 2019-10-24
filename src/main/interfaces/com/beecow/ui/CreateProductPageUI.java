package com.beecow.ui;

public class CreateProductPageUI {
	public static String POPUP_BD = "//div[@class='gosell_popup']/img";
	public static String POPUP_CLOSE_BTN = "//button[@class='close']";
	public static String DANG_BTN = "//button[@beetranslate='beecow.item.action.post']";

	public static String UPLOADIMG_BTN = "//div[@class='recommend-inf text-left']/following-sibling::input";
	public static String PRODUCTNAME_TXT = "//input[@id='name']";
//	public static String CATEGORY1_CBX_BTN = "//span[contains(text(),'Trang Nam')]/.."; // need to be updated
	public static String CATEGORY1_CBX_BTN = "//div[contains(@class,'category-left')]//span[contains(@class,'gly')]/preceding-sibling::span"; 
	public static String CATEGORY1_CBX_LST = "//span[contains(text(),'Trang Nam')]/../following-sibling::ul/li"; // need
																													// to
																													// be
																													// updated
//	public static String CATEGORY2_CBX_BTN = "//span[contains(text(),'Chọn danh mục')]/../..";
	public static String CATEGORY2_CBX_BTN = "//div[contains(@class,'category-mid')]//span[contains(@class,'gly')]/preceding-sibling::span";
	public static String CATEGORY2_CBX_LST = "//span[contains(text(),'Chọn danh mục')]/../../following-sibling::ul/li";
//	public static String CATEGORY3_CBX_BTN = "//span[contains(text(),'Chọn danh mục')]/../..";
	public static String CATEGORY3_CBX_BTN = "//div[contains(@class,'category-right')]//span[contains(@class,'gly')]/preceding-sibling::span";
	public static String CATEGORY3_CBX_LST = "//span[contains(text(),'Chọn danh mục')]/../../following-sibling::ul/li";
	public static String DESCRIPTIONPRODUCT_TXT = "//div[@class='fr-element fr-view']";
	public static String QUANTITY_TXT = "//input[@id='org-qty']";
	public static String ORIGINALPRICE_TXT = "//input[@id='original-price']";
	public static String WEIGHT_TXT = "//input[@formcontrolname='weight']";
	public static String WIDTH_TXT = "//input[@formcontrolname='width']";
	public static String LENGTH_TXT = "//input[@formcontrolname='length']";
	public static String HEIGHT_TXT = "//input[@formcontrolname='height']";

	public static String UPLOADIMG_MSG = "//label[@beetranslate='beecow.store.item.image.error.chooseImage']";
	public static String PRODUCTNAME_MSG = "//label[@beetranslate='beecow.store.item.image.error.productName']";
	public static String CATEGORY1_MSG = "//label[@beetranslate='beecow.item.error.category']";
//	public static String CATEGORY2_MSG = "//span[contains(text(),'Chọn danh mục')]/../..";
	public static String DESCRIPTIONPRODUCT_MSG = "//label[@beetranslate='beecow.item.error.description']";
	public static String QUANTITY_MSG = "//label[@beetranslate='beecow.item.error.itemQty']";
	public static String ORIGINALPRICE_MSG = "//label[@beetranslate='beecow.item.error.price']";
	public static String WEIGHT_MSG = "//div[@id='weight']/following-sibling::div[@class='error-alert']/label";
	public static String WIDTH_MSG = "//input[@formcontrolname='width']/following-sibling::label";
	public static String LENGTH_MSG = "//input[@formcontrolname='length']/following-sibling::label";
	public static String HEIGHT_MSG = "//input[@formcontrolname='height']/following-sibling::label";

	public static String SUCCESS_MSG = "//p[@beetranslate='beecow.item.modal.postSuccess']";
	public static String VIEWLIST_BTN = "//button[@beetranslate='beecow.item.modal.viewList']";


}
