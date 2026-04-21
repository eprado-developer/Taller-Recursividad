# Taller de Recursividad — Estructuras de Datos

## 👤 EDWIN ALFONSO PRADO BRAVO

---

## Descripción del taller

Este repositorio contiene la solución al **Taller de Recursividad** de la asignatura **Estructuras de Datos**, programado en **Java**. Cada ejercicio implementa una función recursiva para resolver un problema específico, cubriendo desde operaciones matemáticas clásicas hasta estructuras como arreglos, matrices y series numéricas.

### Ejercicios resueltos

| # | Descripción |
|---|-------------|
| 01 | Factorial de un número entero |
| 02 | Invertir un número entero |
| 03 | Sumatoria de fracciones: 1 + 1/2 + 1/3 + … + 1/n |
| 04 | Suma de los dígitos de un número |
| 05 | Sumatoria de 1 + 2 + 3 + … + n |
| 06 | Potencia: base^exponente |
| 07 | Máximo Común Divisor (Algoritmo de Euclides) |
| 08 | Copiar una cadena en otra |
| 09 | Cociente de la división entera (restas sucesivas) |
| 10 | Multiplicación por sumas sucesivas |
| 11 | Suma de los elementos de un vector |
| 12 | Suma de los elementos de una matriz m×n |
| 13 | Serie de Fibonacci hasta un límite dado |
| 14 | Función de Ackermann |

---

## Estructura del repositorio

```
Taller-Recursividad/
│
├── src/
│   └── Recursividad/
│       ├── Ejercicio01_Factorial.java
│       ├── Ejercicio02_InvertirNumero.java
│       ├── Ejercicio03_SumatoriaFracciones.java
│       ├── Ejercicio04_SumaDigitos.java
│       ├── Ejercicio05_SumatoriaN.java
│       ├── Ejercicio06_Potencia.java
│       ├── Ejercicio07_MCD.java
│       ├── Ejercicio08_CopiarCadena.java
│       ├── Ejercicio09_Division.java
│       ├── Ejercicio10_Multiplicacion.java
│       ├── Ejercicio11_SumaVector.java
│       ├── Ejercicio12_SumaMatriz.java
│       ├── Ejercicio13_Fibonacci.java
│       └── Ejercicio14_Ackermann.java
│
└── README.md
```

---

## Instrucciones para ejecutar

### Requisitos previos
- **Java JDK 8** o superior instalado.
- Tener configurada la variable de entorno `JAVA_HOME`.

### Compilar todos los archivos

Desde la raíz del proyecto:

```bash
javac -d out src/Recursividad/*.java
```

Esto compilará todos los archivos `.java` y colocará los `.class` generados en la carpeta `out/`.

### Ejecutar un ejercicio específico

```bash
java -cp out Recursividad.Ejercicio01_Factorial
```

Reemplaza `Ejercicio01_Factorial` con el nombre del ejercicio que deseas ejecutar. Ejemplos:

```bash
java -cp out Recursividad.Ejercicio02_InvertirNumero
java -cp out Recursividad.Ejercicio07_MCD
java -cp out Recursividad.Ejercicio13_Fibonacci
java -cp out Recursividad.Ejercicio14_Ackermann
```


