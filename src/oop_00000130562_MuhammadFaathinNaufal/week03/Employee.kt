package oop_00000130562_MuhammadFaathinNaufal.week03

class Employee(val name: String){
    var salary: Int = 0
            set(value) {
                if (value < 0){
                    println("ERR: gaji ga boleh negatif!, Di set ke 0")
                    field = 0
                }
                else{
                    field = value
                }
    }
}

