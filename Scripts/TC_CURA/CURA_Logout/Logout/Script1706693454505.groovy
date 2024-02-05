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

WebUI.callTestCase(findTestCase('TC_CURA/CURA_History/History'), [('Hospital') : findTestData('CURA_BookingAppointment/Dropdown_list').getValue(
            1, 1), ('date') : findTestData('CURA_BookingAppointment/Date_Booking').getValue(1, 1), ('comment') : findTestData(
            'CURA_BookingAppointment/Comment').getValue(1, 1)], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('cura_healthcare_obj/Cura_Logout/Logout/i_CURA Healthcare_fa fa-bars'))

WebUI.click(findTestObject('cura_healthcare_obj/Cura_Logout/Logout/a_Logout'))

WebUI.verifyCheckpoint(findCheckpoint('Checkpoints/Checkpoints_Cura_Excel/Checkpoint_cura_all_ele'), true)

WebUI.closeBrowser()

