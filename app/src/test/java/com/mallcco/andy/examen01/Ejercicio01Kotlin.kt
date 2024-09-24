package com.mallcco.andy.examen01

import org.junit.Test

class Ejercicio01Kotlin {

    @Test
    fun main(){
        // Se definen las palabras o strings que se quieren comparar
        val cadena1 = "listen"
        val cadena2 = "silent"

        val cadena3 = "hello"
        val cadena4 = "world"

        // se hace uso de la funcion definida sonAnagramas para la comparacion los 2 pares de cadena, mostrando en pantalla el resultado de True o False
        println("La cadena \"$cadena1\" y \"$cadena2\" son anagramas?: ${sonAnagramas(cadena1, cadena2)}")
        println("La cadena \"$cadena3\" y \"$cadena4\" son anagramas?: ${sonAnagramas(cadena3, cadena4)}")
    }

    // En esta funcion se verifican si las palabras definidas al inicio son anagramas
    private fun sonAnagramas(cadena1: String, cadena2: String): Boolean {
        // se usa la funcion lowercase() para no hacer las strings en minusculas y no tener problemas con las mayusculas, tambien se puede usar un uppercase()
        // tambien se convierten en listas de caracteres con tolist()
        // con sorted() se ordenan alfabeticamente
        // se almacenan en 2 variables cadena10ordenada y cadena20ordenada
        val cadena1Ordenada = cadena1.lowercase().toList().sorted()
        val cadena2Ordenada = cadena2.lowercase().toList().sorted()

        // se muestra como quedan las listas de caracteres ordenadas
        println("Lista de caracteres ordenada para \"$cadena1\": $cadena1Ordenada")
        println("Lista de caracteres ordenada para \"$cadena2\": $cadena2Ordenada")

        // se hace una comparacion entre las listas y si es verdadero, se devuelve True, caso contrario, False

        return cadena1Ordenada == cadena2Ordenada
    }
}