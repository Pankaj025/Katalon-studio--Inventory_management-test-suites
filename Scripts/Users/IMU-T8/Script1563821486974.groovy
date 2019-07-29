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

WebUI.setText(findTestObject('Object Repository/Users Repository/IMU-T8/input_LOGIN_userName'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Users Repository/IMU-T8/input_LOGIN_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T8/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T8/a_USERS'))

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T8/button_ Add'))

WebUI.setText(findTestObject('Object Repository/Users Repository/IMU-T8/input__user_firstName'), 'Delete')

WebUI.setText(findTestObject('Object Repository/Users Repository/IMU-T8/input__user_userName'), 'Delete')

WebUI.setText(findTestObject('Object Repository/Users Repository/IMU-T8/input__user_lastName'), 'Sample')

WebUI.setText(findTestObject('Object Repository/Users Repository/IMU-T8/input__user_email'), 'delete@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Users Repository/IMU-T8/input__user_passwor'), '4nvbrPglk7k=')

WebUI.setEncryptedText(findTestObject('Object Repository/Users Repository/IMU-T8/input__user_confirmPassword'), '4nvbrPglk7k=')

WebUI.selectOptionByValue(findTestObject('Object Repository/Users Repository/IMU-T8/select_ROLE_ADMINROLE_USERROLE_CHECKERROLE_APPROVER'), 
    '3: Object', true)

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T8/input_Role_add_user'))

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T8/button_OK'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T8/a_Delete'))

WebUI.verifyElementText(findTestObject('Object Repository/Users Repository/IMU-T8/div_Do you really want to delete this user'), 
    'Do you really want to delete this user ?')

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T8/button_No'))

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T8/a_Delete'))

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T8/button_Yes'))

WebUI.closeBrowser()

