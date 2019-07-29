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

WebUI.setText(findTestObject('Object Repository/Bulk Items Repository/IMBI-T6/input_LOGIN_userName'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Bulk Items Repository/IMBI-T6/input_LOGIN_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Bulk Items Repository/IMBI-T6/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/Bulk Items Repository/IMBI-T6/a_BULK ITMES'))

WebUI.click(findTestObject('Object Repository/Bulk Items Repository/IMBI-T6/button_ Add'))

WebUI.click(findTestObject('Object Repository/Bulk Items Repository/IMBI-T6/label_Keep on adding'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Bulk Items Repository/IMBI-T6/select_RFID TagBuk1Buk2Buk3Buk4Buk5Buk6Buk7Buk8Buk9Buk10Buk11'), 
    '18', true)

WebUI.setText(findTestObject('Object Repository/Bulk Items Repository/IMBI-T6/input__batchName'), 'BUK1')

WebUI.setText(findTestObject('Object Repository/Bulk Items Repository/IMBI-T6/input_Start Number_startSNo'), '1')

WebUI.setText(findTestObject('Object Repository/Bulk Items Repository/IMBI-T6/input_End Number_endSNo'), '150')

WebUI.setText(findTestObject('Object Repository/Bulk Items Repository/IMBI-T6/input__total'), '150')

WebUI.click(findTestObject('Object Repository/Bulk Items Repository/IMBI-T6/input_Created Date_Add_bulkItem'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Bulk Items Repository/IMBI-T6/select_RFID TagBuk1Buk2Buk3Buk4Buk5Buk6Buk7Buk8Buk9Buk10Buk11'), 
    '20', true)

WebUI.setText(findTestObject('Object Repository/Bulk Items Repository/IMBI-T6/input__batchName'), 'BUK3_2507')

WebUI.setText(findTestObject('Object Repository/Bulk Items Repository/IMBI-T6/input_Start Number_startSNo'), '500')

WebUI.setText(findTestObject('Object Repository/Bulk Items Repository/IMBI-T6/input_End Number_endSNo'), '3500')

WebUI.setText(findTestObject('Object Repository/Bulk Items Repository/IMBI-T6/input__total'), '3001')

WebUI.click(findTestObject('Object Repository/Bulk Items Repository/IMBI-T6/input_Created Date_Add_bulkItem'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Bulk Items Repository/IMBI-T6/select_RFID TagBuk1Buk2Buk3Buk4Buk5Buk6Buk7Buk8Buk9Buk10Buk11'), 
    '21', true)

WebUI.setText(findTestObject('Object Repository/Bulk Items Repository/IMBI-T6/input__batchName'), 'BUK4_250019_1')

WebUI.setText(findTestObject('Object Repository/Bulk Items Repository/IMBI-T6/input_Start Number_startSNo'), '5789')

WebUI.setText(findTestObject('Object Repository/Bulk Items Repository/IMBI-T6/input_End Number_endSNo'), '98543')

WebUI.setText(findTestObject('Object Repository/Bulk Items Repository/IMBI-T6/input__total'), '92755')

WebUI.click(findTestObject('Object Repository/Bulk Items Repository/IMBI-T6/label_Keep on adding'))

WebUI.click(findTestObject('Object Repository/Bulk Items Repository/IMBI-T6/input_Created Date_Add_bulkItem'))

WebUI.click(findTestObject('Object Repository/Bulk Items Repository/IMBI-T6/button_OK'))

