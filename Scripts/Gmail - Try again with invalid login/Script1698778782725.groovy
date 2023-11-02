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

WebUI.navigateToUrl('https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=AVQVeywjvDYoN5FDADVUpdLkv_4Dss1DZHwOFdZCBX9CuM3ITel-sS3Srk5PAoPo89chcvj7pJ2Kng&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S218891431%3A1698778883803894&theme=glif#inbox')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Gmail/Page_Gmail/input_identifier'), 'abcxyz')

WebUI.click(findTestObject('Object Repository/Gmail/Page_Gmail/span_Next'))

WebUI.click(findTestObject('Object Repository/Gmail/Page_Gmail/a_WpHeLc VfPpkd-mRLv6 VfPpkd-RLmnJb'))

WebUI.setText(findTestObject('Object Repository/Gmail/Page_Gmail/input_identifier'), 'abcxyz')

WebUI.click(findTestObject('Object Repository/Gmail/Page_Gmail/span_Next'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Gmail/Page_Gmail/a_WpHeLc VfPpkd-mRLv6 VfPpkd-RLmnJb_1'), 0)

WebUI.closeBrowser()

