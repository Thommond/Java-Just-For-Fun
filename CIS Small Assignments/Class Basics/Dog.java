// Blueprint class of Dog
public class Dog {
  // Instance Variables 
  private String name = "Hagrid";
  private int weight = 25;
  private int year = 12; 

  // Default constructor
  public Dog() {

  }

  // Constructor that has all vars 
  public Dog(String name, int weight, int year) {
    this.name = name;
    this.weight = weight;
    this.year = year;
  }

  // Constructor with one var
  public Dog(String name) {
    this.name = name;
  }

  /* Getters & Setters */

  // Name methods
  public String getName() {
    return this.name;
  }

  public void setName(String newName) {
    this.name = newName;
  }

  // Weight methods
  public int getWeight() {
    return this.weight;
  }


  public void setWeight(int newWeight) {
    this.weight = newWeight;
  }

  // Year methods
  public int getYear() {
    return this.year;
  }

  public void setYear(int newYear) {
    this.year = newYear;
  }

  // Calculating size
  public String obtainSize() {
    String size;
    if (this.weight <= 10) {
    size = "small";
    } else if(weight > 10 && weight <= 30) {
    size = "medium";
    } else {
    size = "large";
    }
    return size;
  }

}
