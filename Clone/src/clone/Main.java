package clone;

public class Main {

    public static void main(String[] args) {
        try {
            Employee original = new Employee("Jan W. Kowalski", 50000);
            original.setHireDay(2000, 1, 1);

            Employee copy = original.clone();
            copy.raiseSalary(10);
            copy.setHireDay(2002, 12, 31);
            System.out.println("Original= " + original);
            System.out.println("Copy= " + copy);
        }
        catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}