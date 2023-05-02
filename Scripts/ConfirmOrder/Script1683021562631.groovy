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

//Shoes
not_run: GlobalVariable.GlobalShoes = WebUI.getText(findTestObject('Object Repository/OrderConfirm/Page_Demo Web Shop. Checkout/a_Blue and green Sneaker'))

not_run: System.out.println(GlobalVariable.GlobalShoes)

//SubTotal
WebUI.verifyElementText(findTestObject('Object Repository/OrderConfirm/Page_Demo Web Shop. Checkout/span_Sub-Total'), 'Sub-Total:')

GlobalVariable.GlobalSubTotal = WebUI.getText(findTestObject('Object Repository/OrderConfirm/Page_Demo Web Shop. Checkout/span_273.00'))

System.out.println(GlobalVariable.GlobalSubTotal)

//Shipping
WebUI.verifyElementText(findTestObject('Object Repository/OrderConfirm/Page_Demo Web Shop. Checkout/span_Shipping'), 'Shipping:')

GlobalVariable.GlobalShipping = WebUI.getText(findTestObject('Object Repository/OrderConfirm/Page_Demo Web Shop. Checkout/span_0.00'))

System.out.println(GlobalVariable.GlobalShipping)

//Tax
WebUI.verifyElementText(findTestObject('Object Repository/OrderConfirm/Page_Demo Web Shop. Checkout/span_Tax'), 'Tax:')

GlobalVariable.GlobalTax = WebUI.getText(findTestObject('Object Repository/OrderConfirm/Page_Demo Web Shop. Checkout/span_0.00_1'))

System.out.println(GlobalVariable.GlobalTax)

//Total
WebUI.verifyElementText(findTestObject('Object Repository/OrderConfirm/Page_Demo Web Shop. Checkout/span_Total'), 'Total:')

GlobalVariable.GlobalTotal = WebUI.getText(findTestObject('Object Repository/OrderConfirm/Page_Demo Web Shop. Checkout/strong_273.00'))

System.out.println(GlobalVariable.GlobalTotal)

WebUI.click(findTestObject('Object Repository/OrderConfirm/Page_Demo Web Shop. Checkout/input__button-1 confirm-order-next-step-button'))

