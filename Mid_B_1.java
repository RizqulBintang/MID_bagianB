
package mid_b_1;
import java.util.Scanner;

class rumus{
    int alas,tinggi;
    double keliling;
    double sisimiring;
    
    public double rumussmiring(){
    return sisimiring=(int)Math.sqrt(alas*alas+tinggi*tinggi);
    
}
    public double rumuskeliling(){
    return keliling=(int)alas+tinggi+sisimiring;
    }
}

/**
 *
 * @author Bintang
 */
public class Mid_B_1 {

    public static void main(String[] args) {
        rumus a=new rumus();
        Scanner input =new Scanner(System.in);
        System.out.println("Menghitung Sisi-sisi Miring dan Keliling Segitiga Siku-siku");
        
        System.out.print("Masukkan Alas: ");
        a.alas=input.nextInt();
        System.out.print("Masukkan Tinggi: ");
        a.tinggi=input.nextInt();
        
        System.out.println("Sisi Miring= "+a.rumussmiring());
        System.out.println("Keliling= "+a.rumuskeliling());
    }
    
}
