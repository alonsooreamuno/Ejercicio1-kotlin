package controler
import model.Persona

class PersonController {

    var personas:ArrayList<Persona> = ArrayList()

    fun calcularIMC(persona_: Persona): Int {
        return persona_.calcularIMC()
    }

    fun esMayorDeEdad(persona_: Persona): Boolean {
       return persona_.esMayorDeEdad()
    }
}