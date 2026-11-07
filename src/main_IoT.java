public class main_IoT {
    public static void main(String[] args) {
        System.out.println("--DEMO IMPLEMENTASI RESPONSI PBO (SISTEM IOT)--");

        // 1. Test Superclass, Subclass & State Logic
        SmartThermometer thermo = new SmartThermometer("T-01", "Sensor Ruang Tamu", 25.0);
        thermo.aktifkanPerangkat();
        System.out.println(thermo.getInfoPerangkat());

        System.out.println("Memperbarui State Sensor");
        thermo.setsuhuSaatIni(40.0);
        thermo.processData();
        System.out.println(thermo.getInfoPerangkat());

        // 2. Test Interface & Polymorphism
        SmartAirConditioner acRuangan = new SmartAirConditioner("AC-01", "AC Kamar Utama");

        Connectable wifi = acRuangan;
        wifi.connectWiFi("WiFi_Rumah_5G");

        PowerManageable power = acRuangan;
        power.turnOn();

        acRuangan.processData();
        System.out.println(acRuangan.getInfoPerangkat());
    }
}