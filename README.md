# Academia_Java_Backend Curso_Java_SE_POO
# Bienvenido 😄
## Curso Programacion Orientada a Objetos Java

- El contenido de este repositorio son los ejercicios realizados durante el curso de java SE Orientado a objetos estos los realice basandome en las clases del curso de platzi.

Este curso se basa completamente en la teoria del paradigma de programacion orientado a objetos enfocado a java ,por lo que el nivel de detalle y complejidad es mas amplio ya que en estas lecciones vi temas de herencia,polimorfismo ,abstraccion e interfaces.
           ![i](https://cdn.freecourses.info/wp-content/uploads/2354046_4436.jpg "i")

Para este curso realice un poryceto integrador que es un sistema para generar citas medicas todo esto usando poo por lo que aplique lo mas posible a la modularidad en el proyecto.


# Contenido
La estructura del repositorio muestra los archivos .java con el nombre del objeto que representan las clases ,trabaje con el modelo vista,controlador por lo que separe la logica del negocio en el paquete model y la vista de la interfaz en terminal para que el usuario interactue con el programe en el paquete UI y el controlador desde donde se ejecuta el programa es la clase main 

### Clase User 👨‍💻 
En este proyecto uso una super clase que es user que sirve para contener los datos de un usuario ya sea del tipo Doctor,Nurse,Patient,esta clase contiene los atributos generales de un usuario por mloq ue cuenta con validaciones en los metodos set y contiene preferencias de vista en los metodos get ,con esta clase use polimorfismo para modificar el metodo toString.

### Clases Doctor,Nurse y Patient 🚑
En la clase *Doctor* tengo los atributos esepcificos que hacen a un doctor diferente de los otros usuarios,tambein inclui una clase anidada que es la que me ayuda a mostrar cuales son las citas disponibles con un metodo que me genera un array de objetos en los que veo la fecha y hora disponibles.

Despues en la clase *Nurse* y *Patient*solo la uso para determinar los atributos especificos para cada tipo de usuario por lo que solo use poliformismo para sobreescribir el metodo que funciona como una vista de datos del usuario.

### Clases Citas doctor y nurse👩🏻‍⚕️
Estas clases son para determinar el contenido de una cita dependiendo el tipo de usuario con el que se quiera agendar y tambien uso Implements para usar un metodo generico de la interface ISchedule.

### Interface ISchedulable 🚨
En esta parte en la interfaz solo tiene un metodo que muestra los datos de la cita agendada.

### Clase UIDoctor👨🏻‍⚕️
AQui tengo un metodo que sirve como un menu con switchcase en este metodo tengo metodos anidados en los cuales utilizo array poara crear objtos con las citas diponibles y el otro metodo anidado es para agendar cita ,la validacion de agendar cita consiste en buscar en la collection de las citas generadas para validar que no se repita una igual.
### Clase UIPatient💖
Esta clase me ayuda con un metodo para mostrar el menu de un paciente y de igual forma cuenta con metodos anidados en los cuales puedo ver las citas creadas y solitar una cita ,basicamente uso un poco de la misma logica del negocio que en doctor.
### Clase UIMenu🏥
Esta clase es mi vista de UI principal de la cual me ayuda a simular una validacion de usuario primitiva en la cual ingreso el correo y el usuario para poder idntificar que tipo de usuario es para esto de igual forma utilizo una collection de objetos para buscar si esta el usuario.



## Que aprendi y conclusiones
Este curso fue muy completo retome los conceptos de programacion Orientada a objetos y personalmente aprendi a perderle mas el miedo a java y aprovechar todo el potecial para hacer modular un proyecto y tener cierta independencia entre las clases para asi poder tener controlado mas los errores y que el proceso de testing sea mas facil.
Con respecto a los temas vistos me quedo muy claro el tema de las interface que era un tema en el que si tenia bastantes dudas y conoci la gran utilidad que pueden tener las clases abstractas esto para hacer mas genericos los metodos y poder usarlos en diferentes modulos ya que yo antes usaba solamente herencia ,considero que la poo con java es muy util para proyectos y realmente tengo muchisimas ganas de continuar en esta ruta de aprendizaje.



