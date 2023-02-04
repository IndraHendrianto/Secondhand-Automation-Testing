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

'start application'
Mobile.callTestCase(findTestCase('Test Cases/Mobile Secondhand/Page/General/start application'), null, FailureHandling.STOP_ON_FAILURE)

'go to login page'
Mobile.callTestCase(findTestCase('Test Cases/Mobile Secondhand/Page/Login page/go to login page'), null, FailureHandling.STOP_ON_FAILURE)

'input password'
Mobile.callTestCase(findTestCase('Test Cases/Mobile Secondhand/Page/Login page/input user login data'), [('emailLogin'):('')], FailureHandling.STOP_ON_FAILURE)

'apply login'
Mobile.callTestCase(findTestCase('Test Cases/Mobile Secondhand/Page/Login page/apply login'), null, FailureHandling.STOP_ON_FAILURE)

'verify invalid email alert message exist'
Mobile.callTestCase(findTestCase('Test Cases/Mobile Secondhand/Page/Login page/verify mandatory email alert message exist'), null, FailureHandling.STOP_ON_FAILURE)

'close application'
Mobile.callTestCase(findTestCase('Test Cases/Mobile Secondhand/Page/General/close application'), null, FailureHandling.STOP_ON_FAILURE)