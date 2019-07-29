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

WebUI.setText(findTestObject('Login Repository/IML-T5/input_LOGIN_userName'), 'admin')

WebUI.setEncryptedText(findTestObject('Login Repository/IML-T5/input_LOGIN_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Login Repository/IML-T5/button_LOGIN'))

WebUI.verifyElementPresent(findTestObject('Login Repository/IML-T5/img_admin_logo'), 1)

WebUI.verifyElementPresent(findTestObject('Login Repository/IML-T5/div_admin_search-bar'), 1)

WebUI.click(findTestObject('Login Repository/IML-T5/button_admin'))

WebUI.click(findTestObject('Login Repository/IML-T5/button_Logout'))

WebUI.closeBrowser()

