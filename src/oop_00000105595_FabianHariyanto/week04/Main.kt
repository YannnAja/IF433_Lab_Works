package oop_00000105595_FabianHariyanto.week04

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
    val tesla = ElectricCar(brand = "Tesla", numberOfDoors = 4, batteryCapacity = 100)
    tesla.accelerate()
    tesla.honk()
    tesla.openTrunk()

    println("\n--- Testing Employee Hierarchy ---")
    val manager = Manager(name = "Ajai", baseSalary = 10000000)
    manager.work()
    println("Bonus Manager ${manager.name}: Rp ${manager.calculateBonus()}")

    val developer = Developer(name = "Yanto", baseSalary = 15000000, programmingLanguage = "Kotlin")
    developer.work()
    println("Bonus Developer ${developer.name}: Rp ${developer.calculateBonus()}")
}