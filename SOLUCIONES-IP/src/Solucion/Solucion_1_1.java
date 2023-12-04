/*
2. Sistema acádemico de la utpl
 */
package Solucion;

import java.util.Random;

public class Solucion_1_1 {
    public static void main(String[] args) {
        Random rand = new Random();
        // INICIALIZACIÓN
        int numEstudiantes = 10; // Puedes cambiar esto al número de estudiantes que desees.
        int aprobados = 0;
        int reprobados = 0;
        //PROCESO
        for (int i = 0; i < numEstudiantes; i++) {
            String nombreEstudiante = "Estudiante" + (i + 1);
            String cedulaEstudiante = "1150027633" + (i + 1);
            String nombreMateria = "Matemáticas";
            double acd = rand.nextDouble() * 3.5;
            double ape = rand.nextDouble() * 3.5;
            double aa = rand.nextDouble() * 3;

            System.out.println("Nombre del estudiante: " + nombreEstudiante);
            System.out.println("Cédula del estudiante: " + cedulaEstudiante);
            System.out.println("Materia: " + nombreMateria);
            System.out.println("Calificación ACD: " + acd);
            System.out.println("Calificación APE: " + ape);
            System.out.println("Calificación AA: " + aa);

            if (acd + ape + aa >= 7) {
                System.out.println("El estudiante ha aprobado la materia.");
                aprobados++;
            } else {
                System.out.println("El estudiante debe rendir un examen de recuperación.");
                reprobados++;
            }
            System.out.println();
        }

        System.out.println("ESTADÍSTICAS FINALES:");
        System.out.println("Porcentaje de aprobados: " + (aprobados * 100.0 / numEstudiantes) + "%");
        System.out.println("Porcentaje de reprobados: " + (reprobados * 100.0 / numEstudiantes) + "%");
    }  
}
//AUTOR= LADY ROBALINO
/* EVIDENCIA DE RESULTADO:
Nombre del estudiante: Estudiante1
Cédula del estudiante: 11500276331
Materia: Matemáticas
Calificación ACD: 1.6818892336237214
Calificación APE: 2.0112711487758124
Calificación AA: 0.2537683204673862
El estudiante debe rendir un examen de recuperación.

Nombre del estudiante: Estudiante2
Cédula del estudiante: 11500276332
Materia: Matemáticas
Calificación ACD: 2.6387969581597366
Calificación APE: 2.9252408247990993
Calificación AA: 0.062114567852666
El estudiante debe rendir un examen de recuperación.

Nombre del estudiante: Estudiante3
Cédula del estudiante: 11500276333
Materia: Matemáticas
Calificación ACD: 0.7771025069560609
Calificación APE: 0.19159601961897782
Calificación AA: 0.22542788108808542
El estudiante debe rendir un examen de recuperación.

Nombre del estudiante: Estudiante4
Cédula del estudiante: 11500276334
Materia: Matemáticas
Calificación ACD: 0.11738882428908798
Calificación APE: 3.4863235910546537
Calificación AA: 2.2859270827931777
El estudiante debe rendir un examen de recuperación.

Nombre del estudiante: Estudiante5
Cédula del estudiante: 11500276335
Materia: Matemáticas
Calificación ACD: 1.444819408117623
Calificación APE: 1.8441202405161423
Calificación AA: 0.38802542353608027
El estudiante debe rendir un examen de recuperación.

Nombre del estudiante: Estudiante6
Cédula del estudiante: 11500276336
Materia: Matemáticas
Calificación ACD: 3.2543954802162625
Calificación APE: 3.107790833331369
Calificación AA: 2.9623491692633888
El estudiante ha aprobado la materia.

Nombre del estudiante: Estudiante7
Cédula del estudiante: 11500276337
Materia: Matemáticas
Calificación ACD: 0.18968679122649967
Calificación APE: 2.9602185254456335
Calificación AA: 0.8692192745928643
El estudiante debe rendir un examen de recuperación.

Nombre del estudiante: Estudiante8
Cédula del estudiante: 11500276338
Materia: Matemáticas
Calificación ACD: 0.5364279954942622
Calificación APE: 2.847669302218724
Calificación AA: 2.413143874660183
El estudiante debe rendir un examen de recuperación.

Nombre del estudiante: Estudiante9
Cédula del estudiante: 11500276339
Materia: Matemáticas
Calificación ACD: 0.7653454378254327
Calificación APE: 2.3720819588257345
Calificación AA: 1.5782107977727171
El estudiante debe rendir un examen de recuperación.

Nombre del estudiante: Estudiante10
Cédula del estudiante: 115002763310
Materia: Matemáticas
Calificación ACD: 2.2144509541208186
Calificación APE: 0.9865745063498401
Calificación AA: 0.9903473345218853
El estudiante debe rendir un examen de recuperación.

ESTADÍSTICAS FINALES:
Porcentaje de aprobados: 10.0%
Porcentaje de reprobados: 90.0%
*/
