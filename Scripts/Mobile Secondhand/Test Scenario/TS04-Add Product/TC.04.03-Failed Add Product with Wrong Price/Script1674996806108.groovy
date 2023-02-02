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

'pre-conditions login'
Mobile.callTestCase(findTestCase('Test Cases/Mobile Secondhand/Page/General/preconditions-login'), null, FailureHandling.STOP_ON_FAILURE)

'go to product page'
Mobile.callTestCase(findTestCase('Test Cases/Mobile Secondhand/Page/Add Product page/go to add product page'), null, FailureHandling.STOP_ON_FAILURE)

'input new product with wrong price'
Mobile.callTestCase(findTestCase('Test Cases/Mobile Secondhand/Page/Add Product page/Negative Case/input wrong price'), null, FailureHandling.STOP_ON_FAILURE)

'input product image'
Mobile.callTestCase(findTestCase('Test Cases/Mobile Secondhand/Page/Add Product page/Positive Case/input product image'), null, FailureHandling.STOP_ON_FAILURE)

'tap terbitkan'
Mobile.callTestCase(findTestCase('Test Cases/Mobile Secondhand/Page/Add Product page/tap terbitkan button'), null, FailureHandling.STOP_ON_FAILURE)

'close application'
Mobile.callTestCase(findTestCase('Test Cases/Mobile Secondhand/Page/General/close application'), null, FailureHandling.STOP_ON_FAILURE)