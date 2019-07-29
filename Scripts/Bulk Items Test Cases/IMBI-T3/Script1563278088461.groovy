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

WebUI.setText(findTestObject('Object Repository/Bulk Items Repository/IMBI-T3/input_LOGIN_userName'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Bulk Items Repository/IMBI-T3/input_LOGIN_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Bulk Items Repository/IMBI-T3/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/Bulk Items Repository/IMBI-T3/a_BULK ITMES'))

WebUI.click(findTestObject('Object Repository/Bulk Items Repository/IMBI-T3/button_ Add'))

WebUI.click(findTestObject('Object Repository/Bulk Items Repository/IMBI-T3/label_Keep on adding'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Bulk Items Repository/IMBI-T3/select_RFID Tag'), '7', true)

WebUI.setText(findTestObject('Object Repository/Bulk Items Repository/IMBI-T3/input__batchName'), 'Bulk2')

WebUI.setText(findTestObject('Object Repository/Bulk Items Repository/IMBI-T3/input_Start Number_startSNo'), '1')

WebUI.setText(findTestObject('Object Repository/Bulk Items Repository/IMBI-T3/input_End Number_endSNo'), '100')

WebUI.click(findTestObject('Object Repository/Bulk Items Repository/IMBI-T3/input_Created Date_Add_bulkItem'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Bulk Items Repository/IMBI-T3/select_RFID Tag'), '7', true)

WebUI.setText(findTestObject('Object Repository/Bulk Items Repository/IMBI-T3/input__batchName'), 'RFIDTAG_1')

WebUI.setText(findTestObject('Object Repository/Bulk Items Repository/IMBI-T3/input_Start Number_startSNo'), '1')

WebUI.setText(findTestObject('Object Repository/Bulk Items Repository/IMBI-T3/input_End Number_endSNo'), '100')

WebUI.click(findTestObject('Object Repository/Bulk Items Repository/IMBI-T3/input_Created Date_Add_bulkItem'))

WebUI.verifyElementText(findTestObject('Object Repository/Bulk Items Repository/IMBI-T3/h4_Add Bulk Items'), 'Add Bulk Items')

WebUI.selectOptionByValue(findTestObject('Object Repository/Bulk Items Repository/IMBI-T3/select_RFID Tag'), '7', true)

WebUI.setText(findTestObject('Object Repository/Bulk Items Repository/IMBI-T3/input__batchName'), 'Bulk3')

WebUI.setText(findTestObject('Object Repository/Bulk Items Repository/IMBI-T3/input_Start Number_startSNo'), '200')

WebUI.setText(findTestObject('Object Repository/Bulk Items Repository/IMBI-T3/input_End Number_endSNo'), '500')

WebUI.click(findTestObject('Object Repository/Bulk Items Repository/IMBI-T3/label_Keep on adding'))

WebUI.click(findTestObject('Object Repository/Bulk Items Repository/IMBI-T3/input_Created Date_Add_bulkItem'))

WebUI.verifyElementText(findTestObject('Object Repository/Bulk Items Repository/IMBI-T3/div_Bulk items added successfully'), 
    'Bulk items added successfully')

WebUI.click(findTestObject('Object Repository/Bulk Items Repository/IMBI-T3/button_OK'))

WebUI.closeBrowser()

