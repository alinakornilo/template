package tests.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class BaseTest {

  private static final String BASE_URL = "https://www.google.com.ua/";
  private static WebDriver driver;

  public static WebDriver getDriver() {
    return driver;
  }

  @BeforeClass
  public static void setupClass() {
    WebDriverManager.chromedriver().setup();
  }

  @BeforeTest
  public void setupTest() {
    driver = new ChromeDriver();
    driver.get(BASE_URL);
  }

  @AfterTest
  public void teardown() {
    driver.quit();
  }
}
