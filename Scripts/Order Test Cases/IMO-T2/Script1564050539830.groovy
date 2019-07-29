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

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-T2/input_LOGIN_userName'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Orders Repository/IMO-T2/input_LOGIN_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T2/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T2/button_ NEW ORDER'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Orders Repository/IMO-T2/select_CNBDICT-1NavkarCentury Ply'), 
    '2', true)

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-T2/input__orderReference'), 'sms')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T2/input_Yes_orderAgainstBill'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T2/input_Yes_allowedRepairedItems'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T2/div_Select Hardware Type_ng-input'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T2/span_GPS'))

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-T2/input_Quantity_hardware_quantity'), '1')

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-T2/textarea_ADD MORE_comments'), 'comment test')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T2/label_Keep on adding'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T2/input_Choose files_order_place_btn'))

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T2/h4_NEW ORDER'), 'NEW ORDER')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T2/button_NEW ORDER_close_btn'))

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T2/div_RECENTLY PLACED ORDERS ( Total 1 )'), 
    'RECENTLY PLACED ORDERS ( Total: 1 )')

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T2/span_DICT-1'), 'DICT-1')

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T2/div_1 GPS'), '1 GPS')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T2/i_(Jul 25 2019)_view_order'))

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T2/h4_VIEW ORDER'), 'VIEW ORDER')

WebUI.verifyElementNotClickable(findTestObject('Object Repository/Orders Repository/IMO-T2/select_CNBDICT-1NavkarCentury Ply'))

WebUI.verifyElementNotClickable(findTestObject('Object Repository/Orders Repository/IMO-T2/input__orderReference'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotClickable(findTestObject('Object Repository/Orders Repository/IMO-T2/input_Yes_orderAgainstBill'))

WebUI.verifyElementNotClickable(findTestObject('Object Repository/Orders Repository/IMO-T2/input_Yes_allowedRepairedItems'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T2/input__cancel_btn'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T2/button_ NEW ORDER'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Orders Repository/IMO-T2/select_CNBDICT-1NavkarCentury Ply'), 
    '3', true)

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-T2/input__orderReference'), 'mail')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T2/input_Yes_orderAgainstBill'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T2/div_Select Hardware Type_ng-input_1'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T2/span_Antina'))

WebUI.setText(findTestObject('Orders Repository/IMO-T2/input_Quantity_hardware_quantity'), '1')

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-T2/textarea_ADD MORE_comments'), 'Text')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T2/label_Keep on adding'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T2/input_Choose files_order_place_btn'))

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T2/div_Order Placed Successfully'), 'Order Placed Successfully')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T2/button_OK'))

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T2/div_RECENTLY PLACED ORDERS ( Total 2 )'), 
    'RECENTLY PLACED ORDERS ( Total: 2 )')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T2/i_(Jul 25 2019)_edit_order'))

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T2/h4_EDIT ORDER'), 'EDIT ORDER')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T2/span_ADD MORE'))

WebUI.click(findTestObject('Orders Repository/IMO-T2/div_Select Hardware Type_ng-input_2'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T2/span_RFID Tag'))

WebUI.setText(findTestObject('Orders Repository/IMO-T2/input_Quantity_hardware_quantity - Copy'), '20')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T2/input_Choose files_order_update_btn'))

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T2/div_Order Updated Successfully'), 'Order Updated Successfully')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T2/button_OK'))

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T2/span_DICT-1'), 'DICT-1')

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T2/div_20 RFID Tag  1 GPS'), '20 RFID Tag | 1 GPS')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T2/i_(Jul 25 2019)_delete_order'))

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T2/div_Do you really want to delete this order'), 
    'Do you really want to delete this order ?')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T2/button_No'))

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T2/div_RECENTLY PLACED ORDERS ( Total 2 )'), 
    'RECENTLY PLACED ORDERS ( Total: 2 )')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T2/i_(Jul 25 2019)_delete_order'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T2/button_Yes'))

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T2/div_RECENTLY PLACED ORDERS ( Total 1 )'), 
    'RECENTLY PLACED ORDERS ( Total: 1 )')

WebUI.closeBrowser()

