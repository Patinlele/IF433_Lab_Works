package oop_00000130562_MuhammadFaathinNaufal.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
//tambahan menu
    println("=== MENU TUGAS WEEK 02 ===")
    println("1. Student Registration")
    println("2. Library Fine System")
    print("Pilih Menu: ")
    val menu = scanner.nextInt()
    scanner.nextLine()

    if (menu == 1) {

        println("---APP PMBUMN---")
        print("Masukkan Nama: ")
        val name = scanner.nextLine()

        print("Masukkan NIM (min 5): ")
        val nim = scanner.next()
        scanner.nextLine()

        if (nim.length != 5) {
            println("ERR: cancelled. NIM harus 5 karakter!")
        } else {
            println("Pilih Tipe (1: Sendiri, 2: Default): ")
            val type = scanner.nextInt()
            scanner.nextLine()

            if (type == 1) {
                print("Masukkan Jurusan: ")
                val major = scanner.nextLine()
                val s1 = Student(name, nim, major)
                println("terdaftar di : ${s1.major} dengan GPA awal ${s1.gpa}")
            } else if (type == 2) {
                val s2 = Student(name, nim)
                println("terdaftar di : ${s2.major} dengan GPA awal ${s2.gpa}")
            } else {
                println("NGUAWOR! cancelled!")
            }
        }

    } else if (menu == 2) {

        println("\n--- PERPUSTAKAAN ---")
        print("Judul Buku: ")
        val title = scanner.nextLine()

        print("Nama Peminjam: ")
        val borrower = scanner.nextLine()

        print("Lama Pinjam (hari): ")
        var duration = scanner.nextInt()


        if (duration < 0) {
            duration = 1
            println("Info: Durasi tidak valid. Diubah otomatis ke 1 hari.")
        }


        val loan = Loan(title, borrower, duration)

        println("--- Detail ---")
        println("Buku: ${loan.bookTitle}, Peminjam: ${loan.borrower}")
        println("Denda: Rp ${loan.calculateFine()}")
    }
}