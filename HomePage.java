package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[@class='sidebar-item']")
    private WebElement catalogueButton;

    public void clickOnCatalogueButton() {
        catalogueButton.click();
    }
    }
