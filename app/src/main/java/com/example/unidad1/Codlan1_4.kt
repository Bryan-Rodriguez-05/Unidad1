package com.example.unidad1

fun main() {

    //Imprimir 4 lineas
    println("Use the val keyword when the value doesn't change.")
    println("Use the var keyword when the value can change.")
    println("When you define a function, you define the parameters that can be passed to it.")
    println("When you call a function, you pass arguments for the parameters.")

    //correcion de errores

    println("\nNew chat message from a friend")  //cambio el } y la comilla simple '

    //Plantilla de strings - Correcion de errores

    var discountPercentage: Int = 0
    var offer: String = ""
    val item = "Google Chromecast"
    discountPercentage = 20
    offer = "\nSale - Up to $discountPercentage% discount on $item! Hurry up!"

    println(offer)
        // se cambio de VAL a VAR para que puedan ser reasignadas las variable

    //Concatenacion de strings
    val numberOfAdults = 20
    val numberOfKids = 30
    val total = numberOfAdults + numberOfKids
    println("\nThe total party size is: $total")
        // los numeros estaban entre "" y eso hacía que el resultado se concatene comos string, saliendo "2030" en vez de "50"

    //Formato de mensajes

    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = "$baseSalary + $bonusAmount"
    println("\nCongratulations for your bonus! You will receive a total of $totalSalary (additional bonus).\n")
        //Se imprime de manera de string, haciendo que se vea como: "5000 + 1000" para mostrarse el salario y el bonus por separado

    //Operaciones matematicas

    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)
    val result1 = subtract(firstNumber, secondNumber)
    val anotherResult1 = subtract(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")
    println("$firstNumber - $secondNumber = $result1")
    println("$firstNumber - $thirdNumber = $anotherResult1")

    // Notificacion de Gmail
    val firstUserEmailId = "user_one@gmail.com"

    // The following line of code assumes that you named your parameter as emailId.
    // If you named it differently, feel free to update the name.
    println(displayAlertMessage(emailId = firstUserEmailId))

    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"

    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"

    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))
    println()

    //Podometro
    val steps = 4000
    val caloriesBurned = pedometerStepsToCalories(steps);
    println("Walking $steps steps burns $caloriesBurned calories")

    //Comparacion de numeros
    println()
    println(comparisonNumbers(300, 250))
    println()
    println(comparisonNumbers(300, 300))
    println()

    println(comparisonNumbers(200, 220))
    println()


    //Detalles del clima

    println(weatherDetails("Ankara", 27, 31, 82))
    println(weatherDetails("Tokyo", 32, 36, 10))
    println(weatherDetails("Cape Town", 59, 64, 2))
    println(weatherDetails("Guatemala City", 50, 55, 7))
}

fun add(num1 : Int, num2 : Int) : Int{
    return num1 + num2
}

fun subtract(num1 : Int, num2 : Int) : Int{
    return num1 - num2
}

fun displayAlertMessage(system : String = "Unknown OS", emailId : String) : String {
    return "\nThere's a new sign-in request on $system for your Google Account $emailId."

}

fun pedometerStepsToCalories(numberOfSteps: Int): Double {
    val caloriesBurnedForEachStep = 0.04
    val totalCaloriesBurned = numberOfSteps * caloriesBurnedForEachStep
    return totalCaloriesBurned
}

fun comparisonNumbers(timeSpentToday  : Int, timeSpentYesterday  : Int) : Boolean {
    val comparison = timeSpentToday > timeSpentYesterday
    return comparison
}

fun weatherDetails(city : String, lowT : Int, highT : Int, rain : Int) : String{

    return "City: $city\nLow Temperature: $lowT , High Temperature: $highT\nChange of rain: $rain%\n"
}