import java.util.Arrays;
import java.util.Random;

public class Vetores {
    public static void main(String[] args) {
        int[] vetorAleatorio = new int[100];
        int[] vetorCrescente = new int[100];
        int[] vetorDecrescente = new int[100];
        
        // Gerar vetor com 100 números aleatórios
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            vetorAleatorio[i] = random.nextInt(1000); // Aleatórios entre 0 e 999
        }
        
        // Gerar vetor com 100 números em ordem crescente
        for (int i = 0; i < 100; i++) {
            vetorCrescente[i] = i + 1; // De 1 a 100
        }
        
        // Gerar vetor com 100 números em ordem decrescente
        for (int i = 0; i < 100; i++) {
            vetorDecrescente[i] = 100 - i; // De 100 a 1
        }
        
        // Exibir os vetores
        System.out.println("Vetor Aleatório: " + Arrays.toString(vetorAleatorio));
        System.out.println("Vetor Crescente: " + Arrays.toString(vetorCrescente));
        System.out.println("Vetor Decrescente: " + Arrays.toString(vetorDecrescente));
    }
}


