package com.beecow.ui;

public class HomePageUI {
	public static String USERNAME_LBL = "//span[@class='txt']";
	public static String KENHBANHANG_LBL = "//span[@class='plus-txt']";
	public static String DANGSANPHAMMOI_BOX = "//div[@class='addphoto-box file-upload-btn']";// "//div[@class='upload-box']";

//	public static String PRODUCTNAME_LBL = "//a[contains(@href,'" + CreateProductScript.productName.toLowerCase()
//			+ "')]//p[@class='pro-name']";
//	
//	public static String PRODUCTPRICE_LBL = "//a[contains(@href,'" + CreateProductScript.productName.toLowerCase()
//	+ "')]//p[@class='price-disc']";
//	
//	public static String EDIT_BTN = "//a[contains(@href,'" + CreateProductScript.productName.toLowerCase()
//	+ "')]//a";

	public static String PRODUCTNAME_LBL = "//a[contains(@href,'%s')]//p[@class='pro-name']";

	public static String PRODUCTPRICE_LBL = "//a[contains(@href,'%s')]//p[@class='price-disc']";

	public static String EDIT_BTN = "//a[contains(@href,'%s')]//a";

}
