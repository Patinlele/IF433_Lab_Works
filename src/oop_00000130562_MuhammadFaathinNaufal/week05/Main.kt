package oop_00000130562_MuhammadFaathinNaufal.week05

fun main(){
    val dosen1 = Dosen("Pak Alex", nidn = "0123456")
    val admin1 = Admin( nama = "Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("--- aktivitas pegawai ---")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()

        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi as Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> terdeteksi as Admin")
                pegawai. doAdminWork()

            }
        }
        println("------------------")
    }
}