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

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-T5/input_LOGIN_userName'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Orders Repository/IMO-T5/input_LOGIN_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T5/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T5/i_(Jul 26 2019)_edit_order'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T5/h4_EDIT ORDER'), 'EDIT ORDER')

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-T5/input_Quantity_hardware_quantity'), '0')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T5/input_Choose files_order_update_btn'))

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T5/div_Order quantity can not be less than already dispatched item'), 
    'Order quantity can not be less than already dispatched item')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T5/button_OK'))

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-T5/input_Quantity_hardware_quantity'), '2')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T5/input_Choose files_order_update_btn'))

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T5/div_Order Updated Successfully'), 'Order Updated Successfully')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T5/button_OK'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T5/i_(Jul 26 2019)_edit_order'))

WebUI.delay(1)

WebUI.click(findTestObject('Orders Repository/IMO-T5/span_'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T5/input_Choose files_order_update_btn'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T5/button_OK'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T5/i_(Jul 26 2019)_edit_order'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-T5/input_Quantity_hardware_quantity'), '1')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T5/span_ADD MORE'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T5/div_Select Hardware Type_ng-input'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T5/span_Hw3'))

WebUI.setText(findTestObject('Orders Repository/IMO-T5/input_Quantity_hardware_quantity - Copy'), '1')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T5/input_Choose files_order_update_btn'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T5/button_OK'))

WebUI.closeBrowser()

