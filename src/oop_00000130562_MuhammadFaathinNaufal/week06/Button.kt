package oop_00000130562_MuhammadFaathinNaufal.week06

class Button(override val name: String) : Clickable  {
    override fun click() {
        println("tombol '$name' clicked!")
    }
}