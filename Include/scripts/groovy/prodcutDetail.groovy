import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import io.cucumber.datatable.DataTable


class prodcutDetail {
	private DataTable table

	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("주어진 상품 정보를 사용한다")
	def I_want_to_write_a_step_with_name(DataTable table) {
		this.table = table;
		println "DataTable : "
		println table
	}

	@When("브라우저를 오픈한다")
	def I_check_for_the_value_in_step() {
		WebUI.openBrowser('')
	}

	@Then("상품 정보가 일치하는지 확인한다")
	def I_verify_the_status_in_step() {
		List<Map> list = table.asMaps();
		for (Map map : list) {
			String productNo = map.get("productNo");
			String productName = map.get("productName");
			String category = map.get("category");
			String price = map.get("price");

			String url = "https://www.discovery-expedition.com/goods/"+category+"/"+productNo;
			WebUI.navigateToUrl(url)

			WebUI.verifyElementText(findTestObject('Object Repository/Page_Discovery Expedition/productName'), productName)
			WebUI.verifyElementText(findTestObject('Object Repository/Page_Discovery Expedition/price'), price+"원")
		}

		WebUI.closeBrowser()
	}

	@When("상품상세  (.*) (.*) 로 이동한다")
	def I_check_for_the_value_in_step2(String category, String productNo) {
		String url = "https://www.discovery-expedition.com/goods/"+category+"/"+productNo;
		WebUI.navigateToUrl(url)
	}

	@Then("상품명 (.*), 가격 (.*) 을 검증한다")
	def I_verify_the_status_in_step2(String productName, String price) {
		WebUI.verifyElementText(findTestObject('Object Repository/Page_Discovery Expedition/productName'), productName)
		WebUI.verifyElementText(findTestObject('Object Repository/Page_Discovery Expedition/price'), price+"원")
	}
}