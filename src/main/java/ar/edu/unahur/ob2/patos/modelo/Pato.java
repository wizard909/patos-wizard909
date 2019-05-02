package ar.edu.unahur.ob2.patos.modelo;

public abstract class Pato {

    public void cuac() {
        System.out.println("Cuac!");
    }

    public void nadar() {
        System.out.println("Nado como un pato");
    }

    public abstract void display();
}
