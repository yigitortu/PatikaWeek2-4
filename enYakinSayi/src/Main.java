import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] list = {15, 12, 788, 1, -1, -788, 2, 0};

        Arrays.sort(list);// Küçükten büyüğe sıralayalım.
        System.out.println(Arrays.toString(list)); // Yazdıralım.

        Scanner input = new Scanner(System.in); // Kullanıcıdan değer almak için Scanner tanıtalım

        System.out.print("Bir değer giriniz : ");
        int num = input.nextInt();

        // Alınan Değere göre işlem yapalım
        if (num > list.length){
            System.out.println("Hatalı sayı indeksi girdiniz. tekrar deneyiniz.");
        }else {

            int lowNumber = 0;
            int highNumber = 0;
            for (int i = 0; i < num; i++){
                lowNumber = list[num - 1];
                highNumber = list[num];
            }
            System.out.println("Girilen sayı : " + num+
                    "\nGirilen sayıdan küçük en yakın sayı : "+lowNumber+
                    "\nGirilen sayıdan büyük en yakın sayı : "+highNumber );
        }




    }
}