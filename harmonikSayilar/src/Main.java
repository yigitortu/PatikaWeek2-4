
public class Main {
    public static void main(String[] args) {

        int[] array = {2, 3, 4, 5, 6, 7};

        double sum = 0.0;

        for (int i = 0; i < array.length; i++){
            sum += 1.0 / array[i];
        }

        double harmonik = sum / array.length;

        System.out.println("Sonuç : \t" +harmonik);

    }
}