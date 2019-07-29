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

WebUI.setText(findTestObject('Object Repository/Users Repository/IMU-T5/input_LOGIN_userName'), 'Rohan1')

WebUI.setText(findTestObject('Object Repository/Users Repository/IMU-T5/input_LOGIN_password'), 'rohan1')

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T5/button_LOGIN'))

WebUI.delay(1)

WebUI.click(findTestObject('Users Repository/IMU-T5/button_Rohan1'))

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T5/button_Change password'))

WebUI.verifyElementText(findTestObject('Object Repository/Users Repository/IMU-T5/h4_Update password'), 'Update password')

WebUI.verifyElementText(findTestObject('Object Repository/Users Repository/IMU-T5/label_Old Password'), 'Old Password *')

WebUI.verifyElementText(findTestObject('Object Repository/Users Repository/IMU-T5/label_New Password'), 'New Password *')

WebUI.verifyElementText(findTestObject('Object Repository/Users Repository/IMU-T5/label_Confirm Password'), 'Confirm Password *')

WebUI.setEncryptedText(findTestObject('Object Repository/Users Repository/IMU-T5/input__old_password'), '9NLz+4tGZcQ=')

WebUI.sendKeys(findTestObject('Users Repository/IMU-T5/input__old_password'), Keys.chord(Keys.BACK_SPACE))

WebUI.setEncryptedText(findTestObject('Object Repository/Users Repository/IMU-T5/input__newPassword'), '9NLz+4tGZcQ=')

WebUI.sendKeys(findTestObject('Users Repository/IMU-T5/input__newPassword'), Keys.chord(Keys.BACK_SPACE))

WebUI.setEncryptedText(findTestObject('Object Repository/Users Repository/IMU-T5/input__confirm_password'), '9NLz+4tGZcQ=')

WebUI.sendKeys(findTestObject('Users Repository/IMU-T5/input__confirm_password'), Keys.chord(Keys.BACK_SPACE))

WebUI.verifyElementText(findTestObject('Object Repository/Users Repository/IMU-T5/div_Old password is required'), 'Old password is required.')

WebUI.verifyElementText(findTestObject('Object Repository/Users Repository/IMU-T5/div_New password is required'), 'New password is required.')

WebUI.setEncryptedText(findTestObject('Object Repository/Users Repository/IMU-T5/input__old_password'), '9NLz+4tGZcQ=')

WebUI.sendKeys(findTestObject('Users Repository/IMU-T5/input__old_password'), Keys.chord(Keys.BACK_SPACE))

WebUI.verifyElementText(findTestObject('Object Repository/Users Repository/IMU-T5/div_Confirm password is required'), 'Confirm password is required.')

WebUI.verifyElementNotClickable(findTestObject('Users Repository/IMU-T5/button_Update Password'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Users Repository/IMU-T5/button_Cancel'))

WebUI.click(findTestObject('Users Repository/IMU-T5/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T5/button_Rohan1'))

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T5/button_Change password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Users Repository/IMU-T5/input__old_password'), 'ubkHBRHA6I0=')

WebUI.setEncryptedText(findTestObject('Object Repository/Users Repository/IMU-T5/input__newPassword'), 'sd5odF0Gq6TIzP8AqzaF/A==')

WebUI.setEncryptedText(findTestObject('Object Repository/Users Repository/IMU-T5/input__confirm_password'), 'sd5odF0Gq6TIzP8AqzaF/A==')

WebUI.verifyElementClickable(findTestObject('Users Repository/IMU-T5/button_Update Password'))

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T5/button_Update Password'))

WebUI.setText(findTestObject('Object Repository/Users Repository/IMU-T5/input_LOGIN_userName'), 'Rohan1')

WebUI.setEncryptedText(findTestObject('Object Repository/Users Repository/IMU-T5/input_LOGIN_password'), 'ubkHBRHA6I0=')

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T5/button_LOGIN'))

WebUI.verifyElementText(findTestObject('Object Repository/Users Repository/IMU-T5/p_Invalid UserName or Password Please try again'), 
    'Invalid UserName or Password, Please try again !')

WebUI.setEncryptedText(findTestObject('Object Repository/Users Repository/IMU-T5/input_LOGIN_password'), 'sd5odF0Gq6TIzP8AqzaF/A==')

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T5/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T5/button_Rohan1'))

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T5/button_Logout'))

WebUI.closeBrowser()

