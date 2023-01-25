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

Mobile.callTestCase(findTestCase('Test Cases/Mobile Secondhand/Test Scenario/TS02-Login/TC.02.01-Success Login'), null, 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/mobile app secondhand/profil/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/mobile app secondhand/profil/android.widget.ImageView (1)'), 0)

Mobile.setText(findTestObject('mobile app secondhand/Profile/Field-Nama'), 'Tukang Tes', 0)

Mobile.tap(findTestObject('Object Repository/mobile app secondhand/profil/android.widget.Button - Simpan'), 0)

Mobile.tap(findTestObject('Object Repository/mobile app secondhand/profil/android.widget.ImageView (3)'), 0)

Mobile.setText(findTestObject('mobile app secondhand/Profile/Field-No Handphone'), '08632547623542', 0)

Mobile.tap(findTestObject('Object Repository/mobile app secondhand/profil/android.widget.Button - Simpan'), 0)

Mobile.tap(findTestObject('Object Repository/mobile app secondhand/profil/android.widget.ImageView (4)'), 0)

Mobile.setText(findTestObject('mobile app secondhand/Profile/Field-Kota'), 'Chicago', 0)

Mobile.tap(findTestObject('Object Repository/mobile app secondhand/profil/android.widget.Button - Simpan'), 0)

Mobile.tap(findTestObject('Object Repository/mobile app secondhand/profil/android.widget.ImageView (5)'), 0)

Mobile.setText(findTestObject('mobile app secondhand/Profile/Field-Alamat'), 'Jalan Budi Utomo', 0)

Mobile.tap(findTestObject('Object Repository/mobile app secondhand/profil/android.widget.Button - Simpan'), 0)

Mobile.closeApplication()

