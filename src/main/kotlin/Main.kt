fun main() {
    println("Kalkulator dan Git")

    val operasi = readln().toInt()

    println("Masukkan Angka : ex: 1,2,3,4,5,6,7,8,9,0 ")
    val input_1 = readLine()
    val input_2 = readLine()

    println(
        """Pilih Operasi : 
        1. Tambah (+)
        2. Kurang (-)
        3. Kali (*)
        4. Bagi (/)
    """.trimMargin()
    )

    println("pilih Operasi : ")
    when (operasi) {
        1 -> {
            println("Hasil : " + tambah(input_1, input_2))
        }

        2 -> {
            println("Hasil : " + kurang(input_1, input_2))
        }

        3 -> {
            println("Hasil : " + kali(input_1, input_2))
        }

        4 -> {
            println("Hasil : " + bagi(input_1, input_2))
        }
    }
}

//method bagi
fun bagi(bil1: Double, bil2: Double): Double {
    return bil1 / bil2
}