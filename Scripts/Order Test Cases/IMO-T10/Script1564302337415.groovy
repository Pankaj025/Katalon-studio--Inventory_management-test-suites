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

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-T10/input_LOGIN_userName'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Orders Repository/IMO-T10/input_LOGIN_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T10/button_LOGIN'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T10/i_Order ID  7_track_order'))

WebUI.delay(1)

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T10/h4_initiated'), 'initiated')

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T10/div_RFID Tag(50)'), 'RFID Tag(50)')

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T10/h4_dispatched'), 'dispatched')

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T10/div_RFIDTAG_1_child2(25)'), 'RFIDTAG_1_child2(25)')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T10/a_ORDERS'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T10/i_Order ID  7_dispatch_order'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T10/button_RFID Tag (25)'))

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-T10/input_RFID Tag (25)_tagBatchSearch'), 't')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T10/ngb-highlight_Tag Bulk2 Edited( RFID Tag-1001 )'))

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-T10/textarea_Comments_comments'), 'sending rest order')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T10/input_Order Date_dispatch_order_btn'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T10/button_OK'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T10/a_Track'))

WebUI.delay(1)

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T10/h4_dispatched'), 'dispatched')

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T10/a_Tag Bulk2 Edited_child1(25)'), 'Tag Bulk2 Edited_child1(25)')

WebUI.verifyElementText(findTestObject('Object Repository/Orders Repository/IMO-T10/div_Comments sending rest order'), 'Comments:  sending rest order')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T10/a_ORDERS'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T10/button_(See all)'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T10/a_Receive'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-T10/textarea_Comments_comments_8'), 'Received')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T10/input_Recieved Order Date_receiveOrder_btn'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T10/button_OK'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T10/a_Receive'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Orders Repository/IMO-T10/textarea_Comments_comments_16'), 'received')

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T10/input_Recieved Order Date_receiveOrder_btn'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T10/button_OK'))

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T10/a_BULK ITMES'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T10/i_Jul 28 2019_fa fa-plus-square fa-x ng-star-inserted'))

WebUI.delay(1)

WebUI.verifyElementVisible(findTestObject('Object Repository/Orders Repository/IMO-T10/td_RFIDTAG_1_child2'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/Orders Repository/IMO-T10/td_DICT-1'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T10/i_Actions_fa fa-plus-square fa-x ng-star-inserted'))

WebUI.delay(1)

WebUI.verifyElementVisible(findTestObject('Object Repository/Orders Repository/IMO-T10/td_Tag Bulk2 Edited_child1'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/Orders Repository/IMO-T10/td_DICT-1'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Orders Repository/IMO-T10/a_ORDERS'))

WebUI.closeBrowser()

