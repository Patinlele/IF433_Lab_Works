# Penjelasan Week 07 - Special Classes & Static Members

## CHECKPOINT 1 — DatabaseManager (Singleton)
`object` menggantikan `class` untuk membuat Singleton.
Hanya ada satu instance di seluruh aplikasi, dibuat lazy saat
pertama kali diakses, dan thread-safe secara otomatis oleh Kotlin.
Cocok untuk: koneksi database, konfigurasi global, logger.

## CHECKPOINT 2 — NetworkClient (Private Constructor Trial)
Private constructor mencegah pembuatan instance dari luar class.
Baris `NetworkClient("https://api.umn.ac.id")` sengaja dibuat error
untuk membuktikan bahwa constructor tidak bisa diakses langsung.

## CHECKPOINT 3 — NetworkClient (Companion Object Factory)
`companion object` menempel pada class, bukan pada instance.
Fungsi `createClient()` menjadi satu-satunya pintu masuk untuk
membuat instance — inilah Factory Pattern. Nama fungsi lebih
deskriptif dan proses pembuatan objek bisa dikontrol penuh.

## CHECKPOINT 4 — Main (Test Singleton & Companion Object)
Membuktikan DatabaseManager diakses tanpa `()` karena bukan class.
NetworkClient dibuat lewat `createClient()`, bukan konstruktor langsung.

## CHECKPOINT 5 — RegularUser (Trial Equality Failure)
Regular class tidak punya `equals()` berbasis isi. Dua objek dengan
data sama tetap dianggap berbeda karena membandingkan alamat memori,
bukan nilai propertinya. `println()` juga mencetak hash address.

## CHECKPOINT 6 — DataUser (Data Class)
Keyword `data` membuat Kotlin otomatis generate:
- `toString()` → "DataUser(name=Alice, age=22)"
- `equals()` → true jika semua properti sama (Structural Equality)
- `hashCode()` → konsisten berdasarkan isi properti

## CHECKPOINT 7 — copy() & Destructuring
`copy()` membuat objek baru dengan beberapa properti diubah, tanpa
merusak objek asli. Ini adalah fondasi immutable data architecture.
Destructuring memecah objek menjadi variabel terpisah sekaligus:
`val (userName, userAge) = data1`

## CHECKPOINT 8 — AppState (Enum Class)
Enum merepresentasikan sekumpulan konstanta yang sudah pasti diketahui
sejak compile time. Setiap konstanta adalah satu-satunya instance
dari dirinya sendiri. Cocok untuk status sederhana yang tidak perlu
membawa data tambahan yang berbeda-beda.

## CHECKPOINT 9 — ApiResponse (Sealed Class)
Sealed class adalah hierarki tertutup dimana semua subclass dideklarasikan
di tempat yang sama. Berbeda dari Enum, setiap subclass bisa membawa
data yang berbeda tipe dan jumlahnya:
- `Success` membawa data String
- `Error` membawa pesan String
- `Loading` tidak membawa data (cukup sebagai penanda status)

## CHECKPOINT 10 — Non-Exhaustive when (Trial Error)
Ketika `when` digunakan sebagai expression (hasilnya disimpan ke variabel),
Kotlin memaksa semua kemungkinan ditangani. Melewatkan `Loading` membuat
compiler error — ini adalah compile-time safety yang tidak dimiliki Java.

## CHECKPOINT 11 — Exhaustive when (Resolved)
Menambahkan `ApiResponse.Loading` ke blok `when` membuat compiler puas.
Jika subclass baru ditambahkan ke sealed class tapi tidak ditangani
di `when`, compiler langsung memberi error sebelum program dijalankan.

## CHECKPOINT 12 — GameManager (Singleton RPG)
Sama seperti DatabaseManager. Properti `isGameRunning` memastikan
`startGame()` hanya bisa mengubah state sekali. Pemanggilan kedua
ditolak — membuktikan Singleton mencegah duplikasi state global.

## CHECKPOINT 13 — ItemRarity (Enum dengan Properti)
Enum bisa memiliki konstruktor dan properti. Setiap konstanta diberikan
nilai `dropChance` yang unik. `LEGENDARY` memiliki `dropChance = 1`
yang bisa diakses dengan `ItemRarity.LEGENDARY.dropChance`.

## CHECKPOINT 14 — GameItem (Data Class Immutable)
Semua properti menggunakan `val` agar immutable. Karena data class,
dua GameItem dengan isi sama dianggap equal dan bisa di-copy dengan
`copy()` untuk membuat versi baru tanpa merusak yang lama.

## CHECKPOINT 15 — WeaponForge (Factory Pattern Lanjut)
Private constructor + companion object factory memastikan senjata
hanya bisa dibuat melalui fungsi resmi `forgeStarterSword()` atau
`forgeEpicSword()`. Ini mencegah pembuatan senjata dengan data tidak valid.

## CHECKPOINT 16 — BattleState (Sealed Class Hierarchy)
Empat subclass dengan payload berbeda:
- `MonsterEncounter` → nama monster (String)
- `LootDropped` → objek GameItem
- `GameOver` → alasan kekalahan (String)
- `SafeZone` → pakai `object`, tidak perlu data tambahan

## CHECKPOINT 17 — processEvent (Exhaustive when + Smart Cast)
Setelah pengecekan `is BattleState.MonsterEncounter`, Kotlin otomatis
Smart Cast: `event.monsterName` bisa diakses langsung tanpa cast manual.
Semua 4 subclass harus ditangani atau compiler error.

## CHECKPOINT 18 — Test GameManager di Main
`startGame()` dipanggil dua kali. Pemanggilan pertama mengubah state,
pemanggilan kedua mencetak pesan penolakan. Membuktikan Singleton
bekerja sebagai single source of truth untuk state game.

## CHECKPOINT 19 — Test Rarity & Factory
`ItemRarity.LEGENDARY.dropChance` mengakses properti enum langsung.
`Weapon.forgeStarterSword()` membuat senjata via factory tanpa `()`.
`toString()` yang di-override mencetak detail senjata secara readable.

## CHECKPOINT 20 — Test copy() & Battle Events
`starterWeapon.item.copy(damage = 25)` membuat item baru dengan damage
ditingkatkan tanpa mengubah `starterWeapon.item` yang asli.
Empat event dikirim berurutan ke `processEvent()` untuk mensimulasikan
alur pertarungan: aman → encounter → loot → game over.