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

WebUI.setText(findTestObject('Hardware Reports Repository/Hardware Inventory/input_LOGIN_userName'), 'admin')

WebUI.setEncryptedText(findTestObject('Hardware Reports Repository/Hardware Inventory/input_LOGIN_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Hardware Reports Repository/Hardware Inventory/button_LOGIN'))

WebUI.click(findTestObject('Hardware Reports Repository/Hardware Inventory/a_REPORTS'))

WebUI.click(findTestObject('Hardware Reports Repository/Hardware Inventory/a_Hardware'))

WebUI.selectOptionByValue(findTestObject('Hardware Reports Repository/Hardware Inventory/select_InventoryAdded BetweenBelow mandatory quantityInventory Cost'), 
    '0: 1', true)

WebUI.selectOptionByValue(findTestObject('Hardware Reports Repository/Hardware Inventory/select_CNBDICT-1NavkarCentury Ply'), 
    '1', true)

WebUI.click(findTestObject('Hardware Reports Repository/Hardware Inventory/input_Status_col-sm-1 btn btn-primary'))

WebUI.selectOptionByValue(findTestObject('Hardware Reports Repository/Hardware Inventory/select_CNBDICT-1NavkarCentury Ply'), 
    '2', true)

WebUI.click(findTestObject('Hardware Reports Repository/Hardware Inventory/input_Location_col-sm-1 btn btn-primary'))

WebUI.verifyElementVisible(findTestObject('Hardware Reports Repository/Hardware Inventory/td_MCU Box'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Hardware Reports Repository/Hardware Inventory/td_1_1'), FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Hardware Reports Repository/Hardware Inventory/select_CNBDICT-1NavkarCentury Ply'), 
    '3', true)

WebUI.click(findTestObject('Hardware Reports Repository/Hardware Inventory/input_Location_col-sm-1 btn btn-primary'))

WebUI.verifyElementVisible(findTestObject('Hardware Reports Repository/Hardware Inventory/td_Hw3'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Hardware Reports Repository/Hardware Inventory/td_1_2'), FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Hardware Reports Repository/Hardware Inventory/select_CNBDICT-1NavkarCentury Ply'), 
    '4', true)

WebUI.click(findTestObject('Hardware Reports Repository/Hardware Inventory/input_Location_col-sm-1 btn btn-primary'))

WebUI.verifyElementVisible(findTestObject('Hardware Reports Repository/Hardware Inventory/td_Hw4'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Hardware Reports Repository/Hardware Inventory/td_1_3'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Hardware Reports Repository/Hardware Inventory/a_HARDWARES'))

WebUI.click(findTestObject('Hardware Reports Repository/Hardware Inventory/input_ Add_showDispatched'))

WebUI.click(findTestObject('Hardware Reports Repository/Hardware Inventory/a_2'))

WebUI.verifyElementPresent(findTestObject('Hardware Reports Repository/Hardware Inventory/td_MCU Box_1'), 1)

WebUI.verifyElementPresent(findTestObject('Hardware Reports Repository/Hardware Inventory/td_DICT-1  SPARE'), 1)

WebUI.verifyElementPresent(findTestObject('Hardware Reports Repository/Hardware Inventory/td_Hw3_1'), 1)

WebUI.verifyElementPresent(findTestObject('Hardware Reports Repository/Hardware Inventory/td_Navkar  SPARE'), 1)

WebUI.verifyElementPresent(findTestObject('Hardware Reports Repository/Hardware Inventory/td_Hw4_1'), 1)

WebUI.verifyElementPresent(findTestObject('Hardware Reports Repository/Hardware Inventory/td_Century Ply  SPARE'), 1)

WebUI.closeBrowser()

