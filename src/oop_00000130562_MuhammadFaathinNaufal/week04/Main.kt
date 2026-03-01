package oop_00000130562_MuhammadFaathinNaufal.week04

package oop_nim_nama.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle(brand = "Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car(brand = "Toyota", numberOfDoors = 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing ElectricCar ---")
    val myElectricCar = ElectricCar(brand = "Tesla", numberOfDoors = 2, batteryCapacity = 100)
    myElectricCar.openTrunk()
    myElectricCar.honk()
    myElectricCar.accelerate()

    println("\n--- Testing Manager ---")
    val manager = Manager(name = "Andi", baseSalary = 10000000)
    manager.work()
    println("Bonus: Rp ${manager.calculateBonus()}")

    println("\n--- Testing Developer ---")
    val developer = Developer(name = "Budi", baseSalary = 8000000, programmingLanguage = "Kotlin")
    developer.work()
    println("Bonus: Rp ${developer.calculateBonus()}")
}

//test cp 5
// test cp 7
