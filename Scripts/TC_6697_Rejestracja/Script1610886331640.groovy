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

WebUI.click(findTestObject('Rejestracja/Page_Buty i odzie online w ZALANDO. Moda z _477366/button_W porzdku'))

WebUI.click(findTestObject('Rejestracja/Page_Buty i odzie online w ZALANDO. Moda z _477366/svg_Zaloguj si'))

WebUI.click(findTestObject('Rejestracja/Page_Buty i odzie online w ZALANDO. Moda z _477366/button_Przejd dalej'))

WebUI.setText(findTestObject('Rejestracja/Page_Zaloguj si/input_Imi lub firma_register.firstname_1_2_3'), 'Jan')

WebUI.setText(findTestObject('Rejestracja/Page_Zaloguj si/input_Nazwisko lub firma cd._register.lastname_1_2_3'), 
    'Kowalski')

WebUI.setText(findTestObject('Rejestracja/Page_Zaloguj si/input_Adres e-mail_register.email_1'), 'janek33489@onet.pl')

WebUI.setEncryptedText(findTestObject('Rejestracja/Page_Zaloguj si/input_Haso_register.password_1'), 'cXWuCTem/JjgCmoI5LMfZQ==')

WebUI.click(findTestObject('Rejestracja/Page_Zaloguj si/label_Brak preferencji'))

WebUI.click(findTestObject('Rejestracja/Page_Zaloguj si/label_Tak, chc otrzymywa newsletter o trend_426ccf'))

WebUI.click(findTestObject('Rejestracja/Page_Zaloguj si/span_Zarejestruj si'))

WebUI.closeBrowser()

