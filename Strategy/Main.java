public class Main {
    public static void main(String[] args) {
       Context context = new Context(new LampuTerang());		
       System.out.println("Lampu hidup " + context.executeLampu("redup", "terang"));
 
       context = new Context(new LampuRedup());		
       System.out.println("Lampu hidup " + context.executeLampu("redup", "terang"));
    }
 }