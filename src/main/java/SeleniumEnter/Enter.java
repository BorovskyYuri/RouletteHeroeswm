package SeleniumEnter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

/**
 * Created by Borovsky on 27.09.2017.
 */

public class Enter {
    private String login;
    private String password;
    private String dozen;
    private String dozen1src = "//img[@src='http://dcdn3.heroeswm.ru/i/1st12.gif']";
    private String dozen2scr = "//img[@src='http://dcdn2.heroeswm.ru/i/2nd12.gif']";
    private String dozen3src = "//img[@src='http://dcdn1.heroeswm.ru/i/3rd12.gif']";
    private String URLRoulette = "http://www.heroeswm.ru/roulette.php";
    WebDriver driver;


    public void enterDozen1() {

        driver.get(URLRoulette);
        WebElement dozen2 = driver.findElement(By.xpath(dozen2scr));
        dozen2.click();
        WebElement enter = driver.findElement(By.tagName("input"));
        enter.sendKeys("200");
        enter.submit();
        driver.get(URLRoulette);
        WebElement dozen3 = driver.findElement(By.xpath(dozen3src));
        dozen3.click();
        WebElement enter1 = driver.findElement(By.tagName("input"));
        enter1.sendKeys("500");
        enter1.submit();
    }

    public void enterDozen2() {
        System.out.println("2st Dozen");
        driver.get(URLRoulette);
        WebElement dozen3 = driver.findElement(By.xpath(dozen3src));
        dozen3.click();
        WebElement enter = driver.findElement(By.tagName("input"));
        enter.sendKeys("500");
        enter.submit();
        driver.get(URLRoulette);
        WebElement dozen1 = driver.findElement(By.xpath(dozen1src));
        dozen1.click();
        WebElement enter1 = driver.findElement(By.tagName("input"));
        enter1.sendKeys("500");
        enter1.submit();
    }

    public void enterDozen3() {
        System.out.println("2st Dozen");
        driver.get(URLRoulette);
        WebElement dozen1 = driver.findElement(By.xpath(dozen1src));
        dozen1.click();
        WebElement enter = driver.findElement(By.tagName("input"));
        enter.sendKeys("500");
        enter.submit();
        driver.get(URLRoulette);
        WebElement dozen2 = driver.findElement(By.xpath(dozen2scr));
        dozen2.click();
        WebElement enter1 = driver.findElement(By.tagName("input"));
        enter1.sendKeys("500");
        enter1.submit();
    }

    public Enter(String dozen) {
        this.dozen = dozen;
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
        // Open URL
        driver.get("http://www.heroeswm.ru/");
        // Find element with attribute for login
        WebElement element = driver.findElement(By.name("login"));
        // Input login
        element.sendKeys(getLogin());
        // Find element with attribute for password
        WebElement element1 = driver.findElement(By.name("pass"));
        //Input password
        element1.sendKeys(getPassword());
        // Send form
        element.submit();

        if (dozen.toString().equals("dozen1")) {
            enterDozen1();
        }
        if (dozen.toString().equals("dozen2")) {
            enterDozen2();
        }
        if (dozen.toString().equals("dozen3")) {
            enterDozen3();
        }
    }


    public String getLogin() {
        return "JpG";
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return "Klkl6699";
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Enter enter = (Enter) o;

        return dozen != null ? dozen.equals(enter.dozen) : enter.dozen == null;
    }

    public WebDriver getDriver() {
        return driver;
    }
}
