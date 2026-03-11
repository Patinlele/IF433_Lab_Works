package oop_nim_nama.week05 // Jangan lupa ganti dengan NIM dan Nama kamu

fun main() {
    // ==========================================
    // BAGIAN LATIHAN TERBIMBING (GUIDED LAB)
    // ==========================================
    val dosen1 = Dosen(nama = "Pak Alex", nidn = "0123456")
    val admin1 = Admin(nama = "Bu Siti")

    // Polymorphic Collection
    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        // Pemanggilan Runtime Polymorphism
        pegawai.bekerja()

        // Smart Casting dengan is dan when
        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar() // Smart cast!
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println()
    }

    // ==========================================
    // BAGIAN TUGAS MANDIRI 1
    // ==========================================
    println("=== TUGAS MANDIRI 1: OVERLOADING ===")
    val mathHelper = MathHelper()

    // Memanggil ketiga fungsi dengan argumen yang berbeda
    println("Luas Persegi (sisi 5): ${mathHelper.hitungLuas(5)}")
    println("Luas Persegi Panjang (p=5, l=10): ${mathHelper.hitungLuas(5, 10)}")
    println("Luas Lingkaran (r=7.0): ${mathHelper.hitungLuas(7.0)}")
    println()

    // ==========================================
    // BAGIAN TUGAS MANDIRI 2
    // ==========================================
    println("=== TUGAS MANDIRI 2: SISTEM PEMBAYARAN ===")

    // 4a. Buat satu objek EWallet dan satu objek CreditCard [cite: 112]
    val eWallet = EWallet("John EWallet", 50000.0)
    val creditCard = CreditCard("John CC", 100000.0)

    // 4b. Masukkan keduanya ke dalam list bertipe PaymentMethod [cite: 113]
    val paymentMethods: List<PaymentMethod> = listOf(eWallet, creditCard)

    // 4c. Lakukan perulangan dan panggil processPayment(75000.0) [cite: 114]
    for (method in paymentMethods) {
        println("-> Memproses pembayaran untuk ${method.accountName} sebesar 75000.0")
        method.processPayment(75000.0)

        // 5. Smart Casting Challenge: Deteksi jika EWallet, lakukan topUp otomatis [cite: 117-118]
        if (method is EWallet) {
            println("=> (Smart Casting) Terdeteksi EWallet. Melakukan Auto Top-Up...")
            method.topUp(50000.0)
            println("=> Mencoba ulang pembayaran...")
            method.processPayment(75000.0)
        }
        println("----------------------------------------")
    }
}