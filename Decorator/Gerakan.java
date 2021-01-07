public class Gerakan extends Decorator {
    Component component;

    public Gerakan(Component component) {
        this.component = component;
    }

    public String getPoweroff() {
        return component.getPoweroff() + ", Gerakan terdeteksi";
    }

    public int mengaturKecerahan() {
        return 2 + component.mengaturKecerahan();
    }
    public void newBehaviour() {
        getPoweroff();
    }
}
