package oop_00000130562_MuhammadFaathinNaufal.week04

class Manager(name: String, baseSalary: Int) : Employee(name, baseSalary) { // [cite: 86]

    override fun work() { // [cite: 87]
        println("$name sedang memimpin rapat divisi.") // [cite: 87]
    }

    override fun calculateBonus(): Int { // [cite: 88]
        return super.calculateBonus() + 500000 // Kembalikan bonus standar ditambah Rp 500.000 [cite: 88, 89]
    }
}