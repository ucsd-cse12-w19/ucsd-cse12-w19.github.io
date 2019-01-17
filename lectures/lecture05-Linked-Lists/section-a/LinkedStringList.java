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
    // this.front = null;
    this.front = new Node(null, null);
  }
  // What needs to change in prepend() and/or get()

  // Idea: pass in starting Nodes

  // How will we implement the methods?
  public void prepend(String s) {
    this.front.next = new Node(s, this.front.next);
  }

  public String get(int index) {
    Node temp = this.front.next;
    for(int i = 0; i < index; i += 1) {
      temp = temp.next;
    }
    return temp.value;
  }

  public void add(String s) {
    Node temp = this.front;
    while(!(temp.next == null)) {
      temp = temp.next;
    }
    temp.next = new Node(s, null);
  }


  // Size ideas:
  // 1. Do a loop like get, count up until temp is null
  // 2. Add a field called "size", and increment it on prepend, add












}

