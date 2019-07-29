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

WebUI.setText(findTestObject('Hardware Type Repository/IMHT-T6/input_LOGIN_userName'), 'admin')

WebUI.setEncryptedText(findTestObject('Hardware Type Repository/IMHT-T6/input_LOGIN_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Hardware Type Repository/IMHT-T6/button_LOGIN'))

WebUI.click(findTestObject('Hardware Type Repository/IMHT-T6/a_HARDWARE TYPES'))

WebUI.click(findTestObject('Hardware Type Repository/IMHT-T6/button_ Add'))

WebUI.setText(findTestObject('Hardware Type Repository/IMHT-T6/input__hardwareType_name'), 'RFID Tag')

WebUI.setText(findTestObject('Hardware Type Repository/IMHT-T6/input__min_count_in-inventory'), '1000')

WebUI.click(findTestObject('Hardware Type Repository/IMHT-T6/input__is_bulkitem'))

WebUI.verifyElementChecked(findTestObject('Hardware Type Repository/IMHT-T6/input__is_bulkitem'), 1)

WebUI.click(findTestObject('Hardware Type Repository/IMHT-T6/input__adding_to_inventory'))

WebUI.verifyElementText(findTestObject('Hardware Type Repository/IMHT-T6/div_Hardware type added successfully'), 
    'Hardware type added successfully')

WebUI.click(findTestObject('Hardware Type Repository/IMHT-T6/button_OK'))

WebUI.closeBrowser()

