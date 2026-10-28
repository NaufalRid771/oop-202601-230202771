# Catatan Minggu 07: Koleksi

## Yang saya kerjakan
Saya melengkapi pemeriksaan bentrok, pengurutan daftar peminjaman, pengelompokan berdasarkan kode aset, dan penghapusan berdasarkan ID. Saya menambahkan tes sendiri untuk memastikan dua peminjaman yang bertemu tepat pada batas waktu tidak dianggap bentrok.

## Keputusan desain
Jadwal memakai satu `List<Peminjaman>` sebagai sumber data. Rentang waktu dianggap setengah terbuka `[mulai, selesai)`, jadi peminjaman berikutnya dapat mulai tepat ketika peminjaman sebelumnya selesai. Kedua keputusan dicatat pada A-09 dan A-10 di `docs/asumsi.md`.

## Kendala
Pengecekan harus membandingkan kode aset, bukan identitas objek aset, karena dua pengajuan dapat memegang objek aset berbeda dengan kode yang sama. Perbandingan waktu menggunakan dua syarat agar tumpang tindih sebagian maupun terkandung terdeteksi, sementara rentang yang bersinggungan di batas akhir tidak terhitung bentrok.

## Penggunaan AI
- Alat yang dipakai: OpenAI Codex
- Bagian yang dibantu AI: implementasi operasi `JadwalPeminjaman`, tes batas waktu, dan penyusunan catatan.
- Prompt utama: “kerjakan minggu 07”
- Yang saya ubah atau tolak dari saran AI, dan alasannya: Tidak ada perubahan tambahan; keputusan batas waktu dan struktur koleksi didokumentasikan di A-09 dan A-10.
- Satu hal yang saya pahami lebih baik sekarang: List dapat tetap menjadi sumber data sederhana, sementara pengurutan atau pengelompokan dibuat sebagai hasil saat diperlukan.
