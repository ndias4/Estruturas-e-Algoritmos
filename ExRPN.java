import java.util.Scanner;
import java.util.Stack;

public class ExRPN {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma expressão do tipo RPN: ");
        String expressao = scanner.nextLine();

        Stack<Character> pilha = new Stack<>();
        pilha.push(expressao);
    }

    public static boolean ehOperador(char c){
        return c == '+' || c == '-' || c == '*' || c == '/';
    }


}
