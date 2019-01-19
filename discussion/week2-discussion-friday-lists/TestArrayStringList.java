import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestArrayStringList {

  @Test
  public void testAdd() {
    StringList slist = new ArrayStringList();
    slist.add("banana");
    slist.add("apple");

    assertEquals("banana", slist.get(0));
    assertEquals("apple", slist.get(1));
  }

  @Test
  public void testAddThenSize() {
    StringList slist = new ArrayStringList();
    slist.add("banana");
    slist.add("apple");

    assertEquals(2, slist.size());
  }


  @Test
  public void testAddMany() {
    StringList slist = new ArrayStringList();
    slist.add("a");
    slist.add("b");
    slist.add("c");
    slist.add("d");
    slist.add("e");

    assertEquals("e", slist.get(4));
    assertEquals("d", slist.get(3));
    assertEquals("c", slist.get(2));
    assertEquals("b", slist.get(1));
    assertEquals("a", slist.get(0));
  }
  
  @Test
  public void add1Remove1(){
    StringList slist = new ArrayStringList();
    slist.add("a");  
    slist.remove(0);
	
    assertEquals(null, slist.get(0));
    assertEquals(slist.size(), 0);	  
  }
  
  @Test
  public void add0Remove1(){
    StringList slist = new ArrayStringList();
    slist.remove(0);
	
    assertEquals(slist.size(), 0);	  
  }
  
  @Test
  public void add5Remove1(){
    StringList slist = new ArrayStringList();
    slist.add("a");
    slist.add("b");
    slist.add("c");
    slist.add("d");
    slist.add("e");	  
	
    slist.remove(3);
	
    assertEquals(null, slist.get(4));
    assertEquals("e", slist.get(3));
    assertEquals("c", slist.get(2));
    assertEquals("b", slist.get(1));
    assertEquals("a", slist.get(0));
    
    assertEquals(slist.size(), 4);	  
  }
  
  @Test
  public void add5RemoveEnd(){
    StringList slist = new ArrayStringList();
    slist.add("a");
    slist.add("b");
    slist.add("c");
    slist.add("d");
    slist.add("e");	  
	
    slist.remove(4);
	
    assertEquals(null, slist.get(4));
    assertEquals("d", slist.get(3));
    assertEquals("c", slist.get(2));
    assertEquals("b", slist.get(1));
    assertEquals("a", slist.get(0));
    
    assertEquals(slist.size(), 4);	  
  }
  
  @Test
  public void add5RemoveTwice(){
    StringList slist = new ArrayStringList();
    slist.add("a");
    slist.add("b");
    slist.add("c");
    slist.add("d");
    slist.add("e");	  
	
    slist.remove(2);
    slist.remove(1);

    assertEquals(null, slist.get(3));
    assertEquals(null, slist.get(3));
    assertEquals("e", slist.get(2));
    assertEquals("d", slist.get(1));
    assertEquals("a", slist.get(0));
    
    assertEquals(slist.size(), 3);
  }
  
  @Test
  public void removeOutOfBoundsOfSize(){
    StringList slist = new ArrayStringList();
    slist.add("a");
    slist.add("b");
    slist.add("c");
	
    slist.remove(3);

    assertEquals("c", slist.get(2));
    assertEquals("b", slist.get(1));
    assertEquals("a", slist.get(0));
    
    assertEquals(slist.size(), 3);	  
  }
  
  @Test
  public void removeInAndOutOfBoundsOfSize(){
    StringList slist = new ArrayStringList();
    slist.add("a");
    slist.add("b");
    slist.add("c");
	
    slist.remove(1);
    slist.remove(2);

    assertEquals(null, slist.get(2));
    assertEquals("c", slist.get(1));
    assertEquals("a", slist.get(0));
    
    assertEquals(slist.size(), 2);
  }
  
  @Test
  public void removeOutOfBoundsOfCapacity(){
    StringList slist = new ArrayStringList();
    slist.add("a");
    slist.add("b");
    slist.add("c");
	
    slist.remove(6);

    assertEquals("c", slist.get(2));
    assertEquals("b", slist.get(1));
    assertEquals("a", slist.get(0));
    
    assertEquals(slist.size(), 3);	  
  }
  
  @Test
  public void removeInAndOutOfBoundsOfCapacity(){
    StringList slist = new ArrayStringList();
    slist.add("a");
    slist.add("b");
    slist.add("c");
	
    slist.remove(1);
    slist.remove(10);

    assertEquals(null, slist.get(2));
    assertEquals("c", slist.get(1));
    assertEquals("a", slist.get(0));
    
    assertEquals(slist.size(), 2);	  
  }
  
  @Test
  public void removeBeginning(){
    StringList slist = new ArrayStringList();
    slist.add("a");
    slist.add("b");
    slist.add("c");
		
    slist.remove(0);

    assertEquals(null, slist.get(2));
    assertEquals("c", slist.get(1));
    assertEquals("b", slist.get(0));
	    
    assertEquals(slist.size(), 2);
  }
  
  @Test
  public void insertAtBeginningOfEmpty(){
    StringList slist = new ArrayStringList();
    slist.insert(0, "a");

    assertEquals("a", slist.get(0));	    
    assertEquals(slist.size(), 1);		  
  }
  
  @Test
  public void insertOutOfBoundsOfEmpty(){
    StringList slist = new ArrayStringList();
    slist.insert(5, "a");
	    
    assertEquals(slist.size(), 0);		  
  }
  
  @Test
  public void addThenInsertInMiddle(){
    StringList slist = new ArrayStringList();
    slist.add("a");
    slist.add("b");
    slist.add("c");
    slist.insert(1, "x");

    assertEquals("c", slist.get(3));
    assertEquals("b", slist.get(2));
    assertEquals("x", slist.get(1));
    assertEquals("a", slist.get(0));
	    
    assertEquals(slist.size(), 4);	  
  }
  
  @Test
  public void testPrepend() {
    StringList slist = new ArrayStringList();
    slist.prepend("banana");
    slist.prepend("apple");

    assertEquals("banana", slist.get(1));
    assertEquals("apple", slist.get(0));
  }

  @Test
  public void testPrependThenSize() {
    StringList slist = new ArrayStringList();
    slist.prepend("banana");
    slist.prepend("apple");

    assertEquals(2, slist.size());
  }
}
