package tarea2;

//  Creamos una interfaz común para todos los objetos que queremos clonar
interface Clonable {
    Clonable clonar();
}

// Creamos una clase concreta que implementa la interfaz Clonable
class Perro implements Clonable {
    private final String nombre;

    public Perro(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public Clonable clonar() {
        // Realizamos una copia exacta del objeto Perro
        return new Perro(this.nombre);
    }

    public void ladrar() {
        System.out.println("¡guaf! Soy " + nombre);
    }
}

//  Creamos una clase principal para probar el patrón Prototype
public class Main {
    public static void main(String[] args) {
        // Creamos un perro original
        Perro perroOriginal = new Perro("Rocky");

        // Clonamos el perro original
        Perro perroClonado = (Perro) perroOriginal.clonar();

        // Verificamos que el clon sea igual al original
        System.out.println("¿El Perro clonado es igual al original? " + (perroOriginal == perroClonado));

        // Probamos el método ladrar del perro clonado
        perroClonado.ladrar();
    }
}