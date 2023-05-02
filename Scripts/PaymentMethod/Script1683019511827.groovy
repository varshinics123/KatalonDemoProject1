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

WebUI.delay(5)

CreditCard = WebUI.verifyImagePresent(findTestObject('PaymentMethod/Page_Demo Web Shop. Checkout/img'), FailureHandling.STOP_ON_FAILURE)

if (CreditCard == true) {
    WebUI.click(findTestObject('Object Repository/PaymentMethod/Page_Demo Web Shop. Checkout/input_Check  Money Order (5.00)_paymentmethod'))
} else {
    WebUI.verifyElementText(findTestObject('Object Repository/PaymentMethod/Page_Demo Web Shop. Checkout/label_Cash On Delivery (COD) (7.00)'), 
        'Cash On Delivery (COD) (7.00)')

    WebUI.click(findTestObject('Object Repository/PaymentMethod/Page_Demo Web Shop. Checkout/input_Payment method_paymentmethod'))
}

WebUI.click(findTestObject('Object Repository/PaymentMethod/Page_Demo Web Shop. Checkout/input__button-1 payment-method-next-step-button'))

