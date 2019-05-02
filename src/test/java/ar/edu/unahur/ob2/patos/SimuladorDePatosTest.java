package ar.edu.unahur.ob2.patos;

import ar.edu.unahur.ob2.patos.modelo.*;
import org.testng.annotations.Test;

public class SimuladorDePatosTest {

    @Test
    public void testPatos() {
        Pato patoHule = new PatoHule();
        Pato patoCapuchino = new PatoCapuchino();
        Pato patoCabeza = new PatoCabezaNegra();

        patoHule.volar();
        patoCabeza.volar();
        patoCapuchino.volar();

        patoCabeza.setComportamientoDeVuelo(new NoVuelo());

        patoCabeza.volar();

    }


}