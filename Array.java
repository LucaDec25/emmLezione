package esempi;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int numeri[];  //array di 10 interi
        numeri = new int[10];

        for (int j=0; j< numeri.length; j++){
            numeri[j]=j+2;
        }
        for (int l=numeri.length -1; l >= 0; l--){
            System.out.println(numeri[l]);
        }

        String nomi[]=new String[3]; //array di 3 String
        for (int i=0; i< nomi.length; i++){
            System.out.println("");
            nomi[i]=input.nextLine();
        }
    }
}
