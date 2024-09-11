
// Client class of DogTest 
public class DogTest {  
  public static void main(String[] args) {
    Dog dog1 = new Dog("Fido", 5, 3);
    Dog dog2 = new Dog("Rex");
    Dog dog3 = new Dog();

    System.out.println(dog1.getName());
    System.out.println(dog1.getWeight());
    System.out.println(dog1.getYear());
    System.out.println(dog1.obtainSize());
    System.out.println(dog2.getName());
    System.out.println(dog3.getName());
  }
}

