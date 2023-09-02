package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    private static WebDriver driver;
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        //Para abrir el navegador
        driver = new ChromeDriver();

        //Abrir la pagina
        driver.get("https://platzi.com/new-home/");

        //Ejecutar la prueba
        driver.manage().window().maximize();
    }
}