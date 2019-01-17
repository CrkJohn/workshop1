# Workshop 1

![GitHub last commit](https://img.shields.io/github/last-commit/CrkJohn/workshop1.svg?style=for-the-badge)

Lenguaje manejado.

![90+%]( https://img.shields.io/github/languages/top/crkJohn/workshop1.svg?style=for-the-badge&colorB=red)

# Git Basic Concepts!


## (Gid add . ) What is the purpose of this command?

Agrega todos los cambios realizados que se han hecho en el proyecto al actual directorio.

## (git commit -m "Message".) Why we used it?
Es es el mensaje que se le asigna a los cambios hechos del proyecto.

# MAVEN

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
