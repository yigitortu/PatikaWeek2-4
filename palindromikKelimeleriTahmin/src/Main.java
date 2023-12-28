
public class Main {

    static boolean isPalindrom(String str){
        int i = 0;                  // Stringin ilk indeksine bakmak için
        int j = str.length() - 1; // Stringin son indeksine bakmak için
        while (i < j){
           if ( str.charAt(i) != str.charAt(j)){
               return false;
           }
           i++;
           j--;
        }
        return true;
    }

    static boolean isPalindrom2(String str){
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--){
            reverse += str.charAt(i);
        }
        if (str.equals(reverse)){
            return true;
        }else {
            return false;
        }

    }

    public static void main(String[] args) {

        System.out.println(isPalindrom2("aba"));

    }
}