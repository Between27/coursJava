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
        int p = 0;
        for (int i =0; i<tab.length;i++){
            for (int j =0;j < tab.length;j++) {
                if (tab[j] <tab[i]) {p = tab[j];}
            }
            String n = String.valueOf(p);

        }
System.out.println(p);
    }



}
