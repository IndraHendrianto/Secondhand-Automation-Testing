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

'open browser and navigate to Url'
WebUI.callTestCase(findTestCase('Test Cases/Web Secondhand/Page/General/open browser and navigate to Url'), null, FailureHandling.STOP_ON_FAILURE)

'go to login page'
WebUI.callTestCase(findTestCase('Test Cases/Web Secondhand/Page/Login page/go to login page'), null, FailureHandling.STOP_ON_FAILURE)

'input user login data'
WebUI.callTestCase(findTestCase('Test Cases/Web Secondhand/Page/General/user login data'), null, FailureHandling.STOP_ON_FAILURE)

'apply login'
WebUI.callTestCase(findTestCase('Test Cases/Web Secondhand/Page/Login page/apply login'), null, FailureHandling.STOP_ON_FAILURE)

'go to profile page'
WebUI.callTestCase(findTestCase('Test Cases/Web Secondhand/Page/Profile page/go to profil page'), null, FailureHandling.STOP_ON_FAILURE)

'Empty fill and click perbarui button'
WebUI.callTestCase(findTestCase('Test Cases/Web Secondhand/Page/Profile page/apply update data'), null, FailureHandling.STOP_ON_FAILURE)

'verify success update message exist'
WebUI.callTestCase(findTestCase('Test Cases/Web Secondhand/Page/Profile page/verify success update message exist'), null, 
    FailureHandling.STOP_ON_FAILURE)

'close browser'
WebUI.callTestCase(findTestCase('Test Cases/Web Secondhand/Page/General/close browser'), null, FailureHandling.STOP_ON_FAILURE)

