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
import com.github.javafaker.Faker

Faker faker = new Faker(new Locale("in-ID"));
String streetAddress = faker.address().streetAddress();
String cityName = faker.address().cityName();
String fullName = faker.name().fullName();
String numberPhone = faker.phoneNumber().phoneNumber();

'input nama lengkap'
Mobile.setText(findTestObject('Object Repository/shidqi_mobile app secondhand/Register/register page/android.widget.EditText - Masukkan nama lengkap'),
	fullName, 0)

'input email'
Mobile.setText(findTestObject('Object Repository/shidqi_mobile app secondhand/Register/register page/android.widget.EditText - Masukkan email'),
	email, 0)

'input password'
Mobile.setEncryptedText(findTestObject('Object Repository/shidqi_mobile app secondhand/Register/register page/android.widget.EditText - Masukkan password'),
	'I+363Lgg2E89y9MaUC97eA==', 0)

'input nomor telepon'
Mobile.setText(findTestObject('Object Repository/shidqi_mobile app secondhand/Register/register page/android.widget.EditText - Contoh 08123456789'),
	numberPhone, 0)

'input kota'
Mobile.setText(findTestObject('Object Repository/shidqi_mobile app secondhand/Register/register page/android.widget.EditText - Masukkan kota'),
	cityName, 0)

'input alamat'
Mobile.setText(findTestObject('Object Repository/shidqi_mobile app secondhand/Register/register page/android.widget.EditText - Masukkan alamat'),
	streetAddress, 0)