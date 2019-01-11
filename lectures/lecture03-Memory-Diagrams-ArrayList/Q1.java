class Coord {
  public int row, col;
  public Coord(int rowVal, int colVal) {
    this.row = rowVal;
    this.col = colVal;
  }
}
class Car {
  public String color;
  public Coord location;
  public Car(String colorVal, Coord locVal) {
    this.color = colorVal;
    this.location = locVal;
  }
}
class Q1 {
  public static void g(Car c1, Car c2) {
    c2 = c1;
    c2.color = "blue";
  }
  public static String question () {
    Car redCar = new Car("red", new Coord(5, 6));
    Car greenCar = new Car("green", new Coord(7, 8));
    g(redCar, greenCar);
    return redCar.color + ", " + greenCar.color;
  }
  public static void main(String[] args) {
    System.out.println(question());
  }
}

