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

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-T9/input_LOGIN_userName'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Orders Repository/IMO-T9/input_LOGIN_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T9/button_LOGIN'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T9/i_Order ID  7_dispatch_order'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T9/button_RFID Tag (50)'))

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-T9/input_RFID Tag (50)_tagBatchSearch'), 'T')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T9/ngb-highlight_RFIDTAG_1( RFID Tag-80 )'))

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-T9/input_End sequence_endSNo'), '46')

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-T9/input_Total_total'), '25')

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-T9/textarea_Comments_comments'), 'sending half for now')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T9/input_Order Date_dispatch_order_btn'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T9/button_OK'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T9/a_Track'))

WebUI.delay(1)

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T9/h4_dispatched'), 'dispatched')

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T9/a_RFIDTAG_1_child2(25)'), 'RFIDTAG_1_child2(25)')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T9/a_BULK ITMES'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T9/i_Jul 28 2019_fa fa-plus-square fa-x ng-star-inserted'))

WebUI.delay(1)

WebUI.verifyElementVisible(findTestObject('Object Repository/Orders Repository/IMO-T9/td_RFIDTAG_1_child2'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/Orders Repository/IMO-T9/td_25 (21 - 46)'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/Orders Repository/IMO-T9/td_25'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T9/a_ORDERS'))

WebUI.closeBrowser()

