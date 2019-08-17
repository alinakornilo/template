package pages;

import java.util.List;
import java.util.stream.Collectors;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import pages.base.BasePage;

public class EntryPage extends BasePage {

  @FindBy(css = "")
  private WebElement question;
  @FindBys(@FindBy(id = ""))
  private List<WebElement> answers;

  public String getQuestion() {
    return question.getText();
  }

  public List<String> getAnswers() {
    return answers.stream().map(WebElement::getText).collect(Collectors.toList());
  }
}
