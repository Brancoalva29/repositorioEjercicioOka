package com.bdd.page;

import com.ibm.icu.impl.Assert;
import net.serenitybdd.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.io.File;


@DefaultUrl("https://www.saucedemo.com/v1/index.html")


public class EjercicioPage extends PageObject {

    //Input de username
    @FindBy(xpath = "//input[@id='user-name']")
    private WebElement input_username;

    //Input de password
    @FindBy(xpath = "//input[@id='password']")
    private WebElement input_password;

    //Boton de Login
    @FindBy(xpath = "//input[@id='login-button']")
    private WebElement btn_login;

    //Label Producto
    @FindBy(xpath = "//div[@class='product_label']")
    private WebElement lbl_producto;

    //Boton agregar al carrito Sauce Labs Backpack
    @FindBy(xpath = "//div[@class='inventory_list']//div[1]//div[3]//button[1]")
    private WebElement btn_agregar_sauce_labs_backpack;

    @FindBy(xpath = "//h3[@data-test='error' and text()='Username and password do not match any user in this service']")
    private WebElement lbl_error;



    public void usuarioIngresaALaPagina(){


        System.setProperty("webdriver.chrome.driver", new File("resources/chromedriver.exe").getAbsolutePath());
        setDriver(new ChromeDriver());
        open();
        getDriver().manage().window().maximize();
        waitFor(1).seconds();

    }
    public void usuarioIngresaCredencialesValidas(){
        input_username.sendKeys("standard_user");
        waitFor(1).seconds();
        input_password.sendKeys("secret_sauce");
        waitFor(1).seconds();
        btn_login.click();
        waitFor(1).seconds();
    }

    public void seDebeLogearDeManeraCorrecta() {
        if(lbl_producto.isDisplayed()){
            Assert.assrt(true);
        }
        else{
            Assert.fail("Ocurrio un error");
        }
    }
    public void usuarioIngresaCredencialesInvalidas(){
        input_username.sendKeys("standard_user");
        waitFor(1).seconds();
        input_password.sendKeys("123");
        waitFor(1).seconds();
        btn_login.click();
        waitFor(1).seconds();
    }

    public void seDebeLogearDeManeraIncorrecta() {
        if(lbl_error.isDisplayed()){
            Assert.assrt(true);
        }
        else{
            Assert.fail("Ocurrio un error");
        }
    }
}
