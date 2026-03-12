package com.bdd.steps;

import com.bdd.page.Ejercicio2Page;
import io.cucumber.java.en.*;
import net.serenitybdd.annotations.Step;

public class Ejercicio2Step {

    Ejercicio2Page ejercicio2Page;
    @Step
    @Given("^como usuario quiero ingresar a la pagina demoqa$")
    public void como_usuario_quiero_ingresar_a_la_pagina_demoqa(){
        ejercicio2Page.como_usuario_quiero_ingresar_a_la_pagina_demoqa();
    }

    @Step
    @When("^ingreso el nombre (.+) y apellido (.+)$")
    public void ingreso_el_nombre_y_apellido(String nombre, String apellido) {
        ejercicio2Page.ingreso_el_nombre_y_apellido(nombre,apellido);
    }

    @Step
    @And("^ingreso el email (.+)$")
    public void ingreso_el_email(String email) {
        ejercicio2Page.ingreso_el_email(email);
    }

    @Step
    @And("^elijo el genero (.+)$")
    public void elijo_el_genero(String genero) {
        ejercicio2Page.elijo_el_genero(genero);
    }

    @Step
    @And("^ingreso el numero movil (.+)$")
    public void ingreso_el_numero_movil(String numero) {
        ejercicio2Page.ingreso_el_numero_movil(numero);
    }

    @Step
    @And("ingreso el dia {}, mes {}, ano {}")
    public void ingreso_el_dia_mes_ano(String dia,int mes, String ano) {
        ejercicio2Page.ingreso_el_dia_mes_ano(dia,mes,ano);
    }

    @Step
    @And("elijo el hobbies {}")
    public void elijo_el_hobbie(String hobbie) {
        ejercicio2Page.elijo_el_hobbie(hobbie);
    }

    @Step
    @And("ingreso una direccion {}")
    public void ingreso_una_direccion(String direccion) {
        ejercicio2Page.ingreso_una_direccion(direccion);
    }

    @Step
    @And("elijo un estado {} y su ciudad {}")
    public void elijo_un_estado_y_su_ciudad(String estado, String ciudad) {
        ejercicio2Page.elijo_un_estado_y_su_ciudad(estado,ciudad);
    }
    @Step
    @And("hago clic en submit")
    public void hagoClicEnSubmit() {
        ejercicio2Page.hagoClicEnSubmit();
    }
    @Step
    @Then("me debe mostrar el form de envio")
    public void me_debe_mostrar_el_form_de_envio() {
        ejercicio2Page.me_debe_mostrar_el_form_de_envio();
    }


}
