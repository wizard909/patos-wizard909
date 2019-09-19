package ar.edu.unahur.ob2.patos.modelo;

public class PatoDeMadera extends Pato {

    public PatoDeMadera() {super(new NoVuelo()); }

    @Override
    public void parpar() {
        System.out.println("No parpeo");
    }

    @Override
    public void dibujar() {
        System.out.println("Soy un Pato De Madera");
    }
}
