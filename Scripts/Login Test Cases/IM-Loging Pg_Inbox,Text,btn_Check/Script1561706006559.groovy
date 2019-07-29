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

WebUI.verifyElementPresent(findTestObject('Object Repository/Login Repository/IM-Loging Pg_Inbox,Text,btn_Check/p_HELLO'), 
    1)

WebUI.verifyElementText(findTestObject('Login Repository/IM-Loging Pg_Inbox,Text,btn_Check/p_HELLO'), 'HELLO!')

WebUI.verifyElementPresent(findTestObject('Object Repository/Login Repository/IM-Loging Pg_Inbox,Text,btn_Check/p_Please login to see our awesome inventories'), 
    1)

WebUI.verifyElementText(findTestObject('Login Repository/IM-Loging Pg_Inbox,Text,btn_Check/p_Please login to see our awesome inventories'), 
    'Please login to see our awesome inventories')

WebUI.verifyElementClickable(findTestObject('Object Repository/Login Repository/IM-Loging Pg_Inbox,Text,btn_Check/input_LOGIN_userName'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Login Repository/IM-Loging Pg_Inbox,Text,btn_Check/input_LOGIN_password'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Login Repository/IM-Loging Pg_Inbox,Text,btn_Check/button_LOGIN'))

WebUI.verifyElementText(findTestObject('Object Repository/Login Repository/IM-Loging Pg_Inbox,Text,btn_Check/p_INVENTORY MANAGEMENT'), 
    'INVENTORY MANAGEMENT.')

WebUI.closeBrowser()

