package com.bdd.steps;

import com.bdd.page.EjercicioPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class EjercicioStep {

    EjercicioPage ejercicioPage;
    @Given("El usuario ingresa a la pagina")
    public void usuarioIngresaALaPagina(){

        ejercicioPage.usuarioIngresaALaPagina();
    }

    @When("ingresa credenciales validas")
    public void usuarioIngresaCredencialesValidas(){
        ejercicioPage.usuarioIngresaCredencialesValidas();
    }
    @Then("Se debe logear de manera correcta")
    public void seDebeLogearDeManeraCorrecta() {
        ejercicioPage.seDebeLogearDeManeraCorrecta();
    }

    @When("credenciales invalidas")
    public void usuarioIngresaCredencialesInvalidas(){
        ejercicioPage.usuarioIngresaCredencialesInvalidas();
    }
    @Then("Se debe logear de manera incorrecta")
    public void seDebeLogearDeManeraIncorrecta() {
        ejercicioPage.seDebeLogearDeManeraIncorrecta();
    }



}
