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

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-T6/input_LOGIN_userName'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Orders Repository/IMO-T6/input_LOGIN_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T6/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T6/i_Order ID  2_dispatch_order'))

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T6/div_PLACED ORDER DETAILS'), 'PLACED ORDER DETAILS')

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T6/div_1 GPS  1 Hw3'), '1 GPS | 1 Hw3')

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T6/div_REMAINING ORDER DETAILS'), 'REMAINING ORDER DETAILS')

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T6/div_1 HW3'), '1 HW3')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T6/button_Hw3 (1)'))

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-T6/input_Hw3 (1)_hardwareSearch'), 'h')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T6/ngb-highlight_HW3_272019_1( HW3_2507019_1 )'))

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-T6/textarea_Comments_comments'), 'Sending remaining hardware, now order is complete.')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T6/input_Order Date_dispatch_order_btn'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T6/button_OK'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T6/button_(See all)'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T6/a_track'))

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T6/h4_dispatched'), 'dispatched')

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T6/a_HW3_272019_1(HW3_2507019_1)'), 'HW3_272019_1(HW3_2507019_1)')

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T6/small_Sending remaining hardware now order is complete'), 
    'Sending remaining hardware, now order is complete.')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T6/a_ORDERS'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T6/button_(See all)'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T6/a_Receive'))

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-T6/textarea_Comments_comments_22'), 'Hardware Received.')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T6/input_Recieved Order Date_receiveOrder_btn'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T6/button_OK'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T6/a_ORDERS'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T6/button_(See all)'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T6/a_Complete'))

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T6/div_Do you want to complete this order'), 
    'Do you want to complete this order ?')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T6/button_Yes'))

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T6/div_Order completed successfully'), 'Order completed successfully')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T6/button_OK'))

WebUI.click(findTestObject('Orders Repository/IMO-T6/a_Complete - Copy'))

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T6/div_Do you want to complete this order'), 
    'Do you want to complete this order ?')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T6/button_Yes'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T6/button_OK'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T6/a_track_1'))

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T6/h4_initiated'), 'initiated')

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T6/div_GPS(1) Hw3(1)'), 'GPS(1) Hw3(1)')

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T6/h4_dispatched'), 'dispatched')

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T6/a_GPS_250720169_1(GPS_250372019_1)'), 
    'GPS_250720169_1(GPS_250372019_1)')

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T6/small_Dispatching gps only'), 'Dispatching gps only')

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T6/h4_received'), 'received')

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T6/div_GPS(1) Hw2(0)'), 'GPS(1) Hw2(0)')

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T6/small_GPS Received correctly'), 'GPS Received correctly.')

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T6/h4_dispatched'), 'dispatched')

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T6/a_HW3_272019_1(HW3_2507019_1)'), 'HW3_272019_1(HW3_2507019_1)')

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T6/h4_received'), 'received')

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T6/div_GPS(0) Hw3(1)'), 'GPS(0) Hw3(1)')

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T6/small_Hardware Received'), 'Hardware Received.')

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T6/h4_completed'), 'completed')

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T6/div_GPS(1) Hw2(0)'), 'GPS(1) Hw2(0)')

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T6/h4_completed'), 'completed')

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T6/div_GPS(0) Hw3(1)'), 'GPS(0) Hw3(1)')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T6/a_ORDERS'))

WebUI.closeBrowser()

