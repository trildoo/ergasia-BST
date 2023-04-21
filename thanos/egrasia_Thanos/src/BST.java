class BST {
    Node root = null;
    int counter_left = 0;
    int counter_right = 0;

    //add function
    public Node Add(int value, Node root) {
        if (root == null) {
            return new Node(value);
        } else if (value < root.value) {
            root.left = Add(value, root.left);
        } else if (value > root.value) {
            root.right = Add(value, root.right);
        }
        return root;
    }

    public void Search(int value, Node root) {
        if (root == null) {
            System.out.println("Element not found.");
        } else if (value == root.value) {
            System.out.println("Found the element at left " + counter_left + " and right " + counter_right);
        } else if (value < root.value) {
            counter_left++;
            Search(value, root.left);
        } else {
            counter_right++;
            Search(value, root.right);
        }
    }
}
//BST ENDS HERE
//Καλησπέρα σας, δυστυχώς καθώς δεν βρίσκομαι ακόμη στην Σπάρτη και δεν κατέχω φορητό υπολογιστή που να μπορεί να τρέξει το intellij έπρεπε να γράψω αυτό κώδικα στο notepad,παρόλα αυτά δεν πρέπει να υπάρχει κάποιο συντακτικό λάθος