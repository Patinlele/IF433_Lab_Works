package oop_00000130562_MuhammadFaathinNaufal.week12

class CustomExceptionpackage

class InsufficientFundsException(
    val amount: Double,
    val balance: Double
): Exception("Attempted $amount, balance: $balance") {
}