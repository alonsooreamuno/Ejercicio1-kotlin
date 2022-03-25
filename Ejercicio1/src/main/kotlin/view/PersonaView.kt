package view
import model.Persona
import controler.PersonController

class PersonaView {

    private var controlador: PersonController = PersonController()

    fun menuPrincipal() {
        var opcion: Int
        do {
            println("------------------ MENU -------------------")
            println("1. Introducir persona con todos los datos.")
            println("2. Introducir persona menos peso y altura.")
            println("3. Introducir persona por defecto.")
            println("4. Comprobar IMC de las personas ingresadas.")
            println("5. Mostrar si las personas son mayores de edad.")
            println("6. Mostrar datos de personas ingresadas.")
            println("7. Salir")
            print("Opcion:")
            opcion = readln().toInt()

            when (opcion) {
                1 -> {
                    controlador.personas.add(this.crearPersonaDatos())
                }
                2 -> {
                    controlador.personas.add(this.crearPersonaMenosDatos())
                }
                3 -> {
                    controlador.personas.add(Persona())
                }
                4 -> {
                    this.comprobarIMCPersonas()
                }
                5 -> {
                    this.esMayorPersonas()
                }
                6 -> {
                    this.mostrarDatosPersonas()
                }
            }
        }while (opcion != 7)

    }
    private fun crearPersonaDatos():Persona {
        val nuevaPersona:Persona
        println("Digite la siguiente informacion:")
        print("Nombre:")
        val nombre= readln()
        print("Cedula:")
        val cedula= readln()
        print("Edad:")
        val edad= readln().toInt()
        print("Sexo (H / M):")
        val sexo= readLine()!![0]
        print("Peso:")
        val peso= readln().toDouble()
        print("Altura:")
        val altura= readln().toDouble()
        nuevaPersona = Persona(nombre,edad,cedula,sexo,peso,altura)
        return nuevaPersona
    }

     private fun crearPersonaMenosDatos():Persona {
        val nuevaPersona:Persona
        println("Digite la siguiente informacion:")
        print("Nombre:")
        val nombre= readln()
        print("Cedula:")
        val cedula= readln()
        print("Edad:")
        val edad= readln().toInt()
        print("Sexo (H / M):")
        val sexo= readln()[0]
        nuevaPersona = Persona(nombre,edad,cedula,sexo)
        return nuevaPersona
    }

    private fun comprobarIMCPersonas(){
        var msj:String
        println("IMC:")
        for(item in this.controlador.personas){
            msj = when (this.controlador.calcularIMC(item)){
                -1 -> "bajo de peso"
                0 -> "peso ideal"
                1 -> "sobre peso"
                else -> {
                    ""
                }
            }
            println(item.nombre + " " + msj)
        }
    }
    private fun esMayorPersonas(){
        println(" Personas segun edad: ")
        var msj: String
        for(item in this.controlador.personas){
            msj = if(this.controlador.esMayorDeEdad(item)){
                "es mayor de edad."
            }else{
                "NO es mayor de edad."
            }
            println( " - " +item.nombre + " " + msj)
        }
    }

    private fun mostrarDatosPersonas(){
        println(" Datos de las personas: ")
        for(item in this.controlador.personas){
            println("-> Nombre:" + item.nombre + " Edad:" +item.edad + " Cedula:"+item.cedula)
        }
    }

}