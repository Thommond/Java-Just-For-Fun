public class SetterAndGetter {
	public static void main (String [] args ) {
		String userName = "Joe";
	
		PersonExample person1 = new PersonExample();
		
		person1.setFirstName(userName);
		System.out.print("He is " + person1.getFirstName());

	}
}