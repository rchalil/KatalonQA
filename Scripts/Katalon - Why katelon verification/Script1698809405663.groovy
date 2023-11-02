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

WebUI.navigateToUrl('https://katalon.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Katalon/Page_Katalon AI-augmented Software Quality _596167/button_Accept All Cookies'))

WebUI.click(findTestObject('Object Repository/Katalon/Page_Katalon AI-augmented Software Quality _596167/div_Why Katalon'))

WebUI.verifyElementText(findTestObject('Object Repository/Katalon/Page_Katalon AI-augmented Software Quality _596167/div_Easy, speed'), 
    'Easy, speed')

WebUI.verifyElementText(findTestObject('Object Repository/Katalon/Page_Katalon AI-augmented Software Quality _596167/div_Flexibility, Scalability'), 
    'Flexibility, Scalability')

WebUI.verifyElementPresent(findTestObject('Object Repository/Katalon/Page_Katalon AI-augmented Software Quality _596167/div_Visibility'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Katalon/Page_Katalon AI-augmented Software Quality _596167/div_Innovation  AI'), 
    'Innovation & AI')

WebUI.verifyElementText(findTestObject('Object Repository/Katalon/Page_Katalon AI-augmented Software Quality _596167/div_Low cost, high ROI'), 
    'Low cost, high ROI')

WebUI.closeBrowser()

