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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.zalando.pl/')

WebUI.click(findTestObject('Object Repository/Rejestracja-brak wypełnienia pola/Page_Buty i odzie online w ZALANDO. Moda z _477366/button_W porzdku'))

WebUI.click(findTestObject('Object Repository/Rejestracja-brak wypełnienia pola/Page_Buty i odzie online w ZALANDO. Moda z _477366/svg_Zaloguj si'))

WebUI.click(findTestObject('Object Repository/Rejestracja-brak wypełnienia pola/Page_Buty i odzie online w ZALANDO. Moda z _477366/span_Przejd dalej'))

WebUI.click(findTestObject('Object Repository/Rejestracja-brak wypełnienia pola/Page_Zaloguj si/input_Nazwisko lub firma cd._register.lastname'))



WebUI.setText(findTestObject('Object Repository/Rejestracja-brak wypełnienia pola/Page_Zaloguj si/input_Nazwisko lub firma cd._register.lastname_1'), 
   findTestData('dane').getValue(1, 1))


WebUI.setText(findTestObject('Object Repository/Rejestracja-brak wypełnienia pola/Page_Zaloguj si/input_Adres e-mail_register.email_1'), 
    findTestData('dane').getValue(2, 1))


WebUI.setText(findTestObject('Object Repository/Rejestracja-brak wypełnienia pola/Page_Zaloguj si/input_Haso_register.password_1'), 
    findTestData('dane').getValue(3, 1))

WebUI.click(findTestObject('Object Repository/Rejestracja-brak wypełnienia pola/Page_Zaloguj si/label_Brak preferencji'))

WebUI.click(findTestObject('Object Repository/Rejestracja-brak wypełnienia pola/Page_Zaloguj si/label_Tak, chc otrzymywa newsletter o trend_426ccf'))

WebUI.click(findTestObject('Object Repository/Rejestracja-brak wypełnienia pola/Page_Zaloguj si/span_Zarejestruj si'))

WebUI.click(findTestObject('Object Repository/Rejestracja-brak wypełnienia pola/Page_Zaloguj si/span_Pole obowizkowe'))

WebUI.verifyElementText(findTestObject('Rejestracja-brak wypełnienia pola/Page_Zaloguj si/span_Pole obowizkowe'), 'Pole obowiązkowe')

WebUI.closeBrowser()

