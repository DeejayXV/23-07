import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.print("Inserisci una stringa (o \":q\" per uscire): ");
            input = scanner.nextLine();

            if (input.equals(":q")) {
                break;
            }
            
            String risultato = "";
            for (int i = 0; i < input.length(); i++) {
                risultato += input.charAt(i);
                if (i < input.length() - 1) {
                    risultato += ",";
                }
            }
            System.out.println("Risultato: " + risultato);
        }

        scanner.close();
    }
}
