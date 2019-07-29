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

WebUI.setText(findTestObject('Stakeholder Repository/IMS-T2/input_LOGIN_userName'), 'admin')

WebUI.setEncryptedText(findTestObject('Stakeholder Repository/IMS-T2/input_LOGIN_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Stakeholder Repository/IMS-T2/button_LOGIN'))

WebUI.click(findTestObject('Stakeholder Repository/IMS-T2/a_STAKEHOLDERS'))

WebUI.click(findTestObject('Stakeholder Repository/IMS-T2/button_ Add'))

WebUI.setText(findTestObject('Stakeholder Repository/IMS-T2/input__stakeHolder_name'), 'DICT')

WebUI.setText(findTestObject('Stakeholder Repository/IMS-T2/input_Country_stakeHolder_country'), 'a')

WebUI.sendKeys(findTestObject('Stakeholder Repository/IMS-T2/input_Country_stakeHolder_country'), Keys.chord(Keys.BACK_SPACE))

WebUI.click(findTestObject('Stakeholder Repository/IMS-T2/input_Country_add_stakeholder'))

WebUI.verifyElementText(findTestObject('Stakeholder Repository/IMS-T2/h4_Action completed'), 'Action completed')

WebUI.verifyElementText(findTestObject('Stakeholder Repository/IMS-T2/div_Stakeholder added successfully'), 'Stakeholder added successfully')

WebUI.click(findTestObject('Stakeholder Repository/IMS-T2/button_OK'))

WebUI.verifyElementText(findTestObject('Stakeholder Repository/IMS-T2/td_DICT'), 'DICT')

WebUI.closeBrowser()

