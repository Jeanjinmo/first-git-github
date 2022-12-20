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
            println("Hasil dari $input_2 + $input_1 = " + tambah(input_1!!.toDouble(), input_2!!.toDouble()))
        }

//        2 -> {
//            println("Hasil : " + kurang(input_1, input_2))
//        }
//
//        3 -> {
//            println("Hasil : " + kali(input_1, input_2))
//        }
//
//        4 -> {
//            println("Hasil : " + bagi(input_1, input_2))
//        }
    }
}
//method Tambah
fun tambah(input_1: Double, input_2: Double): Double{
    return input_1 + input_2
}