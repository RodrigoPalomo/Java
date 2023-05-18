package poo;

public class Uso_Coche {
    public static void main(String[] args) {
        // Coche Renault = new Coche(); // Instanciar una clase.
//        System.out.println("Este coche tiene: " + Renault.ruedas + " ruedas");

        // System.out.println(Renault.dime_largo());

        // Esto le da sentido al getter porque ahora es más seguro, ya no podemos
        // modificar la variable de "largo", es decir, ya no se podrá hacer esto:
        // Renault.largo = 1000;

        Coche miCoche = new Coche();

        miCoche.establece_color();

        System.out.println(miCoche.dime_color());

    }
}
// Método SETTERS se denominan métodos definidores (Está encargado de definir o establecer el valor de una propiedad)


// Método GETTERS se denominan métodos captadores (Está encargado de captar o proporcionar(devolver) el valor de una propiedad.)
// Sintaxis: public dato_a_devolver nombre_metodo(){codigo + return}
