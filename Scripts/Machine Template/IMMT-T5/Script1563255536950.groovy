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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:8080/#/login')

WebUI.setText(findTestObject('Object Repository/Machine Template Repository/IMMT-T5/input_LOGIN_userName'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Machine Template Repository/IMMT-T5/input_LOGIN_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Machine Template Repository/IMMT-T5/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/Machine Template Repository/IMMT-T5/a_MACHINE TEMPLATES'))

WebUI.click(findTestObject('Machine Template Repository/IMMT-T5/td_View  Edit  Delete'))

WebUI.verifyElementText(findTestObject('Object Repository/Machine Template Repository/IMMT-T5/h4_Edit Template'), 'Edit Template')

WebUI.click(findTestObject('Object Repository/Machine Template Repository/IMMT-T5/span_ADD MORE'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Machine Template Repository/IMMT-T5/select_MCUMorataMCU BoxRFID Tag'), 
    '7', true)

WebUI.setText(findTestObject('Object Repository/Machine Template Repository/IMMT-T5/input_Quantity_hardwareType_Quantity'), 
    '20')

WebUI.click(findTestObject('Object Repository/Machine Template Repository/IMMT-T5/input_ADD MORE_update_template'))

WebUI.verifyElementText(findTestObject('Object Repository/Machine Template Repository/IMMT-T5/div_Template edited successfully'), 
    'Template edited successfully')

WebUI.click(findTestObject('Object Repository/Machine Template Repository/IMMT-T5/button_OK'))

WebUI.closeBrowser()

