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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www2.deloitte.com/us/en.html')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Deloitte/Page_Deloitte US  Audit, Consulting, Adviso_ec7ae4/button_Accept and close'))

WebUI.click(findTestObject('Object Repository/Deloitte/Page_Deloitte US  Audit, Consulting, Adviso_ec7ae4/i_icon-search'))

WebUI.click(findTestObject('Object Repository/Deloitte/Page_Deloitte US  Audit, Consulting, Adviso_ec7ae4/a_Experienced Professionals'))

WebUI.click(findTestObject('Object Repository/Deloitte/Page_Experienced Hires  Deloitte US/a_Search roles for experienced hires'))

WebUI.click(findTestObject('Object Repository/Deloitte/Page_Job Search  Deloitte US/input_search'))

WebUI.click(findTestObject('Object Repository/Deloitte/Page_Job Search  Deloitte US/span_select2-selection select2-selection--m_c168f5'))

WebUI.click(findTestObject('Object Repository/Deloitte/Page_Job Search  Deloitte US/li_Aguascalientes'))

WebUI.click(findTestObject('Object Repository/Deloitte/Page_Job Search  Deloitte US/span_select2-selection select2-selection--m_af5ac6'))

WebUI.click(findTestObject('Object Repository/Deloitte/Page_Job Search  Deloitte US/li_Aguascalientes_1'))

WebUI.click(findTestObject('Object Repository/Deloitte/Page_Job Search  Deloitte US/span_select2-selection select2-selection--m_27cdb3'))

WebUI.click(findTestObject('Object Repository/Deloitte/Page_Job Search  Deloitte US/li_Consulting'))

WebUI.click(findTestObject('Object Repository/Deloitte/Page_Job Search  Deloitte US/button_Search'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Deloitte/Page_Job Search  Deloitte US/div_3 jobs                                 _be6295'), 
    0)

WebUI.closeBrowser()

