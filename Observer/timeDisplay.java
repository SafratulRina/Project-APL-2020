import java.text.SimpleDateFormat;
import java.util.Date;

public class timeDisplay implements Observer, DisplayElement {
    private Time hour;
    private Smartphone notify;

    public timeDisplay(Smartphone notify) {
        this.notify = notify;
        notify.registerObserver(this);
    }

    public void update(String gerak, Time hour11, String bunyi) {
        this.hour = hour11;
        display();
    }

    public void display() {
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Date now = new Date();
        String strDate = String.valueOf(sdfDate.format(now));
      
        StringBuffer tes = new StringBuffer("Sisa waktu pemakaian lampu anda ");
        if (hour.compareTime(strDate))
            tes.append("telah berakhir. Lampu anda akan segera padam");  
        else if(hour.getMinuteLeft()<=5)
            tes.append(hour.getMinuteLeft()+" menit lagi");
        else 
            tes.append("masih lama");
        System.out.println(tes);
    }
}