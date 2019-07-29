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

WebUI.setText(findTestObject('Stakeholder Repository/IM-Stakeholder Pg_Inbox,Text,btn_Check/input_LOGIN_userName'), 'admin')

WebUI.setEncryptedText(findTestObject('Stakeholder Repository/IM-Stakeholder Pg_Inbox,Text,btn_Check/input_LOGIN_password'), 
    '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Stakeholder Repository/IM-Stakeholder Pg_Inbox,Text,btn_Check/button_LOGIN'))

WebUI.verifyElementText(findTestObject('Stakeholder Repository/IM-Stakeholder Pg_Inbox,Text,btn_Check/a_STAKEHOLDERS'), 
    'STAKEHOLDERS')

WebUI.click(findTestObject('Stakeholder Repository/IM-Stakeholder Pg_Inbox,Text,btn_Check/a_STAKEHOLDERS'))

WebUI.verifyElementText(findTestObject('Stakeholder Repository/IM-Stakeholder Pg_Inbox,Text,btn_Check/p_Stakeholders'), 
    'Stakeholders')

WebUI.click(findTestObject('Stakeholder Repository/IM-Stakeholder Pg_Inbox,Text,btn_Check/p_Stakeholders'))

WebUI.verifyElementText(findTestObject('Stakeholder Repository/IM-Stakeholder Pg_Inbox,Text,btn_Check/button_ Add'), '+ Add')

WebUI.click(findTestObject('Stakeholder Repository/IM-Stakeholder Pg_Inbox,Text,btn_Check/button_ Add'))

WebUI.verifyElementText(findTestObject('Stakeholder Repository/IM-Stakeholder Pg_Inbox,Text,btn_Check/h4_Add Stakeholder'), 
    'Add Stakeholder')

WebUI.click(findTestObject('Stakeholder Repository/IM-Stakeholder Pg_Inbox,Text,btn_Check/h4_Add Stakeholder'))

WebUI.verifyElementText(findTestObject('Stakeholder Repository/IM-Stakeholder Pg_Inbox,Text,btn_Check/label_Name'), 'Name: *')

WebUI.verifyElementClickable(findTestObject('Stakeholder Repository/IM-Stakeholder Pg_Inbox,Text,btn_Check/input__stakeHolder_name'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Stakeholder Repository/IM-Stakeholder Pg_Inbox,Text,btn_Check/label_Country'), 'Country:')

WebUI.verifyElementClickable(findTestObject('Stakeholder Repository/IM-Stakeholder Pg_Inbox,Text,btn_Check/input_Country_stakeHolder_country'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Stakeholder Repository/IM-Stakeholder Pg_Inbox,Text,btn_Check/form_Name Name is required  Client     Vendor    Both  Country'))

WebUI.click(findTestObject('Stakeholder Repository/IM-Stakeholder Pg_Inbox,Text,btn_Check/input_Name is required_stakeHolder_client'))

WebUI.verifyElementChecked(findTestObject('Stakeholder Repository/IM-Stakeholder Pg_Inbox,Text,btn_Check/input_Name is required_stakeHolder_client'), 
    1)

WebUI.verifyElementText(findTestObject('Stakeholder Repository/IM-Stakeholder Pg_Inbox,Text,btn_Check/label_Vendor'), 'Vendor')

WebUI.click(findTestObject('Stakeholder Repository/IM-Stakeholder Pg_Inbox,Text,btn_Check/input_Client_stakeHolder_vendor'))

WebUI.verifyElementChecked(findTestObject('Stakeholder Repository/IM-Stakeholder Pg_Inbox,Text,btn_Check/input_Client_stakeHolder_vendor'), 
    1)

WebUI.verifyElementText(findTestObject('Stakeholder Repository/IM-Stakeholder Pg_Inbox,Text,btn_Check/label_Both'), 'Both')

WebUI.click(findTestObject('Stakeholder Repository/IM-Stakeholder Pg_Inbox,Text,btn_Check/input_Vendor_stakeHolder_both'))

WebUI.verifyElementChecked(findTestObject('Stakeholder Repository/IM-Stakeholder Pg_Inbox,Text,btn_Check/input_Vendor_stakeHolder_both'), 
    1)

WebUI.verifyElementText(findTestObject('Stakeholder Repository/IM-Stakeholder Pg_Inbox,Text,btn_Check/label_Keep on adding'), 
    'Keep on adding')

WebUI.click(findTestObject('Stakeholder Repository/IM-Stakeholder Pg_Inbox,Text,btn_Check/label_Keep on adding'))

WebUI.click(findTestObject('Stakeholder Repository/IM-Stakeholder Pg_Inbox,Text,btn_Check/label_Keep on adding'))

WebUI.click(findTestObject('Stakeholder Repository/IM-Stakeholder Pg_Inbox,Text,btn_Check/Form_Close_btn'))

WebUI.closeBrowser()

