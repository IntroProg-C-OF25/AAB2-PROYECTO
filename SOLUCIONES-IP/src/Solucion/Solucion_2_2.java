package Solucion;

import java.util.Random;

public class Solucion_2_2 {

    public static void main(String[] args) {
        int numEstudiantes = 11; //Cambiar segun el número requerido
        String estudiantes[] = new String[numEstudiantes];
        float notas[] = new float[numEstudiantes];
        float notaMasAlta = 0;

        Random random = new Random();

        //En este for generamos los datos aleatoriamente
        for (int i = 1; i < numEstudiantes; i++) { // i++ es lo mismo que i=i+1
            estudiantes[i] = "Estudiante_" + i;

            //notas[i] = random.nextInt(0,11);
            notas[i] = random.nextFloat(0, 10f);
            System.out.println(estudiantes[i] + " tiene una nota de " + notas[i]);
        }

        //En el siguiente for buscamos cual es la nota más alta
        for (int i = 1; i < numEstudiantes; i++) {
            if (notas[i] > notaMasAlta) {
                notaMasAlta = notas[i];
            }
        }
        System.out.println("\nLa nota más alta es: " + notaMasAlta + "\n");

        //En el siguiente for presenta el o los estudiantes con la mejor nota
        for (int i = 1; i < numEstudiantes; i++) {
            if (notas[i] == notaMasAlta) {
                System.out.println("El estudiantes mejor egresado es el " + estudiantes[i] + " con una nota de " + notas[i]);
                
            }
            
        }
        System.out.println("Felicidades (al/los) estudiante(s): ");
        //En el siguiente for presenta el o los estudiantes con la mejor nota
        for (int i=0 ; i<numEstudiantes ; i++){
            if(notas[i] == notaMasAlta){
                System.out.println("    > "+estudiantes[i]+" .");
            }
        }
        System.out.println("por su esfuerzo al ser el mejor egresado con una nota final de: "+notaMasAlta);
    }
}
//Autor:Nayeli Castillo
/* EVIDENCIA DE RESULTADO
Estudiante_1 tiene una nota de 8.646335
Estudiante_2 tiene una nota de 4.766079
Estudiante_3 tiene una nota de 8.448308
Estudiante_4 tiene una nota de 3.57301
Estudiante_5 tiene una nota de 4.4806886
Estudiante_6 tiene una nota de 3.2127018
Estudiante_7 tiene una nota de 5.4924197
Estudiante_8 tiene una nota de 0.23533285
Estudiante_9 tiene una nota de 7.880331
Estudiante_10 tiene una nota de 2.84724

La nota más alta es: 8.646335

El estudiantes mejor egresado es el Estudiante_1 con una nota de 8.646335
Felicidades (al/los) estudiante(s): 
    > Estudiante_1 .
por su esfuerzo al ser el mejor egresado con una nota final de: 8.646335
*/