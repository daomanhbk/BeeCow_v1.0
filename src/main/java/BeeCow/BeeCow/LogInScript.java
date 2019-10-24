package BeeCow.BeeCow;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beecow.actions.LogInPageActions;

import Common.CommonTestCase;
import jSonClasses.jSonFather;

public class LogInScript extends CommonTestCase {
	WebDriver driver;
	LogInPageActions logInPageActions;
	jSonFather commonData;
//	String url;
	
//	String phoneErrorMessageMsg, logInErrorMessageMsG, emailErrorMessageMsg, toiThieu6KiTuMsg, saiEmailSoDTHoacMatKhauMsg, coChutVanDeXayRaMsg;

	@Parameters({ "browser", "version" })
	@BeforeClass
	public void beforeClass(String browser, String version) {
		driver = openBowser(browser, version);
//		driver.manage().window().maximize();
		String userPath = System.getProperty("user.dir");
		String pathFileJson = userPath.concat("/data/").concat("jSonData.json");
		commonData = getDataJson(pathFileJson);
		
		logInPageActions = new LogInPageActions(driver);

//		url = "https://www.beecow.com/";
//		
//		phoneErrorMessageMsg = "Số điện thoại không đúng";  
//		emailErrorMessageMsg = "Email không đúng";
//		logInErrorMessageMsG = "Hãy nhập email / số điện thoại và mật khẩu";
//		toiThieu6KiTuMsg = "Tối thiểu 6 ký tự";
//		saiEmailSoDTHoacMatKhauMsg = "Sai email / số điện thoại hoặc mật khẩu";
//		coChutVanDeXayRaMsg = "Có chút vấn đề xảy ra. Hãy thử lại.";
	}

	@Test
	public void TC_001() {
		driver.get(commonData.getLogInPage().getUrl());
		logInPageActions.clickDangNhap();
		logInPageActions.inputUserName("");
		logInPageActions.inputPassword("");
		logInPageActions.clickDangNhapForm();
		assertEqualCommon(logInPageActions.getLogInErrorMessage(), commonData.getLogInPage().getLogInErrorMessageMsG());
	}

	@Test
	public void TC_002() {
		driver.get(commonData.getLogInPage().getUrl());
		logInPageActions.clickDangNhap();
		logInPageActions.inputUserName("1234");
		logInPageActions.clickDangNhapForm();
		assertEqualCommon(logInPageActions.getPhoneEmailErrorMessage(), commonData.getLogInPage().getPhoneErrorMessageMsg()); //phoneErrorMessageMsg
		assertEqualCommon(logInPageActions.getLogInErrorMessage(), commonData.getLogInPage().getLogInErrorMessageMsG()); //logInErrorMessageMsG
	}
	
	@Test
	public void TC_003() {
		driver.get(commonData.getLogInPage().getUrl());
		logInPageActions.clickDangNhap();
		logInPageActions.inputUserName("1234abcd");
		logInPageActions.clickDangNhapForm();
		assertEqualCommon(logInPageActions.getPhoneEmailErrorMessage(), commonData.getLogInPage().getEmailErrorMessageMsg());
		assertEqualCommon(logInPageActions.getLogInErrorMessage(), commonData.getLogInPage().getLogInErrorMessageMsG());
	}
	
	@Test
	public void TC_004() {
		driver.get(commonData.getLogInPage().getUrl());
		logInPageActions.clickDangNhap();
		logInPageActions.inputUserName("genymotionios@gmail.com");
		logInPageActions.clickDangNhapForm();
//		assertEqualCommon(logInPageActions.getPhoneEmailErrorMessage(), commonData.getLogInPage().getEmailErrorMessageMsg);
		assertEqualCommon(logInPageActions.getLogInErrorMessage(), commonData.getLogInPage().getLogInErrorMessageMsG());
	}
	
	@Test
	public void TC_005() {
		driver.get(commonData.getLogInPage().getUrl());
		logInPageActions.clickDangNhap();
		logInPageActions.inputUserName("genymotionios@gmail.com");
		logInPageActions.inputPassword("123");
		logInPageActions.clickDangNhapForm();
//		assertEqualCommon(logInPageActions.getPhoneEmailErrorMessage(), commonData.getLogInPage().getToiThieu6KiTuMsg);
		assertEqualCommon(logInPageActions.getLogInErrorMessage(), commonData.getLogInPage().getCoChutVanDeXayRaMsg());
	}

	@Test
	public void TC_006() {
		driver.get(commonData.getLogInPage().getUrl());
		logInPageActions.clickDangNhap();
		logInPageActions.inputUserName("genymotionios@gmail.com");
		logInPageActions.inputPassword("123456");
		logInPageActions.clickDangNhapForm();
//		assertEqualCommon(logInPageActions.getPhoneEmailErrorMessage(), toiThieu6KiTuMsg);
		assertEqualCommon(logInPageActions.getLogInErrorMessage(), commonData.getLogInPage().getSaiEmailSoDTHoacMatKhauMsg());
	}
	
	@Test
	public void TC_007() {
		driver.get(commonData.getLogInPage().getUrl());
		logInPageActions.clickDangNhap();
		logInPageActions.inputUserName("genymotionios@gmail.com");
		logInPageActions.inputPassword("1234@abcd");
		logInPageActions.clickDangNhapForm();
		assertEqualCommon(logInPageActions.getUserName(), "genymotionios");
//		assertEqualCommon(logInPageActions.getLogInErrorMessage(), saiEmailSoDTHoacMatKhauMsg);
	}
	
	@AfterClass
	public void afterClass() {
		driver.close();
	}
}
