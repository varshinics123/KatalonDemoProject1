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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demowebshop.tricentis.com/')

WebUI.click(findTestObject('Object Repository/LogintoCheckout/Page_Demo Web Shop/a_Log in'))

WebUI.setText(findTestObject('Object Repository/LogintoCheckout/Page_Demo Web Shop. Login/input_Email_Email'), 'varshini.cs@marlabs.com')

WebUI.setEncryptedText(findTestObject('Object Repository/LogintoCheckout/Page_Demo Web Shop. Login/input_Password_Password'), 
    'xeEP7/uQEf/DMevZmHsexw==')

WebUI.click(findTestObject('Object Repository/LogintoCheckout/Page_Demo Web Shop. Login/input_Forgot password_button-1 login-button'))

WebUI.click(findTestObject('Object Repository/LogintoCheckout/Page_Demo Web Shop/a_Apparel  Shoes'))

WebUI.click(findTestObject('Object Repository/LogintoCheckout/Page_Demo Web Shop. Apparel  Shoes/input_This sleek shoe has all you need for _7bf662'))

WebUI.selectOptionByValue(findTestObject('Object Repository/LogintoCheckout/Page_Demo Web Shop. Blue and green Sneaker/select_8                                   _0e115d'), 
    '26', true)

WebUI.click(findTestObject('Object Repository/LogintoCheckout/Page_Demo Web Shop. Blue and green Sneaker/span_'))

WebUI.click(findTestObject('Object Repository/LogintoCheckout/Page_Demo Web Shop. Blue and green Sneaker/input_Qty_add-to-cart-button-28'))

WebUI.click(findTestObject('Object Repository/LogintoCheckout/Page_Demo Web Shop. Blue and green Sneaker/span_Shopping cart'))

checkbox = WebUI.verifyElementClickable(findTestObject('Object Repository/LogintoCheckout/Page_Demo Web Shop. Shopping Cart/input_I agree with the terms of service and_f529a0'))

if (checkbox == true) {
	
	WebUI.click(findTestObject('Object Repository/LogintoCheckout/Page_Demo Web Shop. Shopping Cart/input_I agree with the terms of service and_f529a0'))
	
} else {
	
	System.out.println('It is not a clickable element')
}



WebUI.click(findTestObject('Object Repository/LogintoCheckout/Page_Demo Web Shop. Shopping Cart/button_Checkout'))

