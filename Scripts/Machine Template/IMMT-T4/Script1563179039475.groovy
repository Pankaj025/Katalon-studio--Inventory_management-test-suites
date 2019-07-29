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

WebUI.setText(findTestObject('Object Repository/Machine Template Repository/IMMT-T4/input_LOGIN_userName'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Machine Template Repository/IMMT-T4/input_LOGIN_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Machine Template Repository/IMMT-T4/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/Machine Template Repository/IMMT-T4/a_MACHINE TEMPLATES'))

WebUI.click(findTestObject('Object Repository/Machine Template Repository/IMMT-T4/button_ Add'))

WebUI.setText(findTestObject('Object Repository/Machine Template Repository/IMMT-T4/input_Name_name'), 'Temp1')

WebUI.click(findTestObject('Object Repository/Machine Template Repository/IMMT-T4/input_For Composite Hardware_options'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Machine Template Repository/IMMT-T4/select_GPSAntinaMCUMorataMCU BoxRFID Tag'), 
    '7', true)

WebUI.setText(findTestObject('Object Repository/Machine Template Repository/IMMT-T4/input_Quantity_hardwareType_Quantity'), 
    '1000')

WebUI.click(findTestObject('Object Repository/Machine Template Repository/IMMT-T4/span_ADD MORE'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Machine Template Repository/IMMT-T4/select_GPSAntinaMCUMorataMCU Box'), 
    '4', true)

WebUI.setText(findTestObject('Object Repository/Machine Template Repository/IMMT-T4/input_Quantity_hardwareType_Quantity'), 
    '1')

WebUI.click(findTestObject('Object Repository/Machine Template Repository/IMMT-T4/input_ADD MORE_create_template'))

WebUI.click(findTestObject('Object Repository/Machine Template Repository/IMMT-T4/div_Machine template with the same name already exists'))

WebUI.click(findTestObject('Object Repository/Machine Template Repository/IMMT-T4/button_OK'))

WebUI.click(findTestObject('Object Repository/Machine Template Repository/IMMT-T4/button_Add Template_close_btn'))

WebUI.closeBrowser()

