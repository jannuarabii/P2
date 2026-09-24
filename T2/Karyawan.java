class Karyawan {
    private String idKaryawan;
    private String nama;
    private double gajiPokok;
    private int jamLembur;

    Karyawan(String idKaryawan, String nama, double gajiPokok) {
        this.idKaryawan = idKaryawan;
        this.nama = nama;
        setgajiPokok(gajiPokok);
        this.jamLembur = 0;
    }

    public String getidKaryawan() {
        return idKaryawan;
    }

    public String getnama() {
        return nama;
    }

    public double getgajiPokok() {
        return gajiPokok;
    }

    public int getjamLembur() {
        return jamLembur;
    }

    public void setgajiPokok (double gajiPokok) {

        if (gajiPokok > 300000) {
            this.gajiPokok = gajiPokok;
        } else {
            System.out.println("PERINGATAN!!!!");
        }
    }

    public void setjamLembur (int jamLembur) {
        if (jamLembur < 0) {
            System.out.println("Jam lembur tidak boleh negatif!");
        } else {
            this.jamLembur = jamLembur;
        }
    }


    public double hitungUangLembur() {
        return getjamLembur() * 50000;
    }

    public double hitungTotalGaji() {
        return getgajiPokok() + hitungUangLembur();
    }

    public void tampilkanSlipGaji() {
        System.out.println("====================");
        System.out.println("SLIP GAJI KARYAWAN PT JANNUAR SUKSES");
        System.out.println("ID Karyawan   : " + getidKaryawan());
        System.out.println("Nama Karyawan : " + getnama());
        System.out.println("Gaji Pokok    : " + getgajiPokok());
        System.out.println("Jam Lembur    : " + getjamLembur());
        System.out.println("Uang Lembur   : " + hitungUangLembur());
        System.out.println("TOTAL GAJI    : " + hitungTotalGaji());
        System.out.println("====================");
    }

}