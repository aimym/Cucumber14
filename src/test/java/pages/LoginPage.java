package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class LoginPage extends CommonMethods {

  @FindBy(xpath="//*[@id='txtUsername']")
    public WebElement usernameTextField;


  @FindBy(id="txtPassword")
  public WebElement passwordTextField;

  @FindBy(xpath="//input[@id='btnLogin']")
  public WebElement loginButton;

  @FindBy(xpath="//*[@id='spanMessage']")
  public WebElement errorMessage;

  @FindBy(id = "menu_admin_viewAdminModule")
  public WebElement adminOption;

 @FindBy(id = "menu_admin_Qualifications")
  public WebElement navigateToQualification;

  @FindBy (id="menu_admin_viewLicenses")
  public  WebElement selectLicensesOption;

  @FindBy(xpath = "//p[@id='listActions']/input[1]")
  public WebElement addBtn;

  @FindBy(id = "license_name")
  public WebElement licName;

  @FindBy(id = "btnSave")
  public WebElement saveBtn;

  public LoginPage(){
    //call selenium page factory
    PageFactory.initElements(driver,this);
  }


}
