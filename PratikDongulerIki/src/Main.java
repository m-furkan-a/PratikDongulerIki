import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

	    int sayi=0,top=0;

	    do {
            System.out.print("Sayı Giriniz : ");
            sayi = input.nextInt();
            if (sayi %2==0 && sayi %4==0){
                top +=sayi;
            }
        }while (sayi %2==0);
	    System.out.print("Girilen değerlerden çift ve 4'ün katları olan sayıların toplamı : " + top);
    }
}
