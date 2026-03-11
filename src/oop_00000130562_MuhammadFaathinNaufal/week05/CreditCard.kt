package oop_00000130562_MuhammadFaathinNaufal.week05

class CreditCard (accountName: String, val limit: Double) : PaymentMethod(accountName) {
    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("[$accountName - Credit Card ] Pembayaran sukses. limit terpakai: $usedAmount/ $limit")


        }else {
            println(
                "[$accountName - Credit Card] Transaksi ditolak. Melebihi limit."
            )
        }
    }

}