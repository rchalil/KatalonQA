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

WebUI.click(findTestObject('Object Repository/Katalon/Page_Katalon AI-augmented Software Quality _596167/div_Resources'))

WebUI.click(findTestObject('Object Repository/Katalon/Page_Katalon AI-augmented Software Quality _596167/div_Resources'))

WebUI.click(findTestObject('Object Repository/Katalon/Page_Katalon AI-augmented Software Quality _596167/div_Academy'))

WebUI.switchToWindowTitle('Katalon Academy - Automation Testing Courses to Level Up')

WebUI.click(findTestObject('Object Repository/Katalon/Page_Katalon Academy - Automation Testing C_4c4a56/button_Choose a course'))

WebUI.click(findTestObject('Object Repository/Katalon/Page_Katalon Academy - Automation Testing C_4c4a56/span_'))

WebUI.click(findTestObject('Object Repository/Katalon/Page_Katalon Academy - Automation Testing C_4c4a56/img'))

WebUI.setText(findTestObject('Object Repository/Katalon/Page_Katalon Academy - Automation Testing C_4c4a56/input_s'), 'test automation')

WebUI.sendKeys(findTestObject('Object Repository/Katalon/Page_Katalon Academy - Automation Testing C_4c4a56/input_s'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Katalon/Page_You searched for test automation - Kat_2262e6/a_Test Authoring With Katalon Handling Aler_e0066a'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Katalon/Page_Handling Alerts, Dialog Boxes, and Dro_d965ab/button_Enroll'), 
    0)

WebUI.closeBrowser()

