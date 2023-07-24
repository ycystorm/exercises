package co.edu.sena.proyecto.model.controlled.pack

import androidx.activity.ComponentActivity
import androidx.compose.runtime.Composable
import kotlin.math.pow
import kotlin.math.roundToLong

class MainActivity () {

    //operadores
    //primer ejercicio
    fun area():String{
        var result:Int;
        var fin:String= ""
        println("por favor ingresa la base de tu triangulo ");
        val base = readLine()!!.toInt();
        println("por favor ingresa la altura de tu triangulo ");
        val altura= readLine()!!.toInt();
        result =(base*altura)/2;
        fin=result.toString()
        return fin;
    }
    //segundo ejercicio
    fun addition():String{
        var result:Int;
        var fin:String= ""
        println("por favor ingresa el primer numero ");
        val num1 = readLine()!!.toInt();
        println("por favor ingresa el segundo numero");
        val num2 = readLine()!!.toInt();
        result=num1+num2;
        fin= result.toString()
        return fin;
    }
    //tercer ejercicio
    fun elevation():String{
        var result:Int;
        var fin:String= ""
        println("por favor ingresa el numero el cual desea elevar ala cuadrado");
        val num1 = readLine()!!.toInt();
        result = num1 * num1;
        fin=result.toString()
        return fin;
    }
    //cuarto ejercicio
    fun  convert():String{
        var dollar:Double=1.11;
        var fin:String= ""
        var result:Double=0.00;
        println("ingresa la cantidad de Euros para la conversion ")
        val euros = readLine()!!.toDouble();
        result= euros * dollar
        fin=result.toString()
        return fin;
    }
    //quinto ejercicio revisar
    fun square():String{
        var area:Double=0.00;
        var perimeter:Double=0.00;
        var volume:Double=0.00;
        var result= "";
        var reduce= "";
        println("ingresa el valor del lado ")
        val side= readLine()!!.toDouble();
        area= side.pow(2);
        reduce = "%.2f".format(area);
        perimeter = side+side+side+side;
        result = " el area es "+ reduce +   " el perimetro es " + perimeter.toString()
        return result;
    }
    //sexto ejercicio
    fun cylinder():String{
        var area:Double=0.00;
        var pi:Double=3.1415;
        var result:String= "";
        var volume:Double=0.00;
        println("ingresa el radio")
        val radio= readLine()!!.toDouble();
        println("ingresa la altura")
        val height = readLine()!!.toDouble();
        area=(2*pi*radio) * (radio+height)
        volume=(pi*radio.pow(2))*height
        result=" el area es %.2f".format(area) + " el volumen es %.2f".format(volume)
        return result
    }

    //septimo ejercicio
    fun circle():String{
        var area:Double=0.00;
        var pi:Double=3.1415;
        var result:String= "";
        var length:Double=0.00;
        var mim:String= "";
        println("por favor escriba el radio del circulo")
        val radio = readLine()!!.toDouble();
        area = pi*(radio.pow(2));
        mim ="%.4f".format(area);
        length = (2*pi)*radio;
        result = "el area es " +  mim + " la longitud  es " + length.toString();
        return result;
    }
    //octavo ejercicio
    fun numbers():String{
        var average:Double = 0.00;
        var result:String = "";
        println("ingresa el primer numero");
        val num1= readLine()!!.toDouble();
        println("ingresa el segundo numero");
        val num2 = readLine()!!.toDouble();
        println("ingresa el tercer numero")
        val num3 = readLine()!!.toDouble();
        average=(num1+num2+num3)/3
        result= "su promedio es %.2f".format(average)
        return result
    }

    //condicionales

    //primer ejercicio
    fun positive():String{
        var result:String= "";
        println("ingresa un numero ");
        val num1= readLine()!!.toInt();
        if (num1>=0){
            result=num1.toString() + " es un numero  positivo "
        }else{
            result=num1.toString() + " es un numero  negativo "
        }
        return result;
    }

    //segundo ejercicio
    fun elderly(){

        print("Ingrese el primer número: ")
        val numero1 = readLine()!!.toDouble()

        print("Ingrese el segundo número: ")
        val numero2 = readLine()!!.toDouble()

        // Determinar cuál es el mayor y cuál es el menor
        val mayor = if (numero1 > numero2) numero1 else numero2
        val menor = if (numero1 < numero2) numero1 else numero2

        // Mostrar los resultados
        println("El número mayor es: $mayor")
        println("El número menor es: $menor")
    }


    //tercer ejercicio
    fun three():String{
        var result:String = "";
        println("ingrese el primer numero");
        val num1= readLine()!!.toInt();
        println("ingresa el segundo numero");
        val num2= readLine()!!.toInt();
        println("ingresa el tercer numero");
        val num3 = readLine()!!.toInt();
        if (num1>0 && num2>0 && num3>0){
            val elderly = maxOf(num1,num2,num3)
            val minor = minOf(num1,num2,num3)
            result = "el numero mayor es $elderly y el numero menor es $minor"
        }else{
            println("un numero o varios son  negativo")
        }
        return result;
    }
    //cuarto ejercicio
    fun choice():String{
        var result:String = "";
        var operation:Int = 0;
        println("ingresa el primer numero entero");
        val num1 = readLine()!!.toInt();
        println("ingresa el segundo numero entro ");
        val num2 = readLine()!!.toInt();
        if (num1<num2){
            operation=num1+num2
            result="el resultado de la suma es $operation"
        }else{
            operation=num1-num2;
            result="el resultado de la resta es $operation"
        }
        return result;
    }

