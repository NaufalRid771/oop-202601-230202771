# Catatan Minggu 04: Polymorphism

## Yang saya kerjakan
Saya menambahkan perhitungan denda pada `Aset` dan override pada `Ruang`, `Laptop`, serta `AlatLab`. Setiap tipe memakai multiplier sesuai aturan dan tarif dasar diambil dari `Varian.aktif()`. Saya juga melengkapi dua overload `KatalogAset.cari()` untuk pencarian nama yang tidak membedakan huruf besar dan kecil, dengan filter jenis pada overload kedua.

## Keputusan desain
Validasi hari negatif dan perkalian tarif diletakkan di helper `hitungDendaDenganMultiplier` pada induk agar konsisten; tiap subclass hanya menentukan multiplier. Perhitungan menggunakan `long` sejak jumlah hari dikalikan untuk menghindari overflow integer. Pencarian mengubah teks ke huruf kecil dengan `Locale.ROOT` agar hasilnya tidak bergantung pada locale mesin.

## Kendala
Perhitungan denda harus tetap memilih multiplier subclass ketika aset dirujuk melalui tipe `Aset`. Override `hitungDenda` menyediakan dynamic binding, sementara helper induk menjaga validasi dan rumus dasar tetap sama.

## Penggunaan AI
- Alat yang dipakai: OpenAI Codex
- Bagian yang dibantu AI: implementasi `hitungDenda(int)` pada `Aset` dan subclass, dua overload `KatalogAset.cari()`, serta penyusunan catatan ini.
- Prompt utama: kerjakan minggu 04
- Yang saya ubah atau tolak dari saran AI, dan alasannya: Tidak ada perubahan tambahan; implementasi mengikuti aturan multiplier dan pencarian yang tertulis pada panduan.
- Satu hal yang saya pahami lebih baik sekarang: overriding menentukan metode yang berjalan berdasarkan kelas objek saat runtime, walaupun variabelnya bertipe kelas induk.
