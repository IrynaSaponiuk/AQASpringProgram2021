package pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class LaptopsAndTabletsPage extends BasePage {

   @FindBy(xpath = "//div[contains(@class,'brand-box__title')]//a[contains(@href,'https://avic.ua/noutbuki')]")
   private WebElement laptopsButton;

    @FindBy(xpath = "//div[contains(@class,'height brand-box')]")
    private WebElement listOfSubcategories;


    public LaptopsAndTabletsPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getSubcategoriesList() {
        return driver.findElements((By) listOfSubcategories);
    }

    public int getSubcategoriesCount() {
        return getSubcategoriesList().size();
    }

    public void clickOnLaptopButton(){
        laptopsButton.click();
    }

}
