package oop_00000130562_MuhammadFaathinNaufal.week006

class Button(ovveride val name: String) : Clickable  {
    override fun click() {
        println("tombol '$name' clicked!")
    }
}