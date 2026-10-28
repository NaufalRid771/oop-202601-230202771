package id.ac.upb.asetpinjam.denda;

import id.ac.upb.asetpinjam.kontrak.AturanDenda;
import id.ac.upb.asetpinjam.model.Aset;

/**
 * Minggu 5: denda yang makin berat bila makin lama terlambat.
 *
 * <p>Rumus progresifnya KEPUTUSAN ANDA (catat di docs/asumsi.md). Syarat minimal yang diuji:
 * 0 hari = 0; tidak pernah lebih murah dari DendaFlat; tidak pernah turun saat hari bertambah.
 */
public class DendaProgresif implements AturanDenda {

    @Override
    public long hitung(Aset aset, int hariTerlambat) {
        if (aset == null) {
            throw new IllegalArgumentException("aset tidak boleh null");
        }
        if (hariTerlambat < 0) {
            throw new IllegalArgumentException("hari terlambat tidak boleh negatif");
        }
        if (hariTerlambat == 0) {
            return 0;
        }
        long flat = aset.hitungDenda(hariTerlambat);
        // Denda naik 10% dari nilai flat untuk setiap hari setelah hari pertama.
        return flat * (100L + 10L * (hariTerlambat - 1)) / 100L;
    }
}
