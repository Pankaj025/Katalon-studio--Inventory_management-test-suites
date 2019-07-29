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

WebUI.setText(findTestObject('Machine Template Repository/IM-Machine Template Pg_Inbox,Text,btn_Check/input_LOGIN_userName'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Machine Template Repository/IM-Machine Template Pg_Inbox,Text,btn_Check/input_LOGIN_password'), 
    '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Machine Template Repository/IM-Machine Template Pg_Inbox,Text,btn_Check/button_LOGIN'))

WebUI.verifyElementText(findTestObject('Machine Template Repository/IM-Machine Template Pg_Inbox,Text,btn_Check/a_MACHINE TEMPLATES'), 
    'MACHINE TEMPLATES')

WebUI.verifyElementClickable(findTestObject('Machine Template Repository/IM-Machine Template Pg_Inbox,Text,btn_Check/a_MACHINE TEMPLATES'))

WebUI.click(findTestObject('Machine Template Repository/IM-Machine Template Pg_Inbox,Text,btn_Check/a_MACHINE TEMPLATES'))

WebUI.verifyElementText(findTestObject('Machine Template Repository/IM-Machine Template Pg_Inbox,Text,btn_Check/p_Machine Templates'), 
    'Machine Templates')

WebUI.verifyElementText(findTestObject('Machine Template Repository/IM-Machine Template Pg_Inbox,Text,btn_Check/button_ Add'), 
    '+ Add')

WebUI.verifyElementClickable(findTestObject('Machine Template Repository/IM-Machine Template Pg_Inbox,Text,btn_Check/button_ Add'))

WebUI.click(findTestObject('Machine Template Repository/IM-Machine Template Pg_Inbox,Text,btn_Check/button_ Add'))

WebUI.verifyElementText(findTestObject('Machine Template Repository/IM-Machine Template Pg_Inbox,Text,btn_Check/h4_Add Template'), 
    'Add Template')

WebUI.verifyElementText(findTestObject('Machine Template Repository/IM-Machine Template Pg_Inbox,Text,btn_Check/label_Name'), 
    'Name:')

WebUI.verifyElementClickable(findTestObject('Machine Template Repository/IM-Machine Template Pg_Inbox,Text,btn_Check/input_Name_name'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Machine Template Repository/IM-Machine Template Pg_Inbox,Text,btn_Check/label_For Composite Hardware'), 
    'For Composite Hardware:')

WebUI.verifyElementClickable(findTestObject('Machine Template Repository/IM-Machine Template Pg_Inbox,Text,btn_Check/input_For Composite Hardware_options'))

WebUI.click(findTestObject('Machine Template Repository/IM-Machine Template Pg_Inbox,Text,btn_Check/input_For Composite Hardware_options'))

WebUI.verifyElementChecked(findTestObject('Machine Template Repository/IM-Machine Template Pg_Inbox,Text,btn_Check/input_For Composite Hardware_options'), 
    1)

WebUI.verifyElementNotChecked(findTestObject('Machine Template Repository/IM-Machine Template Pg_Inbox,Text,btn_Check/input_Yes_options'), 
    1)

WebUI.verifyElementClickable(findTestObject('Machine Template Repository/IM-Machine Template Pg_Inbox,Text,btn_Check/input_Yes_options'))

WebUI.click(findTestObject('Machine Template Repository/IM-Machine Template Pg_Inbox,Text,btn_Check/input_Yes_options'))

WebUI.verifyElementChecked(findTestObject('Machine Template Repository/IM-Machine Template Pg_Inbox,Text,btn_Check/input_Yes_options'), 
    1)

WebUI.verifyElementNotChecked(findTestObject('Machine Template Repository/IM-Machine Template Pg_Inbox,Text,btn_Check/input_For Composite Hardware_options'), 
    1)

WebUI.verifyElementText(findTestObject('Machine Template Repository/IM-Machine Template Pg_Inbox,Text,btn_Check/label_Hardware Type'), 
    'Hardware Type')

WebUI.selectOptionByValue(findTestObject('Machine Template Repository/IM-Machine Template Pg_Inbox,Text,btn_Check/select_GPSAntinaMCUMorataMCU BoxRFID Tag'), 
    '3', true)

WebUI.verifyElementText(findTestObject('Machine Template Repository/IM-Machine Template Pg_Inbox,Text,btn_Check/label_Quantity'), 
    'Quantity')

WebUI.setText(findTestObject('Machine Template Repository/IM-Machine Template Pg_Inbox,Text,btn_Check/input_Quantity_hardwareType_Quantity'), 
    '1')

WebUI.verifyElementClickable(findTestObject('Machine Template Repository/IM-Machine Template Pg_Inbox,Text,btn_Check/span_ADD MORE'))

WebUI.verifyElementText(findTestObject('Machine Template Repository/IM-Machine Template Pg_Inbox,Text,btn_Check/span_ADD MORE'), 
    'ADD MORE')

WebUI.click(findTestObject('Machine Template Repository/IM-Machine Template Pg_Inbox,Text,btn_Check/span_ADD MORE'))

WebUI.selectOptionByValue(findTestObject('Machine Template Repository/IM-Machine Template Pg_Inbox,Text,btn_Check/select_GPSAntinaMorataMCU BoxRFID Tag'), 
    '2', true)

WebUI.setText(findTestObject('Machine Template Repository/IM-Machine Template Pg_Inbox,Text,btn_Check/input_Quantity_hardwareType_Quantity'), 
    '2')

WebUI.click(findTestObject('Machine Template Repository/IM-Machine Template Pg_Inbox,Text,btn_Check/label_Keep on adding'))

WebUI.click(findTestObject('Machine Template Repository/IM-Machine Template Pg_Inbox,Text,btn_Check/label_Keep on adding'))

WebUI.click(findTestObject('Machine Template Repository/IM-Machine Template Pg_Inbox,Text,btn_Check/input_ADD MORE_create_template'))

WebUI.verifyElementText(findTestObject('Machine Template Repository/IM-Machine Template Pg_Inbox,Text,btn_Check/div_Machine template name can not be empty'), 
    'Machine template name can not be empty')

WebUI.click(findTestObject('Machine Template Repository/IM-Machine Template Pg_Inbox,Text,btn_Check/button_OK'))

WebUI.verifyElementClickable(findTestObject('Machine Template Repository/IM-Machine Template Pg_Inbox,Text,btn_Check/button_Add Template_close_btn'))

WebUI.click(findTestObject('Machine Template Repository/IM-Machine Template Pg_Inbox,Text,btn_Check/button_Add Template_close_btn'))

