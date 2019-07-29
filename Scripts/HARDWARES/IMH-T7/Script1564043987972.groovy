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

WebUI.setText(findTestObject('Object Repository/Hardware Repository/IMH-T7/input_LOGIN_userName'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Hardware Repository/IMH-T7/input_LOGIN_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Hardware Repository/IMH-T7/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/Hardware Repository/IMH-T7/a_HARDWARES'))

WebUI.click(findTestObject('Object Repository/Hardware Repository/IMH-T7/button_ Add'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Hardware Repository/IMH-T7/select_GPSAntina'), '8', true)

WebUI.setText(findTestObject('Object Repository/Hardware Repository/IMH-T7/input__hardware_name'), 'RFIDREADER_2507')

WebUI.setText(findTestObject('Object Repository/Hardware Repository/IMH-T7/input__serial_Number'), 'RFIDREADER_25')

WebUI.click(findTestObject('Object Repository/Hardware Repository/IMH-T7/label_Keep on adding'))

WebUI.click(findTestObject('Object Repository/Hardware Repository/IMH-T7/input_Created Date_add_hardware'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Hardware Repository/IMH-T7/select_GPSAntina'), '9', true)

WebUI.setText(findTestObject('Object Repository/Hardware Repository/IMH-T7/input__hardware_name'), 'HW2_2507')

WebUI.setText(findTestObject('Object Repository/Hardware Repository/IMH-T7/input__serial_Number'), 'HW2_25072019')

WebUI.click(findTestObject('Object Repository/Hardware Repository/IMH-T7/input_Created Date_add_hardware'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Hardware Repository/IMH-T7/select_GPSAntina'), '10', true)

WebUI.setText(findTestObject('Object Repository/Hardware Repository/IMH-T7/input__hardware_name'), 'HW3_272019_1')

WebUI.setText(findTestObject('Object Repository/Hardware Repository/IMH-T7/input__serial_Number'), 'HW3_2507019_1')

WebUI.click(findTestObject('Object Repository/Hardware Repository/IMH-T7/input_Created Date_add_hardware'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Hardware Repository/IMH-T7/select_GPSAntina'), '11', true)

WebUI.setText(findTestObject('Object Repository/Hardware Repository/IMH-T7/input__hardware_name'), 'HW4_072019_1')

WebUI.setText(findTestObject('Object Repository/Hardware Repository/IMH-T7/input__serial_Number'), 'HW4_25072')

WebUI.click(findTestObject('Object Repository/Hardware Repository/IMH-T7/input_Created Date_add_hardware'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Hardware Repository/IMH-T7/select_GPSAntina'), '12', true)

WebUI.setText(findTestObject('Object Repository/Hardware Repository/IMH-T7/input__hardware_name'), 'HW5_019_1')

WebUI.setText(findTestObject('Object Repository/Hardware Repository/IMH-T7/input__serial_Number'), 'HW5_25019_1')

WebUI.click(findTestObject('Object Repository/Hardware Repository/IMH-T7/input_Created Date_add_hardware'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Hardware Repository/IMH-T7/select_GPSAntina'), '13', true)

WebUI.setText(findTestObject('Object Repository/Hardware Repository/IMH-T7/input__hardware_name'), 'HW6_25072019_133')

WebUI.setText(findTestObject('Object Repository/Hardware Repository/IMH-T7/input__serial_Number'), 'HW6_250723019_1')

WebUI.click(findTestObject('Object Repository/Hardware Repository/IMH-T7/input_Created Date_add_hardware'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Hardware Repository/IMH-T7/select_GPSAntina'), '14', true)

WebUI.setText(findTestObject('Object Repository/Hardware Repository/IMH-T7/input__hardware_name'), 'HW7_2507452019_1')

WebUI.setText(findTestObject('Object Repository/Hardware Repository/IMH-T7/input__serial_Number'), 'HW7_250072019_1')

WebUI.click(findTestObject('Object Repository/Hardware Repository/IMH-T7/input_Created Date_add_hardware'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Hardware Repository/IMH-T7/select_GPSAntina'), '15', true)

WebUI.setText(findTestObject('Object Repository/Hardware Repository/IMH-T7/input__hardware_name'), 'HW8_2502019_1')

WebUI.setText(findTestObject('Object Repository/Hardware Repository/IMH-T7/input__serial_Number'), 'HW8_25072')

WebUI.click(findTestObject('Object Repository/Hardware Repository/IMH-T7/input_Created Date_add_hardware'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Hardware Repository/IMH-T7/select_GPSAntina'), '16', true)

WebUI.setText(findTestObject('Object Repository/Hardware Repository/IMH-T7/input__hardware_name'), 'HW9_25072019_10')

WebUI.setText(findTestObject('Object Repository/Hardware Repository/IMH-T7/input__serial_Number'), 'HW9_250720193')

WebUI.click(findTestObject('Object Repository/Hardware Repository/IMH-T7/input_Created Date_add_hardware'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Hardware Repository/IMH-T7/select_GPSAntina'), '17', true)

WebUI.setText(findTestObject('Object Repository/Hardware Repository/IMH-T7/input__hardware_name'), 'HW10_2507243019_1')

WebUI.setText(findTestObject('Object Repository/Hardware Repository/IMH-T7/input__serial_Number'), 'HW10_250729019_1')

WebUI.click(findTestObject('Object Repository/Hardware Repository/IMH-T7/input_Created Date_add_hardware'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Hardware Repository/IMH-T7/select_GPSAntina'), '1', true)

WebUI.setText(findTestObject('Object Repository/Hardware Repository/IMH-T7/input__hardware_name'), 'GPS_250720169_1')

WebUI.setText(findTestObject('Object Repository/Hardware Repository/IMH-T7/input__serial_Number'), 'GPS_250372019_1')

WebUI.click(findTestObject('Object Repository/Hardware Repository/IMH-T7/input_Created Date_add_hardware'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Hardware Repository/IMH-T7/select_GPSAntina'), '2', true)

WebUI.setText(findTestObject('Object Repository/Hardware Repository/IMH-T7/input__hardware_name'), 'ANTINA_251072019_1')

WebUI.setText(findTestObject('Object Repository/Hardware Repository/IMH-T7/input__serial_Number'), 'ANTINA_259072019_1')

WebUI.click(findTestObject('Object Repository/Hardware Repository/IMH-T7/input_Created Date_add_hardware'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Hardware Repository/IMH-T7/select_GPSAntina'), '3', true)

WebUI.setText(findTestObject('Object Repository/Hardware Repository/IMH-T7/input__hardware_name'), 'MCU_2586072019_1')

WebUI.setText(findTestObject('Object Repository/Hardware Repository/IMH-T7/input__serial_Number'), 'MCU_2507762019_1')

WebUI.click(findTestObject('Object Repository/Hardware Repository/IMH-T7/input_Created Date_add_hardware'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Hardware Repository/IMH-T7/select_GPSAntina'), '8', true)

WebUI.setText(findTestObject('Object Repository/Hardware Repository/IMH-T7/input__hardware_name'), 'RFIDREADER_250772019_1')

WebUI.setText(findTestObject('Object Repository/Hardware Repository/IMH-T7/input__serial_Number'), 'RFIDREADER_072019_1')

WebUI.click(findTestObject('Object Repository/Hardware Repository/IMH-T7/input_Created Date_add_hardware'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Hardware Repository/IMH-T7/select_GPSAntina'), '4', true)

WebUI.setText(findTestObject('Object Repository/Hardware Repository/IMH-T7/input__hardware_name'), 'MORATA_2072019_1')

WebUI.setText(findTestObject('Object Repository/Hardware Repository/IMH-T7/input__serial_Number'), 'MORATA_25072019')

WebUI.click(findTestObject('Object Repository/Hardware Repository/IMH-T7/input_Created Date_add_hardware'))

WebUI.click(findTestObject('Object Repository/Hardware Repository/IMH-T7/span_'))

WebUI.closeBrowser()

