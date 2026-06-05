# E-Commerce Backend & Inventory Management System

Este repositorio contiene una aplicación de backend de consola desarrollada en **Java**, enfocada en la gestión de inventarios, procesamiento de productos y flujos de transacciones comerciales. El objetivo principal de este proyecto es demostrar la aplicación práctica de patrones de diseño avanzados y los pilares fundamentales de la **Programación Orientada a Objetos (POO)** en un entorno de negocio simulado.

## 🚀 Características y Funcionalidades Principales

* **Arquitectura Orientada a Objetos:** Modelado robusto de entidades comerciales independientes (como `Producto`, `Cliente`, `Carrito`, `Inventario`) asegurando una alta cohesión y bajo acoplamiento.
* **Control Extensible de Inventario:** Lógica de negocio para la adición, actualización de stock, eliminación y búsqueda de productos mediante identificadores únicos.
* **Procesamiento de Transacciones:** Gestión dinámica del flujo de compras, permitiendo calcular subtotales, impuestos y totales de manera automatizada.
* **Manipulación Eficiente de Estructuras:** Uso de estructuras de datos nativas del Java Collections Framework ArrayList, List para el almacenamiento y filtrado rápido en memoria de los registros.

## 🛠️ Stack Tecnológico

* **Lenguaje Principal:** Java (JDK 8 / 11 / 17 o superior)
* **Paradigma:** Programación Orientada a Objetos (POO)
* **Gestor de Dependencias/Construcción:** Gradle.
* **Entorno de Desarrollo:** VS Code.

## ⚙️ Principios de Diseño y Solución de Problemas

El desarrollo de este sistema se enfocó en resolver la consistencia de datos y la mantenibilidad del código backend:

1. **Encapsulamiento de Datos:** Toda la lógica crítica de las propiedades de los productos y transacciones está protegida mediante modificadores de acceso privados y expuesta de forma segura a través de métodos *Getters* y *Setters*, previniendo estados inválidos en los objetos.
2. **Abstracción e Inmutabilidad:** Se diseñaron las clases aislando las reglas de negocio de la interfaz de usuario por consola, facilitando que este backend pueda ser adaptado a futuro a una API Web (Spring Boot) o a una interfaz gráfica (JavaFX) sin alterar las clases núcleo.
3. **Robustez y Control de Flujos:** Implementación de estructuras de control y manejo de excepciones para evitar fallos comunes en tiempo de ejecución, como ingresos de datos inválidos o desbordamientos de stock.

## 🔧 Configuración y Ejecución Local

Para compilar y ejecutar esta aplicación en tu entorno de desarrollo, sigue estos pasos:

1. **Clonar el repositorio:**
```bash
   git clone [https://github.com/longaresf/e-commerce-backend-java.git](https://github.com/longaresf/e-commerce-backend-java.git)
```

2. Ingresar al directorio:
  Bash
  cd e-commerce-backend-java

3. Compilación y Ejecución (Mediante CLI de Java):
  Compilar los archivos fuente .java:

  Bash
  javac Main.java
  ```
   * Ejecutar la aplicación compilada `.class`:
  ```bash
     java Main
  ```
   *(Nota: Reemplaza `Main` por el nombre de tu clase principal si es diferente).*

4. **Ejecución en IDE (Recomendado):**
   * Abre tu IDE de preferencia (IntelliJ IDEA, Eclipse, NetBeans).
   * Importa la carpeta del proyecto como un proyecto Java existente.
   * Busca la clase que contiene el método `public static void main` y presiona **Run**.

## ✒️ Autor

* **Francisco Longares** - *Desarrollador Backend* - [longaresf](https://github.com/longaresf)
