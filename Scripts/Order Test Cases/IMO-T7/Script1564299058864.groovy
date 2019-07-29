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

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-T7/input_LOGIN_userName'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Orders Repository/IMO-T7/input_LOGIN_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T7/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T7/button_ NEW ORDER'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Orders Repository/IMO-T7/select_CNBDICT-1NavkarCentury Ply'), 
    '4', true)

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-T7/input__orderReference'), 'sms')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T7/div_Select Hardware Type_ng-input'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T7/span_Hw4'))

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-T7/input_Quantity_hardware_quantity'), '1')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T7/span_ADD MORE'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T7/div_Select Hardware Type_ng-input_1'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T7/span_Hw5'))

WebUI.setText(findTestObject('Orders Repository/IMO-T7/input_Quantity_hardware_quantity - Copy'), '1')

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-T7/textarea_ADD MORE_comments'), 'test2')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T7/input_Choose files_order_place_btn'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T7/button_OK'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T7/i_Order ID  6_dispatch_order'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T7/button_Hw4 (1)'))

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-T7/input_Hw5 (1)_hardwareSearch'), 'h')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T7/ngb-highlight_HW4_072019_1( HW4_25072 )'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T7/button_Hw5 (1)'))

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-T7/input_Hw5 (1)_hardwareSearch'), 'h')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T7/ngb-highlight_HW5_019_1( HW5_25019_1 )'))

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-T7/textarea_Comments_comments'), 'Dispatching order')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T7/input_Order Date_dispatch_order_btn'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T7/button_OK'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T7/button_(See all)'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T7/a_Receive'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-T7/textarea_Comments_comments_18'), 'Received Hardwares')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T7/input_Recieved Order Date_receiveOrder_btn'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T7/button_OK'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T7/a_Return'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-T7/input_Hardwares_hardwareSearch'), 'H')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T7/ngb-highlight_HW4_072019_1( HW4_25072 )'))

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-T7/textarea_Comments_comments_63'), 'Received defective, return back')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T7/input_Recieved Order Date_click_return'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T7/button_OK'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T7/a_Receive'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-T7/textarea_Comments_comments_83'), 'Received back at CNB')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T7/input_Recieved Order Date_receiveOrder_btn'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T7/button_OK'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T7/a_Complete'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T7/button_Yes'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T7/button_OK'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T7/a_track'))

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T7/h4_initiated'), 'initiated')

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T7/div_Hw4(1) Hw5(1)'), 'Hw4(1) Hw5(1)')

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T7/h4_dispatched'), 'dispatched')

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T7/div_HW4_072019_1(HW4_25072) HW5_019_1(HW5_25019_1)'), 
    'HW4_072019_1(HW4_25072) HW5_019_1(HW5_25019_1)')

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T7/div_Comments Dispatching order'), 'Comments:  Dispatching order')

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T7/h4_received'), 'received')

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T7/div_Hw4(1) Hw5(1)'), 'Hw4(1) Hw5(1)')

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T7/div_Comments Received Hardwares'), 'Comments:  Received Hardwares')

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T7/h4_returned'), 'returned')

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T7/div_HW4_072019_1(HW4_25072)'), 'HW4_072019_1(HW4_25072)')

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T7/div_Comments Received defective return back'), 
    'Comments:  Received defective, return back')

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T7/h4_received'), 'received')

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T7/div_Hw4(1) Hw5(1)'), 'Hw4(1) Hw5(1)')

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T7/div_Comments Received back at CNB'), 
    'Comments:  Received back at CNB')

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T7/h4_completed'), 'completed')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T7/a_ORDERS'))

WebUI.closeBrowser()

