import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:8090/sampleBoardJsRender/')

WebUI.click(findTestObject('Object Repository/SampleBoardJsRender/Page_Sample Board/p_0'))

WebUI.verifyElementText(findTestObject('SampleBoardJsRender/Page_Sample Board/p_0'), '1')

WebUI.setText(findTestObject('Object Repository/SampleBoardJsRender/Page_Sample Board/input_subject'), 'test')

WebUI.setText(findTestObject('Object Repository/SampleBoardJsRender/Page_Sample Board/input_userName'), 'tester')

WebUI.setText(findTestObject('Object Repository/SampleBoardJsRender/Page_Sample Board/textarea_content'), 'test content')

WebUI.click(findTestObject('Object Repository/SampleBoardJsRender/Page_Sample Board/input_btnInsert'))

WebUI.click(findTestObject('Object Repository/SampleBoardJsRender/Page_Sample Board/p_1'))

WebUI.click(findTestObject('Object Repository/SampleBoardJsRender/Page_Sample Board/a_test'))

WebUI.click(findTestObject('Object Repository/SampleBoardJsRender/Page_Sample Board/input_btnList'))

WebUI.click(findTestObject('Object Repository/SampleBoardJsRender/Page_Sample Board/a_test'))

WebUI.setText(findTestObject('Object Repository/SampleBoardJsRender/Page_Sample Board/input_subject_1'), '[update]test')

WebUI.setText(findTestObject('Object Repository/SampleBoardJsRender/Page_Sample Board/input_userName_1'), 'u-tester')

WebUI.setText(findTestObject('Object Repository/SampleBoardJsRender/Page_Sample Board/textarea_test content'), 'test content\nupdated...')

WebUI.click(findTestObject('Object Repository/SampleBoardJsRender/Page_Sample Board/input_btnUpdate'))

WebUI.click(findTestObject('Object Repository/SampleBoardJsRender/Page_Sample Board/input_btnList'))

WebUI.click(findTestObject('Object Repository/SampleBoardJsRender/Page_Sample Board/td_u-tester'))

WebUI.click(findTestObject('Object Repository/SampleBoardJsRender/Page_Sample Board/td_test contentupdated...'))

WebUI.click(findTestObject('Object Repository/SampleBoardJsRender/Page_Sample Board/a_updatetest'))

WebUI.click(findTestObject('Object Repository/SampleBoardJsRender/Page_Sample Board/input_btnRemove'))

WebUI.click(findTestObject('Object Repository/SampleBoardJsRender/Page_Sample Board/p_0'))

WebUI.closeBrowser()

