package oop_00000130562_MuhammadFaathinNaufal.week02

class Student (
    val name: String,
    val nim: String,
    val major: String,

    ){
    init {
        if (nim.length != 5){
            println("Warning: Objeck tercipta dengan NIM ($nim) yang tidak valid!")
            println("Data mahasiswa $name bisa bermasalah di sistem.")
        }else{
            println("LOG: Objek student $name berhasil dialokasikan di memory.")
        }
    } constructor(name: String, nim: String) : this(name, nim, major = "non matriculated") {
        println("LOG: using constructor jalur umum (tanpa jurusan). ")

    }
}