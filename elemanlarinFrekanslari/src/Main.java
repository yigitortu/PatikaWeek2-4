
public class Main {
    public static void main(String[] args) {

        // Verilen dizide Tekrar eden sayıları bulup kaç kere tekrar ettiğini yazacağız.
        // for içinde for döngüsü ile sayıların kaç kere tekrar ettiğini bulacağız.
        // daha sonra ekrana yazdıracağız.

        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        int calcNumberTen = 0;
        int calcNumberTwenty = 0;       // Her birine hesaplama değeri verdim
        int calcNumberFive = 0;

        for (int i = 0; i < list.length; i++) {
            // Değerler içeride varsa yukarıda atadığımız indeksleri 1 arttırmasını söyledim.
            if (list[i] == 10) {
                calcNumberTen += 1;
                System.out.println(10 + " sayısı " + calcNumberTen + " kere tekrar edildi.");

            } // Değerler içeride varsa yukarıda atadığımız indeksleri 1 arttırmasını söyledim.
            else if (list[i] == 20){
                calcNumberTwenty += 1;
                System.out.println(20 + " sayısı " + calcNumberTwenty + " kere tekrar edildi.");

            } // Değerler içeride varsa yukarıda atadığımız indeksleri 1 arttırmasını söyledim.
            else if (list[i] == 5){
                calcNumberFive += 1;
                System.out.println(5 + " sayısı " + calcNumberFive + " kere tekrar edildi.");

            }

        }
        System.out.println();

    }
}