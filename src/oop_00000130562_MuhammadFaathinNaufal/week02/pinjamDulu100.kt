package oop_00000130562_MuhammadFaathinNaufal.week02

class Loan(
    val bookTitle: String,
    val borrower: String,
    val loanDuration: Int = 1
) {

    // Method untuk menghitung denda
    fun calculateFine(): Int {
        return if (loanDuration > 3) {

            (loanDuration - 3) * 2000
        } else {

            0
        }
    }
}
