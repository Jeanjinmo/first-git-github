fun main() {
    println("Kalkulator dan Git")


    println("Masukkan Angka : ex: 1,2,3,4,5,6,7,8,9,0 ")
    print("angka pertama : ")
    val input_1 = readLine()
    print("angka kedua : ")
    val input_2 = readLine()

    println(
        """Pilih Operasi : 
        1. Tambah (+)
        2. Kurang (-)
        3. Kali (*)
        4. Bagi (/)
    """.trimMargin()
    )
    val operasi = readln().toInt()


    println("pilih Operasi : ")
    when (operasi) {
        1 -> {
            println("Hasil dari $input_1 + $input_2 = " + tambah(input_1!!.toDouble(), input_2!!.toDouble()))
        }

        2 -> {
            println("Hasil dari $input_1 - $input_2 = " + kurang(input_1!!.toDouble(), input_2!!.toDouble()))
        }
//
//        3 -> {
//            println("Hasil dari $input_1 * $input_2 = " + kali(input_1!!.toDouble(), input_2!!.toDouble()))
//        }
//
//        4 -> {
//            println("Hasil dari $input_1 / $input_2 = " + bagi(input_1!!.toDouble(), input_2!!.toDouble()))
//        }
    }
}
//method Tambah
fun tambah(input_1: Double, input_2: Double): Double{
    return input_1 + input_2
}//method kurang
fun kurang(bil1: Double, bil2: Double) : Double{
    return bil1 - bil2
}

//method kali
fun kali(bil1: Double, bil2: Double) : Double{
    return bil1 * bil2
}

//method bagi
fun bagi(bil1: Double, bil2: Double) : Double{
    return bil1 / bil2
}