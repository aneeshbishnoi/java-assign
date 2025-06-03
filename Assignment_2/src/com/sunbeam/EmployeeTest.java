package com.sunbeam;

public class EmployeeTest {

    
    static class Employee {
        private String firstName;
        private String lastName;
        private double monthlySalary;

        
        public Employee(String firstName, String lastName, double monthlySalary) {
            this.firstName = firstName;
            this.lastName = lastName;
            setMonthlySalary(monthlySalary);  
        }

        
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setMonthlySalary(double monthlySalary) {
            if (monthlySalary > 0) {
                this.monthlySalary = monthlySalary;
            }
        }

        public double getMonthlySalary() {
            return monthlySalary;
        }

       
        public double getYearlySalary() {
            return monthlySalary * 12;
        }

        
        public void giveRaise(double percent) {
            if (percent > 0) {
                monthlySalary += monthlySalary * percent / 100;
            }
        }
    }

   
    public static void main(String[] args) {
        
        Employee emp1 = new Employee("Alice", "Johnson", 5000);
        Employee emp2 = new Employee("Bob", "Smith", 4500);

        
        System.out.println("Yearly Salary before raise:");
        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() + ": $" + emp1.getYearlySalary());
        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() + ": $" + emp2.getYearlySalary());

        // Give 10% raise
        emp1.giveRaise(10);
        emp2.giveRaise(10);

       
        System.out.println("\nYearly Salary after 10% raise:");
        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() + ": $" + emp1.getYearlySalary());
        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() + ": $" + emp2.getYearlySalary());
    }
}
