public class Main {

    public static void main(String[] args) {

        Component lampu = new Lampu();
        lampu = new Gerakan(lampu); 
        lampu = new Bunyi(lampu);

        System.out.println(lampu.getPoweroff() +
            " Lampu Dengan Kecerahan " + lampu.mengaturKecerahan());    
    }
}
