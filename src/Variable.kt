//Variable Constan
const val APPLICATION ="Belajar Kotlin"
const val  VERSION ="0.0.1"


fun main() {
    val firstName = "Andre"
    val age = 30

    println(firstName)
    println(age)

    // Nullable
    var name : String? = null
    name = "Andre"
    println(name)
    println(name?.length)

    println("$APPLICATION : $VERSION")
}