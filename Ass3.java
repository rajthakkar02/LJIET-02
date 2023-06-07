class Employee {
    private static int count = 0;
    
    public Employee() {
        count++;
    }
    
    public static int getCount() {
        return count;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        
        for (int i = 0; i < 5; i++) {
            employees[i] = new Employee();
        }
        
        System.out.println("Number of employees: " + Employee.getCount());
    }
}
