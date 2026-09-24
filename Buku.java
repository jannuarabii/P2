class Buku {

    String judul;
    String pengarang;
    int tahunTerbit;
    boolean isDipinjam;

    public Buku
    (String JudulBuku,
    String PengarangBuku,
    int TahunTerbitBuku,
    boolean isDipinjam) {

        this.judul = JudulBuku;
        this.pengarang = PengarangBuku;
        this.tahunTerbit = TahunTerbitBuku;
        this.isDipinjam = false;
    }

    public void pinjamBuku() {
        if (!isDipinjam) {
            isDipinjam = true;
            System.out.println("Kamu berhasil minjam buku " + judul + " nihhh");
        } else {
            System.out.println("Sayang banget buku" + judul + " lagi dipinjam");
        }
    }

    public void kembalikanBuku() {
        if (isDipinjam) {
            isDipinjam = false;
            System.out.println("Berhasil mengembalikan buku " + judul);
        } else {
            System.out.println("bukunya ga ada tuhhh");
        }
    }

    public void tampilkanDetail() {
        String status = isDipinjam ? "Dipinjam" : "Tersedia";

        System.out.println("--------------------");
        System.out.println("Judul");
        System.out.println(judul);
        System.out.println("-------");
        System.out.println("Tahun Terbit : " + tahunTerbit);
        System.out.println("Status : " + status);
    }

}

class Anggota {
    String nama;

    public Anggota(String NamaAnggota) {
        this.nama = NamaAnggota;
    }
    
    public void pinjamBuku(Buku buku) {
        buku.pinjamBuku();
    }
}