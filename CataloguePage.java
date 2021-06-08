package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CataloguePage extends BasePage {

    public CataloguePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[contains(text(),'Ноутбуки и планшеты')]")
    private WebElement laptopAndTabletsButton;

    public void clickOnLaptopAndTablets() {
        laptopAndTabletsButton.click();
    }
}
