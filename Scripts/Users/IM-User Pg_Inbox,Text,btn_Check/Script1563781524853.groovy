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

WebUI.setText(findTestObject('Users Repository/IM-User Pg_Inbox,Text,btn_Check/input_LOGIN_userName'), 'admin')

WebUI.setEncryptedText(findTestObject('Users Repository/IM-User Pg_Inbox,Text,btn_Check/input_LOGIN_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Users Repository/IM-User Pg_Inbox,Text,btn_Check/button_LOGIN'))

WebUI.verifyElementText(findTestObject('Users Repository/IM-User Pg_Inbox,Text,btn_Check/a_USERS'), 'USERS')

WebUI.verifyElementClickable(findTestObject('Users Repository/IM-User Pg_Inbox,Text,btn_Check/a_USERS'))

WebUI.click(findTestObject('Users Repository/IM-User Pg_Inbox,Text,btn_Check/a_USERS'))

WebUI.verifyElementText(findTestObject('Users Repository/IM-User Pg_Inbox,Text,btn_Check/p_Users'), 'Users')

WebUI.verifyElementClickable(findTestObject('Users Repository/IM-User Pg_Inbox,Text,btn_Check/button_ Add'))

WebUI.verifyElementText(findTestObject('Users Repository/IM-User Pg_Inbox,Text,btn_Check/button_ Add'), '+ Add')

WebUI.click(findTestObject('Users Repository/IM-User Pg_Inbox,Text,btn_Check/button_ Add'))

WebUI.verifyElementText(findTestObject('Users Repository/IM-User Pg_Inbox,Text,btn_Check/h4_Add User'), 'Add User')

WebUI.verifyElementText(findTestObject('Users Repository/IM-User Pg_Inbox,Text,btn_Check/label_FirstName'), 'FirstName: *')

WebUI.verifyElementText(findTestObject('Users Repository/IM-User Pg_Inbox,Text,btn_Check/label_UserName'), 'UserName: *')

WebUI.verifyElementText(findTestObject('Users Repository/IM-User Pg_Inbox,Text,btn_Check/label_LastName'), 'LastName: *')

WebUI.verifyElementText(findTestObject('Users Repository/IM-User Pg_Inbox,Text,btn_Check/label_Email'), 'Email:*')

WebUI.verifyElementText(findTestObject('Users Repository/IM-User Pg_Inbox,Text,btn_Check/label_Password'), 'Password:*')

WebUI.verifyElementText(findTestObject('Users Repository/IM-User Pg_Inbox,Text,btn_Check/label_ConfirmPassword'), 'ConfirmPassword:*')

WebUI.verifyElementText(findTestObject('Users Repository/IM-User Pg_Inbox,Text,btn_Check/label_Role'), 'Role:')

WebUI.selectOptionByValue(findTestObject('Users Repository/IM-User Pg_Inbox,Text,btn_Check/select_ROLE_ADMINROLE_USERROLE_CHECKERROLE_APPROVER'), 
    '2: Object', true)

WebUI.verifyElementText(findTestObject('Users Repository/IM-User Pg_Inbox,Text,btn_Check/label_Stakeholder'), 'Stakeholder:')

WebUI.setText(findTestObject('Users Repository/IM-User Pg_Inbox,Text,btn_Check/input__user_firstName'), 'a')

WebUI.sendKeys(findTestObject('Users Repository/IM-User Pg_Inbox,Text,btn_Check/input__user_firstName'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Users Repository/IM-User Pg_Inbox,Text,btn_Check/input__user_userName'), 'a')

WebUI.sendKeys(findTestObject('Users Repository/IM-User Pg_Inbox,Text,btn_Check/input__user_userName'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Users Repository/IM-User Pg_Inbox,Text,btn_Check/input__user_lastName'), 'a')

WebUI.sendKeys(findTestObject('Users Repository/IM-User Pg_Inbox,Text,btn_Check/input__user_lastName'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Users Repository/IM-User Pg_Inbox,Text,btn_Check/input__user_email'), 'a')

WebUI.sendKeys(findTestObject('Users Repository/IM-User Pg_Inbox,Text,btn_Check/input__user_email'), Keys.chord(Keys.BACK_SPACE))

WebUI.setEncryptedText(findTestObject('Users Repository/IM-User Pg_Inbox,Text,btn_Check/input__user_passwor'), '9NLz+4tGZcQ=')

WebUI.sendKeys(findTestObject('Users Repository/IM-User Pg_Inbox,Text,btn_Check/input__user_passwor'), Keys.chord(Keys.BACK_SPACE))

WebUI.setEncryptedText(findTestObject('Users Repository/IM-User Pg_Inbox,Text,btn_Check/input__user_confirmPassword'), 'HeCM15nHKBI=')

WebUI.sendKeys(findTestObject('Users Repository/IM-User Pg_Inbox,Text,btn_Check/input__user_confirmPassword'), Keys.chord(Keys.BACK_SPACE))

WebUI.verifyElementText(findTestObject('Users Repository/IM-User Pg_Inbox,Text,btn_Check/div_firstName is required'), 'firstName is required.')

WebUI.verifyElementText(findTestObject('Users Repository/IM-User Pg_Inbox,Text,btn_Check/div_userName is required'), 'userName is required.')

WebUI.verifyElementText(findTestObject('Users Repository/IM-User Pg_Inbox,Text,btn_Check/div_lastName is required'), 'lastName is required.')

WebUI.verifyElementText(findTestObject('Users Repository/IM-User Pg_Inbox,Text,btn_Check/div_email is required'), 'email is required.')

WebUI.verifyElementText(findTestObject('Users Repository/IM-User Pg_Inbox,Text,btn_Check/div_password is required'), 'password is required.')

WebUI.verifyElementText(findTestObject('Users Repository/IM-User Pg_Inbox,Text,btn_Check/div_confirm password is required'), 'confirm password is required.\nPasswords do not match.')

WebUI.verifyElementNotClickable(findTestObject('Users Repository/IM-User Pg_Inbox,Text,btn_Check/input_Stakeholder_add_user'))

WebUI.closeBrowser()

