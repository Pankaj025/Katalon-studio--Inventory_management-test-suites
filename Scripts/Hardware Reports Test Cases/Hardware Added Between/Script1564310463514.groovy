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

WebUI.setText(findTestObject('Hardware Reports Repository/Hardware Added Between/input_LOGIN_userName'), 'admin')

WebUI.setEncryptedText(findTestObject('Hardware Reports Repository/Hardware Added Between/input_LOGIN_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Hardware Reports Repository/Hardware Added Between/button_LOGIN'))

WebUI.click(findTestObject('Hardware Reports Repository/Hardware Added Between/a_REPORTS'))

WebUI.click(findTestObject('Hardware Reports Repository/Hardware Added Between/a_Hardware'))

WebUI.selectOptionByValue(findTestObject('Hardware Reports Repository/Hardware Added Between/select_InventoryAdded BetweenBelow mandatory quantityInventory Cost'), 
    '1: 2', true)

WebUI.click(findTestObject('Hardware Reports Repository/Hardware Added Between/input_From_fromDate'))

WebUI.click(findTestObject('Hardware Reports Repository/Hardware Added Between/span_22'))

WebUI.click(findTestObject('Hardware Reports Repository/Hardware Added Between/input_To_toDate'))

WebUI.click(findTestObject('Hardware Reports Repository/Hardware Added Between/span_31'))

WebUI.click(findTestObject('Hardware Reports Repository/Hardware Added Between/input_To_col-sm-1 btn btn-primary'))

WebUI.click(findTestObject('Hardware Reports Repository/Hardware Added Between/a_2'))

WebUI.click(findTestObject('Hardware Reports Repository/Hardware Added Between/a_1'))

WebUI.verifyElementText(findTestObject('Hardware Reports Repository/Hardware Added Between/p_Total15'), 'Total:15')

WebUI.closeBrowser()

