public class App {
    public static void main(String[] args) throws Exception {
        BinarySearchTree tree = new BinarySearchTree();
        int[] nums = {10,7,11,15,1,0};
        for (int i : nums) {
            tree.insert(i);
        }

        tree.printInOrder();
    }
}
