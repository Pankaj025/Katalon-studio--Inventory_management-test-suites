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

WebUI.setText(findTestObject('Object Repository/Hardware Repository/IMH-T1/input_LOGIN_userName'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Hardware Repository/IMH-T1/input_LOGIN_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Hardware Repository/IMH-T1/button_LOGIN'))

WebUI.verifyElementClickable(findTestObject('Hardware Repository/IMH-T1/a_HARDWARES'))

WebUI.verifyElementText(findTestObject('Hardware Repository/IMH-T1/a_HARDWARES'), 'HARDWARES')

WebUI.click(findTestObject('Object Repository/Hardware Repository/IMH-T1/a_HARDWARES'))

WebUI.verifyElementText(findTestObject('Object Repository/Hardware Repository/IMH-T1/p_Hardwares'), 'Hardwares')

WebUI.verifyElementText(findTestObject('Object Repository/Hardware Repository/IMH-T1/span_Show dispatched'), 'Show dispatched')

WebUI.click(findTestObject('Object Repository/Hardware Repository/IMH-T1/input_ Add_showDispatched'))

WebUI.verifyElementChecked(findTestObject('Hardware Repository/IMH-T1/input_ Add_showDispatched'), 1)

WebUI.click(findTestObject('Object Repository/Hardware Repository/IMH-T1/input_ Add_showDispatched'))

WebUI.verifyElementNotChecked(findTestObject('Hardware Repository/IMH-T1/input_ Add_showDispatched'), 1)

WebUI.verifyElementClickable(findTestObject('Hardware Repository/IMH-T1/button_ Add'))

WebUI.verifyElementText(findTestObject('Hardware Repository/IMH-T1/button_ Add'), '+ Add')

WebUI.click(findTestObject('Object Repository/Hardware Repository/IMH-T1/button_ Add'))

WebUI.verifyElementText(findTestObject('Object Repository/Hardware Repository/IMH-T1/h4_Add Hardware'), 'Add Hardware')

WebUI.verifyElementText(findTestObject('Object Repository/Hardware Repository/IMH-T1/label_Hardware Type'), 'Hardware Type *')

WebUI.verifyElementText(findTestObject('Object Repository/Hardware Repository/IMH-T1/label_Name'), 'Name *')

WebUI.verifyElementText(findTestObject('Object Repository/Hardware Repository/IMH-T1/label_Serial Number'), 'Serial Number *')

WebUI.verifyElementText(findTestObject('Object Repository/Hardware Repository/IMH-T1/label_Price Model'), 'Price Model *')

WebUI.verifyElementText(findTestObject('Object Repository/Hardware Repository/IMH-T1/label_Installed At'), 'Installed At *')

WebUI.verifyElementText(findTestObject('Object Repository/Hardware Repository/IMH-T1/label_Created Date'), 'Created Date')

WebUI.verifyElementClickable(findTestObject('Object Repository/Hardware Repository/IMH-T1/input__hardware_name'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/Hardware Repository/IMH-T1/input__serial_Number'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Hardware Repository/IMH-T1/label_Repaired Item'), 'Repaired Item')

WebUI.click(findTestObject('Object Repository/Hardware Repository/IMH-T1/input_Repaired Item_repaired_item'))

WebUI.verifyElementChecked(findTestObject('Hardware Repository/IMH-T1/input_Repaired Item_repaired_item'), 1)

WebUI.verifyElementClickable(findTestObject('Object Repository/Hardware Repository/IMH-T1/input__installed_at'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Hardware Repository/IMH-T1/label_Keep on adding'), 'Keep on adding')

WebUI.click(findTestObject('Object Repository/Hardware Repository/IMH-T1/input_Created Date_add_hardware'))

WebUI.setText(findTestObject('Hardware Repository/IMH-T1/input__hardware_name'), 'a')

WebUI.sendKeys(findTestObject('Hardware Repository/IMH-T1/input__hardware_name'), Keys.chord(Keys.BACK_SPACE))

WebUI.verifyElementText(findTestObject('Hardware Repository/IMH-T1/Page_Webapp/div_Name is required'), 'Name is required.')

WebUI.setText(findTestObject('Hardware Repository/IMH-T1/input__serial_Number'), 'a')

WebUI.sendKeys(findTestObject('Hardware Repository/IMH-T1/input__serial_Number'), Keys.chord(Keys.BACK_SPACE))

WebUI.verifyElementText(findTestObject('Hardware Repository/IMH-T1/Page_Webapp/div_Serial Number is required'), 'Serial Number is required.')

WebUI.closeBrowser()

