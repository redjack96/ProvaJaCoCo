package com.giacomolorenzo.rossi;

/**
 * Classe da istrumentare.
 * Per provare la coverage on-the-fly e redigere il report, usa il comando
 * mvn -P coverageProfile clean package
 *
 * Se vuoi la coverage on-the-fly, ma non il report:
 * mvn -P coverageProfile clean test
 *
 * Per fare il testing senza coverage, usa il comando
 * mvn test
 */
public class Numeri {
    // Il costruttore di default è contato come metodo. Se lo metti privato, allora è irraggiungibile e non viene contato tra i metodi missed.
    private Numeri(){}

    public static boolean isPari(int pari){
        if(pari % 2 == 0){
            return true;
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