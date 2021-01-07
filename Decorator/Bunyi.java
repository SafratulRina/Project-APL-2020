public class Bunyi extends Decorator {
    Component component;

    public Bunyi(Component component) {
        this.component = component;
    }

    public String getPoweroff() {
        return component.getPoweroff() + ", Bunyi terdeteksi";
    }

    public int mengaturKecerahan() {
        return 2 + component.mengaturKecerahan();
    }
    public void newBehaviour() {
        getPoweroff();
    }
}
