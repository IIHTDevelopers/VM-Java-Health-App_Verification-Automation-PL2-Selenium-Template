package pages;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class verification_page extends StartupPage {


	public By getPageBarFixedLocator(String navBarName) {
		return By.xpath("  ");
	}

	public By getSubNavTabLocator(String subNavName) {
		return By.xpath("  ");
	}

	public By getButtonLocatorsBytext(String buttonName) {
		return By.xpath("  ");
	}

	public By searchBarId() {
		return By.id("   ");
	}

	public By getOkButtonLocator() {
		return By.xpath(" ");
	}

	public By getRadioButtonsLocator(String radioButtonName) {
		return By.xpath("  ");
	}

	public By getStarIconLocator() {
		return By.xpath("  ");
	}

	public By favouriteOrStarIcon() {
		return By.xpath("  ");
	}

	public verification_page(WebDriver driver) {
		super(driver);
	}

	/**
	 * @Test1.1 about this method loginTohealthAppByGivenValidCredetial()
	 * 
	 * @param : Map<String, String>
	 * @description : fill usernameTextbox & passwordTextbox and click on sign in
	 *              button
	 * @return : Boolean
	 * @author : Yaksha
	 */
	public boolean loginToHealthAppByGivenValidCredetial(Map<String, String> expectedData) throws Exception {
		
		return false;
	}

	/**
	 * @Test1.2 about this method scrollDownAndClickVerificationTab()
	 * 
	 * @param : null
	 * @description : verify the pharmacy tab, scroll to it, and click it
	 * @return : String
	 * @author : YAKSHA
	 */
	public void scrollDownAndClickVerificationTab() throws Exception {
		
	}

	/**
	 * @Test1.3 about this method verifyVerificationPageUrl()
	 * 
	 * @param : null
	 * @description : verify verification page url
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyVerificationPageUrl() throws Exception {
		return null;
	}

	/**
	 * @Test2, 3 about this method highlightAndVerifyWhetherElementIsDisplayed
	 * 
	 * @param element : By - Locator of the element to be highlighted and verified
	 * @description : This method verifies whether an element is displayed on the
	 *              page, highlights it if displayed, and returns true if displayed.
	 * @return : boolean - true if the element is displayed, otherwise false
	 * @author : YAKSHA
	 */
	public boolean highlightAndVerifyWhetherElementIsDisplayed(By element) {
		
		return false;
	}

	/**
	 * @Test2, @Test3 and @Test9.1 about this method highlightAndClickOnElement
	 * 
	 * @param element     : By - Locator of the element to be highlighted and
	 *                    clicked
	 * @param elementName : String - Name of the element to be clicked (used for
	 *                    logging purposes)
	 * @description : This method highlights the element and clicks on it. It
	 *              returns true if the element is clicked successfully.
	 * @return : boolean - true if the element is clicked successfully, otherwise
	 *         false
	 * @author : YAKSHA
	 */
	public boolean highlightAndClickOnElement(By element, String elementName) {
		
		
		return false;
	}

	/**
	 * @Test4 about this method verifySelectedTabIsActiveOrNot()
	 * @param : element - the locator of the tab to be verified
	 * @description : This method verifies if the specified tab is displayed, clicks
	 *              it, and returns whether its "class" attribute contains "active".
	 *              This can be used to determine if the tab is active based on its
	 *              class attributes.
	 * @return : boolean - true if the "class" attribute of the tab contains
	 *         "active", false otherwise
	 * @throws : Exception - if there is an issue locating, highlighting, clicking
	 *           the tab, or getting its attribute
	 * @author : YAKSHA
	 */
	public boolean verifySelectedTabIsActiveOrNot(By element) throws Exception {
		
		return false;
	}

	/**
	 * @Test5 about this method verifyNavigationOfTabs()
	 * @param : element - the locator of the tab to be verified
	 * @description : This method verifies if the specified tab is displayed, clicks
	 *              it, and returns whether its "class" attribute contains "active".
	 *              This can be used to determine if the tab is active based on its
	 *              class attributes. It also navigates through "Inventory" and
	 *              "Requisition" tabs before verifying the "Purchase Request" tab.
	 * @return : boolean - true if the "class" attribute of the tab contains
	 *         "active", false otherwise
	 * @throws : Exception - if there is an issue locating, highlighting, clicking
	 *           the tab, or getting its attribute
	 * @author : YAKSHA
	 */
	public boolean verifyNavigationOfTabs() throws Exception {
				return false;
	}

	/**
	 * @Test6 and @Test9.3 about this method
	 *        verifyTheResultsDateRangeIsWithinTheSelectedRange()
	 * 
	 * @param : String, String - from date - to date
	 * @description : This method verifies whether the "Requested On" dates for all
	 *              the result requisitions are within the specified date range.
	 * @return : boolean - true if the actual dates fall within the specified date
	 *         and false if they don't.
	 * @throws : Exception - if there is an issue finding the actual data
	 * @author : YAKSHA
	 */
	public boolean verifyTheResultsDateRangeIsWithinTheSelectedRange(String fromDate, String toDate) throws Exception {
					return false;

		
	}

	/**
	 * @Test7 about this method verifyToolTipText()
	 * @param : null
	 * @description : Verify the text of the tooltip
	 * @return : String
	 * @throws : Exception - if there is an issue finding the text
	 * @author : YAKSHA
	 */
	public String verifyToolTipText() {
		
		return null;
	}

	/**
	 * @Test8 about this method verifyDatesAreRememberedCorrectly()
	 * 
	 * @param fromDate - the expected "from" date in the format "dd-MM-yyyy"
	 * @param toDate   - the expected "to" date in the format "dd-MM-yyyy"
	 * @description : This method selects the "from" and "to" dates in the calendar,
	 *              clicks the OK button, navigates away to another tab, returns to
	 *              the original tab, and verifies if the dates are remembered
	 *              correctly.
	 * @return : boolean - true if the dates are remembered correctly, false
	 *         otherwise
	 * @throws : Exception - if there is an issue locating, highlighting, or
	 *           clicking elements, or if there is an issue with date selection or
	 *           verification
	 * @author : YAKSHA
	 * @throws Exception
	 */
	public boolean verifyDatesAreRememberedCorrectly(String fromDate, String toDate) throws Exception {
		
		return false;
	}

	/**
	 * @Test9.2 about this method clickDateRangeDropdownAndSelect()
	 * 
	 * @param : String - Text of the value to select from dropdown
	 * @description : This method clicks on the date range button and selects a
	 *              value by its text
	 * @return : boolean - true if successfully selected the intended value and
	 *         false if the value is not selected
	 * @throws : Exception - if there is an issue finding the dropdown or its values
	 * @author : YAKSHA
	 */
	public boolean clickDateRangeDropdownAndSelect(String valueToSelect) throws Exception {
		return false;
	}

	/**
	 * @Test14.1 and @Test14.5 about this method isRadioButtonIsVisible()
	 * 
	 * @param : null
	 * @description : This method verifies whether the "Pending" radio button is
	 *              visible on the screen
	 * @return : boolean - true if the "Pending" radio button is visible and false
	 *         if not visible
	 * @throws : Exception - if there is an issue locating or radio button
	 * @author : YAKSHA
	 */
	public boolean isPendingRadioButtonVisible() throws Exception {
		
		return false;
	}

	/**
	 * @Test14.2 about this method scrollAllTheWayDown()
	 * 
	 * @param : null
	 * @description : This method vertically scrolls the screen to the bottom
	 * @return : boolean - true if successfully scrolled down and false if not
	 *         scrolled
	 * @throws : Exception - if there is an issue while scrolling
	 * @author : YAKSHA
	 */
	public boolean scrollAllTheWayDown() throws Exception {
		
		return false;
	}

	/**
	 * @Test14.3 about this method isPreviousButtonVisible()
	 * 
	 * @param : null
	 * @description : This method verifies whether the "Previous" button is visible
	 *              on the screen
	 * @return : boolean - true if the "Previous" button is visible and false if it
	 *         is not visible
	 * @throws : Exception - if there is an issue finding the button
	 * @author : YAKSHA
	 */
	public boolean isPreviousButtonVisible() throws Exception {
		
		return false;
	}

	/**
	 * @Test14.4 about this method scrollAllTheWayUp()
	 * 
	 * @param : null
	 * @description : This method vertically scrolls the screen to the top
	 * @return : boolean - true if successfully scrolled up and false if not
	 *         scrolled
	 * @throws : Exception - if there is an issue while scrolling
	 * @author : YAKSHA
	 */
	public boolean scrollAllTheWayUp() throws Exception {
		return false;
	}

	/**
	 * @Test10.1 @Test10.3 @Test10.5 @Test10.7 @Test12.2 about this method
	 * clickRadioButtonByText()
	 * 
	 * @param : String - Text of the radio button.
	 * @description : This method clicks on the radio button by its text.
	 * @return : boolean - true if the intended radio button was clicked and false
	 *         if it was not clicked
	 * @throws : Exception - if there is an issue finding or clicking the radio
	 *           button
	 * @author : YAKSHA
	 */
	public boolean clickRadioButtonByText(String radioButtonText) throws Exception {
		
		return false;
	}

	/**
	 * @Test10.2 @Test10.4 @Test10.6 @Test10.8 about this method
	 * isRadioButtonSelected()
	 * 
	 * @param : String - Text of the radio button.
	 * @description : This method clicks on the radio button by its text.
	 * @return : boolean - true if the intended radio button was clicked and false
	 *         if it was not clicked
	 * @throws : Exception - if there is an issue finding or clicking the radio
	 *           button
	 * @author : YAKSHA
	 */
	public boolean isRadioButtonSelected(String radioButtonText) throws Exception {
		return false;
	}

	/**
	 * @Test11 about this method
	 *         verifyRecordsAreFilteredAccordingToRequisitionStatus()
	 * 
	 * @param : String - status
	 * @description : This method verifies that all records in the table are
	 *              filtered according to the "active" requisition status by
	 *              selecting "active" from a dropdown and checking the status of
	 *              each record in the table.
	 * @return : boolean - true if all the requisition statuses are "active", false
	 *         otherwise
	 * @throws : Exception - if there is an issue selecting the "active" option,
	 *           locating elements, or verifying the statuses
	 * @author : YAKSHA
	 */
	public boolean verifyRecordsAreFilteredAccordingToRequisitionStatus(String status) throws Exception {
		return false;
	}

	/**
	 * @Test12.1 about this method visitTab()
	 * 
	 * @param : String - Tab's text
	 * @description : This method navigates the user to the specified tab
	 * @return : boolean
	 * @throws : Exception - if there is an issue finding or clicking the tab.
	 * @author : YAKSHA
	 */
	public boolean visitTab(String tabText) throws Exception {
		return false;
	}

	/**
	 * @Test12.3 about this method isRadioButtonSelected()
	 * 
	 * @param : String - Text of the radio button.
	 * @description : This method clicks on the radio button by its text.
	 * @return : boolean - true if the intended radio button was clicked and false
	 *         if it was not clicked
	 * @throws : Exception - if there is an issue finding or clicking the radio
	 *           button
	 * @author : YAKSHA
	 */
	public boolean selectDropdownValueByText(String optionToSelect) throws Exception {
		return false;
	}

	/**
	 * @Test12.4 about this method applyDateFilter()
	 * 
	 * @param : String, String
	 * @description : Applies the date filter with date range
	 * @return : void
	 * @throws : Exception - if there is an issue finding or filling the date fields
	 * @author : YAKSHA
	 */
	public boolean applyDateFilter(String fromDate, String toDate) throws Exception {
		
		return false;
	}

	/**
	 * @Test12.5 about this method clickViewButtonForTheFirstRequisition()
	 * 
	 * @param : null
	 * @description : This method clicks on the "View" button for the first result.
	 * @return : String - requisition number of the first requisition from the
	 *         result.
	 * @throws : Exception - if there is an issue finding or clicking the radio
	 *           button.
	 * @author : YAKSHA
	 */
	public String getRequisitionNumberAndClickViewButtonForTheFirstRequisition() throws Exception {
		return null;
	}

	/**
	 * @Test12.6 about this method getRequisitionNumberFromTheReport()
	 * 
	 * @param : null
	 * @description : This method returns the requisition number from the report
	 * @return : String - requisition number
	 * @throws : Exception - if there is an issue finding the requisition number in
	 *           the report.
	 * @author : YAKSHA
	 */
	public String getRequisitionNumberFromTheReport() throws Exception {
		return null;
	}

	/**
	 * @Test12.7 about this method clickButtonByText()
	 * 
	 * @param buttonText : String - The text of the button to be clicked
	 * @description : This method locates a button using its text and performs a
	 *              click action on it. If the button is found and successfully
	 *              clicked, it highlights the button first. In case of failure
	 *              (e.g., button not found or click error), an error message is
	 *              printed and an exception is thrown.
	 * @return : void
	 * @throws : Exception - if there is an issue finding the button or performing
	 *           the click action
	 * @author : YAKSHA
	 */
	public boolean clickButtonByText(String buttonText) throws Exception {
		
		return false;
	}

	/**
	 * @Test13 about this method verifyRecordCountMatches()
	 * 
	 * @param : null
	 * @description : This test case navigates to the "Verification" module, goes to
	 *              "Inventory" -> "Purchase Request", selects "All" radio button,
	 *              and verifies that the shown result count and the total record
	 *              count at the bottom of the page are equal.
	 * @return : boolean - true if the counts match, false otherwise
	 * @throws : Exception - if there is an issue navigating, selecting radio
	 *           buttons, or extracting counts
	 * @author : YAKSHA
	 */
	public boolean verifyRecordCountMatches() throws Exception {
		return false;
	}

	/**
	 * @Test15 about this method verifyRequiredFieldErrormessage()
	 * 
	 * @param : null
	 * @description : This method verifies the error message for a required field
	 *              when creating a purchase request. It navigates to the
	 *              "Inventory" section, selects "Internal", then "Purchase
	 *              Request", and attempts to create a purchase request without
	 *              filling the required item name field. The method highlights the
	 *              required field error message and returns its text.
	 * @return : String - the error message text for the required item name field
	 * @throws : Exception - if there is an issue locating or clicking elements, or
	 *           retrieving the error message text
	 * @author : YAKSHA
	 */
	public String verifyRequiredFieldErrormessage() throws Exception {
		return null;
	}

}
