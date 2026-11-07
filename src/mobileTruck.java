public class mobileTruck extends mobil {
    private int bakPasir;
    private int Gandengan;

    public mobileTruck (String Merek, int roda, int kursi, int transmisi, int bakPasir, int Gandengan) {
        super (Merek, roda, kursi, transmisi);
        this.bakPasir = bakPasir;
        this.Gandengan = Gandengan;
    }

    public void tampilkanTruck() {
        System.out.println("mobil dengan merk:"+getMerek());
        System.out.println("mempunyai roda:" +getroda());
        System.out.println("transmisi:"+gettransmisi());
        System.out.println("dilengkapi bak pasir:"+bakPasir);
        System.out.println("dilengkapi gandengan: "+Gandengan);
    }
}