public class Main {
    public static void main(String[] args) {

    /* TestMhs Mahasiswa1 = new TestMhs();

    Mahasiswa1.setNama("Jannuar Abimuni Thon");
    Mahasiswa1.setNim("25410100091");


    TestMhs Mahasiswa2 = new TestMhs();

    Mahasiswa2.setNama("Viqo Rizkillahi Ramadhan");
    Mahasiswa2.setNim("2541010090");

    Mahasiswa1.perkenalan();
    Mahasiswa2.perkenalan(); */

    Buku buku1 = new Buku("How to be rich", "Jannuar", 2025, true);
    Buku buku2 = new Buku("Automic Habit", "Abi", 2026, true);
    Buku buku3 = new Buku("The psychology of money", "Muni", 2020, true);
    Buku buku4 = new Buku("Clean code", "Thon", 2028, true);


    Anggota Anggota1 = new Anggota("Jannuar");
    Anggota Anggota2 = new Anggota("Viqo");

    Anggota1.pinjamBuku(buku1);
    Anggota1.pinjamBuku(buku2);

    Anggota2.pinjamBuku(buku1);

    buku1.tampilkanDetail();
    buku2.tampilkanDetail();
}
}