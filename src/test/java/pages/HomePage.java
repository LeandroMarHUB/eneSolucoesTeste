package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }



    public void acessarSite(){
        driver.get ("https://www.amazon.com.br/");
        driver.manage().window().maximize();
    }

    public void pesquisarProduto(){
        driver.findElement(By.id("twotabsearchtextbox")).click();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Fone sem fio");
        driver.findElement(By.id("nav-search-submit-button")).click();
    }

    public void produtoEscolhido(){

        driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/div/div/div/div/div[2]/div[1]/h2/a/span")).click();
    }

    public void botao(){
        driver.findElement(By.id("add-to-cart-button")).click();
    }
}
