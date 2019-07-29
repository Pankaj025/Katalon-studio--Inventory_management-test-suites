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

WebUI.setText(findTestObject('Machine Template Repository/IMMT-T1/input_LOGIN_userName'), 'admin')

WebUI.setEncryptedText(findTestObject('Machine Template Repository/IMMT-T1/input_LOGIN_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Machine Template Repository/IMMT-T1/button_LOGIN'))

WebUI.verifyElementClickable(findTestObject('Machine Template Repository/IMMT-T1/a_MACHINE TEMPLATES'))

WebUI.verifyElementText(findTestObject('Machine Template Repository/IMMT-T1/a_MACHINE TEMPLATES'), 'MACHINE TEMPLATES')

WebUI.click(findTestObject('Machine Template Repository/IMMT-T1/a_MACHINE TEMPLATES'))

WebUI.verifyElementClickable(findTestObject('Machine Template Repository/IMMT-T1/button_ Add'))

WebUI.verifyElementText(findTestObject('Machine Template Repository/IMMT-T1/button_ Add'), '+ Add')

WebUI.click(findTestObject('Machine Template Repository/IMMT-T1/button_ Add'))

WebUI.click(findTestObject('Machine Template Repository/IMMT-T1/input_ADD MORE_create_template'))

WebUI.verifyElementText(findTestObject('Machine Template Repository/IMMT-T1/div_Machine template name can not be empty'), 
    'Machine template name can not be empty')

WebUI.click(findTestObject('Machine Template Repository/IMMT-T1/button_OK'))

WebUI.setText(findTestObject('Machine Template Repository/IMMT-T1/input_Name_name'), 'MCU Box')

WebUI.click(findTestObject('Machine Template Repository/IMMT-T1/input_ADD MORE_create_template'))

WebUI.verifyElementText(findTestObject('Machine Template Repository/IMMT-T1/div_Machine Template items can not be empty'), 
    'Machine Template items can not be empty')

WebUI.click(findTestObject('Machine Template Repository/IMMT-T1/button_OK'))

WebUI.setText(findTestObject('Machine Template Repository/IMMT-T1/input_Name_name'), 'a')

WebUI.sendKeys(findTestObject('Machine Template Repository/IMMT-T1/input_Name_name'), Keys.chord(Keys.BACK_SPACE))

WebUI.selectOptionByValue(findTestObject('Machine Template Repository/IMMT-T1/select_GPSAntinaMCUMorataMCU BoxRFID Tag'), 
    '1', true)

WebUI.setText(findTestObject('Machine Template Repository/IMMT-T1/input_Quantity_hardwareType_Quantity'), '1')

WebUI.click(findTestObject('Machine Template Repository/IMMT-T1/input_ADD MORE_create_template'))

WebUI.verifyElementText(findTestObject('Machine Template Repository/IMMT-T1/div_Machine template name can not be empty'), 
    'Machine template name can not be empty')

WebUI.click(findTestObject('Machine Template Repository/IMMT-T1/button_OK'))

WebUI.click(findTestObject('Machine Template Repository/IMMT-T1/button_Add Template_close_btn'))

WebUI.closeBrowser()

