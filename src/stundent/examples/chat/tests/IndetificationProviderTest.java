package stundent.examples.chat.tests;

import stundent.examples.chat.providers.IndetificationProvider;

public class IndetificationProviderTest {
    public static final int ITERATION = 100_000_000;
    public static void main(String[] args) {


        IndetificationProvider indetificationProvider = new IndetificationProvider();
        int countOne = 0;
        int countTwo = 0;

        int valueOne = indetificationProvider.provide();
        int valueTwo = indetificationProvider.provide();
        int countIdeal = ITERATION / IndetificationProvider.UPPER_LIMIT;


        for( long i = 0 ; i< 100000000l; i++){
            int id = indetificationProvider.provide();

           // if (id == IndetificationProvider.LOWER_LIMIT){
            if (id == valueOne){
                countOne++;
            }
            //if (id == IndetificationProvider.UPPER_LIMIT){
            if (id == valueTwo){
                countTwo++;
            }
        }
        int errorOne = Math.abs(countOne - countIdeal);
        int errorTwo = Math.abs(countTwo - countIdeal);
        int errorAVG = (errorOne + errorTwo) / 2;
        int errorPercentage = (int) (100.0 * errorAVG / countIdeal);
        System.out.println(" Value " + valueOne+" was found "+countOne + " times ");
        System.out.println(" Value " + valueTwo+" was found "+countTwo + " times ");
        System.out.println(" Marja de erroare " + errorPercentage+ " % ");


    }
}
