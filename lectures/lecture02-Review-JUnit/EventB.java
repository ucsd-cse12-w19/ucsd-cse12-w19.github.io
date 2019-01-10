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
      if(this.start.compareTo(other.end) < 0 ||
         this.end.compareTo(other.start)) {
        return true;
      }
    }
    else {
      return false;
    }

    // will use compareTo method
    // see if start of calling event is before the other event's end
    // see if ...




  

  }
}


