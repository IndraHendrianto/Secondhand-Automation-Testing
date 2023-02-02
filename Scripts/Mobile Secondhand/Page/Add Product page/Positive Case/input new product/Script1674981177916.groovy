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

'input new product'
Mobile.setText(findTestObject('Object Repository/vera_mobile_secondhand/android.widget.EditText - Nama Produk (2)'), 'Teh Kotak',
	0)

Mobile.setText(findTestObject('Object Repository/vera_mobile_secondhand/android.widget.EditText - Rp 0,00 (2)'), '4500',
	0)

Mobile.tap(findTestObject('Object Repository/vera_mobile_secondhand/android.widget.Spinner - Pilih Kategori'), 0)

Mobile.tap(findTestObject('Object Repository/vera_mobile_secondhand/android.widget.TextView - Lokasi (1)'), 0)

Mobile.setText(findTestObject('Object Repository/vera_mobile_secondhand/android.widget.EditText - Lokasi Produk (2)'), 'Tangerang',
	0)

Mobile.setText(findTestObject('Object Repository/vera_mobile_secondhand/android.widget.EditText - Contoh Barang bagus mantap (2)'),
	'Teh kotak dalam botol', 0)