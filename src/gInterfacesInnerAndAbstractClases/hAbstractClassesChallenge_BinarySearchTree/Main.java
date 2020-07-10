package gInterfacesInnerAndAbstractClases.hAbstractClassesChallenge_BinarySearchTree;

public class Main {

    public static void main(String[] args) {
	// write your code here
        SearchTree tree = new SearchTree(null);
        tree.traverse(tree.getRoot());

        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
        String[] data = stringData.split(" ");

        for (String s : data){
            tree.addItem(new Node(s));
        }

        tree.traverse(tree.getRoot());
        System.out.println("Tree size is: " + tree.getSize());
//////////////////////////////////////////////////////////////////////////////

        SearchTree numberListTree = new SearchTree(null);

        stringData = "5 7 0 3 9 8 2 1 0 4 6";
        data = stringData.split(" ");

        for (String s : data){
            numberListTree.addItem(new Node(s));
        }
        System.out.println("Tree size is: " + numberListTree.getSize());

        numberListTree.traverse(numberListTree.getRoot());

        numberListTree.removeItem(new Node("3"));
        System.out.println("Tree size is: " + numberListTree.getSize());
        numberListTree.traverse(numberListTree.getRoot());

        numberListTree.removeItem(new Node("5"));
        System.out.println("Tree size is: " + numberListTree.getSize());
        numberListTree.traverse(numberListTree.getRoot());

        numberListTree.removeItem(new Node("0"));
        System.out.println("Tree size is: " + numberListTree.getSize());
        numberListTree.removeItem(new Node("4"));
        System.out.println("Tree size is: " + numberListTree.getSize());
        numberListTree.removeItem(new Node("2"));
        System.out.println("Tree size is: " + numberListTree.getSize());
        numberListTree.traverse(numberListTree.getRoot());

        numberListTree.removeItem(new Node("9"));
        System.out.println("Tree size is: " + numberListTree.getSize());
        numberListTree.traverse(numberListTree.getRoot());
        numberListTree.removeItem(new Node("8"));
        System.out.println("Tree size is: " + numberListTree.getSize());
        numberListTree.traverse(numberListTree.getRoot());
        numberListTree.removeItem(new Node("6"));
        System.out.println("Tree size is: " + numberListTree.getSize());
        numberListTree.traverse(numberListTree.getRoot());
        numberListTree.removeItem(numberListTree.getRoot());
        System.out.println("Tree size is: " + numberListTree.getSize());
        numberListTree.traverse(numberListTree.getRoot());
        numberListTree.removeItem(numberListTree.getRoot());
        System.out.println("Tree size is: " + numberListTree.getSize());
        numberListTree.traverse(numberListTree.getRoot());

        numberListTree.addItem(new Node("666"));
        System.out.println("Tree size is: " + numberListTree.getSize());
        numberListTree.traverse(numberListTree.getRoot());

    }

}
