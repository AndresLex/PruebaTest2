package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test2 {
    //se declara el Wbdriver como varible privada
    private static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        //Para abrir el navegador
        driver = new ChromeDriver();

        //Abrir la pagina
        driver.get("https://www.saucedemo.com/v1/");

        driver.manage().window().maximize();

        //Ejecutar la prueba

        // Varibles para loguearse
        String usuario = "standard_user";
        String contrasena = "secret_sauce";

        // Localizar elementos por ID
        WebElement usuarioEntrada = driver.findElement(By.id("user-name"));

        //Localizar elemento por name
        WebElement contrasenaEntrada = driver.findElement(By.name("password"));


        //localizado por Xpath
        WebElement btningresar = driver.findElement(By.xpath("//input[@id='login-button']"));

        //Hacer Login
        usuarioEntrada.sendKeys(usuario);
        contrasenaEntrada.sendKeys(contrasena);
        btningresar.click();

        //Hacer clic en boton addcompra
        WebElement btnCompra = driver.findElement(By.xpath("//div[@class='inventory_list']/div[1]//button[@class='btn_primary btn_inventory']"));

        btnCompra.click();

        //Hacer clic en btn carrocompra
        WebElement btnCarrito = driver.findElement(By.xpath("//span[@class='fa-layers-counter shopping_cart_badge']"));

        btnCarrito.click();

        //Hacer clic en checkout
        WebElement btnCheckout = driver.findElement(By.xpath("//a[.='CHECKOUT']"));

        btnCheckout.click();

        //LLenado de datos del formulario
        String nombre = "Andres";
        String apellido = "Ccccc";
        String direccion = "Zipaquistan";

        //localizar el input de nombre
        WebElement inputNombre = driver.findElement(By.xpath("//input[@id='first-name']"));
        inputNombre.sendKeys(nombre);

        //innput de apellido
        WebElement inputApellido = driver.findElement(By.xpath("//input[@id='last-name']"));
        inputApellido.sendKeys(apellido);

        //input de ciudad
        WebElement inputZip = driver.findElement(By.xpath("//input[@id='postal-code']"));
        inputZip.sendKeys(direccion);

        //Dar clic en btn continue
        WebElement btnContinue = driver.findElement(By.xpath("//input[@class='btn_primary cart_button']"));
        btnContinue.click();

        //Se localizar el elemento al cual quero moverme
        WebElement footer = driver.findElement(By.tagName("footer"));

        // Crea una instancia de la clase Actions que permite realizar acciones complejas como scroll
        // Se le pasa el objeto driver como parametro para indicar sobre qué navegador o ventana se realizarán las acciones
        Actions actions = new Actions(driver);

        // Hacer scroll hasta el elemento del pie de página para desplazarse a él
        actions.moveToElement(footer).perform();

        //Dar clic en btn finish
        WebElement btnFinish = driver.findElement(By.xpath("//a[.='FINISH']"));
        btnFinish.click();

        //Hacer scroll al footer
        WebElement footer2 = driver.findElement(By.xpath("//footer[@class='footer']"));
        actions.moveToElement(footer2).perform();

        //Hacer scroll arriba
        WebElement nav = driver.findElement(By.xpath("//div[@class='app_logo']"));
        actions.moveToElement(nav).perform();

        //driver.quit();

    }
}