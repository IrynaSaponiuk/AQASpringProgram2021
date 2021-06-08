package pagefactory.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LaptopTests extends BaseTests {

private static final String TEXT_IN_URL = "abracadabra";
    @Test
    public void checkThatUrlDoesNotContainNameOfAnotherCategory() {
        getHomePage().clickOnCatalogueButton();
        getCataloguePage().clickOnLaptopAndTablets();
        getLaptopsAndTabletsPage().clickOnLaptopButton();
        Assert.assertFalse(getDriver().getCurrentUrl().contains(TEXT_IN_URL));
    }

    @Test
    public void isSearchBoxDisplayed() {
        getHomePage().clickOnCatalogueButton();
        getCataloguePage().clickOnLaptopAndTablets();
        getLaptopsAndTabletsPage().clickOnLaptopButton();
        Assert.assertTrue(getLaptopPage().getInputSearch().isDisplayed());
    }
}
