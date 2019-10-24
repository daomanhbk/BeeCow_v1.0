package jSonClasses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class jSonFather {
	@SerializedName("LogInPage")
	@Expose
	private LogInPage logInPage;
	
	@SerializedName("CreateProductPage")
	@Expose
	private CreateProductPage createProductPage;

	public LogInPage getLogInPage() {
		return logInPage;
	}

	public void setLogInPage(LogInPage logInPage) {
		this.logInPage = logInPage;
	}

	public CreateProductPage getCreateProductPage() {
		return createProductPage;
	}

	public void setCreateProductPage(CreateProductPage createProductPage) {
		this.createProductPage = createProductPage;
	}

	
}
