package com.beecow.ui;

public class EditPageUI {
//	public static String PRODUCTNAME_TXT = "//input[@id='name']";
	public static String PRODUCTNAME_TXTJ = "$('input#name')";
	public static String CATEGORY1_CBX_TXT = "//div[contains(@class,'category-left')]//span[contains(@class,'gly')]/preceding-sibling::span";
	public static String CATEGORY2_CBX_TXT = "//div[contains(@class,'category-mid')]//span[contains(@class,'gly')]/preceding-sibling::span";	
	public static String CATEGORY3_CBX_TXT = "//div[contains(@class,'category-right')]//span[contains(@class,'gly')]/preceding-sibling::span";
	public static String DESCRIPTIONPRODUCT_TXT = "//div[@class='fr-element fr-view']";
	public static String QUANTITY_TXT = "//input[@formcontrolname='totalItem']";
	public static String ORIGINALPRICE_TXT = "//input[@id='original-price']";
	public static String DISCOUNT= "//input[@formcontrolname='discount']";
	public static String DISCOUNT_J = "$('input[formcontrolname=\"discount\"]')";
	public static String WEIGHT_TXT = "//input[@formcontrolname='weight']";
	public static String WIDTH_TXT = "//input[@formcontrolname='width']";
	public static String LENGTH_TXT = "//input[@formcontrolname='length']";
	public static String HEIGHT_TXT = "//input[@formcontrolname='height']";

	public static String EDITQUANTITY_SPAN = "//span[@class='icon-pen-underline']";
	public static String EDITQUANTITY_TXT = "//input[@id='editQty']";
	public static String EDITQUANTITYCONFIRM_BTN = "//button[@beetranslate='beecow.common.confirm']";

	public static String EDITUPDATE_BTN = "//button[@beetranslate='beecow.item.action.update']";

	public static String UPDATESUCCESS_MSG = "//p[@beetranslate='beecow.item.modal.updateSuccess']";
	public static String VIEWPRODUCT_BTN = "//button[@beetranslate='beecow.item.modal.viewProduct']";


	public static String DELETE_BTN = "//div[@class='button_group mrgt20']//button[@beetranslate='beecow.common.delete']";
	public static String DELETECONFIRM_BTN = "//div[@class='mrgb20']/following-sibling::button[@beetranslate='beecow.common.delete']";	


}
