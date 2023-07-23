import kotlin.math.pow

fun main() {
    var option: Int

    do {
        println("***** Menú *****")
        println("1. Operadores")
        println("2. Condicionales")
        println("3. Ciclos")
        println("0. Salir")
        print("Seleccione una opción: ")
        option = readLine()?.toIntOrNull() ?: 0

        when (option) {
            1 -> runOperadores()
            2 -> runCondicionales()
            3 -> runCiclos()
            0 -> println("Saliendo del programa.")
            else -> println("Opción inválida. Intente nuevamente.")
        }
        println()
    } while (option != 0)
}

fun runOperadores() {
    var option: Int

    do {
        println("***** Menú de Operadores *****")
        println("1. Calcular el área de un triángulo.")
        println("2. Ingresar dos números por teclado y sumarlos.")
        println("3. Ingresar un número y visualizar el número elevado al cuadrado.")
        println("4. Convertir de euros a dólares.")
        println("5. Calcular área y perímetro de un cuadrado.")
        println("6. Calcular área y volumen de un cilindro.")
        println("7. Calcular longitud y área de una circunferencia.")
        println("8. Calcular el promedio de tres números.")
        println("0. Volver al menú principal")
        print("Seleccione una opción: ")
        option = readLine()?.toIntOrNull() ?: 0

        when (option) {
            1 -> calcularAreaTriangulo()
            2 -> sumarDosNumeros()
            3 -> elevarNumeroAlCuadrado()
            4 -> convertirEurosADolares()
            5 -> calcularAreaYPerimetroCuadrado()
            6 -> calcularAreaYVolumenCilindro()
            7 -> calcularLongitudYAreaCircunferencia()
            8 -> calcularPromedioTresNumeros()
            0 -> println("Volviendo al menú principal.")
            else -> println("Opción inválida. Intente nuevamente.")
        }
        println()
    } while (option != 0)
}

fun runCondicionales() {
    var option: Int

    do {
        println("***** Menú de Condicionales *****")
        println("1. Determinar si un número es positivo o negativo.")
        println("2. Encontrar el mayor y el menor de dos números.")
        println("3. Encontrar el mayor y el menor de tres números.")
        println("4. Sumar o restar dos números según la comparación.")
        println("5. Encontrar el cociente entre dos números.")
        println("6. Sumar o multiplicar dos números según su signo.")
        println("7. Determinar si un año es bisiesto.")
        println("0. Volver al menú principal")
        print("Seleccione una opción: ")
        option = readLine()?.toIntOrNull() ?: 0

        when (option) {
            1 -> determinarPositivoNegativo()
            2 -> encontrarMayorYMenorDosNumeros()
            3 -> encontrarMayorYMenorTresNumeros()
            4 -> sumarORestarSegunComparacion()
            5 -> encontrarCociente()
            6 -> sumarOMultiplicarSegunSigno()
            7 -> determinarAnioBisiesto()
            0 -> println("Volviendo al menú principal.")
            else -> println("Opción inválida. Intente nuevamente.")
        }
        println()
    } while (option != 0)
}

fun runCiclos() {
    var option: Int

    do {
        println("***** Menú de Ciclos *****")
        println("1. Imprimir múltiplos de 3 entre 1 y 100.")
        println("2. Imprimir números impares entre 0 y 100.")
        println("3. Imprimir números pares del 1 al 100.")
        println("4. Imprimir cuadrados de los números del 1 al 30.")
        println("5. Sumar cuadrados de los cien primeros números naturales.")
        println("6. Mostrar números entre dos valores ascendente.")
        println("7. Sumar números ingresados hasta que sea cero.")
        println("0. Volver al menú principal")
        print("Seleccione una opción: ")
        option = readLine()?.toIntOrNull() ?: 0

        when (option) {
            1 -> imprimirMultiplosTres()
            2 -> imprimirNumerosImpares()
            3 -> imprimirNumerosPares()
            4 -> imprimirCuadradosDelUnoAlTreinta()
            5 -> sumarCuadradosPrimerosCienNumeros()
            6 -> mostrarNumerosEntreDosValoresAscendente()
            7 -> sumarNumerosIngresadosHastaCero()
            0 -> println("Volviendo al menú principal.")
            else -> println("Opción inválida. Intente nuevamente.")
        }
        println()
    } while (option != 0)
}

//Operadores

fun calcularAreaTriangulo() {
    println("Ingrese la base del triángulo:")
    val base = readLine()?.toDoubleOrNull()

    println("Ingrese la altura del triángulo:")
    val altura = readLine()?.toDoubleOrNull()

    if (base != null && altura != null && base > 0 && altura > 0) {
        val area = 0.5 * base * altura
        println("El área del triángulo es: $area")
    } else {
        println("Entrada inválida. La base y la altura deben ser números positivos.")
    }
}

