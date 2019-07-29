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

WebUI.setText(findTestObject('Price Model Repository/IM-Price Model Pg_Inbox,Text,btn_Check/input_LOGIN_userName'), 'admin')

WebUI.setEncryptedText(findTestObject('Price Model Repository/IM-Price Model Pg_Inbox,Text,btn_Check/input_LOGIN_password'), 
    '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Price Model Repository/IM-Price Model Pg_Inbox,Text,btn_Check/button_LOGIN'))

WebUI.click(findTestObject('Price Model Repository/IM-Price Model Pg_Inbox,Text,btn_Check/a_PRICE MODELS'))

WebUI.verifyElementText(findTestObject('Price Model Repository/IM-Price Model Pg_Inbox,Text,btn_Check/a_PRICE MODELS'), 
    'PRICE MODELS')

WebUI.verifyElementText(findTestObject('Price Model Repository/IM-Price Model Pg_Inbox,Text,btn_Check/p_Price Models'), 
    'Price Models')

WebUI.verifyElementText(findTestObject('Price Model Repository/IM-Price Model Pg_Inbox,Text,btn_Check/button_ Add'), '+ Add')

WebUI.verifyElementClickable(findTestObject('Price Model Repository/IM-Price Model Pg_Inbox,Text,btn_Check/button_ Add'))

WebUI.click(findTestObject('Price Model Repository/IM-Price Model Pg_Inbox,Text,btn_Check/button_ Add'))

WebUI.verifyElementText(findTestObject('Price Model Repository/IM-Price Model Pg_Inbox,Text,btn_Check/h4_Add Price Model'), 
    'Add Price Model')

WebUI.verifyElementText(findTestObject('Price Model Repository/IM-Price Model Pg_Inbox,Text,btn_Check/label_Hardware Type'), 
    'Hardware Type *')

WebUI.verifyElementText(findTestObject('Price Model Repository/IM-Price Model Pg_Inbox,Text,btn_Check/label_Name'), 'Name *')

WebUI.verifyElementText(findTestObject('Price Model Repository/IM-Price Model Pg_Inbox,Text,btn_Check/label_Vendor'), 'Vendor *')

WebUI.verifyElementText(findTestObject('Price Model Repository/IM-Price Model Pg_Inbox,Text,btn_Check/label_Make'), 'Make')

WebUI.verifyElementText(findTestObject('Price Model Repository/IM-Price Model Pg_Inbox,Text,btn_Check/label_Model'), 'Model')

WebUI.verifyElementText(findTestObject('Price Model Repository/IM-Price Model Pg_Inbox,Text,btn_Check/label_Price'), 'Price *')

WebUI.verifyElementText(findTestObject('Price Model Repository/IM-Price Model Pg_Inbox,Text,btn_Check/label_Comments'), 
    'Comments')

WebUI.click(findTestObject('Price Model Repository/IM-Price Model Pg_Inbox,Text,btn_Check/div__ngx-select__toggle btn form-control'))

WebUI.click(findTestObject('Price Model Repository/IM-Price Model Pg_Inbox,Text,btn_Check/span_Antina'))

WebUI.verifyElementClickable(findTestObject('Price Model Repository/IM-Price Model Pg_Inbox,Text,btn_Check/input__input_name'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Price Model Repository/IM-Price Model Pg_Inbox,Text,btn_Check/select_CNB'), '1', 
    true)

WebUI.verifyElementClickable(findTestObject('Price Model Repository/IM-Price Model Pg_Inbox,Text,btn_Check/input_Make_make'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Price Model Repository/IM-Price Model Pg_Inbox,Text,btn_Check/input_Model_model'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Price Model Repository/IM-Price Model Pg_Inbox,Text,btn_Check/input__input_price'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Price Model Repository/IM-Price Model Pg_Inbox,Text,btn_Check/textarea_Comments_comments'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Price Model Repository/IM-Price Model Pg_Inbox,Text,btn_Check/input_Comments_btn_save'))

WebUI.click(findTestObject('Price Model Repository/IM-Price Model Pg_Inbox,Text,btn_Check/input_Comments_btn_save'))

WebUI.verifyElementText(findTestObject('Price Model Repository/IM-Price Model Pg_Inbox,Text,btn_Check/div_Please provide valid details for price model'), 
    'Please provide valid details for price model')

WebUI.verifyElementClickable(findTestObject('Price Model Repository/IM-Price Model Pg_Inbox,Text,btn_Check/button_OK'))

WebUI.click(findTestObject('Price Model Repository/IM-Price Model Pg_Inbox,Text,btn_Check/button_OK'))

WebUI.click(findTestObject('Price Model Repository/IM-Price Model Pg_Inbox,Text,btn_Check/span_'))

WebUI.closeBrowser()

