package gInterfacesInnerAndAbstractClases.gAbstractClassesChallenge;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MyLinkedList list = new MyLinkedList(null);
        list.traverse(list.getRoot());

        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
        String[] data = stringData.split(" ");

        for (String s : data){
            list.addItem(new Node(s));
        }

        list.traverse(list.getRoot());
        System.out.println();
//////////////////////////////////////////////////////////////////////////////

        MyLinkedList numberList = new MyLinkedList(null);

        stringData = "5 7 0 3 9 8 2 1 0 4 6";
        data = stringData.split(" ");

        for (String s : data){
            numberList.addItem(new Node(s));
        }

        numberList.traverse(numberList.getRoot());

        numberList.removeItem(new Node("3"));
        numberList.traverse(numberList.getRoot());

        numberList.removeItem(new Node("5"));
        numberList.traverse(numberList.getRoot());

        numberList.removeItem(new Node("0"));
        numberList.removeItem(new Node("4"));
        numberList.removeItem(new Node("2"));
        numberList.traverse(numberList.getRoot());

        numberList.removeItem(new Node("9"));
        numberList.traverse(numberList.getRoot());
        numberList.removeItem(new Node("8"));
        numberList.traverse(numberList.getRoot());
        numberList.removeItem(new Node("6"));
        numberList.traverse(numberList.getRoot());
        numberList.removeItem(numberList.getRoot());
        numberList.traverse(numberList.getRoot());
        numberList.removeItem(numberList.getRoot());
        numberList.traverse(numberList.getRoot());


    }

}
