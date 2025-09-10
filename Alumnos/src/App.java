import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Clase para representar a un alumno con su id, nombre y calificación
class Alumno {
    int id;
    String nombre;
    double calificacion;

    public Alumno(int id, String nombre, double calificacion) {
        this.id = id;
        this.nombre = nombre;
        this.calificacion = calificacion;
    }

}

public class App {
    public static void main(String[] args) {

        List<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno(15, "Shanny", 95.5));
        alumnos.add(new Alumno(7, "Hector", 75.2));
        alumnos.add(new Alumno(1, "Sandra", 57.2)); // Calificación reprobatoria
        alumnos.add(new Alumno(10, "Manchas", 98.5));
        alumnos.add(new Alumno(17, "Kobu", 70.3));
        alumnos.add(new Alumno(11, "Kiara", 49.0)); // Calificación reprobatoria

         double promedio = 0;
       for (Alumno alumno : alumnos) {
             System.out.println(alumno.id + " * " + alumno.nombre + " * " + alumno.calificacion);
            promedio = promedio + alumno.calificacion;
        }
        promedio /= alumnos.size();
        System.out.println("El promedio del grupo es: " + promedio);

    



        Iterator<Alumno> reprobo = alumnos.iterator();
        while (reprobo.hasNext()) {
            Alumno alumno = reprobo.next();
            if (alumno.calificacion < 60) {
                reprobo.remove();
            }
        }

        for (Alumno alumno : alumnos) {
            System.out.println(alumno.id + " * " + alumno.nombre + " * " + alumno.calificacion);
        }
   
    }
}