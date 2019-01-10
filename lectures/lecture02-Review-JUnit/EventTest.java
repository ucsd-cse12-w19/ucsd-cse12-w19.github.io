import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.time.LocalDateTime;

public class EventTest {
  LocalDateTime nine45 = LocalDateTime.of(2018, 1, 10, 9, 45);
  LocalDateTime ten30 = LocalDateTime.of(2018, 1, 10, 10, 30);
  LocalDateTime ten45 = LocalDateTime.of(2018, 1, 10, 10, 45);
  LocalDateTime eleven45 = LocalDateTime.of(2018, 1, 10, 11, 45);

  LocalDateTime farPast = LocalDateTime.of(2017, 1, 10, 9, 45);
  LocalDateTime farFuture = LocalDateTime.of(2020, 1, 10, 10, 45);

  @Test
  public void testEventConstructor() {

    Event e1 = new Event(this.nine45, this.ten45, "York 2622");

    assertEquals(this.nine45, e1.start);
    assertEquals(this.ten45, e1.end);
    assertEquals("York 2622", e1.location);
  }

  @Test
  public void testConflictSameTimes() {
    Event e1 = new Event(this.nine45, this.ten45, "11111");
    Event e2 = new Event(this.nine45, this.ten45, "11111");

    assertEquals(true, e1.conflict(e2));
    assertEquals(true, e2.conflict(e1));
  }

  @Test
  public void testConflictSameTimesDifferentLocation() {
    Event e1 = new Event(this.nine45, this.ten45, "Warren");
    Event e2 = new Event(this.nine45, this.ten45, "York");

    assertEquals(false, e1.conflict(e2));
    assertEquals(false, e2.conflict(e1));
  }

  @Test
  public void testConflictContained() {
    Event e1 = new Event(this.nine45, this.ten45, "Warren 2005");
    Event e2 = new Event(this.farPast, this.farFuture, "Warren 2005");

    assertEquals(true, e1.conflict(e2));
    assertEquals(true, e2.conflict(e1));
  }

  @Test
  public void testConflictBackToBack() {
    Event e1 = new Event(this.nine45, this.ten45, "Warren 2005");
    Event e2 = new Event(this.ten45, this.eleven45, "Warren 2005");

    assertEquals(false, e1.conflict(e2));
    assertEquals(false, e2.conflict(e1));
  }

  @Test
  public void testConflictOverlap() {
    Event e1 = new Event(this.nine45, this.ten45, "CSE 260B");
    Event e2 = new Event(this.ten30, this.eleven45, "CSE 260B");

    assertEquals(true, e1.conflict(e2));
    assertEquals(true, e2.conflict(e1));
  }

}