fun sumarDosNumeros() {
    println("Ingrese el primer número:")
    val num1 = readLine()?.toDoubleOrNull()

    println("Ingrese el segundo número:")
    val num2 = readLine()?.toDoubleOrNull()

    if (num1 != null && num2 != null) {
        val suma = num1 + num2
        println("La suma de los números es: $suma")
    } else {
        println("Entrada inválida. Ambos valores deben ser números.")
    }
}

fun elevarNumeroAlCuadrado() {
    println("Ingrese un número:")
    val numero = readLine()?.toDoubleOrNull()

    if (numero != null) {
        val cuadrado = numero.pow(2)
        println("El número elevado al cuadrado es: $cuadrado")
    } else {
        println("Entrada inválida. Debe ingresar un número.")
    }
}

fun convertirEurosADolares() {
    println("Ingrese la cantidad de euros:")
    val euros = readLine()?.toDoubleOrNull()

    if (euros != null && euros >= 0) {
        val dolares = euros * 1.17 // Considerando una tasa de cambio de 1 euro = 1.17 dólares (valor aproximado)
        println("El valor en dólares es: $dolares")
    } else {
        println("Entrada inválida. El valor debe ser un número positivo.")
    }
}

fun calcularAreaYPerimetroCuadrado() {
    println("Ingrese el lado del cuadrado:")
    val lado = readLine()?.toDoubleOrNull()

    if (lado != null && lado >= 0) {
        val area = lado.pow(2)
        val perimetro = 4 * lado
        println("El área del cuadrado es: $area")
        println("El perímetro del cuadrado es: $perimetro")
    } else {
        println("Entrada inválida. El lado del cuadrado debe ser un número positivo.")
    }
}

fun calcularAreaYVolumenCilindro() {
    println("Ingrese el radio del cilindro:")
    val radio = readLine()?.toDoubleOrNull()

    println("Ingrese la altura del cilindro:")
    val altura = readLine()?.toDoubleOrNull()

    if (radio != null && altura != null && radio >= 0 && altura >= 0) {
        val areaBase = 3.1416 * radio.pow(2)
        val areaLateral = 2 * 3.1416 * radio * altura
        val areaTotal = 2 * areaBase + areaLateral
        val volumen = areaBase * altura
        println("El área total del cilindro es: $areaTotal")
        println("El volumen del cilindro es: $volumen")
    } else {
        println("Entrada inválida. El radio y la altura del cilindro deben ser números positivos.")
    }
}

fun calcularLongitudYAreaCircunferencia() {
    println("Ingrese el radio de la circunferencia:")
    val radio = readLine()?.toDoubleOrNull()

    if (radio != null && radio >= 0) {
        val longitud = 2 * 3.1416 * radio
        val area = 3.1416 * radio.pow(2)
        val areaCirculoInscrito = 3.1416 * radio.pow(2)
        println("La longitud de la circunferencia es: $longitud")
        println("El área de la circunferencia es: $area")
        println("El área del círculo inscrito es: $areaCirculoInscrito")
    } else {
        println("Entrada inválida. El radio de la circunferencia debe ser un número positivo.")
    }
}

fun calcularPromedioTresNumeros() {
    println("Ingrese el primer número:")
    val num1 = readLine()?.toDoubleOrNull()

    println("Ingrese el segundo número:")
    val num2 = readLine()?.toDoubleOrNull()

    println("Ingrese el tercer número:")
    val num3 = readLine()?.toDoubleOrNull()

    if (num1 != null && num2 != null && num3 != null) {
        val promedio = (num1 + num2 + num3) / 3
        println("El promedio de los tres números es: $promedio")
    } else {
        println("Entrada inválida. Los valores ingresados deben ser números.")
    }
}

// Condicionales

fun determinarPositivoNegativo() {
    println("Ingrese un número:")
    val numero = readLine()?.toDoubleOrNull()

    if (numero != null) {
        if (numero > 0) {
            println("El número ingresado es positivo.")
        } else if (numero < 0) {
            println("El número ingresado es negativo.")
        } else {
            println("El número ingresado es cero.")
        }
    } else {
        println("Entrada inválida. Debe ingresar un número.")
    }
}

fun encontrarMayorYMenorDosNumeros() {
    println("Ingrese el primer número:")
    val num1 = readLine()?.toDoubleOrNull()

    println("Ingrese el segundo número:")
    val num2 = readLine()?.toDoubleOrNull()

    if (num1 != null && num2 != null) {
        val mayor = if (num1 > num2) num1 else num2
        val menor = if (num1 < num2) num1 else num2
        println("El número mayor es: $mayor")
        println("El número menor es: $menor")
    } else {
        println("Entrada inválida. Ambos valores deben ser números.")
    }
}

