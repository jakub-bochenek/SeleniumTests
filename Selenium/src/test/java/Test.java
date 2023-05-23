import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    ChromeDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/jakubbochenek/Downloads/chromedriver_mac64/chromedriver");
        driver = new ChromeDriver();
    }


    @org.junit.Test
    public void testHomepageLoads() {
        driver.get("https://www.ceneo.pl");
        Assert.assertTrue(driver != null);
    }
    @org.junit.Test
    public void checkTitle(){
        driver.get("https://www.ceneo.pl");
        String pageTitle = driver.getTitle();
        Assert.assertTrue(pageTitle.contains("Ceneo"));
    }
    @org.junit.Test
    public void acceptedCookies(){
        try{
            driver.get("https://www.ceneo.pl");
            WebElement button = driver.findElement(By.xpath("//*[@id=\"js_cookie-monster\"]/div/div/p/button"));
            button.click();
            Assert.assertTrue(true);
        }
        catch (Exception e){
            Assert.fail("Wystąpił błąd: " + e.getMessage());
        }

    }

    @org.junit.Test
    public void clickElement(){
        try{
            driver.get("https://www.ceneo.pl");

            WebElement button = driver.findElement(By.xpath("//*[@id=\"js_cookie-monster\"]/div/div/p/button"));
            button.click();

            button = driver.findElement(By.xpath("/html/body/div[2]/div[4]/button"));
            button.click();
            Assert.assertTrue(true);
        }
        catch (Exception e){
            Assert.fail("Wystąpił błąd: " + e.getMessage());
        }

    }

    @org.junit.Test
    public void findingSearchBar() {
        driver.get("https://www.ceneo.pl");

        WebElement button = driver.findElement(By.xpath("//*[@id=\"js_cookie-monster\"]/div/div/p/button"));
        button.click();
        try {
            WebElement searchInput = driver.findElement(By.id("form-head-search-q"));
            Assert.assertTrue(true);
        }
        catch (Exception e){
            Assert.fail("Wystąpił błąd: " + e.getMessage());
        }
    }

        @org.junit.Test
    public void searchSomthing() {
        driver.get("https://www.ceneo.pl");

        WebElement button = driver.findElement(By.xpath("//*[@id=\"js_cookie-monster\"]/div/div/p/button"));
        button.click();
        WebElement searchInput = driver.findElement(By.id("form-head-search-q"));
        Assert.assertTrue(true);
        try {
            searchInput.sendKeys("rower");
            searchInput.sendKeys(Keys.ENTER);
        }
        catch (Exception e){
            Assert.fail("Wystąpił błąd: " + e.getMessage());
        }
    }

    @org.junit.Test
    public void pageDown() {

        driver.get("https://www.ceneo.pl");
        try {
            driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
            Assert.assertTrue(true);
        } catch (Exception e) {
            Assert.fail("Wystąpił błąd: " + e.getMessage());
        }

    }
    @org.junit.Test
    public void checkImg() {
        driver.get("https://www.ceneo.pl");
        try {
            WebElement image = driver.findElement(By.tagName("img"));
            Assert.assertTrue(true);
        } catch (Exception e) {
            Assert.fail("Wystąpił błąd: " + e.getMessage());
        }
    }
    @org.junit.Test
    public void checkBucket() {
        driver.get("https://www.ceneo.pl");
        WebElement button = driver.findElement(By.xpath("//*[@id=\"js_cookie-monster\"]/div/div/p/button"));
        button.click();

        try {
            WebElement helpLink1 = driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div[3]/div[1]/a/span"));
            helpLink1.click();
            Assert.assertTrue(true);
        } catch (Exception e) {
            Assert.fail("Wystąpił błąd: " + e.getMessage());
        }
    }


        @org.junit.Test
    public void checkCategory(){
        driver.get("https://www.ceneo.pl");
        WebElement button = driver.findElement(By.xpath("//*[@id=\"js_cookie-monster\"]/div/div/p/button"));
        button.click();

        try {
            WebElement helpLink1 = driver.findElement(By.xpath("//*[@id=\"body\"]/div[2]/div[1]/div/div[1]/nav/div[2]/div[4]/a"));
            helpLink1.click();
            Assert.assertTrue(true);
        } catch (Exception e) {
            Assert.fail("Wystąpił błąd: " + e.getMessage());
        }
    }
    @org.junit.Test
    public void checkLogin() {
        driver.get("https://www.ceneo.pl");
        WebElement button = driver.findElement(By.xpath("//*[@id=\"js_cookie-monster\"]/div/div/p/button"));
        button.click();
        try {

            WebElement loginButton = driver.findElement(By.cssSelector("body > div.page-body.theme__bg--primary.js_popupContainer > header > div.layout-wrapper.header__wrapper > div.header__user > div.my-account > a > span"));
            loginButton.click();
            WebElement emailField = driver.findElement(By.cssSelector("#username"));
            emailField.sendKeys("example@example.com");
            WebElement passwordField = driver.findElement(By.cssSelector("#current-password"));
            passwordField.sendKeys("password123");
            WebElement submitButton = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div/form/div[3]/input"));
            submitButton.click();
            Assert.assertTrue(true);
        } catch (Exception e) {
            Assert.fail("Wystąpił błąd: " + e.getMessage());
        }

    }

    @org.junit.Test
    public void changeSizeOfWindow(){
        try {
            Dimension newSize = new Dimension(1200, 800);
            driver.manage().window().setSize(newSize);
            Assert.assertTrue(true);
        }
        catch(Exception e){
            Assert.fail("Wystąpił błąd: " + e.getMessage());
        }
    }
        @org.junit.Test
    public void exitComercial(){
            driver.get("https://www.ceneo.pl");

            WebElement button = driver.findElement(By.xpath("//*[@id=\"js_cookie-monster\"]/div/div/p/button"));
            button.click();

            try {
             button = driver.findElement(By.xpath("//*[@id=\"top-banner__close\"]/div"));
            button.click();
            Assert.assertTrue(true);
        }
        catch(Exception e){
            Assert.fail("Wystąpił błąd: " + e.getMessage());
        }
    }

    @org.junit.Test
    public void checkLabelFavourite() {
        driver.get("https://www.ceneo.pl");
        WebElement button = driver.findElement(By.xpath("//*[@id=\"js_cookie-monster\"]/div/div/p/button"));
        button.click();
        try {
            button = driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div[3]/div[2]/a/span"));
            button.click();
            WebElement newEl = null;
            newEl = driver.findElement(By.xpath("//*[@id=\"clipboard\"]/div/div/div[2]/div/ol/li[1]/div/span"));
            Assert.assertNotNull(newEl);
        } catch (Exception e) {
            Assert.fail("Wystąpił błąd: " + e.getMessage());
        }

    }
    @org.junit.Test
    public void displayFullComercial(){
        driver.get("https://www.ceneo.pl");
        WebElement button = driver.findElement(By.xpath("//*[@id=\"js_cookie-monster\"]/div/div/p/button"));
        button.click();
        try {
            button = driver.findElement(By.xpath("//*[@id=\"top-banner__extend\"]/div"));
            button.click();
            Assert.assertTrue(true);
        } catch (Exception e) {
            Assert.fail("Wystąpił błąd: " + e.getMessage());
        }
    }
    @org.junit.Test
    public void checkComebackToMainPage(){
        driver.get("https://www.ceneo.pl");
        WebElement button = driver.findElement(By.xpath("//*[@id=\"body\"]/div[2]/div[1]/div/div[1]/nav/div[2]/div[1]/a"));
        button.click();
        try {
            button = driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[1]/a/img"));
            button.click();

            Assert.assertTrue(true);
        }
        catch (Exception e){
            Assert.fail("Wystąpił błąd: " + e.getMessage());
        }
    }

    @org.junit.Test
    public void checkAnotherCategory(){

        driver.get("https://www.ceneo.pl");
        WebElement button = driver.findElement(By.xpath("//*[@id=\"js_cookie-monster\"]/div/div/p/button"));
        button.click();
        try {

            button = driver.findElement(By.xpath("//*[@id=\"body\"]/div[2]/div[1]/div/div[1]/nav/div[2]/div[13]/a"));
            button.click();
            Assert.assertTrue(true);


        }
        catch (Exception e){
            Assert.fail("Wystąpił błąd: " + e.getMessage());
        }

    }

    @org.junit.Test
    public void checkRedirectionToComercial() {

        driver.get("https://www.ceneo.pl");
        WebElement button = driver.findElement(By.xpath("//*[@id=\"js_cookie-monster\"]/div/div/p/button"));
        button.click();
        try {

            button = driver.findElement(By.xpath("//*[@id=\"body\"]/div[2]/div[1]/div/div[2]/div[3]/a"));
            button.click();
            Assert.assertTrue(true);


        } catch (Exception e) {
            Assert.fail("Wystąpił błąd: " + e.getMessage());
        }
    }
@org.junit.Test
public void checkOttherNotDisplayedCategories() {

    driver.get("https://www.ceneo.pl");
    WebElement button = driver.findElement(By.xpath("//*[@id=\"js_cookie-monster\"]/div/div/p/button"));
    button.click();
    try {

        button = driver.findElement(By.xpath("//*[@id=\"body\"]/div[2]/div[1]/div/div[1]/nav/div[1]/div[2]"));
        button.click();
        Assert.assertTrue(true);


    } catch (Exception e) {
        Assert.fail("Wystąpił błąd: " + e.getMessage());
    }
}

    @org.junit.Test
    public void checkQuit() {

        driver.get("https://www.ceneo.pl");

        try {

            driver.quit();
            Assert.assertTrue(true);


        } catch (Exception e) {
            Assert.fail("Wystąpił błąd: " + e.getMessage());
        }
    }
    @After
    public void tearDown() {
        driver.quit();
    }
}
