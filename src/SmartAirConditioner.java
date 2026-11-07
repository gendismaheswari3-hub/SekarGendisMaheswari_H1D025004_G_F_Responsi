public class SmartAirConditioner extends IoTDevice implements Connectable, PowerManageable {
    private int suhuTarget;
    private boolean terhubung;

    public SmartAirConditioner(String idPerangkat, String nama) {
        super(idPerangkat, nama);
        this.suhuTarget = 24;
        this.terhubung = false;
    }

    public SmartAirConditioner(String id, String nama, int suhuTarget) {
        super(id, nama);
        this.suhuTarget = suhuTarget;
        this.terhubung = false;
    }

    @Override
    public void processData() {
        System.out.println("AC sedang menyesuaikan suhu ruangan ke target " + suhuTarget + "°C");
    }

    @Override
    public void connectWiFi(String network) {
        this.terhubung = true;
        System.out.println(getName() + " terhubung ke jaringan WiFi " + network);
    }

    @Override
    public boolean isConnected() {
        return this.terhubung;
    }

    @Override
    public void turnOn() {
        setStatus(true);
        System.out.println(getName() + " dinyalakan");
    }

    @Override
    public void turnOff() {
        setStatus(false);
        System.out.println(getName() + " dimatikan");
    }
}