package model

import kotlin.math.pow

class Persona {
    var nombre:String
    var edad:Int
    var cedula:String
    var sexo:Char
    var peso: Double
    var altura: Double
    constructor(){
        this.nombre= "N/A"
        this.edad = 0
        this.cedula="N/A"
        this.sexo='H'
        this.peso=0.0
        this.altura=0.0
        this.personaToSring()
    }
    constructor(nombre_:String, edad_:Int,cedula_: String,sexo_:Char)
    {
        this.nombre= nombre_
        this.edad = edad_
        this.cedula=cedula_
        this.sexo=this.comprobarSexo(sexo_)
        this.peso=0.0
        this.altura=0.0
        this.personaToSring()
    }
    constructor(nombre_:String, edad_:Int,cedula_:String,sexo_:Char,peso_:Double,altura_:Double)
    {
        this.nombre= nombre_
        this.edad = edad_
        this.cedula=cedula_
        this.sexo=this.comprobarSexo(sexo_)
        this.peso=peso_
        this.altura=altura_
        this.personaToSring()
    }

    fun calcularIMC(): Int {
        val imc:Double = this.peso/ this.altura.pow(2.0)
        return when {
            imc < 18.5 -> -1
            imc > 42.9 -> 1
            else -> {
                0
            }
        }
    }
    fun esMayorDeEdad(): Boolean {
        if (this.edad >17) return true
        return false
    }
    private fun comprobarSexo(sexo_: Char): Char{
        if(sexo_ != 'H' && sexo_ != 'M') return 'H'
        return sexo_
    }
    private fun personaToSring(){
        println("--------Persona Ingresada----------")
        println("Nombre: "+ this.nombre)
        println("Edad: "+ this.edad)
        println("Sexo: "+ this.sexo)
        println("Cedula: "+ this.cedula)
        println("Peso: "+ this.peso)
        println("Altura "+ this.altura)
        println("-----------------------------------")
    }
}