fun main() {
    var array = arrayOf("Andre","Marshandito","Anjay","Bambang","Japar")

    var total = 0
    for (name in array) {
        println(name)
        total++
    }
    println("Total diulang = $total")

    for (i in 100 downTo 0 step 5){
        println(i)
    }
}