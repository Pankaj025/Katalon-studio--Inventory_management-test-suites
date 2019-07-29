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

WebUI.setText(findTestObject('Bulk Items Repository/IMBI-T1/input_LOGIN_userName'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Bulk Items Repository/IMBI-T1/input_LOGIN_password'), 
    '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Bulk Items Repository/IMBI-T1/button_LOGIN'))

WebUI.click(findTestObject('Bulk Items Repository/IMBI-T1/a_BULK ITMES'))

WebUI.verifyElementText(findTestObject('Bulk Items Repository/IMBI-T1/p_Bulk Items'), 
    'Bulk Items')

WebUI.verifyElementText(findTestObject('Bulk Items Repository/IMBI-T1/span_Show dispatched'), 
    'Show dispatched')

WebUI.click(findTestObject('Bulk Items Repository/IMBI-T1/input_ Add_showDispatched'))

WebUI.verifyElementChecked(findTestObject('Bulk Items Repository/IMBI-T1/input_ Add_showDispatched'), 
    1)

WebUI.click(findTestObject('Bulk Items Repository/IMBI-T1/input_ Add_showDispatched'))

WebUI.verifyElementNotChecked(findTestObject('Bulk Items Repository/IMBI-T1/input_ Add_showDispatched'), 
    1)

WebUI.verifyElementClickable(findTestObject('Bulk Items Repository/IMBI-T1/button_ Add'))

WebUI.verifyElementText(findTestObject('Bulk Items Repository/IMBI-T1/button_ Add'), '+ Add')

WebUI.click(findTestObject('Bulk Items Repository/IMBI-T1/button_ Add'))

WebUI.verifyElementText(findTestObject('Bulk Items Repository/IMBI-T1/h4_Add Bulk Items'), 
    'Add Bulk Items')

WebUI.verifyElementText(findTestObject('Bulk Items Repository/IMBI-T1/label_Type'), 
    'Type *')

WebUI.verifyElementText(findTestObject('Bulk Items Repository/IMBI-T1/label_Name'), 
    'Name *')

WebUI.verifyElementText(findTestObject('Bulk Items Repository/IMBI-T1/label_Start Number'), 
    'Start Number')

WebUI.verifyElementText(findTestObject('Bulk Items Repository/IMBI-T1/label_End Number'), 
    'End Number')

WebUI.verifyElementText(findTestObject('Bulk Items Repository/IMBI-T1/label_Total'), 
    'Total *')

WebUI.verifyElementText(findTestObject('Bulk Items Repository/IMBI-T1/label_Keep on adding'), 
    'Keep on adding')

WebUI.verifyElementClickable(findTestObject('Bulk Items Repository/IMBI-T1/Add_bulkItem_Btn'))

WebUI.click(findTestObject('Bulk Items Repository/IMBI-T1/Add_bulkItem_Btn'))

WebUI.verifyElementText(findTestObject('Bulk Items Repository/IMBI-T1/div_Bulk item type is required'), 
    'Bulk item type is required')

WebUI.verifyElementText(findTestObject('Bulk Items Repository/IMBI-T1/div_Name is required'), 
    'Name is required')

WebUI.verifyElementText(findTestObject('Bulk Items Repository/IMBI-T1/div_Start number is requiredNumber cant be less than 1'), 
    'Start number is required\nNumber can\'t be less than 1')

WebUI.verifyElementText(findTestObject('Bulk Items Repository/IMBI-T1/div_End number is requiredNumber cant be less than 1'), 
    'End number is required\nNumber can\'t be less than 1')

WebUI.verifyElementText(findTestObject('Bulk Items Repository/IMBI-T1/div_Total is required'), 
    'Total is required')

WebUI.click(findTestObject('Bulk Items Repository/IMBI-T1/span_'))

WebUI.closeBrowser()

