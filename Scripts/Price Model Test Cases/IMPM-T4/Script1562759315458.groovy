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

WebUI.setText(findTestObject('Price Model Repository/IMPM-T4/input_LOGIN_userName'), 'admin')

WebUI.setEncryptedText(findTestObject('Price Model Repository/IMPM-T4/input_LOGIN_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Price Model Repository/IMPM-T4/button_LOGIN'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T4/a_PRICE MODELS'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T4/button_ Add'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T4/div__ngx-select__toggle btn form-control'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T4/span_GPS'))

WebUI.setText(findTestObject('Price Model Repository/IMPM-T4/input__input_name'), 'GPS')

WebUI.selectOptionByValue(findTestObject('Price Model Repository/IMPM-T4/select_CNB'), '1', true)

WebUI.setText(findTestObject('Price Model Repository/IMPM-T4/input__input_price'), '6')

WebUI.click(findTestObject('Price Model Repository/IMPM-T4/input_Comments_btn_save'))

WebUI.verifyElementText(findTestObject('Price Model Repository/IMPM-T4/div_Same name already exists for price model'), 'Same name already exists for price model')

WebUI.click(findTestObject('Price Model Repository/IMPM-T4/button_OK'))

WebUI.closeBrowser()

