package ar.edu.unahur.ob2.patos.modelo;

public class NoVuelo implements Volable {

    @Override
    public void volar() {
        System.out.println("No vuelo");
    }
}
