import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import internal.GlobalVariable as GlobalVariable
import groovy.json.JsonOutput as JsonOutput
import groovy.json.JsonSlurper as JsonSlurper
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

WS.sendRequest(findTestObject('GET/GET Single User'))

WS.sendRequest(findTestObject('POST/POST Register Successful'))

response = WS.sendRequestAndVerify(findTestObject('POST/POST Register Successful'))

WS.verifyResponseStatusCode(response, 200)

