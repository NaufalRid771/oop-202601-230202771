package id.ac.upb.asetpinjam.katalog;

import id.ac.upb.asetpinjam.model.Aset;
import id.ac.upb.asetpinjam.model.JenisAset;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

/** Katalog aset di memori. tambah() dan semua() DISEDIAKAN; Anda mengerjakan dua overload cari() (minggu 4). */
public class KatalogAset {

    private final List<Aset> daftar = new ArrayList<>();

    public void tambah(Aset aset) {
        daftar.add(aset);
    }

    public List<Aset> semua() {
        return List.copyOf(daftar);
    }

    /** Mengambil aset yang namanya memuat kata tanpa membedakan huruf besar/kecil. */
    public List<Aset> cari(String kata) {
        String kataNormal = kata.toLowerCase(Locale.ROOT);
        return daftar.stream()
                .filter(aset -> aset.getNama().toLowerCase(Locale.ROOT).contains(kataNormal))
                .collect(Collectors.toList());
    }

    /** Seperti cari(kata), tetapi hanya untuk jenis yang diminta (overloading). */
    public List<Aset> cari(String kata, JenisAset jenis) {
        String kataNormal = kata.toLowerCase(Locale.ROOT);
        return daftar.stream()
                .filter(aset -> aset.getJenis() == jenis)
                .filter(aset -> aset.getNama().toLowerCase(Locale.ROOT).contains(kataNormal))
                .collect(Collectors.toList());
    }
}
