package pagefactory.tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LaptopsAndTabletsTest  extends BaseTests{

    private final static int EXPECTED_QUANTITY_OF_SUBCATEGORIES = 7;

    @Test
    public void checkTheNumberOfSubcategoriesOnThePage() {
        getHomePage().clickOnCatalogueButton();
        getCataloguePage().clickOnLaptopAndTablets();
        assertEquals(getLaptopsAndTabletsPage().getSubcategoriesCount(), EXPECTED_QUANTITY_OF_SUBCATEGORIES);
    }
}
