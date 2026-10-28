# Catatan Minggu 03: Inheritance

## Yang saya kerjakan
Saya melengkapi tiga turunan `Aset`: `Ruang`, `Laptop`, dan `AlatLab`. Setiap kelas menyimpan data khususnya, memvalidasi data saat dibuat, menyediakan getter, dan mengembalikan jenis aset yang sesuai. Validasi kode dan nama dari kelas induk tetap dijalankan melalui `super`.

## Keputusan desain
Kode, nama, kapasitas, spesifikasi, nomor inventaris, laboratorium, dan tingkat risiko berada di field `final`, karena nilainya ditetapkan ketika aset dibuat. Field kode dan nama serta perilaku umum tetap berada di induk `Aset`; hanya data khusus tiap tipe diletakkan pada subclass. Teks spesifikasi, nomor inventaris, dan laboratorium yang valid disimpan apa adanya; nilai null atau yang hanya berisi spasi ditolak.

Inheritance kurang tepat untuk perilaku yang dapat dipasang atau diganti secara independen pada aset, misalnya strategi perhitungan denda. Jika semua variasi aturan denda dimasukkan ke subclass aset, jumlah subclass dapat membesar saat jenis aset dan kebijakan denda bertambah. Komposisi dengan objek strategi denda memungkinkan aturan tersebut dipilih atau diganti tanpa membuat subclass untuk setiap kombinasi.

## Kendala
Ketiga subclass memerlukan pemeriksaan string yang serupa. Saya menggunakan helper privat pada `Laptop` dan `AlatLab` agar validasi konsisten dalam masing-masing kelas, dan mempertahankan validasi atribut khusus di konstruktor.

## Penggunaan AI
- Alat yang dipakai: OpenAI Codex
- Bagian yang dibantu AI: implementasi field, konstruktor, getter, validasi, dan `getJenis()` pada `Ruang`, `Laptop`, serta `AlatLab`; juga penyusunan catatan ini.
- Prompt utama: kerjakan minggu 03
- Yang saya ubah atau tolak dari saran AI, dan alasannya: Saya memilih tidak menormalisasi teks atribut yang valid agar nilai yang disimpan tetap persis seperti input.
- Satu hal yang saya pahami lebih baik sekarang: subclass dapat memakai konstruktor induk untuk menjaga validasi umum, lalu menambah validasi untuk atribut yang hanya dimiliki tipe tersebut.
