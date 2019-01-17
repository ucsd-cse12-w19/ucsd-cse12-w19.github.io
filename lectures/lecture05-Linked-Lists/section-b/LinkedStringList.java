class Node {
  String value;
  Node next;
  public Node(String value, Node next) {
    this.value = value;
    this.next = next;
  }
}

public class LinkedStringList implements StringList {

  Node front;

  // How will we construct it?
  public LinkedStringList() {
    this.front = new Node(null, null);
  }

  // How will we implement the methods?
  public void prepend(String s) {
    Node newFront = new Node(s, this.front.next);
    this.front.next = newFront;
  }

  public String get(int index) {
    Node current = this.front.next;
    for(int i = 0; i < index; i += 1) {
      // current = this.front.next;   // A
      // current = this.current.next; // B
      current = current.next;      // C
    }
    return current.value;
  }

}

