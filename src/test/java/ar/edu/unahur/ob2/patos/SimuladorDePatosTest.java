package ar.edu.unahur.ob2.patos;

import ar.edu.unahur.ob2.patos.modelo.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SimuladorDePatosTest {

    @Test
    public void testPatos() {
        Pato patoHule = new PatoHule();
        Pato patoCapuchino = new PatoCapuchino();
        Pato patoCabeza = new PatoCabezaNegra();
        Pato patoDeMadera = new PatoDeMadera();

        patoCabeza.setComportamientoDeVuelo(new NoVuelo());

        Assert.assertEquals(patoHule.volar(), "No vuelo");
        Assert.assertEquals(patoCabeza.volar(), "No vuelo");
        Assert.assertEquals(patoCapuchino.volar(), "Vuelo con alas");
        Assert.assertEquals(patoDeMadera.volar(), "No vuelo");

    }

}