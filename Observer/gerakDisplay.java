public class gerakDisplay implements Observer, DisplayElement {
    private String gerak = "tepuk tangan";
    private String user;
    //private int fail = 0;//
    private Smartphone notify;

    public gerakDisplay(Smartphone notify) {
        this.notify = notify;
        notify.registerObserver(this);
    }

    public String getGerak() {
        return this.gerak;
    }

    public void update(String gerak, Time hour11, String bunyi) {  
        this.gerak = gerak;      
        display();
    }

    public void display() {                
        if (gerak == gerak) {
            System.out.println("Lampu Hidup");
        } else {            
            System.out.println("Lampu Mati");
        }
    }
}
