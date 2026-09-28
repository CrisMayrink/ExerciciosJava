
import java.util.Locale;

/* @author cmaya */
public class Program {
    public static void main(String[] args) {
        
        double x = 10.35784;        
        System.out.println(x);
        System.out.printf("%.2f%n", x);
        Locale.setDefault(Locale.US);
        System.out.printf("%.2f%n", x);
    }      
}
