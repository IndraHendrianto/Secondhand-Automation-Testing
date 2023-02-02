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

'precondition success login'
Mobile.callTestCase(findTestCase('Test Cases/Mobile Secondhand/Page/General/preconditions-login'), null, FailureHandling.STOP_ON_FAILURE)

'go to daftar jual saya page'
Mobile.callTestCase(findTestCase('Test Cases/Mobile Secondhand/Page/Edit Product/go to daftar jual saya page'), null, FailureHandling.STOP_ON_FAILURE)

'go to detail product page'
Mobile.callTestCase(findTestCase('Test Cases/Mobile Secondhand/Page/Edit Product/go to detail product page'), null, FailureHandling.STOP_ON_FAILURE)

'change product data'
Mobile.callTestCase(findTestCase('Test Cases/Mobile Secondhand/Page/Edit Product/change product data'), null, FailureHandling.STOP_ON_FAILURE)

'apply update product data'
Mobile.callTestCase(findTestCase('Test Cases/Mobile Secondhand/Page/Edit Product/apply update product data'), null, FailureHandling.STOP_ON_FAILURE)

'verify success update product data'
Mobile.callTestCase(findTestCase('Test Cases/Mobile Secondhand/Page/Edit Product/verify success update product data'), null, FailureHandling.STOP_ON_FAILURE)

'close app'
Mobile.callTestCase(findTestCase('Test Cases/Mobile Secondhand/Page/General/close application'), null, FailureHandling.STOP_ON_FAILURE)