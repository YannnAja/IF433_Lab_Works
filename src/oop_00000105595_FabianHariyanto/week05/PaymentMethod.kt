package oop_00000105595_FabianHariyanto.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}