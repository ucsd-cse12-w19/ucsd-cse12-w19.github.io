public class Event {

  // Time and duration
  int startMinutes;
  int endMinutes;

  Datetime time; // Maybe we make up Datetime, maybe it's built-in
  Duration duration; // Maybe we make up Duration, maybe it's built-in

  Datetime start;
  Datetime end;

  // Location
  String location;

  double lat, lon;

  String[] location;

  Location location; // Maybe we make up Location, maybe it's built-in


  // Determine if two events conflict
  static boolean conflict(Event event1, Event event2) {
    ... event1 ... event2 ...
  }

  boolean conflict(Event event) {
    ... this ... event ...
  }

}


