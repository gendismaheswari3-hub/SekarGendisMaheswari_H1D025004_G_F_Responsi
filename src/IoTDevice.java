public abstract class IoTDevice {
    public static final String PROTOCOL = "MQTT";
    private final String idPerangkat;

    private String nama;
    private boolean aktif;

    public IoTDevice(String idPerangkat) {
        this(idPerangkat, "Perangkat IoT Generik");
    }

    public IoTDevice(String idPerangkat, String nama) {
        this.idPerangkat = idPerangkat;
        this.nama = nama;
        this.aktif = false;
    }

    public abstract void processData();

    public void aktifkanPerangkat() {
        this.aktif = true;
        System.out.println(this.nama + " (" + this.idPerangkat + ") berhasil diaktifkan melalui " + PROTOCOL + ".");
    }

    public String getInfoPerangkat() {
        return "ID: " + this.idPerangkat + " | Nama: " + this.nama + " | Status: " + (this.aktif ? "ON" : "OFF");
    }

    public String getId() {
        return idPerangkat;
    }

    public String getName() {
        return nama;
    }

    public void setName(String nama) {
        this.nama = nama;
    }

    public boolean isStatus() {
        return aktif;
    }

    public void setStatus(boolean status) {
        this.aktif = status;
    }
}