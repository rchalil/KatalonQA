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

WebUI.click(findTestObject('Object Repository/Page_Deloitte US  Audit, Consulting, Adviso_ec7ae4/button_Accept and close'))

WebUI.click(findTestObject('Object Repository/Page_Deloitte US  Audit, Consulting, Adviso_ec7ae4/a_Services'))

WebUI.click(findTestObject('Object Repository/Page_Deloitte US  Audit, Consulting, Adviso_ec7ae4/a_Services'))

WebUI.click(findTestObject('Object Repository/Page_Deloitte US  Audit, Consulting, Adviso_ec7ae4/a_Consulting'))

WebUI.click(findTestObject('Object Repository/Page_Management Consulting Services and Sol_cbb449/h1_Consulting'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Management Consulting Services and Sol_cbb449/h1_Consulting'), 
    0)

WebUI.closeBrowser()

