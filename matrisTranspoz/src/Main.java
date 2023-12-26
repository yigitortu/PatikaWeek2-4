
public class Main {
    public static void main(String[] args) {

        // Elimizde bir çoklu dizi var.
        // Matrisin transpozunu (devriğini) almak
        // matrisin aynı numaralı satırları ile sütunlarının yer değiştirmesi demektir
        //

        // çoklu diziyi yazalım

        int[][] list = {{2, 3, 8}, {5, 6, 4,}};
        // Transpoz olucak olan diziyi tanımlayalım.
        int[][] listTranspoz = new int[list[0].length][list.length];

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[0].length; j++) {
                listTranspoz[j][i] = list[i][j];
            }
        }
        System.out.println("matris");
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[0].length; j++) {
                System.out.print(list[i][j] + "   ");
            }
            System.out.println();
        }

        System.out.println("matris transpoz");
        for (int i = 0; i < listTranspoz.length; i++) {
            for (int j = 0; j < listTranspoz[0].length; j++) {
                System.out.print(listTranspoz[i][j] + "   ");
            }
            System.out.println();
        }





    }
}