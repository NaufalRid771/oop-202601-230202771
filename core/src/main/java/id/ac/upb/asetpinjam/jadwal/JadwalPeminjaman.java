package id.ac.upb.asetpinjam.jadwal;

import id.ac.upb.asetpinjam.model.Peminjaman;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Jadwal peminjaman di memori.
 *
 * <p>Minggu 7: bentrok, semuaUrutMulai, perAset, hapus. Minggu 9: ajukan (melempar exception).
 * tambah() DISEDIAKAN dan sengaja TIDAK memeriksa apa pun.
 */
public class JadwalPeminjaman {

    private final List<Peminjaman> daftar = new ArrayList<>();
    private final int kuotaLaptop;

    public JadwalPeminjaman(int kuotaLaptop) {
        this.kuotaLaptop = kuotaLaptop;
    }

    protected int kuotaLaptop() {
        return kuotaLaptop;
    }

    protected List<Peminjaman> daftarMutable() {
        return daftar;
    }

    /** Menambah apa adanya tanpa pemeriksaan. */
    public void tambah(Peminjaman p) {
        daftar.add(p);
    }

    /**
     * True jika {@code baru} tumpang tindih dengan peminjaman lain untuk aset berkode sama.
     * Rentang waktu dianggap setengah terbuka, sehingga selesai sama dengan mulai tidak bentrok.
     */
    public boolean bentrok(Peminjaman baru) {
        if (baru == null) {
            throw new IllegalArgumentException("peminjaman tidak boleh null");
        }
        return daftar.stream()
                .filter(ada -> ada.getAset().getKode().equals(baru.getAset().getKode()))
                .anyMatch(ada -> baru.getMulai().isBefore(ada.getSelesai())
                        && ada.getMulai().isBefore(baru.getSelesai()));
    }

    /** Semua peminjaman sebagai salinan terurut menaik menurut waktu mulai. */
    public List<Peminjaman> semuaUrutMulai() {
        return daftar.stream()
                .sorted(Comparator.comparing(Peminjaman::getMulai))
                .toList();
    }

    /** Peminjaman dikelompokkan menurut kode aset. */
    public Map<String, List<Peminjaman>> perAset() {
        return daftar.stream().collect(Collectors.groupingBy(
                p -> p.getAset().getKode(), LinkedHashMap::new, Collectors.toList()));
    }

    /** Menghapus peminjaman berdasarkan id. True jika ada yang terhapus. */
    public boolean hapus(String id) {
        return daftar.removeIf(p -> p.getId().equals(id));
    }

    /**
     * TODO minggu 9: periksa lalu tambahkan.
     * Bentrok: PeminjamanBentrokException. Peminjam sudah memegang {@link #kuotaLaptop()} laptop yang
     * aktif (status DISETUJUI atau DIPINJAM) dan mengajukan laptop lagi: KuotaHabisException.
     */
    public void ajukan(Peminjaman baru) {
        throw new UnsupportedOperationException("TODO minggu 9: ajukan");
    }
}
