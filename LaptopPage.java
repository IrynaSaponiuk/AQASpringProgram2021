package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LaptopPage extends BasePage {
    public LaptopPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[contains(@id,'input_search')]")
    private WebElement inputSearch;

    public WebElement getInputSearch() {
        return inputSearch;
    }
}
