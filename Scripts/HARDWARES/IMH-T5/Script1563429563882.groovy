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

WebUI.setText(findTestObject('Object Repository/Hardware Repository/IMH-T5/input_LOGIN_userName'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Hardware Repository/IMH-T5/input_LOGIN_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Hardware Repository/IMH-T5/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/Hardware Repository/IMH-T5/a_HARDWARES'))

WebUI.click(findTestObject('Object Repository/Hardware Repository/IMH-T5/button_ Add'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Hardware Repository/IMH-T5/select_GPSAntinaMCUMorataMCU Box'), 
    '2', true)

WebUI.setText(findTestObject('Object Repository/Hardware Repository/IMH-T5/input__hardware_name'), 'ANTINA_1')

WebUI.setText(findTestObject('Object Repository/Hardware Repository/IMH-T5/input__serial_Number'), 'ANTINA_1')

WebUI.click(findTestObject('Object Repository/Hardware Repository/IMH-T5/input_Created Date_add_hardware'))

WebUI.verifyElementText(findTestObject('Object Repository/Hardware Repository/IMH-T5/div_Hardware already exists'), 'Hardware already exists')

WebUI.click(findTestObject('Object Repository/Hardware Repository/IMH-T5/button_OK'))

WebUI.click(findTestObject('Object Repository/Hardware Repository/IMH-T5/span_'))

WebUI.click(findTestObject('Object Repository/Hardware Repository/IMH-T5/button_ Add'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Hardware Repository/IMH-T5/select_GPSAntinaMCUMorataMCU Box'), 
    '6', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Hardware Repository/IMH-T5/select_MCU Box'), '1', true)

WebUI.setText(findTestObject('Object Repository/Hardware Repository/IMH-T5/input_Choose Templates_hardwareSearch'), 'a')

WebUI.click(findTestObject('Object Repository/Hardware Repository/IMH-T5/span_'))

WebUI.closeBrowser()

