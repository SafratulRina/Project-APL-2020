import java.util.ArrayList;

public class Smartphone implements Subject {
    private ArrayList<Observer> observers;
   
    private Time hour11;
    private String gerak;
    private String bunyi;
    private String data;

    public Smartphone() {
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        if (observers.indexOf(o) >= 0)
            observers.remove(observers.indexOf(o));

    }

    public void notifyObservers() {
        for (Observer ob : observers)
            ob.update(gerak,hour11,bunyi);
    }

    public void timeChanged() {
        notifyObservers();
    }

    public void setTime(Time hour1) {
       hour1 = hour1;
        timeChanged();
    }
    public Time getTime() {
        return hour11;
    }
    public String getBunyi() {
        return bunyi;
    }
    public String getGerak() {
        return gerak;
    }
    public void setData(String gerak, Time hour11, String bunyi) {
        this.hour11 = hour11;
        this.gerak = gerak;
        this.bunyi = bunyi;
        timeChanged();
    }
}