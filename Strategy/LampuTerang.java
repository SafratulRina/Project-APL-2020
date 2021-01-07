public class LampuTerang implements Lampu {
    private String terang;

    public void energi(String on) {
        System.out.println(on);
    }

    public String mengaturKecerahan(String redup, String terang) {
        // this.terang = terang;
        // System.out.println(terang);
        return "terang";
    }

    public String getcolor() {
        return "terang";
    }

    public String getkecerahan() {
        return terang;
    }
}