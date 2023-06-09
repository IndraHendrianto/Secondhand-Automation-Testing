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
String fullName = faker.name().fullName();
String streetAddress = faker.address().streetAddress();
String numberPhone = faker.phoneNumber().phoneNumber();
String cityOpsi = faker.options().option('Bandung','Bogor', 'Jember', 'Kediri', 'Lumajang', 'Malang', 'Pasuruan', 'Probolinggo', 'Yogyakarta');

'input new nama'
WebUI.setText(findTestObject('shidqi_web app secondhand/Profile/Page_Secondhand Store/input_Nama'), fullName)

'select kota'
WebUI.selectOptionByValue(findTestObject('shidqi_web app secondhand/Profile/Page_Secondhand Store/select_kota'), cityOpsi, false)

'input new alamat'
WebUI.setText(findTestObject('shidqi_web app secondhand/Profile/Page_Secondhand Store/textarea_alamat'), streetAddress)

'input new no handphone'
WebUI.setText(findTestObject('shidqi_web app secondhand/Profile/Page_Secondhand Store/input_No.Handphone'), 'nomor salah')
