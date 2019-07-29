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

WebUI.setText(findTestObject('Machine Template Repository/IMMT-T2/input_LOGIN_userName'), 'admin')

WebUI.setEncryptedText(findTestObject('Machine Template Repository/IMMT-T2/input_LOGIN_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Machine Template Repository/IMMT-T2/button_LOGIN'))

WebUI.click(findTestObject('Machine Template Repository/IMMT-T2/a_MACHINE TEMPLATES'))

WebUI.click(findTestObject('Machine Template Repository/IMMT-T2/button_ Add'))

WebUI.setText(findTestObject('Machine Template Repository/IMMT-T2/input_Name_name'), 'MCU Box')

WebUI.click(findTestObject('Machine Template Repository/IMMT-T2/input_For Composite Hardware_options'))

WebUI.selectOptionByValue(findTestObject('Machine Template Repository/IMMT-T2/select_GPSAntinaMCUMorataMCU BoxRFID Tag'), 
    '1', true)

WebUI.setText(findTestObject('Machine Template Repository/IMMT-T2/input_Quantity_hardwareType_Quantity'), '1')

WebUI.click(findTestObject('Machine Template Repository/IMMT-T2/span_ADD MORE'))

WebUI.selectOptionByValue(findTestObject('Machine Template Repository/IMMT-T2/select_AntinaMCUMorataMCU BoxRFID Tag'), '2', 
    true)

WebUI.setText(findTestObject('Machine Template Repository/IMMT-T2/input_Quantity_hardwareType_Quantity - Copy'), '1')

WebUI.click(findTestObject('Machine Template Repository/IMMT-T2/input_ADD MORE_create_template'))

WebUI.click(findTestObject('Machine Template Repository/IMMT-T2/button_OK'))

WebUI.closeBrowser()

