# Catatan Minggu 06: UML dan SOLID

## Yang saya kerjakan
Saya membuat diagram kelas PlantUML untuk bagian inti modul `core`, termasuk tipe, visibility, paket, pewarisan, implementasi interface, dan multiplicity. Saya membuat diagram urutan pengajuan peminjaman dengan cabang sukses dan bentrok. Saya juga menjelaskan OCP dan SRP berdasarkan kelas yang ada di kode.

## Keputusan desain
Diagram menggambarkan bentuk kode yang sudah ada, termasuk method `JadwalPeminjaman.ajukan()` dan `bentrok()` yang masih menunggu implementasi di minggu 7 dan 9. Catatan ini dicantumkan di diagram urutan agar tahap tugas tidak disalahartikan sebagai perilaku yang sudah aktif.

## Kendala
Pengajuan peminjaman baru dijadwalkan untuk diimplementasikan pada minggu 9. Karena itu, diagram urutan memakai signature method yang telah dideklarasikan dan menandai batas implementasinya.

## Penggunaan AI
- Alat yang dipakai: OpenAI Codex
- Bagian yang dibantu AI: penyusunan diagram kelas PlantUML, diagram urutan, dan penjelasan SOLID berdasarkan berkas sumber.
- Prompt utama: “kerjakan minggu 06”
- Yang saya ubah atau tolak dari saran AI, dan alasannya: Tidak ada perubahan tambahan; diagram dibatasi pada kelas dan method yang ditemukan di modul `core`.
- Satu hal yang saya pahami lebih baik sekarang: diagram UML harus mencerminkan hubungan dan method yang benar-benar ada di kode, sedangkan SOLID dapat ditunjukkan lewat pembagian tanggung jawab dan kontrak abstrak.
