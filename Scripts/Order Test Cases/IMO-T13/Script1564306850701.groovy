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

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-13/input_LOGIN_userName'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Orders Repository/IMO-13/input_LOGIN_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-13/button_LOGIN'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-13/button_ NEW ORDER'))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/Orders Repository/IMO-13/select_CNBDICT-1NavkarCentury Ply'), 
    '2', true)

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-13/input__orderReference'), 'sms')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-13/input_Yes_orderAgainstBill'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Orders Repository/IMO-13/select_Temp3'), '2', true)

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-13/input_Quantity_numberOfTemplates'), '1')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-13/span_ADD MORE'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-13/span_ADD MORE'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-13/div_Select Hardware Type_ng-input'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-13/span_MCU Box'))

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-13/input_Quantity_hardware_quantity'), '1')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-13/input_Choose files_order_place_btn'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-13/button_OK'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-13/i_Order ID  12_dispatch_order'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-13/button_Antina (2)'))

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-13/input_MCU Box (1)_hardwareSearch'), 'a')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-13/ngb-highlight_ANTINA_251072019_1( ANTINA_259072019_1 )'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-13/button_MCU Box (1)'))

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-13/input_MCU Box (1)_hardwareSearch'), 'm')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-13/ngb-highlight_MCUBOX_1( MCUBOX_1 )'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-13/input_Order Date_dispatch_order_btn'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-13/button_OK'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-13/button_(See all)'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-13/a_Receive'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-13/input_Recieved Order Date_receiveOrder_btn'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-13/button_OK'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-13/a_HARDWARES'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-13/button_ Add'))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/Orders Repository/IMO-13/select_GPSAntinaMCUMorataMCU BoxRFID ReaderHw2Hw3Hw4Hw5Hw6Hw7Hw8Hw9Hw10'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-13/input__hardware_name'), 'GPS_2807266')

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-13/input__serial_Number'), 'GPS_2807245')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-13/label_Keep on adding'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-13/input_Created Date_add_hardware'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Orders Repository/IMO-13/select_GPSAntinaMCUMorataMCU BoxRFID ReaderHw2Hw3Hw4Hw5Hw6Hw7Hw8Hw9Hw10'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-13/input__hardware_name'), 'GPS_2807201967')

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-13/input__serial_Number'), 'GPS_280720156')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-13/input_Created Date_add_hardware'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Orders Repository/IMO-13/select_GPSAntinaMCUMorataMCU BoxRFID ReaderHw2Hw3Hw4Hw5Hw6Hw7Hw8Hw9Hw10'), 
    '2', true)

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-13/input__hardware_name'), 'ANTINA_280')

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-13/input__serial_Number'), 'ANTINA_280720567')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-13/input_Created Date_add_hardware'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-13/button_OK'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-13/a_ORDERS'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-13/i_Order ID  12_dispatch_order'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-13/button_Antina (1)'))

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-13/input_GPS (1)_hardwareSearch'), 'a')

WebUI.click(findTestObject('Orders Repository/IMO-13/ngb-highlight_ANTINA_280( ANTINA_280720567 )'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-13/button_GPS (1)'))

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-13/input_GPS (1)_hardwareSearch'), 'g')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-13/ngb-highlight_GPS_2807266( GPS_2807245 )'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-13/input_Order Date_dispatch_order_btn'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-13/button_OK'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-13/button_(See all)'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-13/a_Receive'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-13/input_Recieved Order Date_receiveOrder_btn'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-13/button_OK'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-13/a_Complete'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-13/button_Yes'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-13/button_OK'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-13/a_Complete'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-13/button_Yes'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-13/button_OK'))

WebUI.closeBrowser()

