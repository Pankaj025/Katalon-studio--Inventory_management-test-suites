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

WebUI.setText(findTestObject('Object Repository/Bulk Items Repository/IMBI-T5/input_LOGIN_userName'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Bulk Items Repository/IMBI-T5/input_LOGIN_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Bulk Items Repository/IMBI-T5/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/Bulk Items Repository/IMBI-T5/a_BULK ITMES'))

WebUI.click(findTestObject('Bulk Items Repository/IMBI-T5/td_Edit'))

WebUI.setText(findTestObject('Object Repository/Bulk Items Repository/IMBI-T5/input__batchName'), 'Tag Bulk2 Edited')

WebUI.setText(findTestObject('Object Repository/Bulk Items Repository/IMBI-T5/input_Start Number_startSNo'), '1500')

WebUI.setText(findTestObject('Object Repository/Bulk Items Repository/IMBI-T5/input_End Number_endSNo'), '2500')

WebUI.click(findTestObject('Object Repository/Bulk Items Repository/IMBI-T5/input_Created Date_edit_bulkitem'))

WebUI.verifyElementText(findTestObject('Object Repository/Bulk Items Repository/IMBI-T5/div_Bulk items edited successfully'), 
    'Bulk items edited successfully')

WebUI.click(findTestObject('Object Repository/Bulk Items Repository/IMBI-T5/button_OK'))

WebUI.closeBrowser()

