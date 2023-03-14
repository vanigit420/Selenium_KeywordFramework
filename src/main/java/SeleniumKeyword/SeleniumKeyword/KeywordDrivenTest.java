package SeleniumKeyword.SeleniumKeyword;

public class KeywordDrivenTest {
	
	public static void main(String[] args) {
		ReadExcelSheetData rs = new ReadExcelSheetData();
		rs.DemoFile(4);
		KeywordActions ka = new KeywordActions();
		ka.openBrowser();
		ka.navigateToURL();
		ka.enterEmail();
		ka.emailPassword();
		ka.clickForgettonPassword();
		ka.closeBrowser();
		System.out.println("Test Case Executed Successfully for Facebook page");
	}

}
