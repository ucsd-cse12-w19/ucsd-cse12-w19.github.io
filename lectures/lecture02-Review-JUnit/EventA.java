import java.time.LocalDateTime;

public class Event {
  final LocalDateTime start;
  final LocalDateTime end;
  final String location;

  public Event(LocalDateTime start, LocalDateTime end, String location) {
    this.start = start;
    this.end = end;
    this.location = location;
  }

  // Return true if the other event is in the
  // same location at an overlapping time
  public boolean conflict(Event other) {
    if(this.location.equals(other.location)) {
      if(this.start.compareTo(other.start) <= 0 &&
         // A: A positive number <---  chosen
         // B: A negative number

         this.end.compareTo(other.start) > 0) {
         // A: A positive number <---  chosen
         // B: A negative number
        
        return true; // The other event starts "in the middle" of this one
      }
    }
  }
}


