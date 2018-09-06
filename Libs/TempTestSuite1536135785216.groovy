import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/sampleBoardInsertTS')

suiteProperties.put('name', 'sampleBoardInsertTS')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())



RunConfiguration.setExecutionSettingFile("D:\\Develop\\workspace-katalon\\sampleTest\\Reports\\sampleBoardInsertTS\\20180905_172305\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/sampleBoardInsertTS', suiteProperties, [new TestCaseBinding('Test Cases/SampleBoardInsert - Iteration 1', 'Test Cases/SampleBoardInsert',  [ 'i_content' : 'test content 1' , 'i_subject' : 'test1' , 'i_userName' : 'tester1' ,  ]), new TestCaseBinding('Test Cases/SampleBoardInsert - Iteration 2', 'Test Cases/SampleBoardInsert',  [ 'i_content' : 'test content 2' , 'i_subject' : 'test2' , 'i_userName' : 'tester2' ,  ]), new TestCaseBinding('Test Cases/SampleBoardInsert - Iteration 3', 'Test Cases/SampleBoardInsert',  [ 'i_content' : 'test content 3' , 'i_subject' : 'test3' , 'i_userName' : 'tester1' ,  ]), new TestCaseBinding('Test Cases/SampleBoardInsert - Iteration 4', 'Test Cases/SampleBoardInsert',  [ 'i_content' : 'test content 4' , 'i_subject' : 'test4' , 'i_userName' : 'tester2' ,  ]), new TestCaseBinding('Test Cases/SampleBoardInsert - Iteration 5', 'Test Cases/SampleBoardInsert',  [ 'i_content' : 'test content 5' , 'i_subject' : 'test5' , 'i_userName' : 'tester2' ,  ])])
