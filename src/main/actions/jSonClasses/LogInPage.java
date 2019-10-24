package jSonClasses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LogInPage {
    @SerializedName("url") 
    @Expose
    private String url;
    
    @SerializedName("phoneErrorMessageMsg") 
    @Expose
    private String phoneErrorMessageMsg;
    
    @SerializedName("emailErrorMessageMsg") 
    @Expose
    private String emailErrorMessageMsg;
    
    @SerializedName("logInErrorMessageMsG") 
    @Expose
    private String logInErrorMessageMsG;
    
    @SerializedName("toiThieu6KiTuMsg") 
    @Expose
    private String toiThieu6KiTuMsg;
    
    public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getPhoneErrorMessageMsg() {
		return phoneErrorMessageMsg;
	}

	public void setPhoneErrorMessageMsg(String phoneErrorMessageMsg) {
		this.phoneErrorMessageMsg = phoneErrorMessageMsg;
	}

	public String getEmailErrorMessageMsg() {
		return emailErrorMessageMsg;
	}

	public void setEmailErrorMessageMsg(String emailErrorMessageMsg) {
		this.emailErrorMessageMsg = emailErrorMessageMsg;
	}

	public String getLogInErrorMessageMsG() {
		return logInErrorMessageMsG;
	}

	public void setLogInErrorMessageMsG(String logInErrorMessageMsG) {
		this.logInErrorMessageMsG = logInErrorMessageMsG;
	}

	public String getToiThieu6KiTuMsg() {
		return toiThieu6KiTuMsg;
	}

	public void setToiThieu6KiTuMsg(String toiThieu6KiTuMsg) {
		this.toiThieu6KiTuMsg = toiThieu6KiTuMsg;
	}

	public String getSaiEmailSoDTHoacMatKhauMsg() {
		return saiEmailSoDTHoacMatKhauMsg;
	}

	public void setSaiEmailSoDTHoacMatKhauMsg(String saiEmailSoDTHoacMatKhauMsg) {
		this.saiEmailSoDTHoacMatKhauMsg = saiEmailSoDTHoacMatKhauMsg;
	}

	public String getCoChutVanDeXayRaMsg() {
		return coChutVanDeXayRaMsg;
	}

	public void setCoChutVanDeXayRaMsg(String coChutVanDeXayRaMsg) {
		this.coChutVanDeXayRaMsg = coChutVanDeXayRaMsg;
	}

	@SerializedName("saiEmailSoDTHoacMatKhauMsg") 
    @Expose
    private String saiEmailSoDTHoacMatKhauMsg;
    
    @SerializedName("coChutVanDeXayRaMsg") 
    @Expose
    private String coChutVanDeXayRaMsg;
    
    @SerializedName("hayChonHinhAnhChoSanPham") 
    @Expose
    private String hayChonHinhAnhChoSanPham;

	public String getHayChonHinhAnhChoSanPham() {
		return hayChonHinhAnhChoSanPham;
	}

	public void setHayChonHinhAnhChoSanPham(String hayChonHinhAnhChoSanPham) {
		this.hayChonHinhAnhChoSanPham = hayChonHinhAnhChoSanPham;
	}
}
