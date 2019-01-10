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

  // NOTE(joe):
  // I found it much easier to read and understand this by writing a helper
  // method. I chose >= on start and < on end deliberately so that back-to-back
  // events wouldn't conflict. That was an implementation choice I made.
  public static boolean between(LocalDateTime toCheck, LocalDateTime lower, LocalDateTime upper) {
    return toCheck.compareTo(lower) >= 0 && toCheck.compareTo(upper) < 0;
  }

  // Return true if the other event is in the same location at an overlapping
  // time
  public boolean conflict(Event other) {
    if(!this.location.equals(other.location)) { return false; }
    if(between(this.start, other.start, other.end)) { return true; }
    if(between(other.start, this.start, this.end)) { return true; }
    return false;
  }
}


