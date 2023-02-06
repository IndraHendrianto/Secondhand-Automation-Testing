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

'input email'
WebUI.setText(findTestObject('Object Repository/indra_web secondhand/Reject Product/input_Email_exampleInputEmail1'), 
    'anhelica@mitchelllx.com')

'input password'
WebUI.setEncryptedText(findTestObject('Object Repository/indra_web secondhand/Reject Product/input_Password_exampleInputPassword1'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

'apply login'
WebUI.callTestCase(findTestCase('Test Cases/Web Secondhand/Page/Login page/apply login'), null, FailureHandling.STOP_ON_FAILURE)

'Go to interested categorized'
WebUI.callTestCase(findTestCase('Test Cases/Web Secondhand/Page/Product/Go To Interested Categorized'), null, FailureHandling.STOP_ON_FAILURE)

'Choose interest product'
WebUI.click(findTestObject('Object Repository/indra_web secondhand/Reject Product/p_obat kumur Kesehatan'))

'Product has been sold'
WebUI.callTestCase(findTestCase('Test Cases/Web Secondhand/Page/Product/Product has been sold'), null, FailureHandling.STOP_ON_FAILURE)

'verify product rejected'
WebUI.callTestCase(findTestCase('Test Cases/Web Secondhand/Page/Product/verify update status product'), null, FailureHandling.STOP_ON_FAILURE)

'close browser'
WebUI.callTestCase(findTestCase('Test Cases/Web Secondhand/Page/General/close browser'), null, FailureHandling.STOP_ON_FAILURE)

