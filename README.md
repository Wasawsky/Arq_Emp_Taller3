# Clientes y Servicios

Arquitecturas Empresariales 2020-2

## Generalidades

https://whispering-badlands-84825.herokuapp.com/

Este repositorio presenta taller de cliente y servicios de arquitecturas empresariales, usando las herramientas Maven, Heroku, Git y JAVA para su desarrollo.


### Prerrequisitos

Para poder usar este repositorio necesitara instalar Maven en su computador.
http://maven.apache.org/download.html

Puede encontrar la guía para la instalación desde:
http://maven.apache.org/download.html#Installation

También necesitara tener la versión más reciente de Java y jdk actualizados.

Si necesita ejecutar el servidor web con heroku, debe instalar el CLI que ofrece heroku, ingrese con su usuario y contraseña.
https://www.heroku.com

Instale git si aún no lo tiene instalado en su computador.

Lo puede encontrar y seguir los pasos de su instalación en:
https://git-scm.com/book/en/v2/Getting-Started-Installing-Git

Use un framework como Visual Studio Code, IntelliJ o alguno de su preferencia para más comodidad cuando use este repositorio.


### Preparando el espacio de trabajo

Cuando esté preparado abra un directorio en su computador donde quiera trabajar.

Ejecuta la consola de comandos desde el directorio y escribe en la línea de comandos

```
git clone https://github.com/Wasawsky/Arq_Emp_Taller3.git

```

Se le creara una carpeta llamada Arq_Emp_Taller3 en el directorio, es este repositorio desde donde trabajara.

Ingrese a la carpeta y ejecute la consola de comandos, o usando un framework de desarrollo abra la carpeta.

Desde la consola de comandos y estando en el repositorio escriba

```
mvn package
```

Para que se ejecute el POM.xml del proyecto.
Se descargarán librerías que necesitara el proyecto, puede tardar algunos minutos si es la primera vez que ejecuta el comando.

## Despliegue Local

Si necesita ejecutar localmente el servidor, use el siguiente comando para ejecutarlo desde cmd de Windows

```
web: java -cp target/classes;target/dependency/* co.edu.escuelaing.sparkd.SparkD.micro.MicroBoot
```
Abra su navegador y busque la direccion web:

http://localhost:4567/index.html

Si desea usar heroku para el despliegue local, coloque en la consola el comando

```
heroku local web
```

Abra su navegador y busque la direccion web:


http://localhost:5000/index.html

### Funcionalidades

Este proyecto, desplegado en heroku, permite acceder a los recursos que tiene el servidor, entre ellos

- form.html
- /css/style.css
- gato.jpg
- index.html

Adicionalmente, se conecta a una base de datos para consultar los datos de un pedido.

https://whispering-badlands-84825.herokuapp.com/Apps/report

## Uso

Puede ejecutar el método principal de la clase MicroSpBoot.java desde la consola de comandos para iniciar el servidor, ejecute la clase DBConnection.java para verificar la conexion con la base de datos.


## Construido con

* [Maven](https://maven.apache.org/) - Dependency Management
* [GIT](https://git-scm.com/) - Environment Version Control System
* [Java](https://www.java.com/es/) - General-purpose programming language
* [Heroku](https://www.heroku.com) - Cloud platform as a service

## Sobre el autor

*Michael Ballesteros*

Apasionado por el desarrollo y la gestión de sistemas

## Licencia

Para más información de la licencia ver LICENSE.md

Para más proyectos, Sígueme y encuentra mis repositorios :D


