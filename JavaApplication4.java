/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author pavet
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] masyvas = {4, 81, -7, 8, 12, 142, -8, 54, 72, 6, -20};
        int smallest = masyvas[0];
        int i = 0;
        while (i < masyvas.length - 1) {
            for (int j = i; j < masyvas.length; j++) {
                if (masyvas[j] < smallest) {
                    smallest = masyvas[j];
                    masyvas[j] = masyvas[i];
                }
                masyvas[i] = smallest;
            }
            i++;
            smallest = masyvas[i];
        }
        for (int p = 0; p < masyvas.length; p++) {
            System.out.print(masyvas[p] + ", ");
        }
        System.out.println();
        int biggest = masyvas[0];
        i = 0; //resetinam indekso reiksme
        while (i < masyvas.length - 1) {
            for (int k = i; k < masyvas.length; k++) {
                if (masyvas[k] > biggest) {
                    biggest = masyvas[k]; //updatina didziausia
                    masyvas[k] = masyvas[i]; //sukeicia vietomis
                }
                masyvas[i] = biggest;
            }
            i++;
            biggest = masyvas[i];
        }

        for (int x = 0; x < masyvas.length; x++) {
            System.out.print(masyvas[x] + ", ");
        }

    }
}
