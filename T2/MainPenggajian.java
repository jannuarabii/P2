public class MainPenggajian {

    public static void main(String[] args) {

        Karyawan k1 = new Karyawan
        ("KOO1", "Jannuar", 5000000);
        
        k1.setjamLembur(2);
        k1.tampilkanSlipGaji();


        Karyawan k2 = new Karyawan
        ("KOO2", "Leo Messi", 150000);
    
        k2.setjamLembur(-5);
        k2.setjamLembur(6);
        k2.tampilkanSlipGaji();
    }

}