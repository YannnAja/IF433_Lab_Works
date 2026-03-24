package oop_00000105595_FabianHariyanto.week05

fun main() {
    val dosen1 = Dosen(nama = "Pak Alex", nidn = "0123456")
    val admin1 = Admin(nama = "Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()

        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("------------------------------------------------")
    }

    println("\n=== TUGAS 1: MathHelper  ===")
    val math = MathHelper()
    println("Luas Persegi (5): ${math.hitungLuas(5)}")
    println("Luas Persegi Panjang (4 x 6): ${math.hitungLuas(4, 6)}")
    println("Luas Lingkaran (r 7.0): ${math.hitungLuas(7.0)}")
}