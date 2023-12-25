import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Dizi belirleyeceğiz ancak boyutunu kullanıcıdan alacağız.
        // İlk önce scanner sınıfını tanımlayarak kullanıcıdan dizi boyutu değerini alacağız.
        // Değer alındıktan sonra değer kadar kullanıcıdan veri isteyeceğiz. for döngüsü ile sağlanabilir.
        // değerler alındıktan sonra Arrays.sort islemi kullanılarak elemanları sıralayacağız.

        Scanner input = new Scanner(System.in); // Sınıf tanımlandı

        System.out.print("Dizinin boyutu n : ");    //Boyutu kullanıcıdan aldık.
        int n = input.nextInt();
        int[] numbers = new int[n]; // numbers adında bir dizi oluşturacağız.

        for (int i = 0; i < n; i++){
            System.out.print("Dizinin elemanlarını giriniz :"); // Kullanıcıdan aldığımız değerleri numbers
            numbers[i] = input.nextInt();                       // Dizisinini içerisine yerleştireceğiz.
        }

        System.out.println("Girilen elemanlar: ");  // Girilen elemanları küçükten büyüğe
        Arrays.sort(numbers);           // Sıralayacağız

        //Ekrana çıktısını vereceğiz.
        System.out.println(Arrays.toString(numbers));


    }
}