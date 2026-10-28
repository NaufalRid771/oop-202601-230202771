# Catatan Minggu 02: Struktur OOP: Class, Object, Encapsulation

## Yang saya kerjakan
Saya melengkapi kelas `Aset` dengan field privat, konstruktor, getter, dan setter. Konstruktor dan `setNama` menolak nilai null atau kosong, sedangkan setter status dan kondisi menolak null. Saya menetapkan status dan kondisi awal sesuai ketentuan tugas.

## Keputusan desain
Kode dan nama yang hanya berisi spasi dianggap kosong melalui `String.isBlank()`. Nilai yang valid disimpan apa adanya tanpa trim atau perubahan huruf besar, sehingga kode tidak dinormalisasi. Field kode dibuat `final` dan tidak disediakan setter agar tidak dapat diubah setelah objek dibuat.

## Kendala
Kelas `Aset` juga memiliki metode yang akan dikerjakan pada minggu berikutnya. Saya membatasi perubahan minggu ini pada field dan perilaku enkapsulasi minggu 2 agar TODO minggu lain tetap terpisah.

## Penggunaan AI
- Alat yang dipakai: OpenAI Codex
- Bagian yang dibantu AI: implementasi field, konstruktor, getter/setter, validasi pada `Aset`, serta penyusunan catatan ini.
- Prompt utama: kerjakan minggu- 02
- Yang saya ubah atau tolak dari saran AI, dan alasannya: Saya memilih menyimpan kode dan nama persis seperti input yang valid; normalisasi tidak diwajibkan dan dapat mengubah identitas kode.
- Satu hal yang saya pahami lebih baik sekarang: field `final` memastikan kode ditetapkan sekali di konstruktor, sementara pemeriksaan sebelum assignment membuat nilai objek tetap valid jika input ditolak.
