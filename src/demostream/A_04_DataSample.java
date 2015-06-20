/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demostream;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author denis
 */
public class A_04_DataSample {
    
    public static class Employee {

        private Integer employeeNumber;
        private String employeeFirstName;
        private String employeeLastName;
        private LocalDate hireDate;

        public Employee(Integer employeeNumber, String employeeFirstName, String employeeLastName, LocalDate hireDate) {
            this.employeeNumber = employeeNumber;
            this.employeeFirstName = employeeFirstName;
            this.employeeLastName = employeeLastName;
            this.hireDate = hireDate;
        }

        public Integer getEmployeeNumber() {
            return employeeNumber;
        }

        public String getEmployeeFirstName() {
            return employeeFirstName;
        }

        public String getEmployeeLastName() {
            return employeeLastName;
        }

        public LocalDate getHireDate() {
            return hireDate;
        }

        @Override
        public String toString() {
            return "Employee{" + "employeeNumber=" + employeeNumber + ", employeeFirstName=" + employeeFirstName + ", employeeLastName=" + employeeLastName + ", hireDate=" + hireDate + '}';
        }
        
        
    }
    
    static final Comparator<Employee> byHireDate = new Comparator<Employee>() {
        public int compare(Employee left, Employee right) {
            if (left.getHireDate().isBefore(right.getHireDate())) {
                return -1;
            } else {
                return 1;
            } 
        }
    };    
    
    static final Comparator<Employee> byEmployeeNumber = (e1, e2) -> Integer.compare(
            e1.getEmployeeNumber(), e2.getEmployeeNumber());    
    
    public static List<Employee> getData(){
        List<Employee> employees;
        employees = new ArrayList<>();
        employees.add(new Employee(123, "Jack", "Johnson", LocalDate.of(1988, Month.APRIL, 12)));
        employees.add(new Employee(345, "Cindy", "Bower", LocalDate.of(2011, Month.DECEMBER, 15)));
        employees.add(new Employee(567, "Perry", "Node", LocalDate.of(2005, Month.JUNE, 07)));
        employees.add(new Employee(467, "Pam", "Krauss", LocalDate.of(2005, Month.JUNE, 07)));
        employees.add(new Employee(435, "Fred", "Shak", LocalDate.of(1988, Month.APRIL, 17)));
        employees.add(new Employee(678, "Ann", "Lee", LocalDate.of(2007, Month.APRIL, 12)));         
        
        return employees;
    }
    
    public static void main(String args[]){
        List<Employee> employees =getData();
        System.out.println("+++ Tri par date d'embauche puis numero");
        employees.stream().sorted(byHireDate.thenComparing(byEmployeeNumber)).forEach(System.out::println);
        System.out.println();
        System.out.println();
        System.out.println();
        
        System.out.println("+++ Tri par numero decroissant puis date d'embauche");
        employees.stream().sorted(byEmployeeNumber.reversed().thenComparing(byHireDate)).forEach(System.out::println);
        
    }
}
