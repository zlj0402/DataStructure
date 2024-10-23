public class BST<E extends Comparable<E>> {

    private class Node {
        public E e;
        public Node left, right;

        public Node() {
            e = null;
            left = right = null;
        }
    }

    public BST root;
    public int size;

    public BST(){
        root = null;
        size = 0;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void add(E e) {

    }
}
