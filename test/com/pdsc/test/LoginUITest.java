package com.pdsc.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class LoginUITest {

    private WebDriver driver;

    @Before
    public void setUp() {
        // Configurar o caminho para o ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:/Users/david/Downloads/Selenium/CHROME/chromedriver-win64/chromedriver.exe");

        // Inicializar o WebDriver
        driver = new ChromeDriver();
    }

    @After
    public void tearDown() {
        // Fechar o navegador
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testRegistrarUsuarioDadosValidos() throws InterruptedException {
        // Navegar para a página de login
        driver.get("http://localhost:8080/CampusResolve/faces/login.xhtml");

        // Adicionar delay para visualização
        Thread.sleep(2000); // Espera por 2 segundos

        // Preencher os campos de login
        driver.findElement(By.id("input_j_idt6:j_idt7:j_idt10")).sendKeys("12345");
        Thread.sleep(1000); // Espera por 1 segundo

        driver.findElement(By.id("input_j_idt6:j_idt7:j_idt12")).sendKeys("Testeifpe2*");
        Thread.sleep(1000); // Espera por 1 segundo

        // Clicar no botão de login
        driver.findElement(By.id("j_idt6:j_idt7:j_idt13")).click();
        Thread.sleep(2000); // Espera por 2 segundos

        // Verificar se o login foi bem-sucedido verificando o conteúdo da página
        WebElement spanElement = driver.findElement(By.tagName("span"));
        String pageContent = spanElement.getText();
        assertTrue(pageContent.contains("Primefaces welcome page"));
    }
}
