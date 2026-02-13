package oop_00000130562_MuhammadFaathinNaufal.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("---APP PMBUMN---")
    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    println("Masukkan NIM (min 5):")
    val nim = scanner.next()

    scanner.nextLine()

    if (nim.length != 5){
        println("ERR: cancelled. NIM harus 5 karakter!")

    }else {
        print("Masukkan jurusan: ")
        val major = scanner.nextLine()

        val s1 =  Student(name, nim, major)
        println("Status: Pendaftaran done. ")

    }

}

