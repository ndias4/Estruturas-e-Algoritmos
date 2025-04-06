import java.util.Stack;
import java.util.Scanner;

public class ExParenteses{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   
        System.out.println("Digite uma expressão: ");
        String expressao = scanner.nextLine();

        public static boolean analisaParenteses(String expressao){
            Stack<Character> pilha = new Stack<>();
            
            for (char c : expressao.toCharArray());
                if (c = "(") {
                    pilha.push(c);
            } else if (c = ")"){
                    if (pilha.isEmpty()){
                        return false;
                    }
                    pilha.pop();
            } 
        }
    }
}