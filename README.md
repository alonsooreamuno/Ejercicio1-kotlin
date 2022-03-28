# kotlin-ejercicio1

#instrucciones de ejercicio

Ejercicio 1

Haz una clase llamada Persona que siga las siguientes condiciones: 

Sus atributos son: nombre, edad, cédula, sexo (H hombre, M mujer), peso y altura.  
Por defecto, todos los atributos menos la cédula  serán valores por defecto según su tipo (0 números, cadena vacía para String, etc.) 

Se implantaran varios constructores: 
-Un constructor por defecto. 
-Un constructor con el nombre, edad y sexo, el resto por defecto. 
-Un constructor con todos los atributos como parámetro. 

Los métodos que se implementaran son: 

-calcularIMC(): calculara si la persona esta en su peso ideal (peso en kg/(altura^2  en m)), devuelve un -1 si esta por debajo de su peso ideal, un 0 si esta en su peso ideal y un 1 si tiene sobrepeso . Usa constantes para devolver estos valores. 
-esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano. 
-comprobarSexo(char sexo): comprueba que el sexo introducido es correcto. Si no es correcto, sera H. No sera visible al exterior. 
-toString(): devuelve toda la información del objeto correspondiente. Este método sera invocado cuando se construya el objeto. Puedes dividir el método para que te sea más fácil. No será visible al exterior. 

Ahora, crea una clase ejecutable que haga lo siguiente: 

Pide por teclado el nombre, la edad, sexo, peso y altura. 
Crea 3 objetos de la clase anterior, el primer objeto obtendrá las anteriores variables pedidas por teclado, el segundo objeto obtendrá todos los anteriores menos el peso y la altura y el último por defecto, para este último utiliza los métodos set para darle a los atributos un valor. 
Para cada objeto, deberá comprobar si esta en su peso ideal, tiene sobrepeso o por debajo de su peso ideal con un mensaje. 
Indicar para cada objeto si es mayor de edad. 
Por último, mostrar la información de cada objeto. 



Ejercicio 2 

 

Crearemos una clase llamada Serie con las siguientes características: 

Sus atributos son titulo, numero de temporadas, entregado, genero y creador. 

Por defecto, el numero de temporadas es de 3 temporadas y entregado false. El resto de atributos serán valores por defecto según el tipo del atributo. 

Los constructores que se implementaran serán: 

Un constructor por defecto. 

Un constructor con el titulo y creador. El resto por defecto. 

Un constructor con todos los atributos, excepto de entregado. 

Los métodos que se implementara serán: 

 

Crearemos una clase Videojuego con las siguientes características: 

Sus atributos son titulo, horas estimadas, entregado, genero y compañia. 

Por defecto, las horas estimadas serán de 10 horas y entregado false. El resto de atributos serán valores por defecto según el tipo del atributo. 

Los constructores que se implementaran serán: 

Un constructor por defecto. 

Un constructor con el titulo y horas estimadas. El resto por defecto. 

Un constructor con todos los atributos, excepto de entregado. 

Los métodos que se implementara serán: 

 

Como vemos, en principio, las clases anteriores no son padre-hija, pero si tienen en común, por eso vamos a hacer una interfaz llamada Entregable con los siguientes métodos: 

entregar(): cambia el atributo prestado a true. 

devolver(): cambia el atributo prestado a false. 

isEntregado(): devuelve el estado del atributo prestado. 

Implementa los anteriores métodos en las clases Videojuego y Serie. Ahora crea una aplicación ejecutable y realiza lo siguiente: 

Crea dos arrays, uno de Series y otro de Videojuegos, de 5 posiciones cada uno. 

Crea un objeto en cada posición del array, con los valores que desees, puedes usar distintos constructores. 

Entrega algunos Videojuegos y Series con el método entregar(). 

Cuenta cuantos Series y Videojuegos hay entregados. Al contarlos, devuélvelos. 

 

 

Ejercicio 3 

 

Nos piden hacer una un programa que gestione empleados. 

Los empleados se definen por tener: 

Nombre 

Edad 

Salario 

 

También tendremos una constante llamada PLUS, que tendrá un valor de $300 

Tenemos dos tipos de empleados: repartidor y comercial. 

El comercial, aparte de los atributos anteriores, tiene uno más llamado comisión (double). 

El repartidor, aparte de los atributos de empleado, tiene otro llamado zona (String). 

Crea sus constructores (piensa como aprovechar la herencia). 

No se podrán crear objetos del tipo Empleado (la clase padre) pero si de sus hijas. 

Las clases tendrán un método llamado plus, que según en cada clase tendrá una implementación distinta. Este plus básicamente aumenta el salario del empleado. 

En comercial, si tiene más de 30 años y cobra una comisión de más de $200, se le aplicara el plus. 

En repartidor, si tiene menos de 25 años  y reparte en la “zona 3”, este recibirá el plus. 

Puedes hacer que devuelva un booleano o que no devuelva nada, lo dejo a tu elección. 

Crea una clase ejecutable donde crees distintos empleados y le apliques el plus para comprobar que funciona. 

 
