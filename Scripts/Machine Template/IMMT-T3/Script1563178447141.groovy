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

WebUI.setText(findTestObject('Object Repository/Machine Template Repository/IMMT-T3/input_LOGIN_userName'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Machine Template Repository/IMMT-T3/input_LOGIN_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Machine Template Repository/IMMT-T3/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/Machine Template Repository/IMMT-T3/a_MACHINE TEMPLATES'))

WebUI.click(findTestObject('Object Repository/Machine Template Repository/IMMT-T3/button_ Add'))

WebUI.click(findTestObject('Object Repository/Machine Template Repository/IMMT-T3/label_Keep on adding'))

WebUI.setText(findTestObject('Object Repository/Machine Template Repository/IMMT-T3/input_Name_name'), 'Temp3')

WebUI.selectOptionByValue(findTestObject('Object Repository/Machine Template Repository/IMMT-T3/select_GPSAntinaMCUMorataMCU BoxRFID Tag'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/Machine Template Repository/IMMT-T3/input_Quantity_hardwareType_Quantity'), 
    '1')

WebUI.click(findTestObject('Object Repository/Machine Template Repository/IMMT-T3/span_ADD MORE'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Machine Template Repository/IMMT-T3/select_AntinaMCUMorataMCU BoxRFID Tag'), 
    '2', true)

WebUI.setText(findTestObject('Machine Template Repository/IMMT-T3/input_Quantity_hardwareType_Quantity - Copy'), '2')

WebUI.click(findTestObject('Object Repository/Machine Template Repository/IMMT-T3/input_ADD MORE_create_template'))

WebUI.click(findTestObject('Object Repository/Machine Template Repository/IMMT-T3/h4_Add Template'))

WebUI.setText(findTestObject('Object Repository/Machine Template Repository/IMMT-T3/input_Name_name'), 'Delete')

WebUI.selectOptionByValue(findTestObject('Object Repository/Machine Template Repository/IMMT-T3/select_GPSAntinaMCUMorataMCU BoxRFID Tag'), 
    '1', true)

WebUI.setText(findTestObject('Machine Template Repository/IMMT-T3/input_Quantity_hardwareType_Quantity'), '3')

WebUI.click(findTestObject('Object Repository/Machine Template Repository/IMMT-T3/span_ADD MORE'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Machine Template Repository/IMMT-T3/select_AntinaMCUMorataMCU BoxRFID Tag'), 
    '4', true)

WebUI.setText(findTestObject('Machine Template Repository/IMMT-T3/input_Quantity_hardwareType_Quantity - Copy'), '1')

WebUI.click(findTestObject('Object Repository/Machine Template Repository/IMMT-T3/input_ADD MORE_create_template'))

WebUI.click(findTestObject('Object Repository/Machine Template Repository/IMMT-T3/button_Add Template_close_btn'))

WebUI.closeBrowser()

