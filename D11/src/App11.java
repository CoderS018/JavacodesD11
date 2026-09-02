class Node {
    Node[] child = new Node[26];
    boolean end;
}
public class App11 {
    static Node root = new Node();
    static void insert(String word) {
        Node current = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (current.child[index] == null) {
                current.child[index] = new Node();
            }
            current = current.child[index];
        }
        current.end = true;
    }
    static boolean search(String word) {
        Node current = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (current.child[index] == null) {
                return false;
            }
            current = current.child[index];
        }
        return current.end;
    }
    public static void main(String[] args) {
        insert("car");
        insert("cab");
        insert("cat");
        insert("can");
        System.out.println("car: " + search("car"));
        System.out.println("cab: " + search("cab"));
        System.out.println("cat: " + search("cat"));
        System.out.println("can: " + search("can"));
    }
}
