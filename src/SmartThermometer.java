public class SmartThermometer extends IoTDevice {
    private double suhuSaatIni;
    private String statusPeringatan;

    public SmartThermometer(String id, String nama) {
        super(id, nama);
        this.suhuSaatIni = 25.0;
        this.statusPeringatan = "NORMAL";
    }

    public SmartThermometer(String idPerangkat, String nama, double suhuAwal) {
        super(idPerangkat, nama);
        this.suhuSaatIni = suhuAwal;
        this.statusPeringatan = "NORMAL";
    }

    @Override
    public void processData() {
        if (this.suhuSaatIni > 38.0) {
            this.statusPeringatan = "OVERHEAT";
        } else if (this.suhuSaatIni < 16.0) {
            this.statusPeringatan = "FREEZING";
        } else {
            this.statusPeringatan = "NORMAL";
        }
        System.out.println("Memproses Data Suhu: " + this.suhuSaatIni + "°C -> Peringatan: " + this.statusPeringatan);
    }

    @Override
    public String getInfoPerangkat() {
        return super.getInfoPerangkat() + " | Suhu: " + this.suhuSaatIni + "°C | Peringatan: " + this.statusPeringatan;
    }

    public double getsuhuSaatIni() {
        return suhuSaatIni;
    }

    public void setsuhuSaatIni(double suhuSaatIni) {
        this.suhuSaatIni = suhuSaatIni;
    }
}