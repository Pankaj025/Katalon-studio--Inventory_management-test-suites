import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:8080/#/login')

WebUI.setText(findTestObject('Hardware Reports Repository/Hardware Below Mandatory Quantity/input_LOGIN_userName'), 'admin')

WebUI.setEncryptedText(findTestObject('Hardware Reports Repository/Hardware Below Mandatory Quantity/input_LOGIN_password'), 
    '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Hardware Reports Repository/Hardware Below Mandatory Quantity/button_LOGIN'))

WebUI.click(findTestObject('Hardware Reports Repository/Hardware Below Mandatory Quantity/a_REPORTS'))

WebUI.click(findTestObject('Hardware Reports Repository/Hardware Below Mandatory Quantity/a_Hardware'))

WebUI.selectOptionByValue(findTestObject('Hardware Reports Repository/Hardware Below Mandatory Quantity/select_InventoryAdded BetweenBelow mandatory quantityInventory Cost'), 
    '2: 3', true)

WebUI.click(findTestObject('Hardware Reports Repository/Hardware Below Mandatory Quantity/input_Choose Report Type_col-sm-1 btn btn-primary ng-star-inserted'))

WebUI.verifyElementPresent(findTestObject('Hardware Reports Repository/Hardware Below Mandatory Quantity/td_Antina'), 1)

WebUI.verifyElementPresent(findTestObject('Hardware Reports Repository/Hardware Below Mandatory Quantity/td_0'), 1)

WebUI.verifyElementPresent(findTestObject('Hardware Reports Repository/Hardware Below Mandatory Quantity/td_Hw4'), 1)

WebUI.verifyElementPresent(findTestObject('Hardware Reports Repository/Hardware Below Mandatory Quantity/td_0_1'), 1)

WebUI.click(findTestObject('Hardware Reports Repository/Hardware Below Mandatory Quantity/a_HARDWARES'))

WebUI.click(findTestObject('Hardware Reports Repository/Hardware Below Mandatory Quantity/input_ Add_showDispatched'))

WebUI.verifyElementVisible(findTestObject('Hardware Reports Repository/Hardware Below Mandatory Quantity/td_Antina_1'))

WebUI.click(findTestObject('Hardware Reports Repository/Hardware Below Mandatory Quantity/a_2'))

WebUI.verifyElementVisible(findTestObject('Hardware Reports Repository/Hardware Below Mandatory Quantity/td_Hw4_1'))

WebUI.closeBrowser()