fun encontrarMayorYMenorTresNumeros() {
    println("Ingrese el primer número:")
    val num1 = readLine()?.toIntOrNull()

    println("Ingrese el segundo número:")
    val num2 = readLine()?.toIntOrNull()

    println("Ingrese el tercer número:")
    val num3 = readLine()?.toIntOrNull()

    if (num1 != null && num2 != null && num3 != null) {
        val mayor = maxOf(num1, num2, num3)
        val menor = minOf(num1, num2, num3)
        println("El número mayor es: $mayor")
        println("El número menor es: $menor")
    } else {
        println("Entrada inválida. Los valores ingresados deben ser números.")
    }
}

fun sumarORestarSegunComparacion() {
    println("Ingrese el número A:")
    val a = readLine()?.toDoubleOrNull()

    println("Ingrese el número B:")
    val b = readLine()?.toDoubleOrNull()

    if (a != null && b != null) {
        val resultado = if (a < b) a + b else a - b
        println("El resultado es: $resultado")
    } else {
        println("Entrada inválida. Ambos valores deben ser números.")
    }
}

fun encontrarCociente() {
    println("Ingrese el dividendo (A):")
    val a = readLine()?.toDoubleOrNull()

    println("Ingrese el divisor (B):")
    val b = readLine()?.toDoubleOrNull()

    if (a != null && b != null) {
        if (b != 0.0) {
            val cociente = a / b
            println("El cociente entre A y B es: $cociente")
        } else {
            println("La división por cero no está definida. No es posible dividir entre cero.")
        }
    } else {
        println("Entrada inválida. Ambos valores deben ser números.")
    }
}

fun sumarOMultiplicarSegunSigno() {
    println("Ingrese el número A:")
    val a = readLine()?.toDoubleOrNull()

    println("Ingrese el número B:")
    val b = readLine()?.toDoubleOrNull()

    if (a != null && b != null) {
        val resultado = if (a < 0 || b < 0) a + b else a * b
        println("El resultado es: $resultado")
    } else {
        println("Entrada inválida. Ambos valores deben ser números.")
    }
}

fun determinarAnioBisiesto() {
    println("Ingrese un año:")
    val year = readLine()?.toIntOrNull()

    if (year != null) {
        val esBisiesto = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)

        if (esBisiesto) {
            println("El año $year es bisiesto.")
        } else {
            println("El año $year no es bisiesto.")
        }
    } else {
        println("Entrada inválida. Debe ingresar un año válido.")
    }
}

// Ciclos
fun imprimirMultiplosTres() {
    println("Múltiplos de 3 entre 1 y 100:")
        for (i in 1..100) {
            if (i % 3 == 0) {
                print("$i ")
            }
        }
        println()
}

    fun imprimirNumerosImpares() {
        println("Números impares entre 0 y 100:")
        for (i in 1..100 step 2) {
            print("$i ")
        }
        println()
    }

    fun imprimirNumerosPares() {
        println("Números pares del 1 al 100:")
        for (i in 2..100 step 2) {
            print("$i ")
        }
        println()
    }

    fun imprimirCuadradosDelUnoAlTreinta() {
        println("Cuadrados de los números del 1 al 30:")
        for (i in 1..30) {
            val cuadrado = i.toDouble().pow(2)
            print("$cuadrado ")
        }
        println()
    }

    fun sumarCuadradosPrimerosCienNumeros() {
        var suma = 0.0
        for (i in 1..100) {
            suma += i.toDouble().pow(2)
        }
        println("La suma de los cuadrados de los cien primeros números naturales es: $suma")
    }

    fun mostrarNumerosEntreDosValoresAscendente() {
        println("Ingrese el primer número:")
        val num1 = readLine()?.toIntOrNull()

        println("Ingrese el segundo número:")
        val num2 = readLine()?.toIntOrNull()

        if (num1 != null && num2 != null && num1 < num2) {
            println("Números entre $num1 y $num2 en secuencia ascendente:")
            for (i in num1..num2) {
                print("$i ")
            }
            println()
        } else {
            println("Entrada inválida. Ambos valores deben ser números naturales y el primero debe ser menor que el segundo.")
        }
    }

    fun sumarNumerosIngresadosHastaCero() {
        var suma = 0
        var input: Int

        do {
            println("Ingrese un número (ingrese 0 para terminar):")
            input = readLine()?.toIntOrNull() ?: 0

            if (input != 0) {
                suma += input
            }
        } while (input != 0)

        println("La suma de los números ingresados es: $suma")
    }

