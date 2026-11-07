public class mobil {
    private String Merek;
    private int roda;
    private int kursi;
    private int transmisi;

    public mobil(String Merek, int roda, int kursi, int transmisi) {
        this.Merek=Merek;
        this.roda=roda;
        this.kursi=kursi;
        this.transmisi=transmisi;
    }
    public String getMerek() {
        return Merek;
    }
    public void setMerek(String Merek){
        this.Merek=Merek;
    }
    public int getKursi() {
        return kursi;
    }
    public void setkursi(int kursi) {
        this.kursi=kursi;
    }
    public int getroda(){
        return roda;
    }
    public void setroda(int roda){
        this.roda=roda;
    }
    public int gettransmisi(){
        return transmisi;
    }
    public void settransmisi(int transmisi){
        this.transmisi=transmisi;
    }
}
