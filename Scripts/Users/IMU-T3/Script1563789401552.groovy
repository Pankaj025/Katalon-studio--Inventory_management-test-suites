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

WebUI.setText(findTestObject('Object Repository/Users Repository/IMU-T3/input_LOGIN_userName'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Users Repository/IMU-T3/input_LOGIN_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T3/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T3/a_USERS'))

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T3/a_Edit'))

WebUI.setText(findTestObject('Object Repository/Users Repository/IMU-T3/input__user_userName'), 'Rohan1')

WebUI.setEncryptedText(findTestObject('Object Repository/Users Repository/IMU-T3/input__user_passwor'), 'ubkHBRHA6I0=')

WebUI.setEncryptedText(findTestObject('Object Repository/Users Repository/IMU-T3/input__user_confirmPassword'), 'ubkHBRHA6I0=')

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T3/input_Stakeholder_edit_user'))

WebUI.verifyElementText(findTestObject('Object Repository/Users Repository/IMU-T3/div_user  edited successfully'), 'user edited successfully')

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T3/button_OK'))

WebUI.verifyElementText(findTestObject('Object Repository/Users Repository/IMU-T3/td_Rohan1'), 'Rohan1')

WebUI.closeBrowser()

