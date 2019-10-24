package com.beecow.ui;

public class ViewProductPageUI {
	public static String PRODUCTNAME_LBL = "//div[@class='product-description mrgb16']/h3";
//	public static String PRODUCTPRICE_LBL = "//div[@class='product-description mrgb16']//p";
	public static String PRODUCTPRICE_LBL =  "//p[contains(text(),'%s')]/preceding-sibling::p";
	public static String LABEL_LBL = "//span[@beetranslate='beecow.item.detail.Soldout']";
	public static String EDIT_BTN = "//button[@id='edit-product']";
}
