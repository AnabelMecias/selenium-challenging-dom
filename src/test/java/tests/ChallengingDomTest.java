package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.ChallengingDomPage;

public class ChallengingDomTest extends BaseTest{
    private ChallengingDomPage challengingDomPage;

    @BeforeMethod
    public void setUpPage() {
        challengingDomPage = new ChallengingDomPage(driver);
    }

    @Test (priority = 1)
    public void testButtons() {
        System.out.println("Buttons text before the click.");
        System.out.println("Blue Button Text: " + challengingDomPage.getBlueButtonText());
        System.out.println("Red Button Text: " + challengingDomPage.getRedButtonText());    
        System.out.println("Green Button Text: " + challengingDomPage.getGreenButtonText());

        challengingDomPage.clickBlueButton();
        challengingDomPage.clickRedButton();
        challengingDomPage.clickGreenButton();

        System.out.println("Buttons text after the click.");
        System.out.println("Blue Button Text: " + challengingDomPage.getBlueButtonText());
        System.out.println("Red Button Text: " + challengingDomPage.getRedButtonText());    
        System.out.println("Green Button Text: " + challengingDomPage.getGreenButtonText());
    }

    @Test (priority = 2)
    public void testTable () {
        int rowCount = challengingDomPage.getTableRowCount();
        System.out.println("Number of rows in the table: " + rowCount);
        Assert.assertTrue(rowCount > 0, "Table should have rows");

        String firstCellText = challengingDomPage.getCellText(1, 1);
        System.out.println("Text in the first cell: " + firstCellText);
        Assert.assertNotNull(firstCellText, "First cell text should not be null");
        challengingDomPage.clickEditAction(1);
        challengingDomPage.clickDeleteAction(1);

        String secondCellText = challengingDomPage.getCellText(1, 2);
        System.out.println("Text in the second cell: " + secondCellText);
        Assert.assertNotNull(secondCellText, "Second cell text should not be null");
        challengingDomPage.clickEditAction(2);
        challengingDomPage.clickDeleteAction(2);
    }

    @Test  (priority = 3)
    public void testCanvas() {
        challengingDomPage.getCanvasText();
        System.out.println("Canvas text: " + challengingDomPage.getCanvasText());
    }
}
