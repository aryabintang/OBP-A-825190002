import java.util.Scanner;

public class PERSEGI {
    public  static void main(String[] args){
        Scanner input  = new Scanner(System.in);

        Rectangle a= new Rectangle();

        System.out.println(a.toString());

        Rectangle b = new Rectangle();

        System.out.println("masukan panjang = ");
        b.leghth = input.nextDouble();
        System.out.println("masukan lebar =");
        b.width = input.nextDouble();
        System.out.println(" ");
        System.out.println("luas persegi panjang = "+ b.luaspersegi());

        System.out.println("keliling persegi panjang ="+ b.kelilimh());







    }

}
