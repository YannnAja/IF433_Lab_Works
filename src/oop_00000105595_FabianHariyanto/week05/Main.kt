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

    println("\n=== TUGAS 2: SISTEM PEMBAYARAN ===")
    val myEWallet = EWallet("OVO", 50000.0)
    val myCreditCard = CreditCard("Visa", 100000.0)

    val paymentMethods: List<PaymentMethod> = listOf(myEWallet, myCreditCard)

    for (payment in paymentMethods) {
        println("\nMencoba memproses pembayaran sebesar 75000.0 menggunakan ${payment.accountName}...")

        // Coba proses pembayaran (Polymorphism)
        payment.processPayment(75000.0)
    }
}