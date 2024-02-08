fun main() {
    var firstName: String = "Andre"
    var lastName: String = "Marshandito"

    var address: String = """ 
        Jalan Tiga Putra
        Kota Depok
        Jawa Barat
        Indonesia
    """
    println(firstName)
    println(lastName)
    println(address)

    var fullName: String = "$firstName $lastName"
    println(fullName)

    var desc: String = "$fullName length = ${fullName.length}"
    println(desc)
}





