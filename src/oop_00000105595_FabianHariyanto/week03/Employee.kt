package oop_00000105595_FabianHariyanto.week03

class Employee(val name: String) {
    var salary: Int = 0
        set(value) {
            if (value < 0) {
                println("mencoba set gaji ke: $value")
            this.salary = value
        }
}