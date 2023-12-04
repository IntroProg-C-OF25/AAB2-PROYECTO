import random

# INICIALIZACIÓN
numEstudiantes = 10  # Puedes cambiar esto al número de estudiantes que desees.
aprobados = 0
reprobados = 0

# PROCESO
for i in range(numEstudiantes):
    nombreEstudiante = "Estudiante" + str(i + 1)
    cedulaEstudiante = "1150027633" + str(i + 1)
    nombreMateria = "Matemáticas"
    acd = random.random() * 3.5
    ape = random.random() * 3.5
    aa = random.random() * 3

    print("Nombre del estudiante: " + nombreEstudiante)
    print("Cédula del estudiante: " + cedulaEstudiante)
    print("Materia: " + nombreMateria)
    print("Calificación ACD: " + str(acd))
    print("Calificación APE: " + str(ape))
    print("Calificación AA: " + str(aa))

    if acd + ape + aa >= 7:
        print("El estudiante ha aprobado la materia.")
        aprobados += 1
    else:
        print("El estudiante debe rendir un examen de recuperación.")
        reprobados += 1
    print()

print("ESTADÍSTICAS FINALES:")
print("Porcentaje de aprobados: " + str(aprobados * 100.0 / numEstudiantes) + "%")
print("Porcentaje de reprobados: " + str(reprobados * 100.0 / numEstudiantes) + "%")
#AUTOR= Lady Robalino 