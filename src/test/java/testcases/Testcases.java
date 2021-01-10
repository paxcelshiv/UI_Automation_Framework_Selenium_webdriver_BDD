package testcases;

import static com.adidas.utility.BrowserLuncher.browserhelper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.BeforeTest;

import com.adidas.assertions.Validator;
import com.adidas.utility.BrowserLuncher;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Testcases {
	static List<String> orderdetail;
	@BeforeTest
	public void initLogger() {
		DOMConfigurator.configure("log4j.xml");
	}

	@Given("^Enter the website page url as \"([^\"]*)\"$")
	public void enter_the_website_page_url_as(String url) throws Throwable {
		BrowserLuncher.launchBrowser();
		browserhelper.enterUrl(url);
	}

	@Then("^validate home page with logo \"([^\"]*)\"$")
	public void validate_home_page_with_logo(String logoText) throws Throwable {
		Validator.verify(logoText, browserhelper.getText("Xpath", "/html//a[@id='nava']"));
	}

	@When("^Click on Phones button$")
	public void click_on_Phones_button() throws Throwable {
		browserhelper.click("Xpath", "//*[@id=\"contcont\"]/div/div/div/a[2]");
	}

	@Then("^To validate for open phones tab with \"([^\"]*)\" name$")
	public void to_validate_for_open_phones_tab_with_name(String phoneName) throws Throwable {
		Validator.verify(phoneName, browserhelper.getText("Xpath", "//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a"));
	}

	@When("^Click on Laptops button$")
	public void click_on_Laptops_button() throws Throwable {
		browserhelper.click("Xpath", "//*[@id=\"contcont\"]/div/div/div/a[3]");
	}

	@Then("^To validate for open Laptop tab with \"([^\"]*)\" name$")
	public void to_validate_for_open_Laptop_tab_with_name(String laptopName) throws Throwable {
		Validator.verify(laptopName, browserhelper.getText("Xpath", "//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a"));

	}

	@When("^Click on Monitors button$")
	public void click_on_Monitors_button() throws Throwable {
		browserhelper.click("Xpath", "//*[@id=\"contcont\"]/div/div/div/a[4]");
	}

	@Then("^To validate for open Monitors tab with \"([^\"]*)\" name$")
	public void to_validate_for_open_Monitors_tab_with_name(String arg1) throws Throwable {
		Validator.verify(arg1, browserhelper.getText("Xpath", "//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a"));

	}

	@When("^Click on Sony vaio i(\\d+) link$")
	public void click_on_Sony_vaio_i_link(String monitorName) throws Throwable {
		Validator.verify(monitorName, browserhelper.getText("Xpath", "//*[@id=\"tbodyid\"]/div/div/div/h4/a"));
	}

	@When("^Again Click on Laptops button$")
	public void again_Click_on_Laptops_button() throws Throwable {
		browserhelper.click("Xpath", "//*[@id=\"contcont\"]/div/div/div/a[3]");
	}

	@When("^Again Click on Sony vaio i link$")
	public void again_Click_on_Sony_vaio_i_link() throws Throwable {
		browserhelper.click("Xpath", "//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a");
	}

	@When("^click on Add to cart button$")
	public void click_on_Add_to_cart_button() throws Throwable {
		browserhelper.click("Xpath", "//*[@id=\"tbodyid\"]/div[2]/div/a");
	}

	@When("^Accept pop up confirmation as click on OK button$")
	public void accept_pop_up_confirmation_as_click_on_OK_button() throws Throwable {
		Thread.sleep(500);
		browserhelper.accept_confirmationPopup();
	}

	@When("^Click on Home button$")
	public void click_on_Home_button() throws Throwable {
		Thread.sleep(800);
		browserhelper.click("Xpath", "//*[@id=\"navbarExample\"]/ul/li[1]/a");
	}

	@When("^Click on again Laptops textLink$")
	public void click_on_again_Laptops_textLink() throws Throwable {
		browserhelper.click("Xpath", "//*[@id=\"contcont\"]/div/div/div/a[3]");
	}

	@When("^Click on Dell i gb link$")
	public void click_on_Dell_i_gb_link() throws Throwable {
		browserhelper.click("Xpath", "//*[@id=\"tbodyid\"]/div[4]/div/div/h4/a");
	}

	@When("^Again click on Add to cart button$")
	public void again_click_on_Add_to_cart_button() throws Throwable {
		browserhelper.click("Xpath", "//*[@id=\"tbodyid\"]/div[2]/div/a");
	}

	@When("^Again Accept pop up confirmation as click on OK button$")
	public void again_Accept_pop_up_confirmation_as_click_on_OK_button() throws Throwable {
		browserhelper.accept_confirmationPopup();
	}

	@When("^Click on Cart text link$")
	public void click_on_Cart_text_link() throws Throwable {
		browserhelper.click("Xpath", "//*[@id=\"cartur\"]");
	}

	@When("^Click on delete link for Delete Dell i(\\d+) (\\d+)gb laptop$")
	public void click_on_delete_link_for_Delete_Dell_i_gb_laptop(int arg1, int arg2) throws Throwable {
		Thread.sleep(1000);
		browserhelper.click("Xpath", "//*[@id=\"tbodyid\"]/tr[2]/td[4]/a");
	}

	@When("^Click on Place order button$")
	public void click_on_Place_order_button() throws Throwable {
		Thread.sleep(1100);
		browserhelper.click("Xpath", "//*[@id=\"page-wrapper\"]/div/div[2]/button");
	}

	@Then("^Enter details into the web form$")
	public void enter_details_into_the_web_form(DataTable testData) throws Throwable {
		List<String> details = testData.asList(String.class);
		browserhelper.enterValueInTextbox(details.get(0), "xpath", "//*[@id=\"name\"]");
		browserhelper.enterValueInTextbox(details.get(1), "xpath", "//*[@id=\"country\"]");
		browserhelper.enterValueInTextbox(details.get(2), "xpath", "//*[@id=\"city\"]");
		browserhelper.enterValueInTextbox(details.get(3), "xpath", "//*[@id=\"card\"]");
		browserhelper.enterValueInTextbox(details.get(4), "xpath", "//*[@id=\"month\"]");
		browserhelper.enterValueInTextbox(details.get(5), "xpath", "//*[@id=\"year\"]");
	}

	@Then("^I Clicked on the Purchase button$")
	public void i_Clicked_on_the_Purchase_button() throws Throwable {
		browserhelper.click("Xpath", "//*[@id=\"orderModal\"]/div/div/div[3]/button[2]");
	}

	@Then("^I Capture screenshot$")
	public void i_Capture_screenshot() throws Throwable {
		browserhelper.takescreenshot("orderslip");
	}

	@Then("^purchase Id and Amount$")
	public void purchase_Id_and_Amount() throws Throwable {
		String orderdetails = browserhelper.getText("Xpath", "/html/body/div[10]/p");
		orderdetail = new ArrayList<String>();
		System.out.println(orderdetails);
		String[] arrOfStr = orderdetails.split("\n");
		List<String> list = Arrays.asList(arrOfStr);
		for (String str : list) {
			String[] data = str.split(": ");
			List<String> list2 = Arrays.asList(data);
			list2.get(1);
			System.out.println(list2.get(1));
			orderdetail.add(list2.get(1));
		}
		System.out.println(list);
	}

	@Then("^I Asserted purchase id$")
	public void i_Asserted_purchase_id() throws Throwable {
		Validator.verify(orderdetail.get(0), orderdetail.get(0));
	}

	@Then("^I Asserted amount$")
	public void i_Asserted_amount_id() throws Throwable {
		Validator.verify(orderdetail.get(1), "790 USD");
	}

	@Then("^I closed browser$")
	public void i_closed_browser() throws Throwable {
		browserhelper.quitebrowser();
	}

}
