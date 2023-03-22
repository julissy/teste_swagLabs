package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Utils {

    public static WebDriver driver;
     public static void acessarSistema() {
         //Uso caso dê problema para acessar o navegador, passar o options como parametro no new ChromeDriver()
         //ChromeOptions options = new ChromeOptions();
         //options.addArguments("--remote-allow-origins=*");

         System.setProperty("webdriver.chrome.driver", "C:\\Webdrivers\\chromedrive\\111\\chromedriver.exe");
         driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

         driver.get("https://www.saucedemo.com/");
     }

     public static void finalizarAcesso() {
         driver.quit();
     }
}