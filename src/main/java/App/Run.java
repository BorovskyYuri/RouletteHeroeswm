package App;


import LogicsRoulette.Logics;

/**
 * Created by Borovsky on 27.09.2017.
 */
public class Run {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Zver\\Desktop\\Java\\chromedriver.exe");
        Logics logics = new Logics();
        logics.logics();
    }
}
