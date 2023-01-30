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

'click saya tertarik'
WebUI.click(findTestObject('Object Repository/erika_web/Page_Secondhand Store/button_Saya tertarik dan ingin nego'))

'input harga tawar'
WebUI.setText(findTestObject('erika_web/Page_Secondhand Store/input_Harga Tawar_form-control'), '290000')

'click button kirim'
WebUI.click(findTestObject('erika_web/Page_Secondhand Store/button_Kirim'))

'verify element berhasil'
WebUI.verifyElementPresent(findTestObject('erika_web/Page_Secondhand Store/div_Harga tawarmu berhasil dikirim ke penjual'), 
    0)

'verify element menunggu respon penjual'
WebUI.verifyElementPresent(findTestObject('erika_web/Page_Secondhand Store/div_Menunggu respon penjual'), 0)

