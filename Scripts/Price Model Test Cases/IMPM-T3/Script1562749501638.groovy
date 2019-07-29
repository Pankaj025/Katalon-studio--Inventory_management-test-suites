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

WebUI.setText(findTestObject('Price Model Repository/IMPM-T3/input_LOGIN_userName'), 'admin')

WebUI.setEncryptedText(findTestObject('Price Model Repository/IMPM-T3/input_LOGIN_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Price Model Repository/IMPM-T3/button_LOGIN'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T3/a_PRICE MODELS'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T3/button_ Add'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T3/div__ngx-select__toggle btn form-control'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T3/span_Antina'))

WebUI.setText(findTestObject('Price Model Repository/IMPM-T3/input__input_name'), 'Antina')

WebUI.selectOptionByValue(findTestObject('Price Model Repository/IMPM-T3/select_CNB'), '1', true)

WebUI.setText(findTestObject('Price Model Repository/IMPM-T3/input_Make_make'), 'm')

WebUI.setText(findTestObject('Price Model Repository/IMPM-T3/input_Model_model'), 'm')

WebUI.setText(findTestObject('Price Model Repository/IMPM-T3/input__input_price'), '6')

WebUI.setText(findTestObject('Price Model Repository/IMPM-T3/textarea_Comments_comments'), 'test')

WebUI.click(findTestObject('Price Model Repository/IMPM-T3/label_Keep on adding'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T3/input_Comments_btn_save'))

WebUI.verifyElementText(findTestObject('Price Model Repository/IMPM-T3/h4_Add Price Model'), 'Add Price Model')

WebUI.click(findTestObject('Price Model Repository/IMPM-T3/div__ngx-select__toggle btn form-control_1'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T3/span_MCU'))

WebUI.setText(findTestObject('Price Model Repository/IMPM-T3/input__input_name'), 'mcu')

WebUI.selectOptionByValue(findTestObject('Price Model Repository/IMPM-T3/select_CNB'), '1', true)

WebUI.setText(findTestObject('Price Model Repository/IMPM-T3/input_Make_make'), 'm')

WebUI.setText(findTestObject('Price Model Repository/IMPM-T3/input_Model_model'), 'm')

WebUI.setText(findTestObject('Price Model Repository/IMPM-T3/input__input_price'), '4')

WebUI.setText(findTestObject('Price Model Repository/IMPM-T3/textarea_Comments_comments'), 'test1')

WebUI.click(findTestObject('Price Model Repository/IMPM-T3/input_Comments_btn_save'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T3/div__ngx-select__toggle btn form-control_2'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T3/span_Morata'))

WebUI.setText(findTestObject('Price Model Repository/IMPM-T3/input__input_name'), 'morata')

WebUI.selectOptionByValue(findTestObject('Price Model Repository/IMPM-T3/select_CNB'), '1', true)

WebUI.setText(findTestObject('Price Model Repository/IMPM-T3/input_Make_make'), 'm')

WebUI.setText(findTestObject('Price Model Repository/IMPM-T3/input_Model_model'), 'm')

WebUI.setText(findTestObject('Price Model Repository/IMPM-T3/input__input_price'), '8')

WebUI.setText(findTestObject('Price Model Repository/IMPM-T3/textarea_Comments_comments'), 'test2')

WebUI.click(findTestObject('Price Model Repository/IMPM-T3/input_Comments_btn_save'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T3/div__ngx-select__toggle btn form-control_3'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T3/span_RFID Tag'))

WebUI.setText(findTestObject('Price Model Repository/IMPM-T3/input__input_name'), 'tag')

WebUI.selectOptionByValue(findTestObject('Price Model Repository/IMPM-T3/select_CNB'), '1', true)

WebUI.setText(findTestObject('Price Model Repository/IMPM-T3/input_Make_make'), 'm')

WebUI.setText(findTestObject('Price Model Repository/IMPM-T3/input_Model_model'), 'm')

WebUI.setText(findTestObject('Price Model Repository/IMPM-T3/input__input_price'), '7')

WebUI.setText(findTestObject('Price Model Repository/IMPM-T3/textarea_Comments_comments'), 'test3')

WebUI.click(findTestObject('Price Model Repository/IMPM-T3/label_Keep on adding'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T3/input_Comments_btn_save'))

WebUI.verifyElementText(findTestObject('Price Model Repository/IMPM-T3/div_Price Model added successfully'), 'Price Model added successfully')

WebUI.click(findTestObject('Price Model Repository/IMPM-T3/button_OK'))

WebUI.closeBrowser()

