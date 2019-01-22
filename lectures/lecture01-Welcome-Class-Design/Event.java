class Calendar { /*  */ }

class Event {

  // Time

  // Idea: represent date/time with an int
  int datetime;
  int secondsSinceJanFirst1970;

  // Idea: represent date/time with a String
  String datetime; // "Jan 7 2019 7:00AM"

  DateTime time;


  // and duration
  int minutes;


  // Represent time + duration as TWO TIMES: start and end
  String start;
  String end;


  // Location
  String location;
  float latitude, longitude; // maybe use int (minutes and seconds)

  Location location;

  // Determine if two Events conflict




}
