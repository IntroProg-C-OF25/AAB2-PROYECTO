import random

def proyecto(num_estudiantes=11):
    estudiantes = [f"Estudiante_{i}" for i in range(1, num_estudiantes)]
    notas = [random.uniform(0, 10) for _ in range(1, num_estudiantes)]
    nota_mas_alta = max(notas)
    
    print("Notas de los estudiantes:")
    for estudiante, nota in zip(estudiantes, notas):
        print(f"{estudiante} tiene una nota de {nota}")
    
    print(f"\nLa nota más alta es: {nota_mas_alta}\n")
    
    print("El estudiante(s) mejor egresado(s) es(son):")
    for estudiante, nota in zip(estudiantes, notas):
        if nota == nota_mas_alta:
            print(f"{estudiante} con una nota de {nota}")

if __name__ == "__main__":
    proyecto()