    //quinto ejercicio
    fun quotient():String{
        var operation:Double = 0.00;
        var result:String= "";
        var minimum:String = "";
        println("ingresa el primer numero")
        val num1= readLine()!!.toDouble()
        println("ingres el segundo numero")
        val num2 = readLine()!!.toDouble();
        if (num2 != 0.00){
            operation= num1/num2
            minimum=  "%.2f".format(operation)
            result =" el cocinete de la division es $minimum"

        }else{
            result = "la división no es posible "

        }
        return result;
    }
    //sexto ejercicio
    fun case():String{
        var result:String= "";
        var operation:Double = 0.00;
        var minimum:String = "";
        println("ingresa el primer numero");
        val  num1= readLine()!!.toDouble();
        println("ingresa el segundo numero");
        val num2= readLine()!!.toDouble();
        if (num1<0 || num2<0){
            operation= num1+num2
            minimum=  "%.2f".format(operation)
            result =" el resultado de la suma es $minimum"
        }else{
            operation=num1*num2
            minimum=  "%.2f".format(operation)
            result =" el resultado de la multiplicacion es  $minimum"
        }
        return result
    }

    //septimo ejercicio
    fun leapYear():String{
        var result:String= "";
        println("ingresa el año");
        val year = readLine()!!.toInt();
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            result="$year es un año bisiesto.";
        }else{
            result="$year no es un año bisiesto.";
        }
        return result;
    }
    // ciclos

    //primer ejercicio

    fun multiples(){
        for (i in 1..100){
            if (i %3==0){
                println("$i es multipo de 3")
            }
        }
    }
    //segundo ejercicio
    fun odd(){
        for (i in 1..100 step 2){
            if (i %3==0){
                println("$i es impar")
            }
        }
    }
    //tercer ejercicio
    fun pair(){
        for (i in 1..100 step 1){
            if (i %2==0){
                println("$i es par ")
            }
        }
    }
    //cuarto ejercicio
    fun room(){
        for (i in 1..30){
            println(" el cuadrao de  $i  es  "+ i*i)
        }
    }

    //quinto ejercicio
    fun five():String{
        var result:String= "";
        var accumulator:Int=0;
        var squares:Int=0;
        for (i in 1..100){
            squares=i*i;
            accumulator+=squares;
        }
        result="la suma total es $accumulator";
        return result
    }
    //sexto ejercicio
    fun six(){
        println("ingresa el primer numero");
        val num1 = readLine()!!.toInt();
        println("ingresa el sergundo numero");
        val num2 = readLine()!!.toInt();
        if (num1 >= num2) {
            println("El primer número debe ser menor que el segundo.")
        }
        for (i in num1 + 1 until num2) {
            println(i)
        }
    }

    //septimo ejercicio
    fun seven():String{
        var result:Double =0.00;
        var answer:String = "";
        do {
            println("ingresa un numero, 0 es para salir  ")
            val num1 = readLine()!!.toDouble()
            result+=num1;
        }while (num1 != 0.00)
        answer=result.toString()
        return answer;
    }

    fun tex(){
        println("Operadores")
        println("1 Calcular el area de un triangulo")
        println("2 Ingresar dos números por teclado y sumarlos")
        println("3 Ingresar un número y visualizar el número elevado al cuadrado ")
        println("4 Convierta de euros a dólares")
        println("5 Calcular el area y el perimetro de un cuadrado con la medida de un lado ")
        println("6 Calcular el area y el volumen de un cilindro")
        println("7 Calcular el area y la circuferencia de un circulo con el readio")
        println("8 Calacular el promedio de tres numeros ingresados por teclado ")
        println("Condicionales ")
        println("9  Saber si el numero ingresado es positivo o negativo")
        println("10 Escribir dos numeros por teclado y saber cual es el mayor y el menor ")
        println("11 Ingrese tres numeros positivos y saber cual es el menor y mayor ")
        println("12 Da dos números A y B, sumarlos si A es menor que B o sino restarlos")
        println("13 Da dos numeros A Y B , para encontrar el conciente entre A y B  no estan permitidas las dividiones en 0")
        println("14 Da dos números A y B, sumarlos si al menos uno de ellos es negativo, en caso contrario multiplitcarlos" )
        println("15 Saber si un año es bisiesto o no ")
        println("Ciclos")
        println("16 Imprimir todos los múltiplos de 3 que hay entre 1 y 100")
        println("17 Imprimir los números impares entre 0 y 100")
        println("18 Imprimir los números pares del 1 al 100")
        println("19 Imprimir por pantalla los cuadrados de los números del 1 al 30")
        println("20 Imprimir la sumatoria de los cuadrados de los cien primeros números naturales")
        println("21 Dados dos números naturales, el primero menor que el segundo, generar y mostrar todos los números comprendidos entre ellos en secuencia ascendente")
        println("22 Sumar todos los números que se digitan por teclado mientras no sea cero")
        println("99 es para salir del programa ")
    }

}

