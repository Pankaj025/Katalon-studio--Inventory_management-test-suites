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

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-T4/input_LOGIN_userName'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Orders Repository/IMO-T4/input_LOGIN_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T4/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T4/a_ORDERS'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T4/i_Order ID  2_dispatch_order'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T4/button_GPS (1)'))

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-T4/input_Hw2 (1)_hardwareSearch'), 'g')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T4/ngb-highlight_GPS_250720169_1( GPS_250372019_1 )'))

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-T4/textarea_Comments_comments'), 'Dispatching gps only')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T4/input_Order Date_dispatch_order_btn'))

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T4/div_Order Dispatched Successfully'), 
    'Order Dispatched Successfully')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T4/button_OK'))

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T4/div_DISPATCHED ORDERS ( Total 1 ) (See all)'), 
    'DISPATCHED ORDERS ( Total: 1 ) (See all)')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T4/button_(See all)'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T4/a_track'))

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T4/h4_dispatched'), 'dispatched')

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T4/a_GPS_250720169_1(GPS_250372019_1)'), 
    'GPS_250720169_1(GPS_250372019_1)')

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T4/small_Dispatching gps only'), 'Dispatching gps only')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T4/a_ORDERS'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T4/button_(See all)'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T4/a_Receive'))

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-T4/textarea_Comments_comments_27'), 'GPS Received correctly.')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T4/input_Recieved Order Date_receiveOrder_btn'))

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T4/div_Marked items as received'), 'Marked items as received')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T4/button_OK'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T4/a_HARDWARES'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T4/input_ Add_showDispatched'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T4/input_ Add_showDispatched'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T4/a_ORDERS'))

WebUI.closeBrowser()

