# Catatan Minggu 01: Paradigma Pemrograman dan Setup

## Yang saya kerjakan
Saya membuat tiga versi sapaan Aset-Pinjam: prosedural dengan fungsi statis, OOP dengan objek yang menyimpan nama dan NIM, serta fungsional dengan lambda. Ketiganya menghasilkan teks sapaan yang sama. Saya juga mengisi data mahasiswa pada `mahasiswa.properties`.

## Keputusan desain
Ketiga gaya memakai format `Hello Aset-Pinjam, saya [nama] ([NIM])` agar hasilnya mudah dibandingkan dan memuat semua unsur yang disyaratkan. Pada gaya fungsional, NIM ditangkap oleh lambda dan fungsi yang dikembalikan menerima nama.

## Kendala
Implementasi perlu menjaga keluaran setiap gaya tetap sama persis. Saya menggunakan format kalimat yang sama pada ketiganya.

## Penggunaan AI
- Alat yang dipakai: OpenAI Codex
- Bagian yang dibantu AI: peninjauan implementasi `HelloProsedural`, `HelloOOP`, dan `HelloFungsional`, serta penyusunan catatan ini.
- Prompt utama: “kerjakan minggu 01”
- Yang saya ubah atau tolak dari saran AI, dan alasannya: Saya mempertahankan format sapaan sederhana dan lambda sesuai aturan tugas.
- Satu hal yang saya pahami lebih baik sekarang: fungsi dapat dikembalikan sebagai nilai; lambda di sini menangkap NIM lalu menerima nama.

## Refleksi paradigma
- **Prosedural** — Kelebihan: alur sederhana dan langsung. Keterbatasan: data dan aturan aset bisa tersebar di banyak fungsi ketika sistem membesar.
- **OOP** — Kelebihan: data aset/peminjaman dan perilakunya dapat dikelompokkan dalam objek. Keterbatasan: perubahan kecil dapat melibatkan beberapa objek yang saling terkait.
- **Fungsional** — Kelebihan: fungsi perhitungan seperti denda dapat diuji tanpa mengubah state. Keterbatasan: alur yang mengubah status peminjaman perlu memodelkan state secara hati-hati.
