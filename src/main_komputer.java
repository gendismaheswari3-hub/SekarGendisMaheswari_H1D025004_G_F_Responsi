public class main_komputer {
    public static void main(String[] args) {
        televisi_komputer GoogleTv = new televisi_komputer("Google");
        GoogleTv.hidupkan(true);
        GoogleTv.konekInternet(true);
        GoogleTv.keraskanVolume(10);
        GoogleTv.hidupkan(false);
    }
}