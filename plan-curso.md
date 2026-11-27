# Fundamentos de Java con una mascota virtual

## Resumen del Curso
Este curso de 1 hora introduce a estudiantes de secundaria a los fundamentos de la programación con Java, incluyendo programación orientada a objetos, construyendo paso a paso una mascota virtual llamada Nube. **¡No requiere descargas!** Solo abre tu navegador web.

**Duración total**: ~57 minutos de video (más el tiempo que cada estudiante pause para practicar)  
**Público Objetivo**: Estudiantes de 12 a 17 años sin experiencia en programación  
**Prerrequisitos**: Ninguno  
**Herramientas necesarias**: **¡Solo tu navegador web!** (Chrome, Firefox, Safari, Edge) con el editor en línea OnlineGDB

**Repositorio de Código Fuente**: [https://github.com/Open-SourceHelper/java-fundamentals-course-Open-SourceHelper](https://github.com/Open-SourceHelper/java-fundamentals-course-Open-SourceHelper)

**Lista de reproducción compartida por el equipo**: [YouTube](https://youtube.com/playlist?list=PLJeMlKFQeIqU&si=El0PIIh3nBqs1SFv)

## Secuencia de la Lección

### Lección 1: Haz que tu mascota hable (7 minutos)
- **Descripción**: Abre tu primera práctica, ejecuta un programa con Run, cambia un mensaje y ordena dos instrucciones.
- **Enlace**: [Ver la lección](https://youtu.be/XuoiHgIiKD0)
- **Conclusiones clave**: Un programa sigue instrucciones en orden; `System.out.println("Hola, Nube");` muestra una línea en la consola.
- **Empieza a programar**: [Abrir OnlineGDB - Práctica 1](https://onlinegdb.com/KtfLzdwhI)
**¡No es necesario registrarse!**

### Lección 2: ¿Cuánta energía tiene Nube? (7 minutos)
- **Descripción**: Guarda datos en variables, distingue texto de números y actualiza la energía de Nube con un premio.
- **Enlace**: [Ver la lección](https://youtu.be/UDz3TJUtQVQ)
- **Conclusiones clave**: `String nombre = "Nube";` guarda texto, `int energia = 2;` guarda enteros; `energia = energia + premio;` actualiza el valor; `2 + 3` da 5 pero `"2" + "3"` da 23.
- **Práctica**: [Clic para programar](https://onlinegdb.com/CvoYuv9gM)
**¡Inicio inmediato!**

### Lección 3: ¿Juega o descansa? Decisiones y bucles (8 minutos)
- **Descripción**: Decide con if-else si Nube entra al parque, cuenta pasos con for y recarga energía con while.
- **Enlace**: [Ver la lección](https://youtu.be/NEZsPIUfO1E)
- **Conclusiones clave**: `if (energia >= 3) { ... } else { ... }`; `for (int paso = 1; paso <= 3; paso++) { }`; `while (energia < 3) { energia++; }`
- **Práctica**: [Clic para programar](https://onlinegdb.com/R6xIjKpk3)
**¡No necesitas registrarte!**

### Lección 4: Ponle un nombre al entrar — Métodos, entrada/salida e introducción a la POO (11 minutos)
- **Descripción**: Lee un apodo con Scanner, crea el método `saludar` con un parámetro y diseña la clase `Mascota` con su constructor.
- **Enlace**: [Ver la lección](https://youtu.be/t4Z8rBrMPIw)
- **Conclusiones clave**: `String apodo = teclado.nextLine();`; `static void saludar(String nombre) { }`; `class Mascota { String nombre; }`; `new Mascota(apodo)` crea un objeto.
- **Práctica**: [Haz clic para practicar](https://onlinegdb.com/fqh-h_HjMi) (usa la consola interactiva para escribir tu apodo)
**¡No necesitas registrarte!**

### Lección 5: Construye un refugio de dos mascotas — Fundamentos de POO (14 minutos)
- **Descripción**: Crea dos objetos, protege la energía entre 0 y 5 con getters y setters y recorre un arreglo de mascotas.
- **Enlace**: [Ver la lección](https://youtu.be/ZLeAQqtJKrY)
- **Conclusiones clave**: Encapsulación con `private`, `getEnergia()` y `setEnergia(int nueva)`; `if (nueva >= 0 && nueva <= 5)`; `Mascota[] equipo = {nube, sol};` y `for (Mascota mascota : equipo)`.
- **Proyecto final**: [Crea tu refugio POO](https://onlinegdb.com/ZSdeg62VS)
**¡Guarda y comparte con Fork!**

### Lección 6: Encuentra al ladrón de galletas — Depuración y próximos pasos (10 minutos)
- **Descripción**: Compara lo esperado con lo obtenido, corrige un índice equivocado y aprende a leer errores de compilación y de ejecución.
- **Enlace**: [Ver la lección](https://youtu.be/TWjn_QspT_8)
- **Consejos clave**: Escribe lo esperado, observa lo real, cambia una cosa y vuelve a probar; lee primero el primer aviso (`';' expected`); los índices empiezan en 0 (`ArrayIndexOutOfBoundsException`).
- **Práctica**: [Clic para depurar](https://onlinegdb.com/mOJxwI_8ai)

## Recursos adicionales
- **Código fuente completo**: [Repositorio de GitHub](https://github.com/Open-SourceHelper/java-fundamentals-course-Open-SourceHelper)
- **Todas las actividades prácticas**:

| Número de lección | Actividad | Empezar a programar |
|----------|----------|-------------|
| 1 | Hola, Nube (mensajes y orden) | [OnlineGDB](https://onlinegdb.com/KtfLzdwhI) |
| 2 | Variables y energía | [OnlineGDB](https://onlinegdb.com/CvoYuv9gM) |
| 3 | Decisiones y bucles | [OnlineGDB](https://onlinegdb.com/R6xIjKpk3) |
| 4 | Scanner, métodos y clases | [OnlineGDB](https://onlinegdb.com/fqh-h_HjMi) |
| 5 | Refugio POO (encapsulación y arreglos) | [OnlineGDB](https://onlinegdb.com/ZSdeg62VS) |
| 6 | Depuración | [OnlineGDB](https://onlinegdb.com/mOJxwI_8ai) |

- Para seguir aprendiendo: [Learn Java · conceptos del lenguaje](https://dev.java/learn/language-basics/) (en inglés)
- Reto extra: agrega una tercera mascota al refugio y predice su índice antes de ejecutar.

**¡Gracias por completar el curso!**

---

## Elaboración

El equipo preparó una secuencia de seis lecciones sobre la mascota Nube. Cada lección reúne un video, un guion, un programa inicial y una solución para comparar en OnlineGDB.

Universidad Peruana de Ciencias Aplicadas  
Carrera de Ingeniería de Software  
Período 202620  
1ASI0729 Desarrollo de Aplicaciones Open Source  
NRC 7793  
**Nombre del equipo**: Open-SourceHelper  
**Líder del equipo**: Matthew Shinko Okuhama Diaz  
**Integrantes del equipo**:

- Felipe Marcelo Huamanchumo Chicchon
- Gabriel Alejandro Vilchez Vite
- Fabricio Flores Chavez
- Matthew Shinko Okuhama Diaz
- Cristian Joseph Trigoso Garrido

**Fecha de entrega**: 26 de noviembre de 2026
