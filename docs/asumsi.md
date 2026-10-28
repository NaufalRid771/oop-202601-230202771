# Asumsi dan Keputusan Desain

Isi bagian ini sendiri. Satu entri per keputusan. Dinilai dari kejelasan alasan dan konsistensi dengan kode dan tes Anda,
bukan dari jawaban "benar".

Format tiap entri:

```
## A-NN: judul singkat
- Pertanyaan: ...
- Keputusan: ...
- Alasan: ...
- Dampak ke kode: ... (kelas/metode)
- Tes yang membuktikan: ... (nama tes di folder mahasiswa/)
```

## Aturan ambigu dari docs/aturan-bisnis.md

Salin setiap pertanyaan ambigu (nomor 1 sampai 7) ke sini dan jawab. Contoh:

## A-01: batas waktu bentrok
- Pertanyaan: 09:00-11:00 dan 11:00-13:00 pada aset yang sama bentrok atau tidak?
- Keputusan: (isi)
- Alasan: (isi)
- Dampak ke kode: (isi)
- Tes yang membuktikan: (isi)

## Asumsi lain

## A-08: rumus denda progresif
- Pertanyaan: Bagaimana kenaikan denda progresif ditentukan?
- Keputusan: Hari pertama sama dengan denda flat; setiap hari berikutnya menaikkan total denda sebesar 10% dari denda flat untuk jumlah hari tersebut. Rumusnya `flat × (100 + 10 × (hari - 1)) / 100`, dibulatkan ke bawah ke rupiah penuh.
- Alasan: Rumus ini sederhana, tidak pernah lebih rendah dari flat, tidak turun ketika hari bertambah, dan pada hari ke-30 lebih besar dari flat.
- Dampak ke kode: `DendaProgresif.hitung()`.
- Tes yang membuktikan: `Minggu05AbstraksiTest.dendaProgresifMemenuhiSyaratMinimal`.

Tambahkan di sini keputusan lain yang Anda ambil: rumus denda progresif, perubahan skema database, format error API, dan seterusnya.

## A-09: batas waktu bentrok
- Pertanyaan: Apakah peminjaman 09:00-11:00 dan 11:00-13:00 pada aset yang sama bentrok?
- Keputusan: Tidak. Rentang peminjaman dianggap setengah terbuka `[mulai, selesai)`, sehingga aset dapat langsung dipakai peminjaman berikutnya ketika yang pertama selesai.
- Alasan: Waktu selesai menjadi batas eksklusif; aturan ini memungkinkan jadwal berurutan tanpa celah waktu yang tidak diperlukan.
- Dampak ke kode: `JadwalPeminjaman.bentrok()`.
- Tes yang membuktikan: `BatasBentrokTest.peminjamanBerurutanPadaBatasWaktuTidakBentrok`.

## A-10: struktur koleksi jadwal
- Pertanyaan: Struktur apa yang menyimpan seluruh peminjaman?
- Keputusan: Satu `List<Peminjaman>` menjadi sumber data; pengelompokan dan pengurutan dibuat saat diminta.
- Alasan: Operasi utama minggu ini bekerja pada seluruh jadwal dan ukuran data belum menuntut indeks tambahan. Satu sumber data juga menghindari sinkronisasi beberapa koleksi saat tambah atau hapus.
- Dampak ke kode: `JadwalPeminjaman.daftar`, `semuaUrutMulai()`, dan `perAset()`.
- Tes yang membuktikan: `Minggu07JadwalTest.semuaUrutMulaiTerurutMenaik` dan `Minggu07JadwalTest.perAsetMengelompokkanMenurutKodeAset`.
