package BeeCow.BeeCow;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.text.NumberFormat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beecow.actions.CreateProductPageActions;
import com.beecow.actions.EditPageActions;
import com.beecow.actions.HomePageActions;
import com.beecow.actions.LogInPageActions;
import com.beecow.actions.ViewProductPageActions;

import Common.CommonTestCase;
import jSonClasses.jSonFather;

public class CreateProductScript extends CommonTestCase {
	WebDriver driver;
	LogInPageActions logInPageActions;
	HomePageActions homePage;
	CreateProductPageActions createProductPage;
	EditPageActions editPage;
	ViewProductPageActions viewProductPage;
	jSonFather commonData;
	String urlExpected;

	public static String productName;
	String price;
	String comboBox1Value, comboBox2Value, comboBox3Value;

	@Parameters({ "browser", "version" })
	@BeforeClass
	public void beforeClass(String browser, String version) {
		driver = openBowser(browser, version);
		driver.manage().window().maximize();
		String userPath = System.getProperty("user.dir");
		String pathFileJson = userPath.concat("/data/").concat("jSonData.json");
		commonData = getDataJson(pathFileJson);

		urlExpected = "https://www.beecow.com/page/upload-product";


		driver.get(commonData.getLogInPage().getUrl());
		logInPageActions = PageFactory.initElements(driver, LogInPageActions.class);
		logInPageActions.clickDangNhap();
		logInPageActions.inputUserName("genymotionios@gmail.com");
		logInPageActions.inputPassword("1234@abcd");
		homePage = logInPageActions.clickDangNhapF();
		homePage.clickKenhBanHangLBL();
	}

	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		productName = "Cat" + randomProductName();
		price = "8"; // Use for T031
		comboBox1Value = randomCBX1();
		comboBox2Value = randomCBX2();
		comboBox3Value = randomCBX3();
		
		driver.get(commonData.getLogInPage().getUrl());
//		homePage = logInPageActions.clickDangNhapF();
		homePage.clickKenhBanHangLBL();
		Thread.sleep(6000);
		homePage.closePopUp();
		createProductPage = homePage.clickDangSanPhamMoiLBL();

		
	}

