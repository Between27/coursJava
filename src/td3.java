import java.util.Scanner;

public class td3 {
    public static void main(String[] args) {
        ex4();
    }

    public static int ex1(int n){
        int carre;

        carre = n*n;

        return carre;
    }

    public static int ex2(int a,int b) {
        return Math.max(a, b);
    }

    public static int ex3(int[] tab){
        int somme = 0;
        for (int j : tab) somme += j;
        return somme;

    }

    public static void ex4() {
        Scanner question = new Scanner(System.in);
        System.out.println("Quelle fonction voulez-vous utiliser ?");
        System.out.println("1.carré 2.comparaison");
        int q = question.nextInt();
        while (q<1 || q>3) {
            q = question.nextInt();
            System.out.println("Quelle fonction voulez-vous utiliser ?");
            System.out.println("1.carré 2.somme 3.comparaison");
        }
        if (q == 1) {
            System.out.println("Entrez un nombre dont vous voulez le carré");
            int carre = question.nextInt();
            System.out.println("Le carré de "+carre+ " est " +ex1(carre));
        }
        else if (q==2) {
            System.out.println("Entrez un premier nombre ");
            int nombre1 = question.nextInt();
            System.out.println("Entrez un premier nombre ");
            int nombre2 = question.nextInt();
            System.out.println("le plus grand est "+ ex2(nombre1,nombre2));
        }
    }
}
