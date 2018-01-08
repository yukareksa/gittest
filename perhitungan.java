import java.util.Scanner;
public class perhitungan {
public static void main(String[] args){
        int panjang;
        int lebar;
        double luas;

                Scanner a = new Scanner(System.in);
                System.out.println("Menghitung luas persegi panjang");
                System.out.println("Masukkan panjang : ");
                panjang = a.nextInt();
                System.out.println("Masukkan lebar : ");
                lebar = a.nextInt();

                luas = (panjang*lebar);
                System.out.println("Luas persegi panjang = "+luas);
                }
}
