import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*assuming our tree wants to be like this:
        -------------------------------------------------------------------------------
                                                   8
                                                  / \
                                                 3   10
                                                / \   \
                                               1   6   14
                                                  / \  /
                                                 4  7 13
        --------------------------------------------------------------------------------
        */
        Node node1 = new Node(8);
        Scanner user_input = new Scanner(System.in);
        int number_to_find;
        System.out.print("Enter a number to search: ");
        number_to_find = user_input.nextInt();

        BST bst = new BST();
        node1 = bst.Add(3,node1);
        node1 = bst.Add(10,node1);
        node1.left = bst.Add(1,node1.left);
        node1.left = bst.Add(6,node1.left);
        node1.left.right = bst.Add(4,node1.left.right);
        node1.left.right = bst.Add(7,node1.left.right);
        node1.right = bst.Add(14,node1.right);
        node1.right.left = bst.Add(13,node1.right.left);

        bst.Search(number_to_find,node1);
    }
}
//MAIN ENDS HERE