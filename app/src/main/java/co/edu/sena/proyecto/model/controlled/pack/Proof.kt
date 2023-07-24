package co.edu.sena.proyecto.model.controlled.pack

fun main() {

    val ob = MainActivity()

    do {
        var init: Boolean = true;
        val result: String
        ob.tex()
        println("selecciona tu respuesta ")
        val answer = readLine()!!.toInt()
        when (answer) {
            1 -> {
                result = ob.area()
                println(result)
            }

            2 -> {
                result = ob.addition()
                println(result)
            }

            3 -> {
                result = ob.elevation()
                println(result)
            }

            4 -> {
                result = ob.convert()
                println(result)
            }

            5 -> {
                result = ob.square()
                println(result)
            }

            6 -> {
                result = ob.cylinder()
                println(result)
            }

            7 -> {
                result = ob.circle()
                println(result)
            }

            8 -> {
                result = ob.numbers()
                println(result)
            }

            9 -> {
                result = ob.positive()
                println(result)
            }

            10 -> {
                ob.elderly()
            }

            11 -> {
                result = ob.three()
                println(result)
            }

            12 -> {
                result = ob.choice()
                println(result)
            }

            13 -> {
                result = ob.quotient()
                println(result)
            }

            14 -> {
                result = ob.case()
                println(result)
            }

            15 -> {
                result = ob.leapYear()
                println(result)
            }

            16 -> {
                ob.multiples()
            }

            17 -> {
                ob.odd()
            }

            18 -> {
                ob.pair()
            }

            19 -> {
                ob.room()
            }

            20 -> {
                result = ob.five()
                println(result)
            }

            21 -> {
                ob.six()
            }

            22 -> {
                result = ob.seven()
                println(result)
            }
        }

        if (answer in 23..98) {
            println("escribistes un numero no valido")
            println("elige otra opcion")
        } else if (answer == 99) {
            init = false
        }


    } while (init)
}