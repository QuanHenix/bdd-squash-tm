package squash.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * @author qtran - created on 22/07/2020
 */
public class TestCaseInfoPage extends AbstractPage {
    public TestCaseInfoPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }


}
