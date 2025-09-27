public class Cal_Alumno {
    // Atributos
    public String nombre;
    public int[] calificaciones = new int[5];

    // Constructor
    public Cal_Alumno(String nombre, int[] calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    // Met para calculo de prom.
    public double calcularPromedio(int[] calificaciones) {
        int suma = 0;
        for (int nota : calificaciones) {
            suma += nota;
        }
        return (double) suma / calificaciones.length;
    }

    // Método que obtiene la calificación final en letra
    public char obtenerCalificacionFinal(double promedio) {
        if (promedio <= 50) {
            return 'F';
        } else if (promedio <= 60) {
            return 'E';
        } else if (promedio <= 70) {
            return 'D';
        } else if (promedio <= 80) {
            return 'C';
        } else if (promedio <= 90) {
            return 'B';
        } else {
            return 'A';
        }
    }

    // Método que imprime los resultados
    public void imprimirResultados(String nombre, int[] calificaciones, double promedio, char calificacion) {
        System.out.println("Nombre del estudiante: " + nombre);
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Calificación " + (i + 1) + ": " + calificaciones[i]);
        }
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación: " + calificacion);
    }

    // Método main para probar la clase
    public static void main(String[] args) {
        int[] notas = {85, 90, 78, 88, 92}; // Ejemplo de calificaciones
        Cal_Alumno alumno = new Cal_Alumno("Gustavo Carmona", notas);

        double promedio = alumno.calcularPromedio(notas);
        char calificacion = alumno.obtenerCalificacionFinal(promedio);

        alumno.imprimirResultados(alumno.nombre, notas, promedio, calificacion);
    }
}
