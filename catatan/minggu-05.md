# Catatan Minggu 05: Abstraction

## Yang saya kerjakan
Saya mengubah `Aset` menjadi kelas abstrak dan menjadikan operasi yang bergantung pada jenis aset sebagai metode abstrak. Saya mengimplementasikan kelayakan peminjaman berdasarkan status dan kondisi. Saya juga menerapkan aturan denda flat dan progresif.

## Keputusan desain
Denda progresif dihitung sebagai denda flat ditambah kenaikan 10% dari denda flat pada setiap hari setelah hari pertama, lalu dibulatkan ke bawah ke rupiah penuh. Rumus dan alasannya dicatat di `docs/asumsi.md` pada A-08.

## Kendala
Metode denda pada `Aset` perlu abstrak agar seluruh aset konkret menyediakan perhitungan yang sesuai jenisnya. Denda progresif juga perlu memvalidasi hari negatif dan menangani nol hari secara eksplisit.

## Penggunaan AI
- Alat yang dipakai: OpenAI Codex
- Bagian yang dibantu AI: implementasi `Aset`, `DendaFlat`, `DendaProgresif`, serta penyusunan catatan minggu ini.
- Prompt utama: “kerjakan minggu 05”
- Yang saya ubah atau tolak dari saran AI, dan alasannya: Rumus progresif saya tetapkan sebagai kenaikan 10% dari denda flat untuk setiap hari setelah hari pertama; keputusan ini didokumentasikan di A-08.
- Satu hal yang saya pahami lebih baik sekarang: kelas abstrak dapat menetapkan kontrak perilaku yang harus disediakan subclass, sedangkan interface menyatakan kemampuan yang dapat dimiliki suatu kelas.
