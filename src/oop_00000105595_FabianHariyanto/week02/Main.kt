package oop_00000105595_FabianHariyanto.week02
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("=== PILIH MODUL ===")
    println("1. Student System (Langkah 1-6)")
    println("2. Library System (Tugas 1)")
    println("3. Mini RPG Battle! (Tugas 2)")
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
        3 -> {
            scanner.nextLine()
            MiniRPG(scanner)
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

fun MiniRPG(scanner: Scanner) {
    println("\n--- MINI RPG BATTLE ---")
    print("Nama Hero: ")
    val heroName = scanner.nextLine()
    print("Base Damage: ")
    val damage = scanner.nextInt()

    val myHero = Hero(heroName, damage)
    var enemyHp = 100

    while (myHero.isAlive() && enemyHp > 0) {
        println("\nMenu: 1. Serang, 2. Kabur")
        print("Aksi: ")
        val choice = scanner.nextInt()

        if (choice == 1) {
            myHero.attack("Enemy")
            enemyHp -= myHero.baseDamage
            println("Sisa HP Musuh: $enemyHp")

            if (enemyHp > 0) {
                val monsterDmg = (10..20).random()
                println("Musuh menyerang! Kamu terkena $monsterDmg damage.")
                myHero.takeDamage(monsterDmg)
                println("Sisa HP ${myHero.name}: ${myHero.hp}")
            }
        } else if (choice == 2) {
            println("Kamu memilih kabur dari pertarungan!")
            break
        }
    }

    if (!myHero.isAlive()) {
        println("GAME OVER! ${myHero.name} telah gugur.")
    } else if (enemyHp <= 0) {
        println("VICTORY! Musuh berhasil dikalahkan.")
    }
}