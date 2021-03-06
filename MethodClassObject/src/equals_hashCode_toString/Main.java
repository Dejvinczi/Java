package equals_hashCode_toString;

public class Main {

    public static void main(String[] args) {
	    Employee alice1 = new Employee("Alicja Adamczuk", 75000, 1987, 12,15);
	    Employee alice2 = alice1;
	    Employee alice3 = new Employee("Alicja Adamczuk", 75000, 1987, 12,15);
	    Employee bob = new Employee("Bartosz Borkowski", 50000,1989,10,1);

	    System.out.println("Alice1 == Alice2: " +(alice1 == alice2));
	    System.out.println("Alice1 == Alice3: " +(alice1 == alice3));
	    System.out.println("Alice1.equals(Alice3): "+alice1.equals(alice3));
	    System.out.println("Alice1.equals(bob): "+alice1.equals(bob));
	    System.out.println("bob.toString: "+ bob);

	    Manager carl = new Manager("Karol Krakowski", 80000,1987,12,15);
        Manager boss = new Manager("Karol Krakowski", 80000,1987,12,15);

        System.out.println("boss.toString: "+ boss);
        System.out.println("carl.equals(boss): "+carl.equals(boss));
        System.out.println("alice1.hashCode(): "+alice1.hashCode());
        System.out.println("alice3.hashCode(): "+alice3.hashCode());
        System.out.println("bob.hashCode(): "+bob.hashCode());
        System.out.println("carl.hashCode(): "+carl.hashCode());
    }
}
