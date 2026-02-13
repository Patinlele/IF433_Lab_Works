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

    val type = scanner.nextInt()

    if (type == 1){
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()

        val s1 =  Student(name, nim, major)
        println("terdaftar di : ${s1.major} dengan GPA awal ${s1.gpa}")


    }
    else if (type == 2){
        val s2 = Student(name, nim)
        println("terdaftar di : ${s2.major} dengan GPA awal ${s2.gpa}")
    }
    else {
        println("NGUAWOR! cancelled!")
    }

}

