public class LampuRedup implements Lampu {
    private String redup;

    public void energi(String on) {
        System.out.println(on);
    }

    public String mengaturKecerahan(String redup, String terang) {
        // this.redup = redup;
        // System.out.println(redup);
        return "redup";
    }

    public String getcolor() {
        return "redup";
    }

    public String getkecerahan() {
        return redup;
    }
}