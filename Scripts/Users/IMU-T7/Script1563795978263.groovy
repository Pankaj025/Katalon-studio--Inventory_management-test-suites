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

WebUI.setText(findTestObject('Object Repository/Users Repository/IMU-T7/input_LOGIN_userName'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Users Repository/IMU-T7/input_LOGIN_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T7/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T7/a_USERS'))

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T7/a_Edit'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Users Repository/IMU-T7/select_ROLE_ADMINROLE_USERROLE_CHECKERROLE_APPROVER'), 
    '0: Object', true)

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T7/input_Role_edit_user'))

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T7/button_OK'))

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T7/button_admin'))

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T7/button_Logout'))

WebUI.setText(findTestObject('Object Repository/Users Repository/IMU-T7/input_LOGIN_userName'), 'Rohan1')

WebUI.setEncryptedText(findTestObject('Object Repository/Users Repository/IMU-T7/input_LOGIN_password'), 'sd5odF0Gq6TIzP8AqzaF/A==')

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T7/button_LOGIN'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T7/a_HARDWARES'))

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T7/a_USERS'))

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T7/a_STAKEHOLDERS'))

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T7/a_BULK ITMES'))

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T7/a_HARDWARE TYPES'))

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T7/a_MACHINE TEMPLATES'))

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T7/a_PRICE MODELS'))

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T7/a_REPORTS'))

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T7/a_Hardware'))

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T7/a_Bulk Items'))

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T7/a_ORDERS'))

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T7/button_Rohan1'))

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T7/button_Logout'))

WebUI.setText(findTestObject('Object Repository/Users Repository/IMU-T7/input_LOGIN_userName'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Users Repository/IMU-T7/input_LOGIN_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T7/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T7/a_USERS'))

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T7/a_Edit'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Users Repository/IMU-T7/select_ROLE_ADMINROLE_USERROLE_CHECKERROLE_APPROVER'), 
    '1: Object', true)

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T7/input_Role_edit_user'))

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T7/button_OK'))

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T7/button_admin'))

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T7/button_Logout'))

WebUI.setText(findTestObject('Object Repository/Users Repository/IMU-T7/input_LOGIN_userName'), 'Rohan1')

WebUI.setEncryptedText(findTestObject('Object Repository/Users Repository/IMU-T7/input_LOGIN_password'), 'sd5odF0Gq6TIzP8AqzaF/A==')

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T7/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T7/a_ORDERS'))

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T7/a_HARDWARES'))

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T7/a_STAKEHOLDERS'))

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T7/a_BULK ITMES'))

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T7/a_HARDWARE TYPES'))

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Users Repository/IMU-T7/a_USERS'), 1)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Users Repository/IMU-T7/a_MACHINE TEMPLATES'), 1)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Users Repository/IMU-T7/a_PRICE MODELS'), 1)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Users Repository/IMU-T7/a_REPORTS'), 1)

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T7/button_Rohan1'))

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T7/button_Logout'))

WebUI.setText(findTestObject('Object Repository/Users Repository/IMU-T7/input_LOGIN_userName'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Users Repository/IMU-T7/input_LOGIN_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T7/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T7/a_USERS'))

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T7/a_Edit'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Users Repository/IMU-T7/select_ROLE_ADMINROLE_USERROLE_CHECKERROLE_APPROVER'), 
    '3: Object', true)

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T7/input_Role_edit_user'))

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T7/button_OK'))

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T7/button_admin'))

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T7/button_Logout'))

WebUI.setText(findTestObject('Object Repository/Users Repository/IMU-T7/input_LOGIN_userName'), 'Rohan1')

WebUI.setEncryptedText(findTestObject('Object Repository/Users Repository/IMU-T7/input_LOGIN_password'), 'sd5odF0Gq6TIzP8AqzaF/A==')

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T7/button_LOGIN'))

WebUI.verifyElementText(findTestObject('Object Repository/Users Repository/IMU-T7/p_ORDERS'), 'ORDERS')

WebUI.verifyElementPresent(findTestObject('Users Repository/IMU-T7/button_ NEW ORDER'), 1)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Users Repository/IMU-T7/a_ORDERS'), 1)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Users Repository/IMU-T7/a_HARDWARES'), 1)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Users Repository/IMU-T7/a_USERS'), 1)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Users Repository/IMU-T7/a_STAKEHOLDERS'), 1)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Users Repository/IMU-T7/a_BULK ITMES'), 1)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Users Repository/IMU-T7/a_HARDWARE TYPES'), 1)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Users Repository/IMU-T7/a_MACHINE TEMPLATES'), 1)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Users Repository/IMU-T7/a_PRICE MODELS'), 1)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Users Repository/IMU-T7/a_REPORTS'), 1)

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T7/button_Rohan1'))

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T7/button_Logout'))

WebUI.setText(findTestObject('Object Repository/Users Repository/IMU-T7/input_LOGIN_userName'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Users Repository/IMU-T7/input_LOGIN_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T7/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T7/a_USERS'))

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T7/a_Edit'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Users Repository/IMU-T7/select_ROLE_ADMINROLE_USERROLE_CHECKERROLE_APPROVER'), 
    '2: Object', true)

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T7/input_Stakeholder_edit_user'))

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T7/button_OK'))

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T7/button_admin'))

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T7/button_Logout'))

WebUI.setText(findTestObject('Object Repository/Users Repository/IMU-T7/input_LOGIN_userName'), 'Rohan1')

WebUI.setEncryptedText(findTestObject('Object Repository/Users Repository/IMU-T7/input_LOGIN_password'), 'sd5odF0Gq6TIzP8AqzaF/A==')

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T7/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T7/a_ORDERS'))

WebUI.verifyElementNotPresent(findTestObject('Users Repository/IMU-T7/button_ NEW ORDER'), 1)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Users Repository/IMU-T7/a_HARDWARES'), 1)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Users Repository/IMU-T7/a_USERS'), 1)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Users Repository/IMU-T7/a_STAKEHOLDERS'), 1)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Users Repository/IMU-T7/a_BULK ITMES'), 1)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Users Repository/IMU-T7/a_HARDWARE TYPES'), 1)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Users Repository/IMU-T7/a_MACHINE TEMPLATES'), 1)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Users Repository/IMU-T7/a_PRICE MODELS'), 1)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Users Repository/IMU-T7/a_REPORTS'), 1)

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T7/button_Rohan1'))

WebUI.click(findTestObject('Object Repository/Users Repository/IMU-T7/button_Logout'))

WebUI.closeBrowser()

