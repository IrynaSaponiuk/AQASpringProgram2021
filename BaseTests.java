package pagefactory.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pagefactory.CataloguePage;
import pagefactory.HomePage;
import pagefactory.LaptopPage;
import pagefactory.LaptopsAndTabletsPage;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class BaseTests {
    private WebDriver driver;
    private static final String AVIC_URL = "https://avic.ua/";

    @BeforeTest
    public void profileSetUp() {
        chromedriver().setup();
    }

    @BeforeMethod
    public void testsSetUp() {
        driver = new ChromeDriver();//создаем экзаемпляр хром драйвера
        driver.manage().window().maximize();//открыли браузер на весь экран
        driver.get(AVIC_URL);//открыли сайт
    }

    @AfterMethod
    public void tearDown() {
        driver.close();//закрытие драйвера
    }


    public WebDriver getDriver() {
        return driver;
    }

    public HomePage getHomePage() {
        return new HomePage(getDriver());
    }

    public LaptopPage getLaptopPage() {
        return new LaptopPage(getDriver());
    }

    public LaptopsAndTabletsPage getLaptopsAndTabletsPage() {
        return new LaptopsAndTabletsPage(getDriver());
    }

    public CataloguePage getCataloguePage() {
        return new CataloguePage(getDriver());
    }

}
