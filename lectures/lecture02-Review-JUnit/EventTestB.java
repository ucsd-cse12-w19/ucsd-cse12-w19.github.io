import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.time.LocalDateTime;

public class EventTest {
  LocalDateTime start = LocalDateTime.of(2018, 1, 10, 9, 45);
  LocalDateTime end = LocalDateTime.of(2018, 1, 10, 10, 45);

  @Test
  public void testEventConstructor() {

    Event e1 = new Event(this.start, this.end, "York 2622");

    assertEquals(e1.start, this.start);
    assertEquals(e1.end, this.end);
    assertEquals(e1.location, "York 2622");

    // A: I expect this test to pass
    // B: I expect this test to fail
    // C: Something else will happen
    // The test failed (after fixing a compile error)
  }

  @Test
  public void testConflict() {

    Event e1 = new Event(this.start, this.end, "11111");
    Event e2 = new Event(this.start, this.end, "11111");

    assertEquals(e1.conflict(e2), true);

    // Event completely outside another event
    // Event completely contained within an event

    // Events in different places

  }

}

