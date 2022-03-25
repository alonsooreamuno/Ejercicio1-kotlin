# kotlin-ejercicio1

#instrucciones de ejercicio

1) Haz una clase llamada Persona que siga las siguientes condiciones: 

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
