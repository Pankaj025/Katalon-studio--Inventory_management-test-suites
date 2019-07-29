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

WebUI.setText(findTestObject('Price Model Repository/IMPM-T7/input_LOGIN_userName'), 'admin')

WebUI.setEncryptedText(findTestObject('Price Model Repository/IMPM-T7/input_LOGIN_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Price Model Repository/IMPM-T7/button_LOGIN'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T7/a_PRICE MODELS'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T7/button_ Add'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T7/label_Keep on adding'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T7/div__ngx-select__toggle btn form-control'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T7/span_RFID Reader'))

WebUI.setText(findTestObject('Price Model Repository/IMPM-T7/input__input_name'), 'rfid reader')

WebUI.selectOptionByValue(findTestObject('Price Model Repository/IMPM-T7/select_CNBSamsungPanasonic'), 
    '5', true)

WebUI.setText(findTestObject('Price Model Repository/IMPM-T7/input__input_price'), '4')

WebUI.click(findTestObject('Price Model Repository/IMPM-T7/input_Comments_btn_save'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T7/div__ngx-select__toggle btn form-control_1'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T7/span_Hw2'))

WebUI.setText(findTestObject('Price Model Repository/IMPM-T7/input__input_name'), 'hw2')

WebUI.selectOptionByValue(findTestObject('Price Model Repository/IMPM-T7/select_CNBSamsungPanasonic'), 
    '6', true)

WebUI.setText(findTestObject('Price Model Repository/IMPM-T7/input__input_price'), '6')

WebUI.click(findTestObject('Price Model Repository/IMPM-T7/input_Comments_btn_save'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T7/div__ngx-select__toggle btn form-control_2'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T7/span_Hw3'))

WebUI.setText(findTestObject('Price Model Repository/IMPM-T7/input__input_name'), 'hw3')

WebUI.selectOptionByValue(findTestObject('Price Model Repository/IMPM-T7/select_CNBSamsungPanasonic'), 
    '5', true)

WebUI.setText(findTestObject('Price Model Repository/IMPM-T7/input__input_price'), '4')

WebUI.click(findTestObject('Price Model Repository/IMPM-T7/input_Comments_btn_save'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T7/div__ngx-select__toggle btn form-control_3'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T7/span_Hw4'))

WebUI.setText(findTestObject('Price Model Repository/IMPM-T7/input__input_name'), 'hw4')

WebUI.selectOptionByValue(findTestObject('Price Model Repository/IMPM-T7/select_CNBSamsungPanasonic'), 
    '6', true)

WebUI.setText(findTestObject('Price Model Repository/IMPM-T7/input__input_price'), '5')

WebUI.click(findTestObject('Price Model Repository/IMPM-T7/input_Comments_btn_save'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T7/div__ngx-select__toggle btn form-control_4'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T7/span_Hw5'))

WebUI.setText(findTestObject('Price Model Repository/IMPM-T7/input__input_name'), 'hw5')

WebUI.selectOptionByValue(findTestObject('Price Model Repository/IMPM-T7/select_CNBSamsungPanasonic'), 
    '5', true)

WebUI.setText(findTestObject('Price Model Repository/IMPM-T7/input__input_price'), '6')

WebUI.click(findTestObject('Price Model Repository/IMPM-T7/input_Comments_btn_save'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T7/div__ngx-select__toggle btn form-control_5'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T7/span_Hw6'))

WebUI.setText(findTestObject('Price Model Repository/IMPM-T7/input__input_name'), 'hw6')

WebUI.selectOptionByValue(findTestObject('Price Model Repository/IMPM-T7/select_CNBSamsungPanasonic'), 
    '5', true)

WebUI.setText(findTestObject('Price Model Repository/IMPM-T7/input__input_price'), '2')

WebUI.click(findTestObject('Price Model Repository/IMPM-T7/input_Comments_btn_save'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T7/div__ngx-select__toggle btn form-control_6'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T7/span_Hw7'))

WebUI.setText(findTestObject('Price Model Repository/IMPM-T7/input__input_name'), 'hw7')

WebUI.selectOptionByValue(findTestObject('Price Model Repository/IMPM-T7/select_CNBSamsungPanasonic'), 
    '6', true)

WebUI.setText(findTestObject('Price Model Repository/IMPM-T7/input__input_price'), '6')

WebUI.click(findTestObject('Price Model Repository/IMPM-T7/input_Comments_btn_save'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T7/div__ngx-select__toggle btn form-control_7'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T7/span_Hw8'))

WebUI.setText(findTestObject('Price Model Repository/IMPM-T7/input__input_name'), 'hw8')

WebUI.selectOptionByValue(findTestObject('Price Model Repository/IMPM-T7/select_CNBSamsungPanasonic'), 
    '5', true)

WebUI.setText(findTestObject('Price Model Repository/IMPM-T7/input__input_price'), '4')

WebUI.click(findTestObject('Price Model Repository/IMPM-T7/input_Comments_btn_save'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T7/div__ngx-select__toggle btn form-control_8'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T7/span_Hw9'))

WebUI.setText(findTestObject('Price Model Repository/IMPM-T7/input__input_name'), 'hw9')

WebUI.selectOptionByValue(findTestObject('Price Model Repository/IMPM-T7/select_CNBSamsungPanasonic'), 
    '5', true)

WebUI.setText(findTestObject('Price Model Repository/IMPM-T7/input__input_price'), '7')

WebUI.click(findTestObject('Price Model Repository/IMPM-T7/input_Comments_btn_save'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T7/div__ngx-select__toggle btn form-control_9'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T7/span_Hw10'))

WebUI.setText(findTestObject('Price Model Repository/IMPM-T7/input__input_name'), 'hw10')

WebUI.selectOptionByValue(findTestObject('Price Model Repository/IMPM-T7/select_CNBSamsungPanasonic'), 
    '5', true)

WebUI.setText(findTestObject('Price Model Repository/IMPM-T7/input__input_price'), '8')

WebUI.click(findTestObject('Price Model Repository/IMPM-T7/input_Comments_btn_save'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T7/div__ngx-select__toggle btn form-control_10'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T7/span_Buk1'))

WebUI.setText(findTestObject('Price Model Repository/IMPM-T7/input__input_name'), 'buk')

WebUI.selectOptionByValue(findTestObject('Price Model Repository/IMPM-T7/select_CNBSamsungPanasonic'), 
    '5', true)

WebUI.setText(findTestObject('Price Model Repository/IMPM-T7/input__input_price'), '10')

WebUI.click(findTestObject('Price Model Repository/IMPM-T7/input_Comments_btn_save'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T7/div__ngx-select__toggle btn form-control_11'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T7/span_Buk2'))

WebUI.setText(findTestObject('Price Model Repository/IMPM-T7/input__input_name'), 'buk2')

WebUI.selectOptionByValue(findTestObject('Price Model Repository/IMPM-T7/select_CNBSamsungPanasonic'), 
    '6', true)

WebUI.setText(findTestObject('Price Model Repository/IMPM-T7/input__input_price'), '9')

WebUI.click(findTestObject('Price Model Repository/IMPM-T7/input_Comments_btn_save'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T7/div__ngx-select__toggle btn form-control_12'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T7/span_Buk3'))

WebUI.setText(findTestObject('Price Model Repository/IMPM-T7/input__input_name'), 'buk3')

WebUI.selectOptionByValue(findTestObject('Price Model Repository/IMPM-T7/select_CNBSamsungPanasonic'), 
    '5', true)

WebUI.setText(findTestObject('Price Model Repository/IMPM-T7/input__input_price'), '8')

WebUI.click(findTestObject('Price Model Repository/IMPM-T7/input_Comments_btn_save'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T7/div__ngx-select__toggle btn form-control_13'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T7/span_Buk4'))

WebUI.setText(findTestObject('Price Model Repository/IMPM-T7/input__input_name'), 'buk4')

WebUI.selectOptionByValue(findTestObject('Price Model Repository/IMPM-T7/select_CNBSamsungPanasonic'), 
    '5', true)

WebUI.setText(findTestObject('Price Model Repository/IMPM-T7/input__input_price'), '7')

WebUI.click(findTestObject('Price Model Repository/IMPM-T7/input_Comments_btn_save'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T7/div__ngx-select__toggle btn form-control_14'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T7/span_Buk5'))

WebUI.setText(findTestObject('Price Model Repository/IMPM-T7/input__input_name'), 'buk5')

WebUI.selectOptionByValue(findTestObject('Price Model Repository/IMPM-T7/select_CNBSamsungPanasonic'), 
    '6', true)

WebUI.setText(findTestObject('Price Model Repository/IMPM-T7/input__input_price'), '6')

WebUI.click(findTestObject('Price Model Repository/IMPM-T7/input_Comments_btn_save'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T7/div__ngx-select__toggle btn form-control_15'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T7/span_Buk6'))

WebUI.setText(findTestObject('Price Model Repository/IMPM-T7/input__input_name'), 'buk6')

WebUI.selectOptionByValue(findTestObject('Price Model Repository/IMPM-T7/select_CNBSamsungPanasonic'), 
    '5', true)

WebUI.setText(findTestObject('Price Model Repository/IMPM-T7/input__input_price'), '5')

WebUI.click(findTestObject('Price Model Repository/IMPM-T7/input_Comments_btn_save'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T7/div__ngx-select__toggle btn form-control_16'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T7/span_Buk7'))

WebUI.setText(findTestObject('Price Model Repository/IMPM-T7/input__input_name'), 'buk7')

WebUI.selectOptionByValue(findTestObject('Price Model Repository/IMPM-T7/select_CNBSamsungPanasonic'), 
    '6', true)

WebUI.setText(findTestObject('Price Model Repository/IMPM-T7/input__input_price'), '4')

WebUI.click(findTestObject('Price Model Repository/IMPM-T7/input_Comments_btn_save'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T7/div__ngx-select__toggle btn form-control_17'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T7/span_Buk8'))

WebUI.setText(findTestObject('Price Model Repository/IMPM-T7/input__input_name'), 'buk8')

WebUI.selectOptionByValue(findTestObject('Price Model Repository/IMPM-T7/select_CNBSamsungPanasonic'), 
    '5', true)

WebUI.setText(findTestObject('Price Model Repository/IMPM-T7/input__input_price'), '3')

WebUI.click(findTestObject('Price Model Repository/IMPM-T7/input_Comments_btn_save'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T7/div__ngx-select__toggle btn form-control_18'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T7/span_Buk9'))

WebUI.setText(findTestObject('Price Model Repository/IMPM-T7/input__input_name'), 'buk9')

WebUI.selectOptionByValue(findTestObject('Price Model Repository/IMPM-T7/select_CNBSamsungPanasonic'), 
    '5', true)

WebUI.setText(findTestObject('Price Model Repository/IMPM-T7/input__input_price'), '2')

WebUI.click(findTestObject('Price Model Repository/IMPM-T7/input_Comments_btn_save'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T7/div__ngx-select__toggle btn form-control_19'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T7/span_Buk10'))

WebUI.setText(findTestObject('Price Model Repository/IMPM-T7/input__input_name'), 'buk10')

WebUI.setText(findTestObject('Price Model Repository/IMPM-T7/input__input_price'), '1')

WebUI.selectOptionByValue(findTestObject('Price Model Repository/IMPM-T7/select_CNBSamsungPanasonic'), 
    '6', true)

WebUI.click(findTestObject('Price Model Repository/IMPM-T7/input_Comments_btn_save'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T7/div__ngx-select__toggle btn form-control_20'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T7/span_Buk11'))

WebUI.setText(findTestObject('Price Model Repository/IMPM-T7/input__input_name'), 'buk11')

WebUI.selectOptionByValue(findTestObject('Price Model Repository/IMPM-T7/select_CNBSamsungPanasonic'), 
    '6', true)

WebUI.setText(findTestObject('Price Model Repository/IMPM-T7/input__input_price'), '10')

WebUI.click(findTestObject('Price Model Repository/IMPM-T7/input_Comments_btn_save'))

WebUI.click(findTestObject('Price Model Repository/IMPM-T7/span_'))

WebUI.closeBrowser()

