package com.department;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Department softwareDepartment = new Department("Software");
        Department constructionDepartment = new Department("Construction");

        softwareDepartment.addEmployee(new Employee("Meltem", "Sert", "29", Position.TEST_ENGINEER));
        softwareDepartment.addEmployee(new Employee("Fadile", "Avcı", "29", Position.SOFTWARE_DEVELOPER));

        constructionDepartment.addEmployee(new Employee("Çiğdem", "Sert", "26", Position.GEOMATICS_ENGINEER));
        constructionDepartment.addEmployee(new Employee("Burcu", "Sert", "24", Position.JOB_SECURITY_SPECIALIST));

        for (Employee employee : softwareDepartment.listEmployee()) {
            System.out.println(employee);
        }

        System.out.println("*****************************");

        for (Employee employee : constructionDepartment.getEmployees()) {
            System.out.println(employee);
        }

    }
}