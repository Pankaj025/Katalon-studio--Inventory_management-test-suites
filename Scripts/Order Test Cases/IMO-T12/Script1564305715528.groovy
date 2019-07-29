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

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-T12/input_LOGIN_userName'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Orders Repository/IMO-T12/input_LOGIN_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T12/button_LOGIN'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T12/a_HARDWARES'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T12/input_ Add_showDispatched'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T12/a_2'))

WebUI.click(findTestObject('Orders Repository/IMO-T12/a_Make It Available'))

WebUI.delay(1)

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T12/h4_Make hardware available'), 'Make hardware available')

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T12/div_Do you want to make this hardware for support'), 
    'Do you want to make this hardware for support ?')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T12/button_Yes'))

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T12/div_Hardware successfully marked as available'), 
    'Hardware successfully marked as available')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T12/button_OK'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T12/input_ Add_showDispatched'))

WebUI.delay(1)

WebUI.verifyElementVisible(findTestObject('Object Repository/Orders Repository/IMO-T12/td_HW4_072019_1'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/Orders Repository/IMO-T12/td_CNB  SPARE'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T12/a_ORDERS'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T12/button_ NEW ORDER'))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/Orders Repository/IMO-T12/select_CNBDICT-1NavkarCentury Ply'), 
    '4', true)

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-T12/input__orderReference'), 'sms')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T12/div_Select Hardware Type_ng-input'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T12/span_Hw4'))

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-T12/input_Quantity_hardware_quantity'), '1')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T12/input_Yes_allowedRepairedItems'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T12/input_Choose files_order_place_btn'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T12/button_OK'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T12/i_Order ID  11_dispatch_order'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T12/button_Hw4 (1)'))

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-T12/input_Hw4 (1)_hardwareSearch'), 'h')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T12/ngb-highlight_HW4_072019_1( HW4_25072 )'))

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-T12/textarea_Comments_comments'), 'sending Hw after repaired.')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T12/input_Order Date_dispatch_order_btn'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T12/button_OK'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T12/div_ORDERS'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T12/button_(See all)'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T12/a_Receive'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T12/input_Recieved Order Date_receiveOrder_btn'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T12/button_OK'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T12/a_HARDWARES'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T12/input_ Add_showDispatched'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T12/a_2'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T12/a_1'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Orders Repository/IMO-T12/td_Hw4'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/Orders Repository/IMO-T12/td_Century Ply  SPARE'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T12/a_ORDERS'))

WebUI.closeBrowser()

