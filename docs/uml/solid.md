# Prinsip SOLID yang terlihat di kode

## Open/Closed Principle (OCP)

`Aset` menjadi kelas abstrak yang mendefinisikan operasi umum dan kontrak `hitungDenda()`. `Ruang`, `Laptop`, dan `AlatLab` menyediakan perhitungan denda masing-masing dengan mengoverride method tersebut. Dengan begitu, jenis aset baru dapat menambahkan perilaku denda lewat subclass tanpa mengubah pemanggil yang menggunakan tipe `Aset`. `getJenis()` juga diwajibkan oleh kelas abstrak agar setiap jenis konkret mengembalikan identitas yang sesuai.

## Single Responsibility Principle (SRP)

`Peminjaman` menyimpan data satu permohonan, memvalidasi data dan waktu saat dibuat, serta mengelola status permohonan. `JadwalPeminjaman` memiliki tanggung jawab berbeda: menyimpan kumpulan permohonan dan menyediakan operasi pencarian, pengurutan, penghapusan, serta pengajuan. Pemisahan ini menjaga aturan pengelolaan jadwal tidak bercampur dengan representasi satu peminjaman. `KatalogAset` juga berdiri terpisah untuk pengelolaan koleksi dan pencarian aset.

Kelas dan method yang disebut di atas mengikuti implementasi pada paket `model`, `jadwal`, dan `katalog` di modul `core`.
