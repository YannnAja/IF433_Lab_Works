package oop_00000105595_FabianHariyanto.week02
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("=== PILIH MODUL ===")
    println("1. Student System (Langkah 1-6)")
    println("2. Library System (Tugas 1)")
    print("Pilihan: ")

    when(scanner.nextInt()) {
        1 -> {
            scanner.nextLine()
            menuStudent(scanner)
        }
        2 -> {
            scanner.nextLine()
            LibraryMenu(scanner)
        }
        else -> println("Keluar")
    }
}

fun menuStudent(scanner: Scanner) {
    println("--- APLIKASI PMB UMN ---")

    print("Masukkan Nama: ")
    val name = scanner.nextLine()
    print("Masukkan NIM (Wajib 5 Karakter): ")
    val nim = scanner.next()

    scanner.nextLine()

    if (nim.length != 5) {
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!");
    } else {
        print("Pilih Jalur (1. Reguler, 2. Umum): ")
        val type = scanner.nextInt()
        scanner.nextLine()

        if (type == 1) {
            print("Masukkan Jurusan: ")
            val major = scanner.nextLine()
            val s1 = Student(name, nim, major= major, 0.0)
            println("Terdaftar di: ${s1.major} dengan GPA awal ${s1.gpa}")
        } else if (type == 2) {
            val s2 = Student(name, nim) // Memanggil Secondary [cite: 86]
            println("Terdaftar di: ${s2.major} dengan GPA awal ${s2.gpa}")
        } else {
            println("Pilihan ngawur, pendaftaran batal!")
        }
    }
}

fun LibraryMenu(scanner: Scanner) {
    println("\n--- SISTEM PERPUSTAKAAN ---")

    print("Judul Buku: ")
    val title = scanner.nextLine()

    print("Peminjam: ")
    val borrower = scanner.nextLine()

    print("Lama Pinjam (hari): ")
    var duration = scanner.nextInt()

    if (duration < 0) {
        duration = 1
    }

    val loan = Loan(title, borrower, duration)
    println("Detail Peminjaman: $title oleh $borrower")
    println("Total Denda: Rp ${loan.calculateFine()}")
}
