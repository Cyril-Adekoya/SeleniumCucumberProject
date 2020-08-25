package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class ProfileUpdateTest {
    WebDriver driver;

    String driverPath="C:\\Users\\cyril\\Selenium-java\\chromedriver.exe";
    @Given("^I have registered on blueskycitadel$")
    public void iHaveRegisteredOnBlueskycitadel() {

        System.setProperty("webdriver.chrome.driver",driverPath);
        driver=new ChromeDriver();
        driver.get("http://blueskycitadel.com/my-account/");

    }

    @When("^I enter my username and Password$")
    public void iEnterMyUsernameAndPassword() {
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Cyriladekoya@hotmail.co.uk");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("lenovothinkpad");
    }

    @And("^I click on Submit link$")
    public void iClickOnSubmitLink() {
        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }

    @Then("^My form is accepted$")
    public void myFormIsAccepted() {

        WebElement responsemsg=driver.findElement(By.xpath("//ul[@class='user-registration-error']"));
        String expectedmsg=responsemsg.getText();
        String actualmsg="ERROR: Your account is still pending approval. Verify your email " +
                "by clicking on the link sent to your email. Resend Verification Link";
        System.out.println("Form submission response"+ expectedmsg);
        Assert.assertEquals(expectedmsg,actualmsg);


    }
}
