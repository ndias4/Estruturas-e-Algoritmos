import java.util.Stack;

public class ExInverterString{
    static String A = "A";
    static String B = "B";
    static String C = "C";
    static String D = "D";

    public static void main(String[] args) {
        Stack<String> pilha = new Stack <> ();

        pilha.push(A);
        pilha.push(B);
        pilha.push(C);
        pilha.push(D);

        System.out.println("O topo da pilha é: "+ pilha.peek());

        System.out.println("A pilha está vazia? "+ pilha.isEmpty());

        StringBuilder inverterString = new StringBuilder();

        while (!pilha.isEmpty()) {
            inverterString.append(pilha.pop());
        }
        System.out.println("String invertida: " + inverterString.toString());
    }
}