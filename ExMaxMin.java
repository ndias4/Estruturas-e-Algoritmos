public class ExMaxMin {
    public static void main(String[] args) {
        int vetor[] = {2,6,12,7,17,14,5,4,3};
        int maior = vetor[0];
        int menor = vetor[0];

        for (int i = 1; i < vetor.length; i++){
            if (vetor[i] > maior){
                maior = vetor[i];
            }
        }
        for (int i = 1; i < vetor.length; i++){
            if (vetor[i] < menor){
                menor = vetor[i];
            }
        }
        System.out.println(" o maior número é " + maior + ", e o menor número é " + menor);
    }
    
}
