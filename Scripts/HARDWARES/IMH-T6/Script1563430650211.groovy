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

WebUI.setText(findTestObject('Object Repository/Hardware Repository/IMH-T6/input_LOGIN_userName'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Hardware Repository/IMH-T6/input_LOGIN_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Hardware Repository/IMH-T6/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/Hardware Repository/IMH-T6/a_HARDWARES'))

WebUI.click(findTestObject('Object Repository/Hardware Repository/IMH-T6/a_Edit'))

WebUI.setText(findTestObject('Object Repository/Hardware Repository/IMH-T6/input__hardware_name'), 'MORATA_123')

WebUI.setText(findTestObject('Object Repository/Hardware Repository/IMH-T6/input__serial_Number'), 'MORATA_123')

WebUI.click(findTestObject('Object Repository/Hardware Repository/IMH-T6/input_Created Date_save_hardware'))

WebUI.verifyElementText(findTestObject('Object Repository/Hardware Repository/IMH-T6/div_Hardware edited successfully'), 
    'Hardware edited successfully')

WebUI.click(findTestObject('Object Repository/Hardware Repository/IMH-T6/button_OK'))

WebUI.verifyElementText(findTestObject('Object Repository/Hardware Repository/IMH-T6/td_MORATA_123'), 'MORATA_123')

WebUI.closeBrowser()

