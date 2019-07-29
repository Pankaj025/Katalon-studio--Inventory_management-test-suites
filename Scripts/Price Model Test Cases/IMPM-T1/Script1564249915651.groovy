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

WebUI.setText(findTestObject('Price Model Repository/IMPM-T1/input_LOGIN_userName'), 'admin')

WebUI.setEncryptedText(findTestObject('Price Model Repository/IMPM-T1/input_LOGIN_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Price Model Repository/IMPM-T1/button_LOGIN'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T1/a_PRICE MODELS'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T1/button_ Add'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T1/input_Comments_btn_save'))

WebUI.verifyElementText(findTestObject('Price Model Repository/IMPM-T1/div_Please provide valid details for price model'), 
    'Please provide valid details for price model')

WebUI.click(findTestObject('Price Model Repository/IMPM-T1/button_OK'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T1/div_Select Hardware Type_ng-input'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T1/span_GPS'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T1/input_Comments_btn_save'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T1/button_OK'))

WebUI.setText(findTestObject('Price Model Repository/IMPM-T1/input__input_name'), 'gps')

WebUI.click(findTestObject('Price Model Repository/IMPM-T1/input_Comments_btn_save'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T1/button_OK'))

WebUI.selectOptionByValue(findTestObject('Price Model Repository/IMPM-T1/select_CNBSamsungPanasonic'), 
    '1', true)

WebUI.click(findTestObject('Price Model Repository/IMPM-T1/input_Comments_btn_save'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T1/button_OK'))

WebUI.setText(findTestObject('Price Model Repository/IMPM-T1/input__input_name'), 'a')

WebUI.sendKeys(findTestObject('Price Model Repository/IMPM-T1/input__input_name'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Price Model Repository/IMPM-T1/input__input_price'), '5')

WebUI.click(findTestObject('Price Model Repository/IMPM-T1/input_Comments_btn_save'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T1/button_OK'))

WebUI.closeBrowser()