//	@Test
//	public void TC_008() {
////		homePage.clickKenhBanHangLBL();
////		createProductPage = homePage.clickDangSanPhamMoiLBL();
////		createProductPage.closePopUp();
//		assertEqualCommon(createProductPage.getHomePageURL(), urlExpected);
//	}
//
//	@Test
//	public void TC_009() {
//		createProductPage.clearAllField();
//		createProductPage.clickButtonDang();
//		assertEqualCommon(createProductPage.getUploadingErrorMsg(),
//				commonData.getCreateProductPage().getHayChonHinhAnhChoSanPhamMsg());
//
//		assertEqualCommon(createProductPage.getProductNameErrorMsg(),
//				commonData.getCreateProductPage().getHayDienTenSanPhamMsg());
//
//		assertEqualCommon(createProductPage.getCategoryErrorMsg(),
//				commonData.getCreateProductPage().getHayChonDanhMucMsg());
//
//		assertEqualCommon(createProductPage.getDescriptionErrorMsg(),
//				commonData.getCreateProductPage().getHayMoTaSanPhamMsg());
//
//		assertEqualCommon(createProductPage.getQuantityErrorMsg(),
//				commonData.getCreateProductPage().getNhapSoLuongMsg());
//
//		assertEqualCommon(createProductPage.getPriceErrorMsg(), commonData.getCreateProductPage().getHayDienGiaMsg());
//
//		assertEqualCommon(createProductPage.getWeightErrorMsg(),
//				commonData.getCreateProductPage().getHayDienCanNangSanPhamMsg());
//
//		assertEqualCommon(createProductPage.getWidthErrorMsg(), commonData.getCreateProductPage().getBatBuocMsg());
//
//		assertEqualCommon(createProductPage.getLengthErrorMsg(), commonData.getCreateProductPage().getBatBuocMsg());
//
//		assertEqualCommon(createProductPage.getHeightErrorMsg(), commonData.getCreateProductPage().getBatBuocMsg());
//	}
//
//	@Test
//	public void TC_010() throws InterruptedException, AWTException {
//		createProductPage.clearAllField();
//		createProductPage.uploadImage();
//		createProductPage.clickButtonDang();
//
//		assertEqualCommon(createProductPage.getProductNameErrorMsg(),
//				commonData.getCreateProductPage().getHayDienTenSanPhamMsg());
//
//		assertEqualCommon(createProductPage.getCategoryErrorMsg(),
//				commonData.getCreateProductPage().getHayChonDanhMucMsg());
//
//		assertEqualCommon(createProductPage.getDescriptionErrorMsg(),
//				commonData.getCreateProductPage().getHayMoTaSanPhamMsg());
//
//		assertEqualCommon(createProductPage.getQuantityErrorMsg(),
//				commonData.getCreateProductPage().getNhapSoLuongMsg());
//
//		assertEqualCommon(createProductPage.getPriceErrorMsg(), commonData.getCreateProductPage().getHayDienGiaMsg());
//
//		assertEqualCommon(createProductPage.getWeightErrorMsg(),
//				commonData.getCreateProductPage().getHayDienCanNangSanPhamMsg());
//
//		assertEqualCommon(createProductPage.getWidthErrorMsg(), commonData.getCreateProductPage().getBatBuocMsg());
//
//		assertEqualCommon(createProductPage.getLengthErrorMsg(), commonData.getCreateProductPage().getBatBuocMsg());
//
//		assertEqualCommon(createProductPage.getHeightErrorMsg(), commonData.getCreateProductPage().getBatBuocMsg());
//	}
//
//	@Test
//	public void TC_011() throws InterruptedException, AWTException {
//		createProductPage.clearAllField();
//		createProductPage.uploadImage();
//		createProductPage.setProductName(productName);
//		createProductPage.clickButtonDang();
//
//		assertEqualCommon(createProductPage.getCategoryErrorMsg(),
//				commonData.getCreateProductPage().getHayChonDanhMucMsg());
//
//		assertEqualCommon(createProductPage.getDescriptionErrorMsg(),
//				commonData.getCreateProductPage().getHayMoTaSanPhamMsg());
//
//		assertEqualCommon(createProductPage.getQuantityErrorMsg(),
//				commonData.getCreateProductPage().getNhapSoLuongMsg());
//
//		assertEqualCommon(createProductPage.getPriceErrorMsg(), commonData.getCreateProductPage().getHayDienGiaMsg());
//
//		assertEqualCommon(createProductPage.getWeightErrorMsg(),
//				commonData.getCreateProductPage().getHayDienCanNangSanPhamMsg());
//
//		assertEqualCommon(createProductPage.getWidthErrorMsg(), commonData.getCreateProductPage().getBatBuocMsg());
//
//		assertEqualCommon(createProductPage.getLengthErrorMsg(), commonData.getCreateProductPage().getBatBuocMsg());
//
//		assertEqualCommon(createProductPage.getHeightErrorMsg(), commonData.getCreateProductPage().getBatBuocMsg());
//	}
//
//	@Test
//	public void TC_012() throws InterruptedException, AWTException {
//		createProductPage.clearAllField();
//		createProductPage.uploadImage();
//		createProductPage.setProductName(productName);
//		createProductPage.selectCombobox1(comboBox1Value);//
//		createProductPage.clickButtonDang();//
//		assertEqualCommon(createProductPage.getCategoryErrorMsg(),
//				commonData.getCreateProductPage().getHayChonDanhMucMsg());//
//		assertEqualCommon(createProductPage.getDescriptionErrorMsg(),
//				commonData.getCreateProductPage().getHayMoTaSanPhamMsg());//
//		assertEqualCommon(createProductPage.getQuantityErrorMsg(),
//				commonData.getCreateProductPage().getNhapSoLuongMsg());//
//		assertEqualCommon(createProductPage.getPriceErrorMsg(), commonData.getCreateProductPage().getHayDienGiaMsg());//
//		assertEqualCommon(createProductPage.getWeightErrorMsg(),
//				commonData.getCreateProductPage().getHayDienCanNangSanPhamMsg());//
//		assertEqualCommon(createProductPage.getWidthErrorMsg(), commonData.getCreateProductPage().getBatBuocMsg());//
//		assertEqualCommon(createProductPage.getLengthErrorMsg(), commonData.getCreateProductPage().getBatBuocMsg());//
//		assertEqualCommon(createProductPage.getHeightErrorMsg(), commonData.getCreateProductPage().getBatBuocMsg());
//	}
//
//	@Test
//	public void TC_013() throws InterruptedException, AWTException {
//		createProductPage.clearAllField();
//		createProductPage.uploadImage();
//		createProductPage.setProductName(productName);
//		createProductPage.selectCombobox1(comboBox1Value);
//		createProductPage.selectCombobox2(comboBox2Value);//
//		createProductPage.clickButtonDang();//
//		assertEqualCommon(createProductPage.getDescriptionErrorMsg(),
//				commonData.getCreateProductPage().getHayMoTaSanPhamMsg());//
//		assertEqualCommon(createProductPage.getQuantityErrorMsg(),
//				commonData.getCreateProductPage().getNhapSoLuongMsg());//
//		assertEqualCommon(createProductPage.getPriceErrorMsg(), commonData.getCreateProductPage().getHayDienGiaMsg());//
//		assertEqualCommon(createProductPage.getWeightErrorMsg(),
//				commonData.getCreateProductPage().getHayDienCanNangSanPhamMsg());//
//		assertEqualCommon(createProductPage.getWidthErrorMsg(), commonData.getCreateProductPage().getBatBuocMsg());//
//		assertEqualCommon(createProductPage.getLengthErrorMsg(), commonData.getCreateProductPage().getBatBuocMsg());//
//		assertEqualCommon(createProductPage.getHeightErrorMsg(), commonData.getCreateProductPage().getBatBuocMsg());
//	}
//
//	@Test
//	public void TC_014() throws InterruptedException, AWTException {
//		createProductPage.clearAllField();
//		createProductPage.uploadImage();
//		createProductPage.setProductName(productName);
//		createProductPage.selectCombobox1(comboBox1Value);
//		createProductPage.selectCombobox2(comboBox2Value);
//		createProductPage.setDescriptionProduct("Description product");
//		createProductPage.clickButtonDang();//
//
//		assertEqualCommon(createProductPage.getQuantityErrorMsg(),
//				commonData.getCreateProductPage().getNhapSoLuongMsg());//
//		assertEqualCommon(createProductPage.getPriceErrorMsg(), commonData.getCreateProductPage().getHayDienGiaMsg());//
//		assertEqualCommon(createProductPage.getWeightErrorMsg(),
//				commonData.getCreateProductPage().getHayDienCanNangSanPhamMsg());//
//		assertEqualCommon(createProductPage.getWidthErrorMsg(), commonData.getCreateProductPage().getBatBuocMsg());//
//		assertEqualCommon(createProductPage.getLengthErrorMsg(), commonData.getCreateProductPage().getBatBuocMsg());//
//		assertEqualCommon(createProductPage.getHeightErrorMsg(), commonData.getCreateProductPage().getBatBuocMsg());
//	}
//
//	@Test
//	public void TC_015() throws InterruptedException, AWTException {
//		createProductPage.clearAllField();
//		createProductPage.uploadImage();
//		createProductPage.setProductName(productName);
//		createProductPage.selectCombobox1(comboBox1Value);
//		createProductPage.selectCombobox2(comboBox2Value);
//		createProductPage.setDescriptionProduct("Description product");
//		createProductPage.setQuantity("10");
//		createProductPage.clickButtonDang();
//
//		assertEqualCommon(createProductPage.getPriceErrorMsg(), commonData.getCreateProductPage().getHayDienGiaMsg());
//
//		assertEqualCommon(createProductPage.getWeightErrorMsg(),
//				commonData.getCreateProductPage().getHayDienCanNangSanPhamMsg());
//
//		assertEqualCommon(createProductPage.getWidthErrorMsg(), commonData.getCreateProductPage().getBatBuocMsg());
//
//		assertEqualCommon(createProductPage.getLengthErrorMsg(), commonData.getCreateProductPage().getBatBuocMsg());
//
//		assertEqualCommon(createProductPage.getHeightErrorMsg(), commonData.getCreateProductPage().getBatBuocMsg());
//	}
//
//	@Test
//	public void TC_016() throws InterruptedException, AWTException {
//		createProductPage.clearAllField();
//		createProductPage.uploadImage();
//		createProductPage.setProductName(productName);
//		createProductPage.selectCombobox1(comboBox1Value);
//		createProductPage.selectCombobox2(comboBox2Value);
//		createProductPage.setDescriptionProduct("Description product");
//		createProductPage.setQuantity("10");
//		createProductPage.setPrice("8");
//		createProductPage.clickButtonDang();
//
//		assertEqualCommon(createProductPage.getWeightErrorMsg(),
//				commonData.getCreateProductPage().getHayDienCanNangSanPhamMsg());
//		assertEqualCommon(createProductPage.getWidthErrorMsg(), commonData.getCreateProductPage().getBatBuocMsg());
//		assertEqualCommon(createProductPage.getLengthErrorMsg(), commonData.getCreateProductPage().getBatBuocMsg());
//		assertEqualCommon(createProductPage.getHeightErrorMsg(), commonData.getCreateProductPage().getBatBuocMsg());
//	}
//
//	@Test
//	public void TC_017() throws InterruptedException, AWTException {
//		createProductPage.clearAllField();
//		createProductPage.uploadImage();
//		createProductPage.setProductName(productName);
//		createProductPage.selectCombobox1(comboBox1Value);
//		createProductPage.selectCombobox2(comboBox2Value);
//		createProductPage.setDescriptionProduct("Description product");
//		createProductPage.setQuantity("10");
//		createProductPage.setPrice("8");
//		createProductPage.setWeight("49");
//		createProductPage.clickButtonDang();
//
//		assertEqualCommon(createProductPage.getWeightErrorMsg(),
//				commonData.getCreateProductPage().getCanNangTu50gDen1000gMsg());
//		assertEqualCommon(createProductPage.getWidthErrorMsg(), commonData.getCreateProductPage().getBatBuocMsg());
//		assertEqualCommon(createProductPage.getLengthErrorMsg(), commonData.getCreateProductPage().getBatBuocMsg());
//		assertEqualCommon(createProductPage.getHeightErrorMsg(), commonData.getCreateProductPage().getBatBuocMsg());
//	}
//
//	@Test
//	public void TC_018() throws InterruptedException, AWTException {
//		createProductPage.clearAllField();
//		createProductPage.uploadImage();
//		createProductPage.setProductName(productName);
//		createProductPage.selectCombobox1(comboBox1Value);
//		createProductPage.selectCombobox2(comboBox2Value);
//		createProductPage.setDescriptionProduct("Description product");
//		createProductPage.setQuantity("10");
//		createProductPage.setPrice("8");
//		createProductPage.setWeight("10001");
//		createProductPage.clickButtonDang();
//		assertEqualCommon(createProductPage.getWeightErrorMsg(),
//				commonData.getCreateProductPage().getCanNangTu50gDen1000gMsg());
//		assertEqualCommon(createProductPage.getWidthErrorMsg(), commonData.getCreateProductPage().getBatBuocMsg());
//		assertEqualCommon(createProductPage.getLengthErrorMsg(), commonData.getCreateProductPage().getBatBuocMsg());
//		assertEqualCommon(createProductPage.getHeightErrorMsg(), commonData.getCreateProductPage().getBatBuocMsg());
//	}
//
//	@Test
//	public void TC_019() throws InterruptedException, AWTException {
//		createProductPage.clearAllField();
//		createProductPage.uploadImage();
//		createProductPage.setProductName(productName);
//		createProductPage.selectCombobox1(comboBox1Value);
//		createProductPage.selectCombobox2(comboBox2Value);
//		createProductPage.setDescriptionProduct("Description product");
//		createProductPage.setQuantity("10");
//		createProductPage.setPrice("8");
//		createProductPage.setWeight("50");
//		createProductPage.clickButtonDang();
//
//		assertEqualCommon(createProductPage.getWidthErrorMsg(), commonData.getCreateProductPage().getBatBuocMsg());
//		assertEqualCommon(createProductPage.getLengthErrorMsg(), commonData.getCreateProductPage().getBatBuocMsg());
//		assertEqualCommon(createProductPage.getHeightErrorMsg(), commonData.getCreateProductPage().getBatBuocMsg());
//	}
//
//	@Test
//	public void TC_020() throws InterruptedException, AWTException {
//		createProductPage.clearAllField();
//		createProductPage.uploadImage();
//		createProductPage.setProductName(productName);
//		createProductPage.selectCombobox1(comboBox1Value);
//		createProductPage.selectCombobox2(comboBox2Value);
//		createProductPage.setDescriptionProduct("Description product");
//		createProductPage.setQuantity("10");
//		createProductPage.setPrice("8");
//		createProductPage.setWeight("1000");
//		createProductPage.clickButtonDang();
//
//		assertEqualCommon(createProductPage.getWidthErrorMsg(), commonData.getCreateProductPage().getBatBuocMsg());
//		assertEqualCommon(createProductPage.getLengthErrorMsg(), commonData.getCreateProductPage().getBatBuocMsg());
//		assertEqualCommon(createProductPage.getHeightErrorMsg(), commonData.getCreateProductPage().getBatBuocMsg());
//	}
//
//	@Test
//	public void TC_021() throws InterruptedException, AWTException {
//		createProductPage.clearAllField();
//		createProductPage.uploadImage();
//		createProductPage.setProductName(productName);
//		createProductPage.selectCombobox1(comboBox1Value);
//		createProductPage.selectCombobox2(comboBox2Value);
//		createProductPage.setDescriptionProduct("Description product");
//		createProductPage.setQuantity("10");
//		createProductPage.setPrice("8");
//		createProductPage.setWeight("1000");
//		createProductPage.setWidth("0");
//		createProductPage.clickButtonDang();
//
//		assertEqualCommon(createProductPage.getWidthErrorMsg(), commonData.getCreateProductPage().getTu1cmToi50cmMsg());
//		assertEqualCommon(createProductPage.getLengthErrorMsg(), commonData.getCreateProductPage().getBatBuocMsg());
//		assertEqualCommon(createProductPage.getHeightErrorMsg(), commonData.getCreateProductPage().getBatBuocMsg());
//	}
//
//	@Test
//	public void TC_022() throws InterruptedException, AWTException {
//		createProductPage.clearAllField();
//		createProductPage.uploadImage();
//		createProductPage.setProductName(productName);
//		createProductPage.selectCombobox1(comboBox1Value);
//		createProductPage.selectCombobox2(comboBox2Value);
//		createProductPage.setDescriptionProduct("Description product");
//		createProductPage.setQuantity("10");
//		createProductPage.setPrice("8");
//		createProductPage.setWeight("1000");
//		createProductPage.setWidth("51");
//		createProductPage.clickButtonDang();
//
//		assertEqualCommon(createProductPage.getWidthErrorMsg(), commonData.getCreateProductPage().getTu1cmToi50cmMsg());
//		assertEqualCommon(createProductPage.getLengthErrorMsg(), commonData.getCreateProductPage().getBatBuocMsg());
//		assertEqualCommon(createProductPage.getHeightErrorMsg(), commonData.getCreateProductPage().getBatBuocMsg());
//	}
//
//	@Test
//	public void TC_023() throws InterruptedException, AWTException {
//		createProductPage.clearAllField();
//		createProductPage.uploadImage();
//		createProductPage.setProductName(productName);
//		createProductPage.selectCombobox1(comboBox1Value);
//		createProductPage.selectCombobox2(comboBox2Value);
//		createProductPage.setDescriptionProduct("Description product");
//		createProductPage.setQuantity("10");
//		createProductPage.setPrice("8");
//		createProductPage.setWeight("1000");
//		createProductPage.setWidth("1");
//		createProductPage.clickButtonDang();
//
//		assertEqualCommon(createProductPage.getLengthErrorMsg(), commonData.getCreateProductPage().getBatBuocMsg());
//		assertEqualCommon(createProductPage.getHeightErrorMsg(), commonData.getCreateProductPage().getBatBuocMsg());
//	}
//
//	@Test
//	public void TC_024() throws InterruptedException, AWTException {
//		createProductPage.clearAllField();
//		createProductPage.uploadImage();
//		createProductPage.setProductName(productName);
//		createProductPage.selectCombobox1(comboBox1Value);
//		createProductPage.selectCombobox2(comboBox2Value);
//		createProductPage.setDescriptionProduct("Description product");
//		createProductPage.setQuantity("10");
//		createProductPage.setPrice("8");
//		createProductPage.setWeight("1000");
//		createProductPage.setWidth("50");
//		createProductPage.clickButtonDang();
//
//		assertEqualCommon(createProductPage.getLengthErrorMsg(), commonData.getCreateProductPage().getBatBuocMsg());
//		assertEqualCommon(createProductPage.getHeightErrorMsg(), commonData.getCreateProductPage().getBatBuocMsg());
//	}
//
//	@Test
//	public void TC_025() throws InterruptedException, AWTException {
//		createProductPage.clearAllField();
//		createProductPage.uploadImage();
//		createProductPage.setProductName(productName);
//		createProductPage.selectCombobox1(comboBox1Value);
//		createProductPage.selectCombobox2(comboBox2Value);
//		createProductPage.setDescriptionProduct("Description product");
//		createProductPage.setQuantity("10");
//		createProductPage.setPrice("8");
//		createProductPage.setWeight("1000");
//		createProductPage.setWidth("50");
//		createProductPage.setLength("0");
//
//		createProductPage.clickButtonDang();
//
//		assertEqualCommon(createProductPage.getLengthErrorMsg(),
//				commonData.getCreateProductPage().getTu1cmToi30cmMsg());
//		assertEqualCommon(createProductPage.getHeightErrorMsg(), commonData.getCreateProductPage().getBatBuocMsg());
//	}
//
//	@Test
//	public void TC_026() throws InterruptedException, AWTException {
//		createProductPage.clearAllField();
//		createProductPage.uploadImage();
//		createProductPage.setProductName(productName);
//		createProductPage.selectCombobox1(comboBox1Value);
//		createProductPage.selectCombobox2(comboBox2Value);
//		createProductPage.setDescriptionProduct("Description product");
//		createProductPage.setQuantity("10");
//		createProductPage.setPrice("8");
//		createProductPage.setWeight("1000");
//		createProductPage.setWidth("50");
//		createProductPage.setLength("31");
//		createProductPage.clickButtonDang();
//
//		assertEqualCommon(createProductPage.getLengthErrorMsg(),
//				commonData.getCreateProductPage().getTu1cmToi30cmMsg());
//		assertEqualCommon(createProductPage.getHeightErrorMsg(), commonData.getCreateProductPage().getBatBuocMsg());
//	}
//
//	@Test
//	public void TC_027() throws InterruptedException, AWTException {
//		createProductPage.clearAllField();
//		createProductPage.uploadImage();
//		createProductPage.setProductName(productName);
//		createProductPage.selectCombobox1(comboBox1Value);
//		createProductPage.selectCombobox2(comboBox2Value);
//		createProductPage.setDescriptionProduct("Description product");
//		createProductPage.setQuantity("10");
//		createProductPage.setPrice("8");
//		createProductPage.setWeight("1000");
//		createProductPage.setWidth("50");
//		createProductPage.setLength("1");
//		createProductPage.clickButtonDang();
//
//		assertEqualCommon(createProductPage.getHeightErrorMsg(), commonData.getCreateProductPage().getBatBuocMsg());
//	}
//
//	@Test
//	public void TC_028() throws InterruptedException, AWTException {
//		createProductPage.clearAllField();
//		createProductPage.uploadImage();
//		createProductPage.setProductName(productName);
//		createProductPage.selectCombobox1(comboBox1Value);
//		createProductPage.selectCombobox2(comboBox2Value);
//		createProductPage.setDescriptionProduct("Description product");
//		createProductPage.setQuantity("10");
//		createProductPage.setPrice("8");
//		createProductPage.setWeight("1000");
//		createProductPage.setWidth("50");
//		createProductPage.setLength("30");
//		createProductPage.clickButtonDang();
//
//		assertEqualCommon(createProductPage.getHeightErrorMsg(), commonData.getCreateProductPage().getBatBuocMsg());
//	}
//
//	@Test
//	public void TC_029() throws InterruptedException, AWTException {
//		createProductPage.clearAllField();
//		createProductPage.uploadImage();
//		createProductPage.setProductName(productName);
//		createProductPage.selectCombobox1(comboBox1Value);
//		createProductPage.selectCombobox2(comboBox2Value);
//		createProductPage.setDescriptionProduct("Description product");
//		createProductPage.setQuantity("10");
//		createProductPage.setPrice("8");
//		createProductPage.setWeight("1000");
//		createProductPage.setWidth("50");
//		createProductPage.setLength("30");
//		createProductPage.setHeight("0");
//		createProductPage.clickButtonDang();
//
//		assertEqualCommon(createProductPage.getHeightErrorMsg(),
//				commonData.getCreateProductPage().getTu1cmToi50cmMsg());
//	}
//
//	@Test
//	public void TC_030() throws InterruptedException, AWTException {
//		createProductPage.clearAllField();
//		createProductPage.uploadImage();
//		createProductPage.setProductName(productName);
//		createProductPage.selectCombobox1(comboBox1Value);
//		createProductPage.selectCombobox2(comboBox2Value);
//		createProductPage.setDescriptionProduct("Description product");
//		createProductPage.setQuantity("10");
//		createProductPage.setPrice("8");
//		createProductPage.setWeight("1000");
//		createProductPage.setWidth("50");
//		createProductPage.setLength("30");
//		createProductPage.setHeight("51");
//		createProductPage.clickButtonDang();
//
//		assertEqualCommon(createProductPage.getHeightErrorMsg(),
//				commonData.getCreateProductPage().getTu1cmToi50cmMsg());
//	}
//
//	@Test
//	public void TC_031() throws InterruptedException, AWTException {
//		createProductPage.clearAllField();
//		createProductPage.uploadImage();
//		createProductPage.setProductName(productName);
//		createProductPage.selectCombobox1(comboBox1Value);
//		createProductPage.selectCombobox2(comboBox2Value);
//
//		if (createProductPage.checkCombobox3IsAvailable()) {
//			createProductPage.selectCombobox3(comboBox3Value);
//		}
//
//		createProductPage.setDescriptionProduct("Description product");
//		createProductPage.setQuantity("10");
//		createProductPage.setPrice(price);
//		createProductPage.setWeight("1000");
//		createProductPage.setWidth("50");
//		createProductPage.setLength("30");
//		createProductPage.setHeight("1");
//		createProductPage.clickButtonDang();
//		assertEqualCommon(createProductPage.getSuccessMsg(),
//				commonData.getCreateProductPage().getBanDaDangThanhCongSanPhamNayMsg());
//
//		createProductPage.clickViewListBtn();
//		assertEqualCommon(homePage.getProductNameLBL(), productName.toLowerCase());
//		assertTrue(homePage.getProductPriceLBL().contains(price));
//		
//		//Delete Product
//		editPage = homePage.clickEditBtn();
//		editPage.clickDeleteButton();
//		editPage.clickConfirmDeleteButton();
//	}
//
//	@Test
//	public void TC_032() throws InterruptedException, AWTException {
//		createProductPage.clearAllField();
//		createProductPage.uploadImage();
//		createProductPage.setProductName(productName);
//		createProductPage.selectCombobox1(comboBox1Value);
//		createProductPage.selectCombobox2(comboBox2Value);
//
//		if (createProductPage.checkCombobox3IsAvailable()) {
//			createProductPage.selectCombobox3(comboBox3Value);
//		}
//
//		createProductPage.setDescriptionProduct("Description product");
//		createProductPage.setQuantity("10");
//		createProductPage.setPrice(price);
//		createProductPage.setWeight("1000");
//		createProductPage.setWidth("50");
//		createProductPage.setLength("30");
//		createProductPage.setHeight("50");
//		createProductPage.clickButtonDang();
//		assertEqualCommon(createProductPage.getSuccessMsg(),
//				commonData.getCreateProductPage().getBanDaDangThanhCongSanPhamNayMsg());
//
//		createProductPage.clickViewListBtn();
//		assertEqualCommon(homePage.getProductNameLBL(), productName.toLowerCase());
//		assertTrue(homePage.getProductPriceLBL().contains(price));
//		
//		//Delete Product
//		editPage = homePage.clickEditBtn();
//		editPage.clickDeleteButton();
//		editPage.clickConfirmDeleteButton();
//	}

