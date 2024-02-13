fun main() {
    val nilai = "d"

    when (nilai) {

        "A" -> {
            println("Amazing")
        }
        "B" -> {
            println("Good")
        }
        "C" -> {
            println("Nice")
        }
        "D" -> {
            println("Not Bad")
        }
        else -> {
            println("Try Again")
        }

    }

    when (nilai){
        "a","b","c" -> {
            println("lulus")
        }
        else -> {
            println("Maaf,Tidak Lulus")
        }
    }

    val nilaiLulus: Array<String> = arrayOf("a","b","c")
    when (nilai){
        in nilaiLulus -> println("Selamat")
        !in nilaiLulus -> println("Maaf,Coba Lgi")
    }

     val name = "Andre"
    when (name){
        is String -> println("Name Is String")
        !is String -> println("Name is Not String")
    }

    val nilaiUjian = 88
    when{
        nilaiUjian > 90 -> println("Amazing")
        nilaiUjian > 80 -> println("Good Job")
        nilaiUjian > 70 -> println("Not Bad")
        else -> println("Ngulang")
    }



}