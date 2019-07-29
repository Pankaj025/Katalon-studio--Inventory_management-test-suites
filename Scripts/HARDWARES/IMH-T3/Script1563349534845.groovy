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

WebUI.setText(findTestObject('Object Repository/Hardware Repository/IMH-T3/input_LOGIN_userName'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Hardware Repository/IMH-T3/input_LOGIN_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Hardware Repository/IMH-T3/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/Hardware Repository/IMH-T3/a_HARDWARES'))

WebUI.click(findTestObject('Object Repository/Hardware Repository/IMH-T3/button_ Add'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Hardware Repository/IMH-T3/select_GPSAntinaMCUMorataMCU Box'), 
    '2', true)

WebUI.setText(findTestObject('Object Repository/Hardware Repository/IMH-T3/input__hardware_name'), 'ANTINA_1')

WebUI.setText(findTestObject('Object Repository/Hardware Repository/IMH-T3/input__serial_Number'), 'ANTINA_1')

WebUI.click(findTestObject('Object Repository/Hardware Repository/IMH-T3/label_Keep on adding'))

WebUI.click(findTestObject('Object Repository/Hardware Repository/IMH-T3/input_Created Date_add_hardware'))

WebUI.verifyElementText(findTestObject('Object Repository/Hardware Repository/IMH-T3/h4_Add Hardware'), 'Add Hardware')

WebUI.selectOptionByValue(findTestObject('Object Repository/Hardware Repository/IMH-T3/select_GPSAntinaMCUMorataMCU Box'), 
    '3', true)

WebUI.setText(findTestObject('Object Repository/Hardware Repository/IMH-T3/input__hardware_name'), 'MCU_1')

WebUI.setText(findTestObject('Object Repository/Hardware Repository/IMH-T3/input__serial_Number'), 'MCU_1')

WebUI.click(findTestObject('Object Repository/Hardware Repository/IMH-T3/input_Created Date_add_hardware'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Hardware Repository/IMH-T3/select_GPSAntinaMCUMorataMCU Box'), 
    '4', true)

WebUI.setText(findTestObject('Object Repository/Hardware Repository/IMH-T3/input__hardware_name'), 'MORATA_1')

WebUI.setText(findTestObject('Object Repository/Hardware Repository/IMH-T3/input__serial_Number'), 'MORATA_1')

WebUI.click(findTestObject('Object Repository/Hardware Repository/IMH-T3/label_Keep on adding'))

WebUI.click(findTestObject('Object Repository/Hardware Repository/IMH-T3/input_Created Date_add_hardware'))

WebUI.click(findTestObject('Object Repository/Hardware Repository/IMH-T3/button_OK'))

WebUI.closeBrowser()

