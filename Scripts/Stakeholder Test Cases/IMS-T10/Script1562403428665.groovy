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

WebUI.setText(findTestObject('Stakeholder Repository/IMS-T10/input_LOGIN_userName'), 'admin')

WebUI.setEncryptedText(findTestObject('Stakeholder Repository/IMS-T10/input_LOGIN_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Stakeholder Repository/IMS-T10/button_LOGIN'))

WebUI.click(findTestObject('Stakeholder Repository/IMS-T10/a_STAKEHOLDERS'))

WebUI.verifyElementPresent(findTestObject('Stakeholder Repository/IMS-T10/td_CNB-2'), 1)

WebUI.click(findTestObject('Stakeholder Repository/IMS-T10/a_Delete'))

WebUI.verifyElementText(findTestObject('Stakeholder Repository/IMS-T10/h4_Confirm deletion'), 'Confirm deletion')

WebUI.verifyElementText(findTestObject('Stakeholder Repository/IMS-T10/div_Do you really want to delete this stakeholder'), 
    'Do you really want to delete this stakeholder ?')

WebUI.click(findTestObject('Stakeholder Repository/IMS-T10/button_No'))

WebUI.click(findTestObject('Stakeholder Repository/IMS-T10/a_Delete'))

WebUI.click(findTestObject('Stakeholder Repository/IMS-T10/button_Yes'))

WebUI.verifyElementNotPresent(findTestObject('Stakeholder Repository/IMS-T10/td_CNB-2'), 1)

WebUI.closeBrowser()

