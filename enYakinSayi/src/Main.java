import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        int userValue = 5;

        // Diziyi sıralayalım.
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        // Yakın ve Yüksek değeri 0 olarak atayalım.
        int closeLowValue = 0;
        int closeHighValue = 0;

        // Formülü yazalım.
        for (int i = 0; i < userValue + 1; i++) {
            closeLowValue = list[userValue - 1];
            closeHighValue = list[userValue + 1];
        }

        // Ekrana yazdıralım.
        System.out.println("Girilen sayı : " + userValue +
                "\nGirilen sayıdan en küçük sayı : " + closeLowValue +
                "\nGirilen sayıdan en büyük sayı : " + closeHighValue);


    }
}