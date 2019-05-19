
package mid_b_3;

import java.util.Scanner;
class a{
    String nama;
    int hm,lk,hp;
    double bun,cil,thm;
    double untung;
    
    public int rumus1(){
        return hp=hm/lk;
    }
    public double rumus2(){
        return bun=(int)hp*0.1;
    }
    public double rumus3(){
        return cil=(int)hp+bun;
    }
    public double rumus4(){
        return thm=(int)cil*lk;
    }
    public double rumus5(){
        return untung=(int)thm-hp;
    }
    public void cetak(){
        System.out.println("Nama: "+nama);
        System.out.println("Harga Motor:Rp. "+hm);
        System.out.println("Lama Kredit: "+lk+" bulan");
        System.out.println("Harga Pokok:Rp. "+hp);
        System.out.println("Bunga: "+bun);
        System.out.println("Cicilan: "+cil);
        System.out.println("Total Harga Motor:Rp. "+thm);
        System.out.println("Keuntungan Dealer:Rp. "+untung);
    }
}

/**
 *
 * @author Bintang
 */
public class Mid_B_3 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        a A=new a();
        System.out.println("PEMBAYARAN SEPEDA MOTOR KREDIT");
        System.out.print("Masukkan Nama: ");
        A.nama=input.nextLine();
        System.out.print("Masukkan Harga Motor:Rp. ");
        A.hm=input.nextInt();
        System.out.print("Masukkan Lama Kredit(bulan): ");
        A.lk=input.nextInt();
        System.out.println("==============================");
        A.rumus1();
        A.rumus2();
        A.rumus3();
        A.rumus4();
        A.rumus5();
        A.cetak();
     
        
    }
    
}
