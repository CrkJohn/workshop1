# WORKSHOP1

![GitHub last commit](https://img.shields.io/github/last-commit/CrkJohn/workshop1.svg?style=for-the-badge)

**Lenguaje manejado.**     ![90+%]( https://img.shields.io/github/languages/top/crkJohn/workshop1.svg?style=for-the-badge&colorB=red)

###### Integrantes
- [John David Ibañez](https://github.com/CrkJohn)
- [Juan Camilo Velandia](https://github.com/jcamilovelandiab)
------------
[PARTE DE MAVEN BASIC](https://github.com/CrkJohn/MavenBasic.git)


# Git Basic Concepts!

 

## What is the purpose of this command?
```
Gid add . 
```
Agrega todos los cambios realizados que se han hecho en el proyecto al actual directorio.

##  Why we used it?
```
git commit -m "Message"
```
Es es el mensaje que se le asigna a los cambios hechos del proyecto.

## Using the push command 
```
git push origin master
```
El propósito de esta linea es empujar(push) los cambios realizados en el proyecto o repositorio, al origen del servidor remoto, en la rama principal (master branch).

## Cloning our repository
```
git clone <repository>
```
Éste comando es utilizado para apuntar hacia un repositorio existente y crear un clon o una copia del repositorio destino.

## Using pull command
```
git pull origin master
```

El comando extrae los cambios que se han hecho al repositorio remoto de origen,
y los mezcla con la rama local, actualizando el repositorio local.

---

# MAVEN
## Create Maven Project

### Create a new maven project using the command 
```
mvn archetype:generate -B -DgroupId=edu.eci -DartifactId=file-spy
```

Ejecutamos la linea y en seguida se creará el proyecto maven.

![](https://github.com/CrkJohn/workshop1/blob/master/imagenes/batchMode.PNG)
![](https://github.com/CrkJohn/workshop1/blob/master/imagenes/buildSuccess.PNG)


### What do means the -B option in the command?

batch-mode (modo por lotes), Crea un proyecto de forma no interactiva, es decir utilizará automáticamente los valores predeterminados que están en la configuración de maven, también deshabilita la salida de color en el momento de la instalación.


### What do means the -D option in the command?
Define una propiedad del sistema, en este caso define el groupId

### What do means the groupId, artifactId properties in the command?

GroupId es un identificador único universal para un proyecto, éste suele ser solo el nombre del proyecto.
ArtifactId son las carpetas que se van a crear, ejemplo edu.eci, dentro de las carpetas predefinidas
src/main/java y src/test/java, crearán la extensión edu/eci

### Describe the content of the directory that has been created.

Crea una carpeta llamada src y un documento XML pom, En la carpeta src se encuentran las carpetas src/main/java/edu/eci en la que está el archivo App.java y  src/test/java/edu/eci en la que está el archivo AppTest.java

## POM file

### What do means the word SNAPSHOT in the version value?

Una versión instantánea en Maven que no ha sido lanzada. Es básicamente una versión 1.0 en desarrollo, al estar en desarrollo descargarla hoy daría un archivo diferente al descargarlo ayer o mañana.

### What is the purpose of the packing tag into the POM file?
   
- El tag  packaging dentro del archivo pom significa la  aparencia del diseño del producto.
     - Tipos de aparecias:
        - WAR, web archive
        - EAR - enterprise archive
        - JAR -  Java archive
        - TAR- tape archives 
- En maven cuando no se declara el tag en el archivo pom, por defecto maven sabrá que es un archivo JAR

### What is the purpose of the dependencies and dependency tags into the POM file?

El propósito de las dependencias es  construir y ejecutar correctamente el projecto en construcción, maven administra la lista de dependencias además maven descarga y vincula las dependencias de la compilación e incorpora las dependencias de esas dependencias (dependencias transitivas).
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

[Informacion de las dependencias y de los tags del cuerpo de dependecy](https://maven.apache.org/pom.html#Dependencies)

## Dependency Management

### Go to the MVNRepository and search fortika-core library. Add a new dependency to the POM file with the last version of this library.

```xml
<!-- https://mvnrepository.com/artifact/org.apache.tika/tika-core -->
<dependency>
    <groupId>org.apache.tika</groupId>
    <artifactId>tika-core</artifactId>
    <version>1.20</version>
</dependency>
```

### What is the functionality of this class?

Ésta clase vigila una carpeta en específico, en este caso se está apuntando desde el código a la carpeta "C:\\Users\\DiegoPT\\Downloads\\temp", y muestra un mensaje en consola cuando se crea un archivo tipo .txt .csv.

## Building Lifecycles and Plugins


### The three principal Maven lifecycles areclean, default and site. Describe each one.

- Clean, limpia los archivos y directorios generados por la construcción de un proyecto maven
- Default, este ciclo de vida genera, compila, empaqueta, etc, el código fuente, no se puede ejecutar el ciclo de vida default directamente, como lo es con Clean y Site, en su lugar ejecuta una fase de vida específica.
Las fases de vida más comunes dentro del ciclo de vida default son:
   
    - Validate, valida que el proyecto está correcto y que toda la información necesaria está disponible, esto también asegura que las dependendecias hayan sido descargadas.
    
    - Compile, compila el codigo fuente del proyecto
    
    - Test, corre todas las pruebas sobre el código fuente.
    
    - Package, Empaqueta todo el código en un formato distribuible como el JAR.
     
    - Install, Instala el paquete en un repositorio local para que otros repositorios locales pueden usar la dependencia
    
    - Deploy, copia el paquete final en el repositorio remoto para compartirlo con otros desarrolladores y proyectos.

- Site, éste comando permite compilar el código hasta cierto ciclo de vida.

### Using the terminal execute the command mvn compile.
![](https://github.com/CrkJohn/workshop1/blob/master/imagenes/mvnCompile.PNG)

**What is this command using for?**
Si se quiere compilar las fuentes java,  para eso se ejecuta el comando 
*$ mvn compile* en la raíz de nuestro proyecto. 

**What are transitive dependencies?**
Son las dependencias de las dependencias que tenemos en el proyecto en construccion.

### Using the terminal execute the command mvn package

![](https://github.com/CrkJohn/workshop1/blob/master/imagenes/mvnPackage1.PNG)
![](https://github.com/CrkJohn/workshop1/blob/master/imagenes/mvnPackage2.PNG)

**What is this command using for?**
Si se quiere crear el ejecutable del packaging file del proyecto se ejecuta 
el comando *mvn package* , genera el desplegable del proyecto, si se quieren eliminar artefactos de las compilaciones anteriores se utiliza **clean** es decir *mvn clean package*


###  Using the terminal execute the command mvn install. 

![](https://github.com/CrkJohn/workshop1/blob/master/imagenes/mvnInstall.PNG)

**What is this command using for?**
Si ejecuta el comando *mvn install*, los artefactos generados se instalan en el repositorio local de Maven.


### Generate a new maven project
Ejecutamos la siguiente línea de código
```
mvn archetype:generate -B -DgroupId=edu.eci -DartifactId=another-maven-project
```
![](https://github.com/CrkJohn/workshop1/blob/master/imagenes/anotherMavenProject.PNG)

