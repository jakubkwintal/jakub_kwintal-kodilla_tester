//import com.kodilla.selenium.pages.GoogleSearch;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class TestGoogle {
//
//    WebDriver driver;
//
//    @Before
//    public void testSetup() {
//        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.navigate().to("http://www.google.com");
//    }
//
//    @After
//    public void tearDown() {
//        driver.close();
//    }
//
//    @Test
//    public void testGooglePage() {
//        GoogleSearch googleSearch = new GoogleSearch(driver);
//        googleSearch.searchResult();
//    }
//}
