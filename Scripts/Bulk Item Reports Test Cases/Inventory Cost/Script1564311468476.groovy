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

WebUI.setText(findTestObject('Object Repository/Bulk Item Reports Repository/Inventory Cost/input_LOGIN_userName'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Bulk Item Reports Repository/Inventory Cost/input_LOGIN_password'), 
    '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Bulk Item Reports Repository/Inventory Cost/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/Bulk Item Reports Repository/Inventory Cost/a_REPORTS'))

WebUI.click(findTestObject('Object Repository/Bulk Item Reports Repository/Inventory Cost/a_Bulk Items'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Bulk Item Reports Repository/Inventory Cost/select_InventoryAdded BetweenBelow mandatory quantityInventory Cost'), 
    '3: 4', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Bulk Item Reports Repository/Inventory Cost/select_CNBDICT-1NavkarCentury Ply'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Bulk Item Reports Repository/Inventory Cost/input_Location_col-sm-1 btn btn-primary'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Bulk Item Reports Repository/Inventory Cost/td_RFID Tag  ( Total - 982 )'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Bulk Item Reports Repository/Inventory Cost/td_ 6874'))

WebUI.verifyElementVisible(findTestObject('Bulk Item Reports Repository/Inventory Cost/td_Total   681667'))

WebUI.closeBrowser()

