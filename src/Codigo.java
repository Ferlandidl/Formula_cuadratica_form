
public class Codigo {
    private int n1=0;
    private int n2=0;
    private int n3=0;

    public Codigo() {
    }     
    public Codigo(int a, int b, int c) {
        this.n1=a;
        this.n2=b;
        this.n3=c;
    }
    public double pitagoras() {
       double h=0; double h1=0; double h2; 
       h=Math.pow(n1, 2)+Math.pow(n2, 2)+Math.pow(n3, h);
       h1=Math.sqrt(h);
       h2=Math.pow(h1, 2);
       
       return h1;
    }    
}
