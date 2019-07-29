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

WebUI.setText(findTestObject('Object Repository/Bulk Items Repository/IMBI-T2/input_LOGIN_userName'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Bulk Items Repository/IMBI-T2/input_LOGIN_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Bulk Items Repository/IMBI-T2/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/Bulk Items Repository/IMBI-T2/a_BULK ITMES'))

WebUI.click(findTestObject('Object Repository/Bulk Items Repository/IMBI-T2/button_ Add'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Bulk Items Repository/IMBI-T2/select_RFID Tag'), '7', true)

WebUI.setText(findTestObject('Object Repository/Bulk Items Repository/IMBI-T2/input__batchName'), 'Tag Bulk1')

WebUI.setText(findTestObject('Object Repository/Bulk Items Repository/IMBI-T2/input_Start Number_startSNo'), '100')

WebUI.setText(findTestObject('Object Repository/Bulk Items Repository/IMBI-T2/input_End Number_endSNo'), '1000')

WebUI.click(findTestObject('Object Repository/Bulk Items Repository/IMBI-T2/input_Created Date_Add_bulkItem'))

WebUI.verifyElementText(findTestObject('Object Repository/Bulk Items Repository/IMBI-T2/div_Bulk items added successfully'), 
    'Bulk items added successfully')

WebUI.click(findTestObject('Object Repository/Bulk Items Repository/IMBI-T2/button_OK'))

WebUI.verifyElementText(findTestObject('Object Repository/Bulk Items Repository/IMBI-T2/td_Tag Bulk1'), 'Tag Bulk1')

WebUI.verifyElementText(findTestObject('Object Repository/Bulk Items Repository/IMBI-T2/td_901'), '901')

WebUI.closeBrowser()

