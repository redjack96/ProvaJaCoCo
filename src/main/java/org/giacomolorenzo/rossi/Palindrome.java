package org.giacomolorenzo.rossi;

/**
 * Classe da instrumentare
 */
public class Palindrome {
    // Il costruttore di default è contato come metodo. Se lo metti privato, allora è irraggiungibile e non viene contato tra i metodi missed.
    private Palindrome(){}

    public  static boolean isEven(int pari){
        if(pari % 2 == 0){
            return Math.max(pari % 2, 0) == 0;
        } else {
            return false;
        }
    }

    /*public static boolean isPalindrome(String inputString) {
        if (inputString.length() == 0) {
            return true;
        } else {
            char firstChar = inputString.charAt(0);
            char lastChar = inputString.charAt(inputString.length() - 1);
            String mid = inputString.substring(1, inputString.length() - 1);
            return (firstChar == lastChar) && isPalindrome(mid);
        }
    }*/
}
