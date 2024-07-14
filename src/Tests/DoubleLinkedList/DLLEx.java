package Tests.DoubleLinkedList;

public class DLLEx {

  public static void main(String[] args) {
    Node<Integer> node1 = new Node<Integer>();
    Node<Integer> node2 = new Node<Integer>();

    node1.next = node2;
    Node<Integer> head = node1;

    DoubleLinkedList<Integer> mylist = new DoubleLinkedList<Integer>();
    mylist.addNode(1);
    mylist.addNode(2);
    mylist.addNode(3);
    mylist.addNode(4);
    mylist.addNode(5);

    mylist.printAll();
    System.out.println();

    mylist.addNodeInside(9, 3);
    mylist.printAll();
    System.out.println();

    mylist.deleteNode(2);
    mylist.printAll();

  }
}
