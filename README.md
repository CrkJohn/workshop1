# Workshop 1

![GitHub last commit](https://img.shields.io/github/last-commit/CrkJohn/workshop1.svg?style=for-the-badge)

Lenguaje manejado.

![90+%]( https://img.shields.io/github/languages/top/crkJohn/workshop1.svg?style=for-the-badge&colorB=red)

# Git Basic Concepts!
 - - - 
 

## (Gid add . ) What is the purpose of this command?

Agrega todos los cambios realizados que se han hecho en el proyecto al actual directorio.

## (git commit -m "Message".) Why we used it?
Es es el mensaje que se le asigna a los cambios hechos del proyecto.

# MAVEN
- - -
## Create Maven Project

### Create a new maven project using the command 
```
mvn archetype:generate -B -DgroupId=edu.eci -DartifactId=file-spy
```
- IMAGEN

### What do means the -B option in the command?
--batch-mode, Crea un proyecto de forma no interactiva y también deshabilita la salida de color en el
momento de la instalación
https://stackoverflow.com/questions/25896081/what-is-the-diffrence-between-interactive-and-batch-mode-in-maven

### What do means the -D option in the command?
Define una propiedad del sistema, en este caso define el groupId

### What do means the groupId, artifactId properties in the command?
GroupId es un identificador único universal para un proyecto, éste suele ser solo el nombre del proyecto
ArtifactId son las carpetas que se van a crear, ejemplo edu.eci, dentro de las carpetas predefinidas
src/main/java y src/test/java, crearán la extensión edu/eci

### Describe the content of the directory that has been created.

Crea una carpeta llamada src y un documento XML pom,
En la carpeta src se encuentran las carpetas
src/main/java/edu/eci en la que está el archivo App.java y 
src/test/java/edu/eci en la que está el archivo AppTest.java

### What do means the word SNAPSHOT in the version value?

- Es basicamente una version 1.0 en desarrollo, al estar en desarrollo descargarla hoy daría una archivo diferente al descargarlo mañana o ayer.

 
### What is the purpose of the packing tag into the POM file?
   
- El tag  packaging dentro del archivo pom significa la  aparencia del diseño del producto.
     - Tipos de aparecias:
        - WAR, web archive
        - EAR - enterprise archive
        - JAR -  Java archive
        - TAR- tape archives 
- En maven cuando no se declara el tag en el archivo pom, por defecto maven sabra que es un archivo JAR
-
### What is the purpose of the dependencies and dependency tags into the POM file?

El proposito de las dependencias es  construir y ejecutar correctamente el projecto en construcción, maven adminitra la lista de dependencias a demas maven descarga y vincula las dependencias de la compilación y incorpora las dependencias de esas dependencias (dependencias transitivas).
```xml
<!--- Estructura de una dependencia -->
   <dependencies>
        <dependency>
            <groupId> x </groupId>
            <artifactId> y </artifactId>
            <version>4.12</version>
            <type>jar</type>
            <scope>test</scope>
            <optional>true</optional>
        </dependency>
    </dependencies>
```

![Informacion de las dependencias y de los tags del cuerpo de dependecy](https://maven.apache.org/pom.html#Dependencies)
