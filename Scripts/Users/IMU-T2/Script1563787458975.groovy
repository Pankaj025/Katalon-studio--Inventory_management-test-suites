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

WebUI.setText(findTestObject('Object Repository/Users Repository/IMU-T2/input_LOGIN_userName'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Users Repository/IMU-T2/input_LOGIN_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T2/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T2/a_USERS'))

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T2/button_ Add'))

WebUI.setText(findTestObject('Object Repository/Users Repository/IMU-T2/input__user_firstName'), 'Rohan')

WebUI.setText(findTestObject('Object Repository/Users Repository/IMU-T2/input__user_userName'), 'Rohan')

WebUI.setText(findTestObject('Object Repository/Users Repository/IMU-T2/input__user_lastName'), 'kumar')

WebUI.setText(findTestObject('Object Repository/Users Repository/IMU-T2/input__user_email'), 'Rohan@yahoo.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Users Repository/IMU-T2/input__user_passwor'), 'pnHC4wg7OsI=')

WebUI.setEncryptedText(findTestObject('Object Repository/Users Repository/IMU-T2/input__user_confirmPassword'), 'pnHC4wg7OsI=')

WebUI.selectOptionByValue(findTestObject('Object Repository/Users Repository/IMU-T2/select_ROLE_ADMINROLE_USERROLE_CHECKERROLE_APPROVER'), 
    '2: Object', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Users Repository/IMU-T2/select_CNBDICT-1NavkarCentury PlySamsungPanasonic'), 
    '2: Object', true)

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T2/input_Stakeholder_add_user'))

WebUI.verifyElementText(findTestObject('Object Repository/Users Repository/IMU-T2/div_user  added successfully'), 'user added successfully')

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T2/button_OK'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Users Repository/IMU-T2/td_Rohan'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/Users Repository/IMU-T2/td_Rohanyahoocom'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/Users Repository/IMU-T2/td_ROLE_CHECKER'), FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

