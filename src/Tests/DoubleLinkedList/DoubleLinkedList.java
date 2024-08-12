package Tests.DoubleLinkedList;

public class DoubleLinkedList<T> {

  public Node<T> head = null;

  public class Node<T> {

    T data;
    Node<T> next = null;
    Node<T> prev = null;

    public Node(T data) {
      this.data = data;
    }
  }

  public void addNode(T data) {
    if (this.head == null) {
      this.head = new Node<T>(data);
    } else {
      Node<T> node = this.head;

      while (node.next != null) {
        node = node.next;
      }
      node.next = new Node<T>(data);
      node.next.prev = node;
    }
  }

  public void printAll() {
    if (this.head != null) {
      Node<T> node = this.head;
      System.out.print(node.data + " ");
      while (node.next != null) {
        node = node.next;
        System.out.print(node.data + " ");
      }
    }
  }

  public Node<T> search(T data) {
    if (this.head == null) {
      return null;
    } else {
      Node<T> node = this.head;
      while (node != null) {
        if (node.data == data) {
          return node;
        } else {
          node = node.next;
        }
      }
    }
    return null;
  }

  public void addNodeInside(T data, T isData) {
    Node searchNode = this.search(isData);

    if (searchNode == null) {
      this.addNode(data);
    } else {
      Node<T> nextNode = searchNode.next;
      searchNode.next = new Node<T>(data);
      nextNode.prev = searchNode.next;
      searchNode.next.next = nextNode;
      searchNode.next.prev = searchNode;
    }
  }

  public void deleteNode(T data) {
    if (this.head == null) {
      return;
    } else {
      Node<T> node = this.head;
      while (node != null) {
        if (node.next.data == data) {
          node.next = node.next.next;
          node.next.prev = node;
          break;
        } else {
          node = node.next;
        }
      }
    }
  }
}
