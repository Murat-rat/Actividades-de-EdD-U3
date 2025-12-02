public class BinarySearchTree {
    private Node root;

    /*
    Método público para insertar
    */

    public void insert(int value) {
        //Invocación recursiva para saber donde se coloca el nuevo nodo
        root = insertRecursive(root, value);
    }

    private Node insertRecursive(Node current, int valor) {
        //Caso base, cuando current sea null, se crea un nuevo nodo
        if(current == null) {
            return new Node(valor);
        }

        //Si el valor a insertar es menor, iremos al subarbol izquierdo
        if (valor < current.value) {
            current.left = insertRecursive(current.left, valor);
        }

        //Si el valor a insertar es mayor, iremos al subarbol derecho
        else if (valor > current.value) {
            current.right = insertRecursive(current.right, valor);
        }

        //Cuando los valores son iguales, no se hace nada (no se permiten duplicados)

        return current;
    }

    public void printInOrder() {
        printInOrderRecursicve(root);
    }

    private void printInOrderRecursicve(Node current) {
        if(current != null) {
            //Recorrer la parte izquierda
            printInOrderRecursicve(current.left);
            System.out.print(current.value + ", ");
            printInOrderRecursicve(current.right);
        }
    }
}
