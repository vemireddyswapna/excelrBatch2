class ps005 {
    int id;
    String name;
    double salary;

    public ps005() {
    }

    public ps005(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ps005[id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }

    public class Main {
        public static void main(String[] args) {
            ps005 employee = new ps005(65, "swathi", 50000.00);
            System.out.println("Employee ID: " + employee.getId());
            System.out.println("Employee Name: " + employee.getName());
            System.out.println("Employee Salary: " + employee.getSalary());
            employee.setName("swathi");
            employee.setSalary(55000.00);
            System.out.println("\nUpdated Employee Info: " + employee.toString());
            System.out.println("\nUpdated Employee Info (direct call to toString): " + employee);
        }
    }
}