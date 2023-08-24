package genericLibraries;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	protected PropertiesUtility property;
	protected ExcelUtility excel;
	protected JavaUtility jutil;
    protected WebDriverUtiliy webutil;
    public WebDriver driver;
    public static WebDriver sdDriver;
    
    
    
    protected WelcomePage welcome;
    protected ShoppersStackLoginPage login;
    protected HomePage homne;
    protected SignUpPage signup;
    protected MyProfilePage myprofile;
    protected myAddressesPage myaddress;
    protected HeadPhonesPage headphone;
    protected CartPage cart;
    protected AddressFormPage address;
    
    @BeforeClass
    public void classConfiguration() {
    	property=new PropertiesUtility();
    	excel=new ExcelUtility();
    	jutil=new JavaUtility();
    	webutil=new WebDriverUtiliy();
    	
    	
    	property.propertiesInit(IConstantPath.PROPERTIES_PATH);
    	excel.excelInit(IConstantPath.EXCEL_PATH);
    }
    @BeforeMethod
    public void methodConfiguration() {
    	driver=webutil.navigateToApp(property.getData("Browser"),property.getData("url"),Long.parseLong(property.getData("time")));
    	sdDriver=driver;
    	
    	welcome=new WelcomePage(driver);
    	login=new ShoppersStackLoginPage(driver);
    	home=new HomePage(driver);
    	signup=new SignUpPage(driver);
    	myProfile=new MyProfilePage(driver);
    	myaddress= new myAddressPage(driver);
    	headphone=new HeadPhonesPage(driver);
    	cart= new CartPage(driver);
    	address= new AddressFormPage(driver);
    }
    @AfterMethod
    public void methodTeardown() {
    	home.clickProfileButton();
    	home.clickLogout();
    	webutil.closeAllBrowsers();
    }
    @AfterClass
    public void classTeardown() {
    	excel.closeExcel();
    }
   //@AfterTest
   //@AfterSuite
}
