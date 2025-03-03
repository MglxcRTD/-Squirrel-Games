# 🐿️ **Squirrel-Games** - Proyecto inspirado en la serie *Squid Game*

## 📌 **Descripción**

El proyecto Squirrel-Games está inspirado en la exitosa serie de Netflix Squid Game. Se trata de un sistema de gestión diseñado para crear y administrar diferentes ediciones de juegos similares a los presentados en la serie. El sistema permite gestionar tanto a los participantes como a los empleados del juego, asignar pruebas, controlar resultados y gestionar la jerarquía interna de los empleados.

### **Características Principales:**

- Creación de Ediciones de Juegos: Configuración de cada edición, incluyendo atributos como el año, la ubicación, los participantes y los empleados.
- Gestión de Participantes: Registro y asignación de información relevante para cada participante, incluyendo su nombre, ID, apellidos y más.
- Administración de Empleados: Definición y gestión de roles jerárquicos para los empleados del juego (workers, soldiers y managers), asignación de tareas y responsabilidades.
- Gestión de Pruebas: Creación de pruebas personalizables, asignación de participantes a las mismas y seguimiento de resultados, incluyendo la asignación de un manager responsable.

## 🎮 **Funcionalidad Principal**
- **Crear ediciones de juegos**: Configura los detalles del juego, como el año de edición, ubicación, pruebas y más.
- **Gestionar participantes**: Crea y edita participantes con atributos como nombre, apellidos, ID y fecha de nacimiento.
- **Asignar pruebas**: Añade pruebas a las ediciones de juego y asigna participantes a cada prueba.
- **Administración de empleados**: Define trabajadores, soldados y managers, asignando roles, jerarquía y funciones.
- **Seguimiento de resultados**: Observa el desempeño de los participantes y finaliza las pruebas mostrando resultados.

---

## 🛠️ **Cómo Ejecutarlo**

### 1️⃣ Clonar o descargar el repositorio  
Si tienes Git instalado, puedes clonar el proyecto con:  
```bash
git clone https://github.com/MglxcRTD/-Squirrel-Games.git
```
También puedes descargar el archivo .zip desde GitHub y extraerlo.

2️⃣ Importar el proyecto en Eclipse
Abre Eclipse.
Ve a File (Archivo) → Import (Importar).
Selecciona Existing Projects into Workspace (Proyectos existentes en el espacio de trabajo) y haz clic en Next.
Busca la carpeta del proyecto descargado y selecciona Finish.

3️⃣ Ejecutar el proyecto
Abre la clase principal (donde se encuentra el método public static void main(String[] args)).
Haz clic derecho en el archivo y selecciona Run As → Java Application.

4️⃣ Resultado

Al ejecutar el proyecto, en la consola se mostrará inicialmente el año de la edición junto con la ubicación de los juegos. Posteriormente, se mostrará la información del manager encargado de la prueba, incluyendo su arma, munición, la prueba asignada, su supervisor y el número de miembros en su equipo.

Además, se visualizará la prueba a realizar junto con una breve descripción de la misma y el responsable. También aparecerá el número de participantes y el porcentaje de eliminación, mostrando el ID de los jugadores eliminados. Al finalizar la prueba, se mostrará el número de participantes restantes.

## 🧑‍💻 **Tecnologías Utilizadas**

- Java: Lenguaje de programación principal para el desarrollo del proyecto.
- Eclipse: IDE utilizado para la escritura y ejecución del código.
- Maven (si aplica): Herramienta de gestión de dependencias (si el proyecto utiliza alguna librería externa).
- JUnit (si aplica): Framework para la realización de pruebas unitarias.

## 🙌 **Colaboradores**

Este proyecto ha sido desarrollado por un equipo de cuatro personas utilizando diversas herramientas y tecnologías, como Eclipse, Visual Studio Code, Git Bash y los sistemas integrados de Git en Eclipse y Visual Studio Code.

Reparto de Tareas:

Sergio:

- Desarrollo de la clase EdiciónJuegos y la clase Main para la comprobación del funcionamiento general del código.

- Desarrollo de pruebas para las clases EdicionDeJuegosTest y PruebasTest.

Crisveling:

- Desarrollo de la clase Pruebas.

- Desarrollo de pruebas para las clases ParticipanteTest y PinkGuardTest.

Daniel:

- Desarrollo de las clases enumeradas Armas, Departamentos y Rango.

- Desarrollo de pruebas para las clases ArmasTest, RangoTest, DepartamentosTest, InfiltradoExceptionTest, ParticipanteInfiltradoTest y SupervisorExceptionTest.

- Generación del reporte de cobertura para evaluar el porcentaje de código cubierto por las pruebas.

Miguel:

- Desarrollo de las clases Participante, Participante_Infiltrado, Manager, PinkGuard, Soldiers, SupervisorException, Workers e InfiltradoException.
- Documentación del proyecto utilizando Javadoc.
- Gestión del proyecto en GitHub Projects.
- Desarrollo del archivo README.md.

Aunque las tareas fueron distribuidas entre los miembros, todos colaboraron de manera activa en los diferentes aspectos del proyecto, como se refleja en los commits realizados a lo largo del desarrollo.

## 📝 Conclusiones

El desarrollo de Squirrel-Games ha sido una experiencia enriquecedora en la que hemos aprendido a utilizar diversas herramientas, como GitHub y Git Bash, para mejorar la colaboración en equipo. A lo largo del proceso, hemos comprobado la importancia de estas herramientas para gestionar el código de manera eficiente, trabajar en paralelo sin conflictos y mantener un historial claro de los cambios realizados. Este proyecto nos ha permitido consolidar nuestros conocimientos en Java y JUnit, así como perfeccionar nuestras habilidades en el uso de herramientas de desarrollo colaborativo.

Este proyecto representa no solo el desarrollo de un sistema de gestión de juegos, sino también una lección valiosa sobre la importancia del trabajo en equipo y la colaboración en el mundo del desarrollo de software.









