import java.util.Arrays;
import java.util.Scanner;
public class td1 {
    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 5};

        exo11(tab);
    }


    public static void exo7() {
        Scanner question = new Scanner(System.in);
        int nb = question.nextInt();
        int produit = 1;
        int i = 1;
        while (i <= nb) {
            produit *= i;
            i++;
        }
        System.out.println(produit);
    }

    public static void exo6() {
        Scanner question = new Scanner(System.in);
        int nb = question.nextInt();
        int somme = 0;
        for (int i = 0; i <= nb; i++) {
            somme += i;
        }
        System.out.println(somme);
    }

    public static void exo5() {
        Scanner question = new Scanner(System.in);
        System.out.println("Entrez un premier nombre ");
        int nombre1 = question.nextInt();
        int nb = nombre1;
        System.out.println("Entrez un premier nombre ");
        int nombre2 = question.nextInt();
        nombre1 = nombre2;
        nombre2 = nb;
        System.out.println("Le nombre 1 est " + nombre1);
        System.out.println("Le nombre 2 est " + nombre2);
    }

    public static void exo4() {
        Scanner question = new Scanner(System.in);
        System.out.println("Entrez un nombre");
        int nb = question.nextInt();
        if (nb % 2 == 0) System.out.println("Ce nombre est pair");
        else System.out.println("Ce nombre est impair");
    }

    public static void exo3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un premier nombre ");
        int nombre1 = scanner.nextInt();
        System.out.println("Entrez un premier nombre ");
        int nombre2 = scanner.nextInt();
        String rep = "Le nombre le plus grand est ";
        if (nombre1 > nombre2) {
            System.out.println(rep + nombre1);
        } else {
            System.out.println(rep + nombre2);
        }
    }

    public static void exo2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Comment vous appelez-vous ? ");

        String nom = scanner.nextLine();

        System.out.println(nom);
    }

    public static void exo8() {
        Scanner question = new Scanner(System.in);
        int nb = question.nextInt();
        int heure = 0;
        while (nb > 59) {
            heure++;
            nb -= 60;
        }
        System.out.println(heure + " heures et " + nb + " minutes");
    }

    public static String exo9(int[] tab) {
        Scanner question = new Scanner(System.in);
        int nb = question.nextInt();
        String message = "";
        for (int i = 0; i < tab.length; i++) {
            if (nb == tab[i]) {
                message = "oui";
                break;
            } else {message = "Non";}
        }
      return message;
    }


    public static void exo10(int[] tab) {
        Scanner question = new Scanner(System.in);
        int nb = question.nextInt();
        String message = "";
        for (int i = 0; i < tab.length; i++) {
            if (nb == tab[i]) {
                message = "oui à la position " + i;
                break;
            } else {message = "Non";}
        }
        System.out.println(message);

    }

    public static void exo11 (int[] tab){
        Scanner question = new Scanner(System.in);
        System.out.println("Saisissez un nombre ");
        int nb = question.nextInt();
        System.out.println("Saisissez un indice");
        boolean v = false;
        while(!v) {
            int indice = question.nextInt();
            if (indice < 0 || indice> tab.length) {
                System.out.println("Entrez un indice correct");
            }
            else {tab[indice] = nb;v=true;}
            }
        System.out.println(Arrays.toString(tab));
        }



    }
