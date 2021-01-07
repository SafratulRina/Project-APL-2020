public class Context {
    private Lampu lampu;
    private String redup;
    private String terang;
 
    public Context(Lampu lampu){
       this.lampu = lampu;
    }
    public String executeLampu(String redup, String terang){
       return lampu.mengaturKecerahan(redup, terang);
      }
 }
