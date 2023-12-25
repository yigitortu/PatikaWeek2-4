
public class Main {
    public static void main(String[] args) {
        // dizimizi atayalım.
        int[] array = {2, 3, 4, 5, 6, 7};

        double sum = 0.0;

        // harmonik sayılar için oluşturduğumuz 1/ formülü
        for (int i = 0; i < array.length; i++){
            sum += 1.0 / array[i];
        }

        // harmonik sayı formülü
        double harmonik = sum / array.length;

        System.out.println("Sonuç : \t" +harmonik);

    }
}