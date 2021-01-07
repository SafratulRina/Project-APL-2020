public class bunyiDisplay implements Observer, DisplayElement {
    private String bunyi = "tepuk tangan";
    private String user;
    //private int fail = 0;//
    private Smartphone notify;

    public bunyiDisplay(Smartphone notify) {
        this.notify = notify;
        notify.registerObserver(this);
    }

    public String getBunyi() {
        return this.bunyi;
    }

    public void update(String gerak, Time hour11, String bunyi) {  
        this.bunyi = bunyi;      
        display();
    }

    public void display() {                
        if (bunyi == bunyi) {
            System.out.println("Lampu Hidup");
        } else {            
            System.out.println("Lampu Mati");
        }
    }
}
