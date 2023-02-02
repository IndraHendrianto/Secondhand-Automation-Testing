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
String productName = faker.commerce().productName();
String productPrice = faker.options().option('10000', '20000', '30000', '40000', '50000');
String cityName = faker.address().cityName();
String productDesc = faker.lorem().sentence();

'change nama produk'
Mobile.setText(findTestObject('Object Repository/shidqi_mobile app secondhand/produk/namaProduk'), productName, 0)

'change harga produk'
Mobile.setText(findTestObject('Object Repository/shidqi_mobile app secondhand/produk/hargaProduk'), productPrice, 0)

'change lokasi produk'
Mobile.setText(findTestObject('Object Repository/shidqi_mobile app secondhand/produk/lokasiProduk'), cityName, 0)

'change deskripsi produk'
Mobile.setText(findTestObject('Object Repository/shidqi_mobile app secondhand/produk/deskripsiProduk'), productDesc, 0)