//	@Test
//	public void TC_033() throws InterruptedException, AWTException {
//		createProductPage.clearAllField();
//		createProductPage.uploadImage();
//		createProductPage.setProductName(productName);
//		createProductPage.selectCombobox1(comboBox1Value);
//		String combobox1SelectedText = createProductPage.getCombobox1Value();
//		createProductPage.selectCombobox2(comboBox2Value);
//		String combobox2SelectedText = createProductPage.getCombobox2Value();
//		String combobox3SelectedText=null;
//		if (createProductPage.checkCombobox3IsAvailable()) {
//			createProductPage.selectCombobox3(comboBox3Value);
//			combobox3SelectedText = createProductPage.getCombobox3Value();
//		}
//
//		createProductPage.setDescriptionProduct(commonData.getCreateProductPage().getDescriptionProduct());
//		createProductPage.setQuantity(commonData.getCreateProductPage().getQuantity());
//		createProductPage.setPrice(price);
//		createProductPage.setWeight(commonData.getCreateProductPage().getWeight());
//		createProductPage.setWidth(commonData.getCreateProductPage().getWidth());
//		createProductPage.setLength(commonData.getCreateProductPage().getLength());
//		createProductPage.setHeight(commonData.getCreateProductPage().getHeight());
//		createProductPage.clickButtonDang();
//		assertEqualCommon(createProductPage.getSuccessMsg(),
//				commonData.getCreateProductPage().getBanDaDangThanhCongSanPhamNayMsg());
//
//		createProductPage.clickViewListBtn();
//		assertEqualCommon(homePage.getProductNameLBL(), productName.toLowerCase());
//		assertTrue(homePage.getProductPriceLBL().contains(price));
//		editPage = homePage.clickEditBtn();
//		//ProductName, Combobox1-3, Price are the local variables
//		assertEqualCommon(editPage.getProductNameValue(), productName);
//		assertEqualCommon(editPage.getComboBox1Value(), combobox1SelectedText);
//		assertEqualCommon(editPage.getComboBox2Value(), combobox2SelectedText);
//		if (createProductPage.checkCombobox3IsAvailable()) {
//			assertEqualCommon(editPage.getComboBox3Value(), combobox3SelectedText);			
//		}
//		
//		assertEqualCommon(editPage.getQuantityValue(), commonData.getCreateProductPage().getQuantity());
//		assertEqualCommon(editPage.getPriceValue(), price+",000");
//		assertEqualCommon(editPage.getWeightValue(), commonData.getCreateProductPage().getWeight());
//		assertEqualCommon(editPage.getWidthValue(), commonData.getCreateProductPage().getWidth());
//		assertEqualCommon(editPage.getLengthValue(), commonData.getCreateProductPage().getLength());
//		assertEqualCommon(editPage.getHeightValue(), commonData.getCreateProductPage().getHeight());
//		
//		
//		//Delete Product
////		editPage = homePage.clickEditBtn();
//		editPage.clickDeleteButton();
//		editPage.clickConfirmDeleteButton();
//	}

	@Test
	public void TC_034() throws InterruptedException, AWTException {
		String priceTC34 = "7";
		String giamGia = "9";
		
		double expectedPriceDouble = (Double.parseDouble(priceTC34) - Double.parseDouble(priceTC34)*Double.parseDouble(giamGia)/100)*1000;
		String expectedPrice = NumberFormat.getInstance().format(expectedPriceDouble);
		
		createProductPage.clearAllField();
		createProductPage.uploadImage();
		createProductPage.setProductName(productName);
		createProductPage.selectCombobox1(comboBox1Value);
		createProductPage.selectCombobox2(comboBox2Value);

		if (createProductPage.checkCombobox3IsAvailable()) {
			createProductPage.selectCombobox3(comboBox3Value);
		}

		createProductPage.setDescriptionProduct("Description product");
		createProductPage.setQuantity("10");
		createProductPage.setPrice(priceTC34);
		createProductPage.setWeight("1000");
		createProductPage.setWidth("50");
		createProductPage.setLength("30");
		createProductPage.setHeight("50");
		createProductPage.clickButtonDang();
		assertEqualCommon(createProductPage.getSuccessMsg(),
				commonData.getCreateProductPage().getBanDaDangThanhCongSanPhamNayMsg());

		createProductPage.clickViewListBtn();
		assertEqualCommon(homePage.getProductNameLBL(), productName.toLowerCase());
		assertTrue(homePage.getProductPriceLBL().contains(priceTC34));

		editPage = homePage.clickEditBtn();
		editPage.clickEditQuantitySpan();
		editPage.setQuantityInput("0");
		editPage.clickConfirmBtn();
		editPage.setDiscountValue(giamGia);
		editPage.clickUpdateBtn();

		assertEqualCommon(editPage.getUpdateSuccessMsg(), "Bạn đã cập nhật thành công sản phẩm này");

		viewProductPage = editPage.clickViewProduct();
		assertEqualCommon(viewProductPage.getProductNameLBL(), productName.toLowerCase());
//		System.out.println(priceTC34+",");
//		System.out.println(expectedPrice);
//		System.out.println("Get: "+viewProductPage.getProductPriceLBL(priceTC34+","));
		assertTrue(viewProductPage.getProductPriceLBL(priceTC34+",").contains(expectedPrice));
		
		assertEqualCommon(viewProductPage.getLabelLBL(), "Hết hàng");
		
		//Delete Product
		editPage = viewProductPage.clickEditBtn();
		editPage.clickDeleteButton();
		editPage.clickConfirmDeleteButton();
	}

	@AfterClass
	public void afterClass() {
		//
	}
}
