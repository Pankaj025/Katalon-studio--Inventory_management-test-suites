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

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-T11/input_LOGIN_userName'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Orders Repository/IMO-T11/input_LOGIN_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T11/button_LOGIN'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T11/button_ NEW ORDER'))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/Orders Repository/IMO-T11/select_CNBDICT-1NavkarCentury Ply'), 
    '3', true)

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-T11/input__orderReference'), 'call')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T11/input_Yes_orderAgainstBill'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T11/div_Select Hardware Type_ng-input'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T11/span_RFID Tag'))

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-T11/input_Quantity_hardware_quantity'), '1050')

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-T11/textarea_ADD MORE_comments'), 'need RFID')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T11/input_Choose files_order_place_btn'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T11/button_OK'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T11/i_Order ID  10_dispatch_order'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T11/button_RFID Tag (1050)'))

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-T11/input_RFID Tag (1050)_tagBatchSearch'), 'b')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T11/ngb-highlight_Tag Bulk1( RFID Tag-901 )'))

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-T11/input_RFID Tag (1050)_tagBatchSearch'), 'b')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T11/ngb-highlight_Tag Bulk2 Edited( RFID Tag-976 )'))

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-T11/textarea_Comments_comments'), 'order dispatched')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T11/input_Order Date_dispatch_order_btn'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T11/button_OK'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T11/a_BULK ITMES'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T11/input_ Add_showDispatched'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T11/i_Actions_fa fa-plus-square fa-x ng-star-inserted'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T11/input_ Add_showDispatched'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T11/a_ORDERS'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T11/button_(See all)'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T11/a_Receive'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-T11/textarea_Comments_comments_8'), 'received')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T11/input_Recieved Order Date_receiveOrder_btn'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T11/button_OK'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T11/a_BULK ITMES'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T11/i_Actions_fa fa-plus-square fa-x ng-star-inserted'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Orders Repository/IMO-T11/td_Tag Bulk2 Edited_child2'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/Orders Repository/IMO-T11/td_149 (1525 - 1673)'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/Orders Repository/IMO-T11/td_149'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/Orders Repository/IMO-T11/td_Navkar'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T11/input_ Add_showDispatched'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Orders Repository/IMO-T11/td_Tag Bulk1'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/Orders Repository/IMO-T11/td_901'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/Orders Repository/IMO-T11/td_Navkar'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T11/a_ORDERS'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T11/button_(See all)'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T11/a_Complete'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T11/button_Yes'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T11/button_OK'))

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T11/td_Order Completed'), 'Order Completed')

WebUI.closeBrowser()

