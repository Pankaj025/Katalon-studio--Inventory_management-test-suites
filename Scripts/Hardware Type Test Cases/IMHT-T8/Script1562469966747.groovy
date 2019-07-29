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

WebUI.setText(findTestObject('Hardware Type Repository/IMHT-T8/input_LOGIN_userName'), 'admin')

WebUI.setEncryptedText(findTestObject('Hardware Type Repository/IMHT-T8/input_LOGIN_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Hardware Type Repository/IMHT-T8/button_LOGIN'))

WebUI.click(findTestObject('Hardware Type Repository/IMHT-T8/a_HARDWARE TYPES'))

WebUI.click(findTestObject('Hardware Type Repository/IMHT-T8/td_Delete sample'))

WebUI.click(findTestObject('Hardware Type Repository/IMHT-T8/a_Delete'))

WebUI.click(findTestObject('Hardware Type Repository/IMHT-T8/h4_Confirm deletion'))

WebUI.click(findTestObject('Hardware Type Repository/IMHT-T8/div_Do you really want to delete this hardware type'))

WebUI.click(findTestObject('Hardware Type Repository/IMHT-T8/button_No'))

WebUI.click(findTestObject('Hardware Type Repository/IMHT-T8/a_Delete'))

WebUI.click(findTestObject('Hardware Type Repository/IMHT-T8/button_Yes'))

WebUI.closeBrowser()

