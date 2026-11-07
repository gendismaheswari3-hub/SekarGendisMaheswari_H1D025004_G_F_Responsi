public class persegiPanjang2D extends bentuk2D {
    private int panjang;
    private int lebar;
    private double luas;
    private int keliling;

    public persegiPanjang2D(int panjang,int lebar){
        this.panjang=panjang;
        this.lebar=lebar;
    }
    public void cetakLuas(){
        luas=panjang*lebar;
        System.out.println("Luas persegi adalah:"+luas);
    }
    public void cetakKeliling(){
        keliling=2*(panjang+lebar);
        System.out.println("Keliling persegi:"+keliling);
    }
}
