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

Mobile.startApplication('/Users/jokopriyono/Documents/QAE-Wave5-VeraRamdhani/app-release.apk', true)

'seller add product'
Mobile.callTestCase(findTestCase('Test Cases/Mobile Secondhand/Page/Buyer Page/add cancel product'), null, FailureHandling.STOP_ON_FAILURE)

'buyer login'
Mobile.callTestCase(findTestCase('Test Cases/Mobile Secondhand/Page/Buyer Page/preconditions-login-buyer'), null, FailureHandling.STOP_ON_FAILURE)

'go to search page'
Mobile.callTestCase(findTestCase('Test Cases/Mobile Secondhand/Page/Search page/Go to Search Page'), null, FailureHandling.STOP_ON_FAILURE)

'search product'
Mobile.callTestCase(findTestCase('Test Cases/Mobile Secondhand/Page/Buyer Page/search cancel product'), null, FailureHandling.STOP_ON_FAILURE)

'price negotiation'
Mobile.callTestCase(findTestCase('Test Cases/Mobile Secondhand/Page/Buyer Page/price negotiation buyer'), null, FailureHandling.STOP_ON_FAILURE)

'close application'
Mobile.callTestCase(findTestCase('Test Cases/Mobile Secondhand/Page/General/close application'), null, FailureHandling.STOP_ON_FAILURE)

'seller login'
Mobile.callTestCase(findTestCase('Test Cases/Mobile Secondhand/Page/General/preconditions-login'), null, FailureHandling.STOP_ON_FAILURE)

'go to product list page'
Mobile.callTestCase(findTestCase('Test Cases/Mobile Secondhand/Page/Product Page/go to product list page'), null, FailureHandling.STOP_ON_FAILURE)

'go to interested product'
Mobile.callTestCase(findTestCase('Test Cases/Mobile Secondhand/Page/Sold Product Page/go to interested product'), null, FailureHandling.STOP_ON_FAILURE)

'go to bid information'
Mobile.callTestCase(findTestCase('Test Cases/Mobile Secondhand/Page/Sold Product Page/go to bid information'), null, FailureHandling.STOP_ON_FAILURE)

'accept order'
Mobile.callTestCase(findTestCase('Test Cases/Mobile Secondhand/Page/Sold Product Page/accept order'), null, FailureHandling.STOP_ON_FAILURE)

'call buyer'
Mobile.callTestCase(findTestCase('Test Cases/Mobile Secondhand/Page/Sold Product Page/call buyer'), null, FailureHandling.STOP_ON_FAILURE)

'check product status'
Mobile.callTestCase(findTestCase('Test Cases/Mobile Secondhand/Page/Sold Product Page/check product status'), null, FailureHandling.STOP_ON_FAILURE)

'change status - cancel order'
Mobile.callTestCase(findTestCase('Test Cases/Mobile Secondhand/Page/Sold Product Page/cancel order'), null, FailureHandling.STOP_ON_FAILURE)

'close application'
Mobile.callTestCase(findTestCase('Test Cases/Mobile Secondhand/Page/General/close application'), null, FailureHandling.STOP_ON_FAILURE)

