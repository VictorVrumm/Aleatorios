import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        palavra = palavra.toLowerCase();

        StringBuilder resultado = new StringBuilder();

        for (char c : palavra.toCharArray()) {
            if (Character.isLetter(c)) {
                int valor = c - 'a' + 1;
                resultado.append(valor);
            }
        }
        System.out.println("Criptografia: " + resultado.toString());
        scanner.close();
    }
}
