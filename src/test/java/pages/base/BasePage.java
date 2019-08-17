package pages.base;

import org.openqa.selenium.WebDriver;
import tests.base.BaseTest;

public class BasePage {

  private final WebDriver driver;

  BasePage() {
    driver = BaseTest.getDriver();
  }

  public WebDriver getDriver() {
    return driver;
  }
}
