    public class FuncaoArray {
    public static void main(String[] args) {
        int[] numbers = {25, 5};

        int[] resultado = ordenarNumeros(numbers);

        System.out.println("[" + resultado[0] + ", " + resultado[1] + "]");
    }
    public static int[] ordenarNumeros(int[] numbers){
        if(numbers[0] > numbers[1]){
            int temp = numbers[0];
            numbers[0] = numbers[1];
            numbers[1] = temp;
        }
        return numbers;
    }
}
