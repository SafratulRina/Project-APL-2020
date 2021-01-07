public class Main {
    public static void main(String args[]) throws Exception {
        Smartphone tes = new Smartphone(); 
        new bunyiDisplay(tes);
        new timeDisplay(tes); 
        new gerakDisplay(tes);
        tes.setData("jalan",new Time("2021-01-07 11:45"),"prak");
    }
}