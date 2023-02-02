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

'preconditions: login'
WebUI.callTestCase(findTestCase('Test Cases/Web Secondhand/Page/General/preconditions-login'), null, FailureHandling.STOP_ON_FAILURE)

'go to daftar jual saya page'
WebUI.callTestCase(findTestCase('Test Cases/Web Secondhand/Page/Product/go to daftar jual saya page'), null, FailureHandling.STOP_ON_FAILURE)

'go to detail product page'
WebUI.callTestCase(findTestCase('Test Cases/Web Secondhand/Page/Product/go to detail product page'), null, FailureHandling.STOP_ON_FAILURE)

'click edit button'
WebUI.callTestCase(findTestCase('Test Cases/Web Secondhand/Page/Product/click edit button'), null, FailureHandling.STOP_ON_FAILURE)

'change product data'
WebUI.callTestCase(findTestCase('Test Cases/Web Secondhand/Page/Product/input product data'), null, FailureHandling.STOP_ON_FAILURE)

'apply update product data'
WebUI.callTestCase(findTestCase('Test Cases/Web Secondhand/Page/Product/appy add product'), null, FailureHandling.STOP_ON_FAILURE)

'go to daftar jual saya page'
WebUI.callTestCase(findTestCase('Test Cases/Web Secondhand/Page/Product/go to daftar jual saya page'), null, FailureHandling.STOP_ON_FAILURE)

'verify updated product exist'
WebUI.callTestCase(findTestCase('Test Cases/Web Secondhand/Page/Product/verify new product exist'), null, FailureHandling.STOP_ON_FAILURE)

'close browser'
WebUI.callTestCase(findTestCase('Test Cases/Web Secondhand/Page/General/close browser'), null, FailureHandling.STOP_ON_FAILURE)