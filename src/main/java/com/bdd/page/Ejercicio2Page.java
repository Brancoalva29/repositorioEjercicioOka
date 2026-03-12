package com.bdd.page;


import com.ibm.icu.impl.Assert;
import net.serenitybdd.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.io.File;

@DefaultUrl("https://demoqa.com/automation-practice-form")

public class Ejercicio2Page extends PageObject {

    //Input nombre
    @FindBy(xpath = "//input[@id='firstName']")
    private WebElement inpt_nombre;

    //Input apellido
    @FindBy(xpath = "//input[@id='lastName']")
    private WebElement inpt_apellido;

    //Input email
    @FindBy(xpath = "//input[@id='userEmail']")
    private WebElement inpt_email;

    //Input numero
    @FindBy(xpath = "//input[@id='userNumber']")
    private WebElement inpt_numero;

    //Input calendario
    @FindBy(xpath = "//input[@id='dateOfBirthInput']")
    private WebElement calendario;

    // inpt_direccion
    @FindBy(xpath = "//textarea[@id='currentAddress']")
    private WebElement inpt_direccion;


    // lbl_confirmacion
    @FindBy(xpath = "//div[@id='example-modal-sizes-title-lg']")
    private WebElement lbl_confirmacion;

    // btn_submit
    @FindBy(xpath = "//button[@id='submit']")
    private WebElement btn_submit;


    public void como_usuario_quiero_ingresar_a_la_pagina_demoqa(){

        System.setProperty("webdriver.chrome.driver", new File("resources/chromedriver-131.exe").getAbsolutePath());
        setDriver(new ChromeDriver());
        open();
        getDriver().manage().window().maximize();
        waitFor(200).millisecond();
    }

    public void ingreso_el_nombre_y_apellido(String nombre, String apellido) {
        inpt_nombre.sendKeys(nombre);
        waitFor(200).millisecond();
        inpt_apellido.sendKeys(apellido);
        waitFor(200).millisecond();
    }

    public void ingreso_el_email(String email) {
        inpt_email.sendKeys(email);
    }

    public void elijo_el_genero(String genero) {
        int valor_chck=1;
        if(genero == "Male"){
            valor_chck = 1;
        } else if(genero == "Female"){
            valor_chck = 2;
        } else if (genero == "Other") {
            valor_chck = 3;
        }
        getDriver().findElement(By.xpath("//label[@for='gender-radio-1']")).click();
        waitFor(1).seconds();
    }

    public void ingreso_el_numero_movil(String numero) {
        inpt_numero.sendKeys(numero);
        waitFor(1).seconds();

    }

    public void ingreso_el_dia_mes_ano(String dia,int mes, String ano) {
        calendario.click();
        waitFor(500).millisecond();


        Select select_mes = new Select(getDriver().findElement(By.xpath("//select[@class='react-datepicker__month-select']")));
        mes = mes -1;
        select_mes.selectByValue(String.valueOf(mes));
        waitFor(500).millisecond();


        Select select_ano = new Select(getDriver().findElement(By.xpath("//select[@class='react-datepicker__year-select']")));
        select_ano.selectByValue(ano);
        waitFor(500).millisecond();


        WebElement select_dia = getDriver().findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--0"+dia+"']"));
        select_dia.click();
        waitFor(500).millisecond();



    }

    public void elijo_el_hobbie(String hobbie) {
        int valor_chck=0;
        if(hobbie == "Sports"){
            valor_chck = 1;
        } else if(hobbie == "Reading"){
            valor_chck = 2;
        } else if (hobbie == "Music") {
            valor_chck = 3;
        }
        WebElement chck_hobbie = getDriver().findElement(By.xpath("//label[@for='hobbies-checkbox-3']"));
        chck_hobbie.click();
        waitFor(1).seconds();
    }
    public void ingreso_una_direccion(String direccion) {
        inpt_direccion.sendKeys(direccion);
        waitFor(1).seconds();
    }


    public void elijo_un_estado_y_su_ciudad(String estado, String ciudad) {
        Select select_estado = new Select(getDriver().findElement(By.xpath("//div[contains(@class,'css-1gtu0rj-indicatorContainer')]//*[name()='svg']//*[name()='path' and contains(@d,'M4.516 7.5')]")));
        select_estado.selectByValue(estado);
        waitFor(500).millisecond();

        Select select_ciudad = new Select(getDriver().findElement(By.xpath("//div[contains(@class,'css-1gtu0rj-indicatorContainer')]//*[name()='svg']")));
        select_ciudad.selectByValue(ciudad);
        waitFor(500).millisecond();

    }
    public void hagoClicEnSubmit(){
        btn_submit.click();
        waitFor(500).millisecond();
    }

    public void me_debe_mostrar_el_form_de_envio() {
        if(lbl_confirmacion.isDisplayed()){
            Assert.assrt(true);
        }
        else{
            Assert.fail("Ocurrio un error");
        }
    }


}
