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

WebUI.setText(findTestObject('Hardware Type Repository/IM-Hardware Type Pg_Inbox,Text,btn_Check/input_LOGIN_userName'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Hardware Type Repository/IM-Hardware Type Pg_Inbox,Text,btn_Check/input_LOGIN_password'), 
    '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Hardware Type Repository/IM-Hardware Type Pg_Inbox,Text,btn_Check/button_LOGIN'))

WebUI.click(findTestObject('Hardware Type Repository/IM-Hardware Type Pg_Inbox,Text,btn_Check/a_HARDWARE TYPES'))

WebUI.verifyElementClickable(findTestObject('Hardware Type Repository/IM-Hardware Type Pg_Inbox,Text,btn_Check/a_HARDWARE TYPES'))

WebUI.verifyElementText(findTestObject('Hardware Type Repository/IM-Hardware Type Pg_Inbox,Text,btn_Check/a_HARDWARE TYPES'), 
    'HARDWARE TYPES')

WebUI.verifyElementPresent(findTestObject('Hardware Type Repository/IM-Hardware Type Pg_Inbox,Text,btn_Check/p_Hardware Types'), 
    1)

WebUI.verifyElementText(findTestObject('Hardware Type Repository/IM-Hardware Type Pg_Inbox,Text,btn_Check/p_Hardware Types'), 
    'Hardware Types')

WebUI.verifyElementClickable(findTestObject('Hardware Type Repository/IM-Hardware Type Pg_Inbox,Text,btn_Check/button_ Add'))

WebUI.verifyElementText(findTestObject('Hardware Type Repository/IM-Hardware Type Pg_Inbox,Text,btn_Check/button_ Add'), 
    '+ Add')

WebUI.click(findTestObject('Hardware Type Repository/IM-Hardware Type Pg_Inbox,Text,btn_Check/button_ Add'))

WebUI.verifyElementText(findTestObject('Hardware Type Repository/IM-Hardware Type Pg_Inbox,Text,btn_Check/h4_Add HardwareType'), 
    'Add HardwareType')

WebUI.verifyElementText(findTestObject('Hardware Type Repository/IM-Hardware Type Pg_Inbox,Text,btn_Check/label_Name'), 
    'Name: *')

WebUI.verifyElementText(findTestObject('Hardware Type Repository/IM-Hardware Type Pg_Inbox,Text,btn_Check/label_Min count in inventory'), 
    'Min count in inventory: *')

WebUI.verifyElementText(findTestObject('Hardware Type Repository/IM-Hardware Type Pg_Inbox,Text,btn_Check/label_Is Composite Item'), 
    'Is Composite Item:')

WebUI.click(findTestObject('Hardware Type Repository/IM-Hardware Type Pg_Inbox,Text,btn_Check/input_Is Composite Item_is_composite_item_yes'))

WebUI.verifyElementChecked(findTestObject('Hardware Type Repository/IM-Hardware Type Pg_Inbox,Text,btn_Check/input_Is Composite Item_is_composite_item_yes'), 
    1)

WebUI.verifyElementNotChecked(findTestObject('Hardware Type Repository/IM-Hardware Type Pg_Inbox,Text,btn_Check/input_Is Composite Item_is_composite_item_no'), 
    1)

WebUI.click(findTestObject('Hardware Type Repository/IM-Hardware Type Pg_Inbox,Text,btn_Check/input_Is Composite Item_is_composite_item_no'))

WebUI.verifyElementChecked(findTestObject('Hardware Type Repository/IM-Hardware Type Pg_Inbox,Text,btn_Check/input_Is Composite Item_is_composite_item_no'), 
    1)

WebUI.verifyElementNotChecked(findTestObject('Hardware Type Repository/IM-Hardware Type Pg_Inbox,Text,btn_Check/input_Is Composite Item_is_composite_item_yes'), 
    1)

WebUI.verifyElementText(findTestObject('Hardware Type Repository/IM-Hardware Type Pg_Inbox,Text,btn_Check/label_Is Bulk Item'), 
    'Is Bulk Item ? *')

WebUI.verifyElementText(findTestObject('Hardware Type Repository/IM-Hardware Type Pg_Inbox,Text,btn_Check/div_Keep on adding'), 
    'Keep on adding')

WebUI.verifyElementText(findTestObject('Hardware Type Repository/IM-Hardware Type Pg_Inbox,Text,btn_Check/label_Keep on adding'), 
    'Keep on adding')

WebUI.click(findTestObject('Hardware Type Repository/IM-Hardware Type Pg_Inbox,Text,btn_Check/input__adding_to_inventory'))

WebUI.verifyElementText(findTestObject('Hardware Type Repository/IM-Hardware Type Pg_Inbox,Text,btn_Check/div_Name is required'), 
    'Name is required.')

WebUI.closeBrowser()

