public class ujiMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("Daplun", "H1D009002");
        mhs1.cetakInformasi();
        System.out.println(mhs1.Nama);
        Mahasiswa mhs2 = new Mahasiswa("Daplun", "H1D009002", "Purwokerto");

        mhs2.cetakInformasi();
        System.out.println(mhs2);
    }
}