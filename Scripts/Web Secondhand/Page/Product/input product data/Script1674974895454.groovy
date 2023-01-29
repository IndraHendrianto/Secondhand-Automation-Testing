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
String categoryOpsi = faker.options().option('1', '2', '3', '4', '5');
String productDesc = faker.lorem().sentence();

'input nama produk'
WebUI.setText(findTestObject('shidqi_web app secondhand/Product/Page_Secondhand Store/input_Nama Produk_nm_produk'), productName)

'input harga produk'
WebUI.setText(findTestObject('shidqi_web app secondhand/Product/Page_Secondhand Store/input_Harga Produk_harga_produk'),
	productPrice)

'select kategori produk'
WebUI.selectOptionByValue(findTestObject('shidqi_web app secondhand/Product/Page_Secondhand Store/select_Pilih KategoriHobyKendaraanBajuElektronikKesehatan'),
	categoryOpsi, false)

'input deskripsi produk'
WebUI.setText(findTestObject('shidqi_web app secondhand/Product/Page_Secondhand Store/textarea_Deskripsi_deskripsi'), productDesc)
