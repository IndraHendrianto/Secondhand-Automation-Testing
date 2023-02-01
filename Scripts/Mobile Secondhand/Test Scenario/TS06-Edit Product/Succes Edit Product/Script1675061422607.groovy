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

Mobile.tap(findTestObject('Object Repository/Rafi_mobile app secondhand/android.widget.TextView - Daftar Jual Saya'), 0)

Mobile.tap(findTestObject('Object Repository/Rafi_mobile app secondhand/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/Rafi_mobile app secondhand/Edit Product/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Rafi_mobile app secondhand/Edit Product/android.widget.Button'), 0)

Mobile.tap(findTestObject('Object Repository/Rafi_mobile app secondhand/Edit Product/Camera/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Rafi_mobile app secondhand/Edit Product/Camera/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/Rafi_mobile app secondhand/android.widget.Button - Perbarui Produk'), 0)

Mobile.callTestCase(findTestCase('Test Cases/Mobile Secondhand/Test Scenario/TS06-Edit Product/verify toast Succes Edit Product'), null, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

