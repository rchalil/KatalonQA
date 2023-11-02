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

WebUI.verifyElementVisible(findTestObject('Object Repository/Katalon/Page_Katalon AI-augmented Software Quality _596167/a_Learn more'))

WebUI.click(findTestObject('Object Repository/Katalon/Page_Katalon AI-augmented Software Quality _596167/a_Learn more'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Katalon/Page_Katalon Studio 9.0.0 Performance Boost_5d349a/div_TABLE OF CONTENTS'), 
    0)

WebUI.click(findTestObject('Object Repository/Katalon/Page_Katalon Studio 9.0.0 Performance Boost_5d349a/a_Key performance improvements in Katalon S_185eed'))

WebUI.rightClick(findTestObject('Object Repository/Katalon/Page_Katalon Studio 9.0.0 Performance Boost_5d349a/strong_Key performance improvements in Kata_e75e1d'))

WebUI.click(findTestObject('Object Repository/Katalon/Page_Katalon Studio 9.0.0 Performance Boost_5d349a/strong_Key performance improvements in Kata_e75e1d'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Katalon/Page_Katalon Studio 9.0.0 Performance Boost_5d349a/strong_Key performance improvements in Kata_e75e1d'))

WebUI.closeBrowser()

