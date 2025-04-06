// Classe que representa a lista encadeada
class SimpleLinkedList {
    private Node head;

    // Construtor para criar uma lista encadeada vazia
    public SimpleLinkedList() {
        this.head = null;
    }
   // Método para adicionar um elemento no final da lista
   public void add(int data) {
    Node newNode = new Node(data);
    if (head == null) {
        head = newNode;
    } else {
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
}
    // Método para imprimir todos os elementos da lista
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
        // Método para remover o primeiro nó que contém um valor específico
        public void remove(int data) {
            if (head == null) {
                return;
            }
    
            // Caso o elemento a ser removido seja o primeiro da lista
            if (head.data == data) {
                head = head.next;
                return;
            }
    
            Node current = head;
            Node previous = null;
            while (current != null && current.data != data) {
                previous = current;
                current = current.next;
            }
    
            // Se o nó foi encontrado, removê-lo
            if (current != null) {
                previous.next = current.next;
            }
        }
    }
