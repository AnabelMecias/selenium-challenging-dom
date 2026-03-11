package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChallengingDomPage {
    private WebDriver driver;

    public ChallengingDomPage(WebDriver driver) {
        this.driver = driver;
    }

    // Buttons
    private By blueBotton = By.cssSelector("div.large-2.columns > a.button:first-child");
    private By redBotton = By.cssSelector("div.large-2.columns > a.button.alert");
    private By greenBotton = By.cssSelector("div.large-2.columns > a.button.success");

    // Table
    private By tableRows = By.cssSelector(".large-10.columns table tbody tr");

    // Actions on table
    private By rowActionsEdit(int rowIndex) {
        return By.cssSelector(".large-10.columns table tr:nth-child(" + rowIndex + ") td:last-child > a:first-child");
    }

    private By rowActionsDelete(int rowIndex) {
        return By.cssSelector(".large-10.columns table tr:nth-child(" + rowIndex + ") td:last-child > a:nth-child(2)");
    }

    public void clickBlueButton() {
        driver.findElement(blueBotton).click();
    }

    public String getBlueButtonText() {
        return driver.findElement(blueBotton).getText();
    }

    public void clickRedButton() {
        driver.findElement(redBotton).click();
    }

    public String getRedButtonText() {
        return driver.findElement(redBotton).getText();
    }

    public void clickGreenButton() {
        driver.findElement(greenBotton).click();
    }

    public String getGreenButtonText() {
        return driver.findElement(greenBotton).getText();
    }

    public int getTableRowCount() {
        return driver.findElements(tableRows).size();
    }

    public String getCellText(int rowIndex, int columnIndex) {
        return driver
                .findElement(By.cssSelector(
                        ".large-10.columns table tr:nth-child(" + rowIndex + ") td:nth-child(" + columnIndex + ")"))
                .getText();
    }

    public void clickEditAction(int rowIndex) {
        driver.findElement(rowActionsEdit(rowIndex)).click();
    }

    public void clickDeleteAction(int rowIndex) {
        driver.findElement(rowActionsDelete(rowIndex)).click();
    }

    public List<WebElement> getAllTableRows() {
        return driver.findElements(tableRows);
    }

    public String getCanvasText() {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        String script = 
            "let scripts = Array.from(document.querySelectorAll('script'));" +
            "for (let s of scripts) {" +
            "  let text = s.textContent;" +
            "  let match = text.match(/Answer:\\s*\\d+/);" +
            "  if (match) return match[0];" +
            "}" +
            "return null;";

        return (String) js.executeScript(script);
    }

}
