import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int  sayi1,basamak = 0, kalan;
        boolean durum = true;
        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz: ");
        sayi1 = input.nextInt();
        input.close();
        while(durum){
            kalan = sayi1%10;
            sayi1 = (sayi1-kalan)/10;
            basamak++;
            if(sayi1 <=0){
                System.out.printf("Basamak sayisi: %d",basamak);
                break;
            }
        }
    }
}

