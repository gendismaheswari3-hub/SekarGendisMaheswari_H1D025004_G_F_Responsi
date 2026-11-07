public class mainTelevisi {

    public static void main(String[] args) {
        televisi tvFlat=new televisi("Sharp", "3 Juta");
        tvFlat.informasiTv();
        tvFlat.hidupkanTv();
        tvFlat.setChannel(1);
        System.out.println("Televisi diset pada channel: "+tvFlat.getChannel());
        tvFlat.matikanTv();
    }
}