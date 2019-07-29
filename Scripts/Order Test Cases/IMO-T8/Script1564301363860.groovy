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

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-T8/input_LOGIN_userName'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Orders Repository/IMO-T8/input_LOGIN_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T8/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T8/button_ NEW ORDER'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Orders Repository/IMO-T8/select_CNBDICT-1NavkarCentury Ply'), 
    '2', true)

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-T8/input__orderReference'), 'chat')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T8/input_Yes_orderAgainstBill'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T8/div_Select Hardware Type_ng-input'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T8/span_RFID Tag'))

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-T8/input_Quantity_hardware_quantity'), '50')

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-T8/textarea_ADD MORE_comments'), 'need urgently')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T8/input_Choose files_order_place_btn'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T8/button_OK'))

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T8/span_DICT-1'), 'DICT-1')

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T8/div_50 RFID Tag'), '50 RFID Tag')

WebUI.closeBrowser()

