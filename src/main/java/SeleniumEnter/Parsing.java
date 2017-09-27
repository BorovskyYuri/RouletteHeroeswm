package SeleniumEnter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Borovsky on 27.09.2017.
 */
public class Parsing {
    List<Integer> dozen = new ArrayList<>();

    public void parsing(){
        HtmlUnitDriver driver = new HtmlUnitDriver();
        driver.get("http://www.heroeswm.ru/allroul.php");
        //parsing HTML
        List<Integer> list = new ArrayList<>();
        for (int i =0; i<4; i++) {
            List<WebElement> webElements = driver.findElements(By.cssSelector("html body center table tbody tr td table tbody tr td a"));
            webElements.get(i).click();
            WebElement element;
            element = driver.findElement(By.cssSelector("html body center table tbody tr td div u font b"));
            System.out.println(element.getText().toString());
            list.add(Integer.parseInt(element.getText().toString()));
            driver.get("http://www.heroeswm.ru/allroul.php");
        }
        for (int i = 0; i < 4; i++) {
            if ((list.get(i) < 13) && (list.get(i) > 0)) {
                dozen.add(1);
            } else {
                if ((list.get(i) > 12) && (list.get(i) < 25)) {
                    dozen.add(2);
                } else {
                    if ((list.get(i)) > 24) {
                        dozen.add(3);
                    } else {
                        System.out.println("Not now");
                    }
                }
            }
        }
    }

    public List<Integer> getDozen() {
        return dozen;
    }
}
