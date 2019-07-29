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

WebUI.setText(findTestObject('Object Repository/Bulk Item Reports Repository/Inventory/input_LOGIN_userName'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Bulk Item Reports Repository/Inventory/input_LOGIN_password'), 
    '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Bulk Item Reports Repository/Inventory/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/Bulk Item Reports Repository/Inventory/a_REPORTS'))

WebUI.click(findTestObject('Object Repository/Bulk Item Reports Repository/Inventory/a_Bulk Items'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Bulk Item Reports Repository/Inventory/select_InventoryAdded BetweenBelow mandatory quantityInventory Cost'), 
    '0: 1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Bulk Item Reports Repository/Inventory/select_CNBDICT-1NavkarCentury Ply'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Bulk Item Reports Repository/Inventory/input_Location_col-sm-1 btn btn-primary'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Bulk Item Reports Repository/Inventory/td_RFID Tag'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Bulk Item Reports Repository/Inventory/td_982'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Bulk Item Reports Repository/Inventory/select_CNBDICT-1NavkarCentury Ply'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/Bulk Item Reports Repository/Inventory/input_Location_col-sm-1 btn btn-primary'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Bulk Item Reports Repository/Inventory/td_RFID Tag'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Bulk Item Reports Repository/Inventory/td_50'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Bulk Item Reports Repository/Inventory/select_CNBDICT-1NavkarCentury Ply'), 
    '3', true)

WebUI.click(findTestObject('Object Repository/Bulk Item Reports Repository/Inventory/input_Location_col-sm-1 btn btn-primary'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Bulk Item Reports Repository/Inventory/td_RFID Tag'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Bulk Item Reports Repository/Inventory/td_1050'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Bulk Item Reports Repository/Inventory/select_CNBDICT-1NavkarCentury Ply'), 
    '4', true)

WebUI.click(findTestObject('Object Repository/Bulk Item Reports Repository/Inventory/input_Location_col-sm-1 btn btn-primary'))

WebUI.verifyElementText(findTestObject('Object Repository/Bulk Item Reports Repository/Inventory/div_No result found'), 
    'No result found')

WebUI.click(findTestObject('Object Repository/Bulk Item Reports Repository/Inventory/a_BULK ITMES'))

WebUI.click(findTestObject('Object Repository/Bulk Item Reports Repository/Inventory/input_ Add_showDispatched'))

WebUI.delay(1)

WebUI.click(findTestObject('Bulk Item Reports Repository/Inventory/i_Jul 28 2019_fa fa-plus-square fa-x ng-star-inserted'))

WebUI.click(findTestObject('Bulk Item Reports Repository/Inventory/i_Jul 29 2019_fa fa-plus-square fa-x ng-star-inserted Tag'))

WebUI.delay(1)

WebUI.verifyElementVisible(findTestObject('Object Repository/Bulk Item Reports Repository/Inventory/td_20'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Bulk Item Reports Repository/Inventory/td_DICT-1'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Bulk Item Reports Repository/Inventory/td_25'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Bulk Item Reports Repository/Inventory/td_DICT-1'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Bulk Item Reports Repository/Inventory/td_25'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Bulk Item Reports Repository/Inventory/td_DICT-1'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Bulk Item Reports Repository/Inventory/td_149'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Bulk Item Reports Repository/Inventory/td_Navkar'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Bulk Item Reports Repository/Inventory/td_827'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Bulk Item Reports Repository/Inventory/td_CNB'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Bulk Item Reports Repository/Inventory/td_55'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Bulk Item Reports Repository/Inventory/td_CNB'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Bulk Item Reports Repository/Inventory/td_100'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Bulk Item Reports Repository/Inventory/td_CNB'))

WebUI.closeBrowser()

