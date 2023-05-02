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

WebUI.callTestCase(findTestCase('LoginToCheckout'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('BillingAddress'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('ShippingAddress'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PaymentMethod'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PaymentInformation'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('ConfirmOrder'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Thankyou'), [:], FailureHandling.STOP_ON_FAILURE)

SubTotal = WebUI.getText(findTestObject('Object Repository/OrderInformation/Page_Demo Web Shop. Order Details/span_11.00'))

Shipping = WebUI.getText(findTestObject('Object Repository/OrderInformation/Page_Demo Web Shop. Order Details/span_0.00'))

Tax = WebUI.getText(findTestObject('Object Repository/OrderInformation/Page_Demo Web Shop. Order Details/span_0.00'))

Total = WebUI.getText(findTestObject('Object Repository/OrderInformation/Page_Demo Web Shop. Order Details/strong_11.00'))

if (GlobalVariable.GlobalSubTotal == SubTotal) {
    System.out.println('\t\tSubTotal amount got machted!! :)')
} else {
    System.out.println('\t\tSubTotal amount not machted!! :(')
}

if (GlobalVariable.GlobalShipping == Shipping) {
    System.out.println('\t\tShipping amount got machted!! :)')
} else {
    System.out.println('\t\tShipping amount not machted!! :(')
}

if (GlobalVariable.GlobalTax == Tax) {
    System.out.println('\t\tTax amount got machted!! :)')
} else {
    System.out.println('\t\tTax amount not machted!! :(')
}

if (GlobalVariable.GlobalTotal == Total) {
    System.out.println('\t\tTotal amount got machted!! :)')
} else {
    System.out.println('\t\tTotal amount not machted!! :(')
}

WebUI.click(findTestObject('Object Repository/OrderInformation/Page_Demo Web Shop. Order Details/a_PDF Invoice'))

