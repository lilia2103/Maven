package string_two;

import java.util.Scanner;

public class StringTwo {

    /**
     * ex.1
     * o and z
     * @param str
     */
    public void oandz(String str){
        if(str.equals("")){
            System.out.println("string is empty");
            return;
        }
        StringBuilder st = new StringBuilder();
        if(str.charAt(0) == 'o'){
            st.append(str.charAt(0));
            if(str.charAt(1) == 'z'){
                st.append(str.charAt(1));
            }else {
                System.out.println("equal to 'z'");
                return;
            }
        }else {
            System.out.println("equal to 'o'");
            return;
        }
        System.out.println(st);
    }

    /**
     * ex.2
     * @param str
     * @return count
     */
    int ofChar(String str){
        int count = 0 ;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)){
                count++;
            }
        }
        System.out.println(count);
        return count;
    }

    /**
     * ex.3 Palindrome
     * @param pal
     * @return an;
     */
    public static boolean isPalindrome(String pal) {
        String rev = "";
        boolean an = false;
        for (int i = pal.length() - 1; i >= 0; i--) {
            rev =rev + pal.charAt(i);
        }
        if (pal.equals(rev)){
            an = true;
        }
        return an;
    }

    void listOfString(){
        Scanner sc = new Scanner(System.in);
        int i = 0 ;
        String str = "";
        String  list = "";
        while (i < 4){
            System.out.println("Enter the word:");
            str = sc.nextLine();
            i++;
            if (str.charAt(0) == 'a' && str.length() == 3){
                list = str;
            }
        }
        System.out.println(list + " ");
    }

    /**
     * ex.7
     * @param str
     * @param low
     * @param high
     */
    static void SubStr(String str, int low, int high){
        for (int i = low; i <= high; ++i)
            System.out.println(str.charAt(i));
    }

    /**
     * ex.7 շարունակություն
     * @param str
     * @return
     */

    static int longetPal(String str){
        int n = str.length();
        int maxLeng = 1 ,start = 0 ;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                int flag = 1;
                for (int k = 0; k < (j - i +1)/ 2 ; k++) {
                    if (flag != 0 && (j - i + 1) > maxLeng){
                        start = i;
                        maxLeng = j - i + 1;
                    }

                }
            }
            //System.out.println("Longest palindrome subString is:");
            //System.out.println(SubStr(str, start, start + maxLeng -1);

        }
        return  maxLeng;
    }






    public static void main(String[] args) {
        String pal = "phxhp";
        pal = pal.toLowerCase();
        boolean A = isPalindrome(pal);
        System.out.println(A);

        String str1 = "hksksijdlpkpxpkp";
        System.out.println("\nlength is:" + longetPal(str1));
    }
}
