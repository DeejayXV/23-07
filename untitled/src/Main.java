public class Main {

    public static boolean stringaPariDispari(String s) {
        if (s.length() % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean annoBisestile(int anno) {
        if ((anno % 4 == 0 && anno % 100 != 0) || (anno % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String str1 = "ciao";
        String str2 = "epicode";

        System.out.println("La stringa \"" + str1 + "\" ha un numero di caratteri pari? " + stringaPariDispari(str1));
        System.out.println("La stringa \"" + str2 + "\" ha un numero di caratteri pari? " + stringaPariDispari(str2));

        int anno1 = 2020;
        int anno2 = 1900;
        int anno3 = 2000;

        System.out.println("L'anno " + anno1 + " è bisestile? " + annoBisestile(anno1));
        System.out.println("L'anno " + anno2 + " è bisestile? " + annoBisestile(anno2));
        System.out.println("L'anno " + anno3 + " è bisestile? " + annoBisestile(anno3));
    }
}