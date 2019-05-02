package ar.edu.unahur.ob2.patos.modelo;

public abstract class Pato {

    private Volable comportamientoDeVuelo;

    public Pato(Volable comportamientoDeVuelo) {
        this.comportamientoDeVuelo = comportamientoDeVuelo;
    }

    public void volar() {
        comportamientoDeVuelo.volar();
    }

    public void parpar() {
        System.out.println("Cuac!");
    }

    public void nadar() {
        System.out.println("Nado como un pato");
    }

    public void setComportamientoDeVuelo(Volable comportamientoDeVuelo) {
        this.comportamientoDeVuelo = comportamientoDeVuelo;
    }

    public abstract void dibujar();
}
