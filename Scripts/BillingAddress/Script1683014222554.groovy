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

WebUI.selectOptionByValue(findTestObject('Object Repository/Billing Address/Page_Demo Web Shop. Checkout/select_Select countryUnited StatesCanadaAfg_dd1e54'), 
    '41', true)

WebUI.setText(findTestObject('Object Repository/Billing Address/Page_Demo Web Shop. Checkout/input_City_BillingNewAddress.City'), 
    'ppura')

WebUI.setText(findTestObject('Object Repository/Billing Address/Page_Demo Web Shop. Checkout/input_Address 1_BillingNewAddress.Address1'), 
    '#445, kennalu')

WebUI.setText(findTestObject('Object Repository/Billing Address/Page_Demo Web Shop. Checkout/input_Zip  postal code_BillingNewAddress.Zi_77bd94'), 
    '571435')

WebUI.setText(findTestObject('Object Repository/Billing Address/Page_Demo Web Shop. Checkout/input_Phone number_BillingNewAddress.PhoneNumber'), 
    '1234567890')

WebUI.click(findTestObject('Object Repository/Billing Address/Page_Demo Web Shop. Checkout/input_Fax number_button-1 new-address-next-_2f210c'))

