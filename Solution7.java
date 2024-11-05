package ilp;

import java.util.Scanner;

public class Solution7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee arr[] = new Employee[4];
        for (int i = 0; i < arr.length; i++) {
            int a = sc.nextInt();
            sc.nextLine(); // Move to the next line
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble();
            boolean e = sc.nextBoolean(); // Read the boolean directly
            sc.nextLine();
            arr[i] = new Employee(a, b, c, d, e);

        }
        String branch = sc.nextLine();
        int count = findCountOfEmployeesUsingCompTransport(arr, branch);
        if (count > 0) {
            System.out.println(count);

        } else {
            System.out.println("No such Emplyee ");
        }
        Employee secondHigest = findEmployeeWithSecondHighestRating(arr);
        if (secondHigest != null) {
            System.out.println(secondHigest.getName());
            System.out.println(secondHigest.getEmployeeId());
        } else {
            System.out.println("All Employees using company transport");
        }
    }

    public static int findCountOfEmployeesUsingCompTransport(Employee[] arr, String branch) {
        int Emcount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getBranch().equalsIgnoreCase(branch) && arr[i].isCompanyTransport()) {
                Emcount++;
            }
        }
        return Emcount;
    }

    public static Employee findEmployeeWithSecondHighestRating(Employee[] arr) {
        Employee highest = null;
        Employee secondHigest = null;
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].isCompanyTransport()) {
                if (highest == null || arr[i].getRating() > highest.getRating()) {
                    secondHigest = highest;
                    highest = arr[i];

                } else if (secondHigest == null || arr[i].getRating() > secondHigest.getRating()) {
                    secondHigest = arr[i];

                }

            }
        }
        return secondHigest;
    }
}

class Employee {
    private int employeeld;
    private String name;
    private String branch;
    private double rating;
    private boolean companyTransport;

    Employee(int employeeld,
            String name,
            String branch,
            double rating,
            boolean companyTransport) {

        this.employeeld = employeeld;
        this.name = name;
        this.branch = branch;
        this.rating = rating;
        this.companyTransport = companyTransport;
    }

    public int getEmployeeId() {
        return employeeld;
    }

    public String getName() {
        return name;
    }

    public String getBranch() {
        return branch;
    }

    public double getRating() {
        return rating;
    }

    public boolean isCompanyTransport() {
        return companyTransport;
    }

    public void setName(int employeeld) {
        this.employeeld = employeeld;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setCompanyTransport(boolean companyTransport) {
        this.companyTransport = companyTransport;
    }
}
