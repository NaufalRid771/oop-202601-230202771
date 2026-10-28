package id.ac.upb.asetpinjam.model;

/** Minggu 3: aset berupa laptop. Spesifikasi dan nomor inventaris tidak boleh kosong. */
public class Laptop extends Aset {

    private final String spesifikasi;
    private final String nomorInventaris;

    public Laptop(String kode, String nama, String spesifikasi, String nomorInventaris) {
        super(kode, nama);
        this.spesifikasi = wajibDiisi(spesifikasi, "spesifikasi");
        this.nomorInventaris = wajibDiisi(nomorInventaris, "nomor inventaris");
    }

    public String getSpesifikasi() {
        return spesifikasi;
    }

    public String getNomorInventaris() {
        return nomorInventaris;
    }

    private static String wajibDiisi(String nilai, String namaField) {
        if (nilai == null || nilai.isBlank()) {
            throw new IllegalArgumentException(namaField + " tidak boleh null atau kosong");
        }
        return nilai;
    }

    @Override
    public JenisAset getJenis() {
        return JenisAset.LAPTOP;
    }

    @Override
    public long hitungDenda(int hariTerlambat) {
        return hitungDendaDenganMultiplier(hariTerlambat, 2);
    }
}
