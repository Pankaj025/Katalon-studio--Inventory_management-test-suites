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

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-T1/input_LOGIN_userName'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Orders Repository/IMO-T1/input_LOGIN_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T1/button_LOGIN'))

WebUI.verifyElementText(findTestObject('Orders Repository/IMO-T1/a_ORDERS'), 'ORDERS')

WebUI.verifyElementClickable(findTestObject('Orders Repository/IMO-T1/a_ORDERS'))

WebUI.click(findTestObject('Orders Repository/IMO-T1/a_ORDERS'))

WebUI.verifyElementText(findTestObject('Orders Repository/IMO-T1/p_ORDERS'), 'ORDERS')

WebUI.verifyElementText(findTestObject('Orders Repository/IMO-T1/button_ NEW ORDER'), '+ NEW ORDER')

WebUI.verifyElementClickable(findTestObject('Orders Repository/IMO-T1/button_ NEW ORDER'))

WebUI.click(findTestObject('Orders Repository/IMO-T1/button_ NEW ORDER'))

WebUI.verifyElementText(findTestObject('Orders Repository/IMO-T1/h4_NEW ORDER'), 'NEW ORDER')

WebUI.verifyElementText(findTestObject('Orders Repository/IMO-T1/p_Order For'), 'Order For *')

WebUI.verifyElementText(findTestObject('Orders Repository/IMO-T1/label_Order Reference'), 'Order Reference *')

WebUI.verifyElementText(findTestObject('Orders Repository/IMO-T1/label_Order Against Bill'), 'Order Against Bill')

WebUI.verifyElementText(findTestObject('Orders Repository/IMO-T1/label_Allow Repaired Item'), 'Allow Repaired Item:')

WebUI.verifyElementText(findTestObject('Orders Repository/IMO-T1/span_ADD MORE'), 'ADD MORE')

WebUI.verifyElementText(findTestObject('Orders Repository/IMO-T1/label_Order Date'), 'Order Date *')

WebUI.verifyElementText(findTestObject('Orders Repository/IMO-T1/p_Attach Documents'), 'Attach Documents')

WebUI.verifyElementText(findTestObject('Orders Repository/IMO-T1/small_Max 3 files are allowed'), 'Max 3 files are allowed.')

WebUI.verifyElementClickable(findTestObject('Orders Repository/IMO-T1/input_Choose files_cancel_btn'))

WebUI.verifyElementClickable(findTestObject('Orders Repository/IMO-T1/input_Choose files_order_place_btn'))

WebUI.click(findTestObject('Orders Repository/IMO-T1/input_Choose files_order_place_btn'))

WebUI.verifyElementText(findTestObject('Orders Repository/IMO-T1/div_Order items can not be empty'), 'Order items can not be empty.')

WebUI.click(findTestObject('Orders Repository/IMO-T1/button_OK'))

WebUI.verifyElementClickable(findTestObject('Orders Repository/IMO-T1/input__orderReference'))

WebUI.click(findTestObject('Orders Repository/IMO-T1/input_Yes_orderAgainstBill'))

WebUI.verifyElementChecked(findTestObject('Orders Repository/IMO-T1/input_Yes_orderAgainstBill'), 1)

WebUI.verifyElementNotChecked(findTestObject('Orders Repository/IMO-T1/input_No_orderAgainstBill'), 1)

WebUI.click(findTestObject('Orders Repository/IMO-T1/input_No_orderAgainstBill'))

WebUI.verifyElementChecked(findTestObject('Orders Repository/IMO-T1/input_No_orderAgainstBill'), 1)

WebUI.verifyElementNotChecked(findTestObject('Orders Repository/IMO-T1/input_Yes_orderAgainstBill'), 1)

WebUI.click(findTestObject('Orders Repository/IMO-T1/input_Yes_allowedRepairedItems'))

WebUI.verifyElementChecked(findTestObject('Orders Repository/IMO-T1/input_Yes_allowedRepairedItems'), 1)

WebUI.verifyElementNotChecked(findTestObject('Orders Repository/IMO-T1/input_No_allowedRepairedItems'), 1)

WebUI.click(findTestObject('Orders Repository/IMO-T1/input_No_allowedRepairedItems'))

WebUI.verifyElementChecked(findTestObject('Orders Repository/IMO-T1/input_No_allowedRepairedItems'), 1)

WebUI.verifyElementNotChecked(findTestObject('Orders Repository/IMO-T1/input_Yes_allowedRepairedItems'), 1)

WebUI.verifyElementClickable(findTestObject('Orders Repository/IMO-T1/textarea_ADD MORE_comments'))

WebUI.verifyElementText(findTestObject('Orders Repository/IMO-T1/label_Keep on adding'), 'Keep on adding')

WebUI.closeBrowser()

