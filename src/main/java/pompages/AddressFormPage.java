package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.WebDriverUtiliy;

public class AddressFormPage {
//Declaration
	@FindBy(id="Name")
	private WebElement nameTF;
	@FindBy(id="House/Office InfoTF")
	private WebElement houseInfoTFF;
	
	@FindBy(id="Street Info")
	private WebElement streetInfoTF;
	@FindBy(id="Landmark")
	private WebElement landMarkTF;
	
	@FindBy(id="Country")
	private WebElement countryDropdown;
	
	@FindBy(id="State")
	private WebElement stateDropdown;
	
	@FindBy(id="City")
	private WebElement cityDropdown;
	
	@FindBy(id="pincode")
	private WebElement pincodeTF;
	
	@FindBy(id="Phone Number")
	private WebElement phoneNumberTF;
	@FindBy(xpath = "//button[text()='Add Address']")
	private WebElement addAddressButton;
	
	//initialization
	public AddressFormPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//utilization
	public void addAddressDetails(WebDriverUtiliy web,String name,String houseInfo,String street,String landMark,String country,String state,)
	
	
	


	
}
