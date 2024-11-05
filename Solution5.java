package ilp;

import java.util.Arrays;
import java.util.Scanner;

public class Solution5 {
    public static void main(String args[]) {
        Employee[] arr = new Employee[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            int a = sc.nextInt();
            String b = sc.nextLine();
            sc.nextLine();
            String c = sc.nextLine();
            sc.nextLine();
            int d = sc.nextInt();
            int e = sc.nextInt();
            arr[i] = new Employee(a, b, c, d, e);

        }
        int sal = sc.nextInt();
        sc.nextLine();
        String dept = sc.nextLine();

        String ans = findDept(arr, sal);
        if (ans != null) {
            System.out.println(ans);
        } else {
            System.out.println("No Department found");
        }
        int ans2 = findSecondHighestSalary(arr, dept);
        if (ans2 != 0) {
            System.out.println(ans2);
        } else {
            System.out.println("No data found");
        }
    }

    public static String findDept(Employee[] arr, int Salary) {
        String[] dept = new String[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getSalary() == Salary && arr[i].getRating() >= 3) {
                // dept = Arrays.copyOf(dept, dept.length + 1);
                // dept[dept.length - 1] = arr[i].getDept();
                return arr[i].getDept();
            }

        }
        // if (dept.length > 0) {
        // return dept;

        // }

        return null;
    }

    public static int findSecondHighestSalary(Employee[] arr, String dept) {
        int[] sal = new int[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getDept().equalsIgnoreCase(dept)) {
                sal = Arrays.copyOf(sal, sal.length + 1);
                sal[sal.length - 1] = arr[i].getSalary();
                Arrays.sort(sal);

            }
        }
        if (sal.length < 2) {
            return 0; // If less than 2 salaries, no second highest
        }
        Arrays.sort(sal);
        return sal[sal.length - 2];

    }
}

class Employee {
    int EmpId;
    String EmpName;
    String Dept;
    int Rating;
    int Salary;

    Employee(int EmpId,
            String EmpName,
            String Dept,
            int Rating,
            int Salary) {
        this.EmpId = EmpId;
        this.EmpName = EmpName;
        this.Dept = Dept;
        this.Rating = Rating;
        this.Salary = Salary;

    }

    public int getEmpId() {
        return EmpId;
    }

    public String EmpName() {
        return EmpName;
    }

    public String getDept() {
        return Dept;
    }

    public int getRating() {
        return Rating;
    }

    public int getSalary() {
        return Salary;
    }

    public void setEmpId(int EmpId) {
        this.EmpId = EmpId;
    }

    public void getEmpName(String EmpName) {
        this.EmpName = EmpName;
    }

    public void getDept(String Dept) {
        this.Dept = Dept;
    }

    public void getRating(int getRating) {
        this.Rating = Rating;
    }

    public void getSalary(int Salary) {
        this.Salary = Salary;
    }
}