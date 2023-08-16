package com.fsg.notasmedias.model

import java.util.function.DoubleBinaryOperator

class Alumno {

    var nombre: String
        get () { return nombre}
        set (value) {nombre = value}

    var nota: Double
        get() {return nota}
        set(value) {nota = value}

    constructor(nombre: String, nota: Double) {
        this.nombre = nombre
        this.nota = nota
    }
}