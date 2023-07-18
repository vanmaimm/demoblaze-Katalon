package login

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class Login {
	@Keyword
	def static void loginIntoApplication(){

		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.navigateToUrl(GlobalVariable.G_URL)
		WebUI.click(findTestObject('Object Repository/Page_STORE/a_Log in'))
		WebUI.setText(findTestObject('Object Repository/Page_STORE/input_Username_loginusername'), 'testwithkatalon')
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_STORE/input_Password_loginpassword'), 'P9ET2sDE0SE=')
		WebUI.click(findTestObject('Object Repository/Page_STORE/button_Log in'))
	}
	@Keyword
	def static void loginIntoApplicationWithGlobalVariable(){
		loginIntoApplication()
	}
}
