// Classe principal para testar a lista encadeada
public class SimpleLinkedListExample {
    public static void main(String[] args) {
        SimpleLinkedList list = new SimpleLinkedList();

        // Adicionando elementos à lista
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // Imprimindo os elementos da lista
        System.out.println("Elementos da lista:");
        list.printList();  // Saída: 10 20 30 40

        // Removendo um elemento da lista
        list.remove(30);

        // Imprimindo a lista após remoção
        System.out.println("Lista após remover o elemento 30:");
        list.printList();  // Saída: 10 20 40
    }
}