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

WebUI.setText(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input_LOGIN_userName'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input_LOGIN_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/a_HARDWARE TYPES'))

WebUI.click(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/button_ Add'))

WebUI.click(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/label_Keep on adding'))

WebUI.setText(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__hardwareType_name'), 'RFID Reader')

WebUI.setText(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__min_count_in-inventory'), '1')

WebUI.click(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__adding_to_inventory'))

WebUI.setText(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__hardwareType_name'), 'Hw2')

WebUI.setText(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__min_count_in-inventory'), '1')

WebUI.click(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__adding_to_inventory'))

WebUI.setText(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__hardwareType_name'), 'Hw3')

WebUI.setText(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__min_count_in-inventory'), '1')

WebUI.click(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__adding_to_inventory'))

WebUI.setText(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__hardwareType_name'), 'Hw4')

WebUI.setText(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__min_count_in-inventory'), '1')

WebUI.click(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__adding_to_inventory'))

WebUI.setText(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__hardwareType_name'), 'Hw5')

WebUI.setText(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__min_count_in-inventory'), '1')

WebUI.click(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__adding_to_inventory'))

WebUI.setText(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__hardwareType_name'), 'Hw6')

WebUI.setText(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__min_count_in-inventory'), '1')

WebUI.click(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__adding_to_inventory'))

WebUI.setText(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__hardwareType_name'), 'Hw7')

WebUI.setText(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__min_count_in-inventory'), '1')

WebUI.click(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__adding_to_inventory'))

WebUI.setText(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__hardwareType_name'), 'Hw8')

WebUI.setText(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__min_count_in-inventory'), '1')

WebUI.click(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__adding_to_inventory'))

WebUI.setText(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__hardwareType_name'), 'Hw9')

WebUI.setText(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__min_count_in-inventory'), '1')

WebUI.click(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__adding_to_inventory'))

WebUI.setText(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__hardwareType_name'), 'Hw10')

WebUI.setText(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__min_count_in-inventory'), '1')

WebUI.click(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__adding_to_inventory'))

WebUI.setText(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__hardwareType_name'), 'Buk1')

WebUI.setText(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__min_count_in-inventory'), '10')

WebUI.click(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__is_bulkitem'))

WebUI.click(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__adding_to_inventory'))

WebUI.setText(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__hardwareType_name'), 'Buk2')

WebUI.setText(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__min_count_in-inventory'), '10')

WebUI.click(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__is_bulkitem'))

WebUI.click(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__adding_to_inventory'))

WebUI.setText(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__hardwareType_name'), 'Buk3')

WebUI.setText(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__min_count_in-inventory'), '10')

WebUI.click(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__is_bulkitem'))

WebUI.click(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__adding_to_inventory'))

WebUI.setText(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__hardwareType_name'), 'Buk4')

WebUI.setText(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__min_count_in-inventory'), '10')

WebUI.click(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__is_bulkitem'))

WebUI.click(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__adding_to_inventory'))

WebUI.setText(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__hardwareType_name'), 'Buk5')

WebUI.setText(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__min_count_in-inventory'), '10')

WebUI.click(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__is_bulkitem'))

WebUI.click(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__adding_to_inventory'))

WebUI.setText(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__hardwareType_name'), 'Buk6')

WebUI.setText(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__min_count_in-inventory'), '10')

WebUI.click(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__is_bulkitem'))

WebUI.click(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__adding_to_inventory'))

WebUI.setText(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__hardwareType_name'), 'Buk7')

WebUI.setText(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__min_count_in-inventory'), '10')

WebUI.click(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__is_bulkitem'))

WebUI.click(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__adding_to_inventory'))

WebUI.setText(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__hardwareType_name'), 'Buk8')

WebUI.setText(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__min_count_in-inventory'), '10')

WebUI.click(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__is_bulkitem'))

WebUI.click(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__adding_to_inventory'))

WebUI.setText(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__hardwareType_name'), 'Buk9')

WebUI.setText(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__min_count_in-inventory'), '10')

WebUI.click(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__is_bulkitem'))

WebUI.click(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__adding_to_inventory'))

WebUI.setText(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__hardwareType_name'), 'Buk10')

WebUI.setText(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__min_count_in-inventory'), '10')

WebUI.click(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__is_bulkitem'))

WebUI.click(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__adding_to_inventory'))

WebUI.setText(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__hardwareType_name'), 'Buk11')

WebUI.setText(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__min_count_in-inventory'), '10')

WebUI.click(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__is_bulkitem'))

WebUI.click(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/input__adding_to_inventory'))

WebUI.click(findTestObject('Object Repository/Hardware Type Repository/IMHT-T9/span_'))

WebUI.closeBrowser()

