# Desafíos de Código en Java para Entrevistas Técnicas

Este repositorio es una plantilla de práctica personal que contiene 19 desafíos de código comunes en entrevistas técnicas para roles de desarrollo y automatización de pruebas (SDET) en Java.

El proyecto está configurado con Maven para la gestión de dependencias y JUnit 5 para las pruebas unitarias, siguiendo las mejores prácticas de la industria.

---

## 🚀 Tecnologías Utilizadas
* **Lenguaje:** Java 17
* **Gestión de Dependencias y Construcción:** Apache Maven
* **Framework de Pruebas:** JUnit 5

---

## 📋 Cómo Utilizar esta Plantilla

Este repositorio está diseñado para ser clonado o "forkeado" para cada sesión de práctica.

### **Prerrequisitos**
* Git
* Java JDK 17 (o superior)
* Apache Maven
* Un IDE como IntelliJ IDEA

### **Pasos Iniciales**
1.  **Clona el repositorio:**
    ```bash
    git clone [https://github.com/danifern/java-coding-challenges.git](https://github.com/danifern/java-coding-challenges.git)
    ```
2.  **Abre el proyecto** en IntelliJ IDEA. IntelliJ detectará automáticamente el archivo `pom.xml` y configurará el proyecto.

---

## 💡 Flujo de Trabajo para Practicar
1.  **Elige un Desafío:** Busca en el índice de abajo el desafío que quieras resolver.
2.  **Implementa tu Solución:** Ve a la clase correspondiente en `src/main/java/com/challenges` (ej. `Challenge01_StringReverser.java`) y escribe tu lógica dentro del método, en la sección `// TODO:`.
3.  **Verifica tu Solución:** Ve a la clase de prueba correspondiente en `src/test/java/com/challenges` (ej. `Challenge01_StringReverserTest.java`). Haz clic derecho sobre el nombre de la clase y selecciona "Run tests...". JUnit te dirá si tu solución pasa todas las pruebas.
4.  **(Opcional) Guarda tu Progreso:** Si quieres guardar tus soluciones sin modificar la plantilla principal, puedes crear una rama de práctica:
    ```bash
    git checkout -b mi-sesion-de-practica
    git commit -am "feat: Solve String Reverser challenge"
    ```

---

## 📚 Índice de Desafíos

| #  | Desafío                           | Estatus      | Notas                                        |
|:---|:----------------------------------|:------------:|:---------------------------------------------|
| 01 | Invertir un String                | `Plantilla`  |                                              |
| 02 | Invertir un Array                 | `Plantilla`  |                                              |
| 03 | Invertir Palabras en un String    | `Plantilla`  |                                              |
| 04 | Número Primo                      | `Plantilla`  |                                              |
| 05 | Palíndromo de String              | `Plantilla`  |                                              |
| 06 | Palíndromo de Número              | `Plantilla`  |                                              |
| 07 | Máximo y Mínimo de un Array       | `Plantilla`  |                                              |
| 08 | (Incluido en el 07)               | `Plantilla`  |                                              |
| 09 | N-ésimo Mínimo/Máximo de un Array | `Plantilla`  |                                              |
| 10 | (Incluido en el 09)               | `Plantilla`  |                                              |
| 11 | Java String Pool                  | `Conceptual` | No tiene archivo de prueba, es para ejecutar `main`. |
| 12 | Intercambiar Variables (sin tmp)  | `Plantilla`  |                                              |
| 13 | Anagrama de dos Strings           | `Plantilla`  |                                              |
| 14 | Eliminar Duplicados de un String  | `Plantilla`  |                                              |
| 15 | Contar Letras (Map)               | `Plantilla`  |                                              |
| 16 | FizzBuzz                          | `Plantilla`  |                                              |
| 17 | Par o Impar                       | `Plantilla`  |                                              |
| 18 | Suma de Dos (Two Sum)             | `Plantilla`  |                                              |
| 19 | Ordenamiento Personalizado        | `Plantilla`  |                                              |