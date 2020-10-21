package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {
	private WebDriver driver; 
	
	public LoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="input-username")
	private WebElement userName; 
	
	@FindBy(id="input-password")
	private WebElement password;
	
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div/div/div/div[2]/form/div[3]/button")
	private WebElement loginBtn; 
	
	@FindBy(id="catalog")
	private WebElement catalog;
	
	@FindBy(id="button-menu")
	private WebElement menu;
	
	@FindBy(xpath="//*[@id=\"catalog\"]/ul/li[1]/a")
	private WebElement categories;
	
	@FindBy(xpath="//*[@id=\"form-category\"]/div/table/tbody/tr[1]/td[4]/a")
	private WebElement edit;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[1]/div/div/a")
	private WebElement cancel;
	
	@FindBy(xpath="//*[@id=\"form-category\"]/div/table/tbody/tr[1]/td[1]/input")
	private WebElement checkbox;
	
	@FindBy(xpath="//*[@id=\"form-category\"]/div/table/tbody/tr[2]/td[1]/input")
	private WebElement checkbox2;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[1]/div/div/button")
	private WebElement delete;
	
	@FindBy(xpath="//*[@id=\"header\"]/ul/li[4]/a")
	private WebElement logout;
	
	@FindBy(xpath="//*[@id=\"catalog\"]/ul/li[2]/a")
	private WebElement products;
	
	@FindBy(id="input-name")
	private WebElement productName;
	
	@FindBy(id="input-price")
	private WebElement price;
	
	@FindBy(id="input-status")
	private WebElement status;
	
	@FindBy(id="input-model")
	private WebElement model;
	
	@FindBy(id="input-quantity")
	private WebElement quantity;
	
	@FindBy(id="button-filter")
	private WebElement filter;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[1]/div/div/a")
	private WebElement addnew;
	
	@FindBy(id="input-name1")
	private WebElement newProductname;
	
	@FindBy(id="input-meta-title1")
	private WebElement metaTitle;
	
	@FindBy(xpath="//*[@id=\"form-product\"]/ul/li[2]/a")
	private WebElement datatab;
	
	@FindBy(id="input-model")
	private WebElement inModel;
	
	@FindBy(xpath="//*[@id=\"form-product\"]/ul/li[3]/a")
	private WebElement link;
	
	@FindBy(id="input-category")
	private WebElement cat;
	
	@FindBy(xpath="//*[@id=\"tab-links\"]/div[2]/div/ul/li[2]")
	private WebElement listVal;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[1]/div/div/button")
	private WebElement savebtn;
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	
	public void clickCatalog() throws InterruptedException {
		Thread.sleep(2000);
		this.catalog.click();
	}
	
	public void clickMenu() throws InterruptedException {
		Thread.sleep(2000);
		this.menu.click();
	}
	
	public void clickCategories() throws InterruptedException {
		Thread.sleep(2000);
		this.categories.click();
	}
	
	public void clickCheckbox2() throws InterruptedException {
		Thread.sleep(500);
		this.checkbox2.click();
	}
	
	public void clickEdit() throws InterruptedException {
		Thread.sleep(2000);
		this.edit.click();
	}
	
	public void clickCancel() throws InterruptedException {
		Thread.sleep(2000);
		this.cancel.click();
	}
	
	public void clickCheckbox() throws InterruptedException {
		Thread.sleep(2000);
		this.checkbox.click();
	}
	
	public void clickDelete() throws InterruptedException {
		Thread.sleep(2000);
		this.delete.click();
	}
	
	public void clickLogout() throws InterruptedException {
		Thread.sleep(2000);
		this.logout.click();
	}
	
	public void clickProducts() throws InterruptedException {
		Thread.sleep(1500);
		this.products.click();
	}
	
	public void sendProductName(String name) throws InterruptedException {
		Thread.sleep(1500);
		this.productName.clear();
		this.productName.sendKeys(name);
	}
	
	public void sendPrice(String price) throws InterruptedException {
		Thread.sleep(1500);
		this.price.clear();
		this.price.sendKeys(price);
	}
	
	public void clickStatus() throws InterruptedException {
		Thread.sleep(1500);
		this.status.click();
	}
	
	public void sendModel(String model) throws InterruptedException {
		Thread.sleep(1500);
		this.model.clear();
		this.model.sendKeys(model);
	}
	
	public void sendQuantity(String quantity) throws InterruptedException {
		Thread.sleep(1500);
		this.quantity.clear();
		this.quantity.sendKeys(quantity);
	}
	
	public void clickFilter() throws InterruptedException {
		Thread.sleep(1000);
		this.filter.click();
	}
	
	public void clickAddnew() throws InterruptedException {
		Thread.sleep(1500);
		this.addnew.click();
	}
	
	public void sendNewProductname(String name) throws InterruptedException {
		Thread.sleep(1000);
		this.newProductname.clear();
		this.newProductname.sendKeys(name);
	}
	
	public void sendMetaTitle(String title) throws InterruptedException {
		Thread.sleep(2500);
		this.metaTitle.clear();
		this.metaTitle.sendKeys(title);
	}
	
	public void clickDatatab() throws InterruptedException {
		Thread.sleep(1500);
		this.datatab.click();
	}
	
	public void sendInputmodel(String model) throws InterruptedException {
		Thread.sleep(1500);
		this.inModel.clear();
		this.inModel.sendKeys(model);
	}
    
	public void clickLink() throws InterruptedException {
		Thread.sleep(1500);
		this.link.click();
	}
	
	public void clickCat() throws InterruptedException {
		Thread.sleep(1500);
		this.cat.click();
	}
	
	public void clickListval() throws InterruptedException {
		Thread.sleep(1000);
		this.listVal.click();
	}
	
	public void clickSavebtn() throws InterruptedException {
		Thread.sleep(1500);
		this.savebtn.click();
	}
}
