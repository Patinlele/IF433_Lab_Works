package oop_00000130562_MuhammadFaathinNaufal.week05

class Ewallet (accountName: String, var balance: Double) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {
        if (balance >= amount){
            balance -= amount
            println("$[accountName - Ewallet] Pembayaran sukses. Sisa saldo: $balance")

        } else {
            println("[$accountName - Ewallet] Saldo tidak cukup.")
        }
    }

    fun topUp(amount: Double){
        balance += amount
        println("[$accountName - Ewallet] Top up $amount berhasil. Saldo saat ini:$balance" )

    }
}