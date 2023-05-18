package poo;
public class Coche {
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso_plataforma;
    String color;
    int peso_total;
    boolean asientos_cuero, climatizador;

    // CONSTRUCTOR
    public Coche(){
        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        peso_plataforma = 500;
    }
    // CONSTRUCTOR

    // GETTER
    public String dime_largo(){
        // obligatoriamente tiene que devolver algo(return) porque sino
        // va a marcar error siempre

        return "El largo del coche es: " + largo; // Capto y proporciono valor

        // Acá si podemos entrar a la variable "largo" aunque sea privada (private)
        // porque sólo es accesible dentro de la misma clase
    }
    // GETTER

    // SETTER
    // El setter tiene la palabra reservada "void", que indica que no
    // va a devolver ningún valor, al contrario de un GETTER.
    public void establece_color(){
        color = "azul"; // Seteo valor
    }
    // SETTER

    public String dime_color(){
        return "El color del coche es: " + color;
    }
}
