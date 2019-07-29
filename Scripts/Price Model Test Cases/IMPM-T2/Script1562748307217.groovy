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

WebUI.setText(findTestObject('Price Model Repository/IMPM-T2/input_LOGIN_userName'), 'admin')

WebUI.setEncryptedText(findTestObject('Price Model Repository/IMPM-T2/input_LOGIN_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Price Model Repository/IMPM-T2/button_LOGIN'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T2/a_PRICE MODELS'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T2/button_ Add'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T2/div__ngx-select__toggle btn form-control'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T2/span_GPS'))

WebUI.setText(findTestObject('Price Model Repository/IMPM-T2/input__input_name'), 'GPS')

WebUI.selectOptionByValue(findTestObject('Price Model Repository/IMPM-T2/select_CNB'), '1', true)

WebUI.setText(findTestObject('Price Model Repository/IMPM-T2/input_Make_make'), 'M')

WebUI.setText(findTestObject('Price Model Repository/IMPM-T2/input_Model_model'), 'M')

WebUI.setText(findTestObject('Price Model Repository/IMPM-T2/input__input_price'), '5')

WebUI.setText(findTestObject('Price Model Repository/IMPM-T2/textarea_Comments_comments'), 'comment test')

WebUI.click(findTestObject('Price Model Repository/IMPM-T2/input_Comments_btn_save'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T2/button_OK'))

WebUI.verifyElementText(findTestObject('Price Model Repository/IMPM-T2/td_5'), '5')

WebUI.verifyElementText(findTestObject('Price Model Repository/IMPM-T2/td_GPS'), 'GPS')

WebUI.verifyElementText(findTestObject('Price Model Repository/IMPM-T2/td_CNB'), 'CNB')

WebUI.verifyElementText(findTestObject('Price Model Repository/IMPM-T2/td_comment test'), 'comment test')

WebUI.closeBrowser()

