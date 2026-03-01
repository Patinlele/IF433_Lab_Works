package oop_00000130562_MuhammadFaathinNaufal.week04

package oop_nim_nama.week04

class Developer(name: String, baseSalary: Int, val programmingLanguage: String) : Employee(name, baseSalary) { // [cite: 92, 93]

    override fun work() {
        println("$name sedang ngoding menggunakan $programmingLanguage.")
    }

}