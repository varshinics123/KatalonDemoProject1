import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.setText(findTestObject('Object Repository/PaymentInformation/Page_Demo Web Shop. Checkout/input_Cardholder name_CardholderName'), 
    'Barbara Gordon')

WebUI.setText(findTestObject('Object Repository/PaymentInformation/Page_Demo Web Shop. Checkout/input_Card number_CardNumber'), 
    '4485564059489345')

WebUI.selectOptionByValue(findTestObject('Object Repository/PaymentInformation/Page_Demo Web Shop. Checkout/select_010203040506070809101112'), 
    '4', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PaymentInformation/Page_Demo Web Shop. Checkout/select_202320242025202620272028202920302031_99023a'), 
    '2024', true)

WebUI.setText(findTestObject('Object Repository/PaymentInformation/Page_Demo Web Shop. Checkout/input_Card code_CardCode'), 
    '123')

WebUI.click(findTestObject('Object Repository/PaymentInformation/Page_Demo Web Shop. Checkout/input__button-1 payment-info-next-step-button'))

