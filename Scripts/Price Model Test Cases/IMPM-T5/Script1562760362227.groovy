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

WebUI.setText(findTestObject('Price Model Repository/IMPM-T5/input_LOGIN_userName'), 'admin')

WebUI.setEncryptedText(findTestObject('Price Model Repository/IMPM-T5/input_LOGIN_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Price Model Repository/IMPM-T5/button_LOGIN'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T5/a_PRICE MODELS'))

WebUI.verifyElementText(findTestObject('Price Model Repository/IMPM-T5/td_morata'), 'morata')

WebUI.verifyElementText(findTestObject('Price Model Repository/IMPM-T5/td_8'), '8')

WebUI.click(findTestObject('Price Model Repository/IMPM-T5/a_Edit'))

WebUI.verifyElementText(findTestObject('Price Model Repository/IMPM-T5/h4_Edit Price Model'), 'Edit Price Model')

WebUI.setText(findTestObject('Price Model Repository/IMPM-T5/input__input_price'), '6')

WebUI.click(findTestObject('Price Model Repository/IMPM-T5/input_Comments_btn_update'))

WebUI.verifyElementText(findTestObject('Price Model Repository/IMPM-T5/div_Price Model edited successfully'), 'Price Model edited successfully')

WebUI.click(findTestObject('Price Model Repository/IMPM-T5/button_OK'))

WebUI.verifyElementText(findTestObject('Price Model Repository/IMPM-T5/td_morata'), 'morata')

WebUI.verifyElementText(findTestObject('Price Model Repository/IMPM-T5/td_6'), '6')

WebUI.closeBrowser()

