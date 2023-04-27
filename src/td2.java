import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class td2 {
    public static void main(String[] args) {
    int[] tab= {8,4,7,5,1,2};
    exo1(tab);
    }

    public static void exo1 (int[] tab) {
        ArrayList<String> liste = new ArrayList<String>();
        for (int i =0; i<tab.length;i++){
            int min = tab[0];
            int minIndex = 0;
            for (int j =1;j < tab.length;j++) {
                if (tab[j] <min) {min = tab[j];
                    minIndex = j;

                }
            }

        }
        System.out.println(liste);
    }



}
