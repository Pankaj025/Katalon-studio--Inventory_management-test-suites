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

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-T3/input_LOGIN_userName'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Orders Repository/IMO-T3/input_LOGIN_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T3/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T3/button_ NEW ORDER'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Orders Repository/IMO-T3/select_CNBDICT-1NavkarCentury Ply'), 
    '3', true)

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-T3/input__orderReference'), 'mail')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T3/input_Yes_orderAgainstBill'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T3/div_Select Hardware Type_ng-input'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T3/span_GPS'))

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-T3/input_Quantity_hardware_quantity'), '1')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T3/span_ADD MORE'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T3/div_Select Hardware Type_ng-input_1'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T3/span_Hw2'))

WebUI.setText(findTestObject('Orders Repository/IMO-T3/input_Quantity_hardware_quantity - Copy'), '1')

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-T3/textarea_ADD MORE_comments'), 'test1')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T3/input_Choose files_order_place_btn'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T3/button_OK'))

WebUI.verifyElementText(findTestObject('Orders Repository/IMO-T3/div_RECENTLY PLACED ORDERS ( Total 2 )'), 'RECENTLY PLACED ORDERS ( Total: 2 )')

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T3/span_Navkar'), 'Navkar')

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T3/div_1 GPS  1 Hw2'), '1 GPS | 1 Hw2')

WebUI.closeBrowser()

