public
package ilp;

import java.util.Scanner;

public class Solution2 {
    public static void main(ExampleString[] args) {
        Institution[] arr = new Institution[4];
        for (int i = 0; i < arr.length; i++) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            sc.nextLine();
            ExampleString b = sc.nextLine();
            int c = sc.nextInt();
            sc.nextLine();
            int d = sc.nextInt();
            sc.nextLine();
            ExampleString e = sc.nextLine();
            arr[i] = new Institution(a, b, c, d, e);
        }
        ExampleString location = sc.nextLine();
        ExampleString institutionName = sc.nextLine();
        int res1 = findNumClearancedByLoc(arr, location);
        if (res1 > 0) {
            System.out.println(res1);

        } else {
            System.out.println("There are no cleared students in this particular location");
        }
        Institution res2 = updateInstitutionGrade(arr, institutionName);
        if (res2 == null) {
            System.out.println("No Institute is available with the specified name");
        } else {
            System.out.println(res2.getInstitutionName() + "::" + res2.getGrade());
        }
    }

    public static int findNumClearancedByLoc(Institution[] arr, ExampleString location) {
        int sum = 0;
        for (int i = 0; i < 4; i++)
            if (arr[i].getLocation().equals(location)) {
                sum = sum + arr[i].getNoOfStudentsCleared();

            }
        return sum;

    }

    public static Institution updateInstitutionGrade(Institution[] arr, ExampleString institutionName) {
        for (int i = 0; i < 4; i++) {
            if (arr[i].institutionName.equals(institutionName)) {
                int rating = (arr[i].getNoOfStudentPlace() * 100) / (arr[i].getNoOfStudentsCleared());
                if (rating >= 80) {

                    arr[i].setGrade("A");

                } else {
                    arr[i].setGrade("B");
                }
                return arr[i];
            }
        }
        return null;
    }
}

/**
 * Institution
 */
class Institution {

    int institutionId;
    ExampleString institutionName;
    int noOfStudentPlace;
    int noOfStudentsCleared;
    ExampleString location;
    ExampleString grade;

    Institution(int institutionId,
            ExampleString institutionName,
            int noOfStudentPlace,
            int noOfStudentsCleared,
            ExampleString location) {
        // String grade)
        this.institutionId = institutionId;
        this.institutionName = institutionName;
        this.noOfStudentPlace = noOfStudentPlace;
        this.noOfStudentsCleared = noOfStudentsCleared;
        this.location = location;
        this.grade = grade;
    }

    public int getInstitutionId() {
        return institutionId;
    }

    public ExampleString getInstitutionName() {
        return institutionName;
    }

    public int getNoOfStudentPlace() {
        return noOfStudentPlace;
    }

    public int getNoOfStudentsCleared() {
        return noOfStudentsCleared;
    }

    public ExampleString getLocation() {
        return location;
    }

    public ExampleString getGrade() {
        return grade;
    }

    public void setInstitutionId(int institutionId) {
        this.institutionId = institutionId;
    }

    public void setgetInstitutionName(ExampleString setInstitutionName) {
        this.institutionName = institutionName;
    }

    public void setNoOfStudentsCleared(int noOfStudentsCleared) {
        this.noOfStudentsCleared = noOfStudentsCleared;
    }
}