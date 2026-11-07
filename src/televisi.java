public class televisi {

    private String merek;
    private String harga;
    private int channel;

    public televisi(String merek, String harga) {
        this.merek = merek;
        this.harga = harga;
    }

    public void informasiTv() {
        System.out.println("Televisi " + merek + " harga " + harga);
    }

    public void hidupkanTv() {
        System.out.println("Televisi hidup");
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getChannel() {
        return this.channel;
    }

    public void matikanTv() {
        System.out.println("Televisi mati");
    }
}