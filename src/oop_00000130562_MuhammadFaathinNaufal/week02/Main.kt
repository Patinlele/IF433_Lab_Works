package oop_00000130562_MuhammadFaathinNaufal.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
//tambahan menu
    println("=== MENU TUGAS WEEK 02 ===")
    println("1. Student Registration")
    println("2. Library Fine System")
    println("3. Mini RPG Battle")
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
            println("Info: Durasi minus. Diubah ke 1 hari.")
        }
        val loan = Loan(title, borrower, duration)
        println("Total Denda: Rp ${loan.calculateFine()}")

    } else if (menu == 3) {

        println("\n--- MINI RPG BATTLE ---")
        print("Nama Hero: ")
        val heroName = scanner.nextLine()
        print("Base Damage: ")
        val heroDamage = scanner.nextInt()

        val myHero = Hero(heroName, heroDamage)
        var enemyHp = 100

        println("Start! ${myHero.name} VS Enemy")


        while (myHero.isAlive() && enemyHp > 0) {
            println("\nHP Hero: ${myHero.hp} | HP Musuh: $enemyHp")
            println("1. Serang  2. Kabur")
            print("Aksi: ")
            val action = scanner.nextInt()

            if (action == 1) {
                myHero.attack("Enemy")
                enemyHp -= myHero.baseDamage
                if(enemyHp < 0) enemyHp = 0
                println("Enemy kena ${myHero.baseDamage} dmg.")

                if (enemyHp > 0) {
                    println(">> Musuh membalas!")
                    val enemyDmg = (10..20).random()
                    myHero.takeDamage(enemyDmg)
                }
            } else if (action == 2) {
                println("Kabur dari pertarungan...")
                break
            }
        }

        println("\n=== GAME OVER ===")
        if (myHero.isAlive() && enemyHp == 0) println("YOU WIN!")
        else if (!myHero.isAlive()) println("YOU DIED.")
    }
}