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

WebUI.setText(findTestObject('Hardware Reports Repository/Hardware Inventory Cost/input_LOGIN_userName'), 'admin')

WebUI.setEncryptedText(findTestObject('Hardware Reports Repository/Hardware Inventory Cost/input_LOGIN_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Hardware Reports Repository/Hardware Inventory Cost/button_LOGIN'))

WebUI.click(findTestObject('Hardware Reports Repository/Hardware Inventory Cost/a_REPORTS'))

WebUI.click(findTestObject('Hardware Reports Repository/Hardware Inventory Cost/a_Hardware'))

WebUI.selectOptionByValue(findTestObject('Hardware Reports Repository/Hardware Inventory Cost/select_InventoryAdded BetweenBelow mandatory quantityInventory Cost'), 
    '3: 4', true)

WebUI.selectOptionByValue(findTestObject('Hardware Reports Repository/Hardware Inventory Cost/select_CNBDICT-1NavkarCentury Ply'), 
    '2', true)

WebUI.click(findTestObject('Hardware Reports Repository/Hardware Inventory Cost/input_Location_col-sm-1 btn btn-primary'))

WebUI.verifyElementVisible(findTestObject('Hardware Reports Repository/Hardware Inventory Cost/td_Antina   ( Total - 2 )'))

WebUI.verifyElementVisible(findTestObject('Hardware Reports Repository/Hardware Inventory Cost/td_ 12'))

WebUI.selectOptionByValue(findTestObject('Hardware Reports Repository/Hardware Inventory Cost/select_CNBDICT-1NavkarCentury Ply'), 
    '3', true)

WebUI.click(findTestObject('Hardware Reports Repository/Hardware Inventory Cost/input_Location_col-sm-1 btn btn-primary'))

WebUI.verifyElementVisible(findTestObject('Hardware Reports Repository/Hardware Inventory Cost/td_Hw3   ( Total - 1 )'))

WebUI.verifyElementVisible(findTestObject('Hardware Reports Repository/Hardware Inventory Cost/td_ 4'))

WebUI.selectOptionByValue(findTestObject('Hardware Reports Repository/Hardware Inventory Cost/select_CNBDICT-1NavkarCentury Ply'), 
    '4', true)

WebUI.click(findTestObject('Hardware Reports Repository/Hardware Inventory Cost/input_Location_col-sm-1 btn btn-primary'))

WebUI.verifyElementVisible(findTestObject('Hardware Reports Repository/Hardware Inventory Cost/td_Hw5   ( Total - 1 )'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Hardware Reports Repository/Hardware Inventory Cost/td_ 6'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Hardware Reports Repository/Hardware Inventory Cost/a_PRICE MODELS'))

WebUI.verifyElementPresent(findTestObject('Hardware Reports Repository/Hardware Inventory Cost/td_Antina'), 1)

WebUI.verifyElementPresent(findTestObject('Hardware Reports Repository/Hardware Inventory Cost/td_6'), 1)

WebUI.verifyElementPresent(findTestObject('Hardware Reports Repository/Hardware Inventory Cost/td_Hw3'), 1)

WebUI.verifyElementPresent(findTestObject('Hardware Reports Repository/Hardware Inventory Cost/td_4'), 1)

WebUI.verifyElementPresent(findTestObject('Hardware Reports Repository/Hardware Inventory Cost/td_Hw5'), 1)

WebUI.verifyElementPresent(findTestObject('Hardware Reports Repository/Hardware Inventory Cost/td_6'), 1)

WebUI.closeBrowser()

