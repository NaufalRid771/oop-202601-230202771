package id.ac.upb.asetpinjam.mahasiswa;

import static id.ac.upb.asetpinjam.TestSupport.pinjam;
import static org.assertj.core.api.Assertions.assertThat;

import id.ac.upb.asetpinjam.TestSupport;
import id.ac.upb.asetpinjam.jadwal.JadwalPeminjaman;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("week7")
class BatasBentrokTest {

    @Test
    void peminjamanBerurutanPadaBatasWaktuTidakBentrok() {
        JadwalPeminjaman jadwal = new JadwalPeminjaman(1);
        var peminjam = TestSupport.peminjam("P1");
        jadwal.tambah(pinjam("1", peminjam, TestSupport.ruang("R-1"), 9, 11));
        var berikutnya = pinjam("2", peminjam, TestSupport.ruang("R-1"), 11, 13);

        assertThat(jadwal.bentrok(berikutnya)).isFalse();
    }
}
