package ilp;

import java.util.Scanner;
import java.util.Arrays;

public class Solution4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Course[] arr = new Course[4];
        for (int i = 0; i < 4; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            double c = sc.nextDouble();
            sc.nextLine();
            String d = sc.nextLine();
            boolean e = sc.nextBoolean();
            sc.nextLine();
            arr[i] = new Course(a, b, c, d, e);

        }
        double CourseRating = sc.nextDouble();
        sc.nextLine();
        String CourseName = sc.nextLine();
        int result = CountCourse(arr, CourseName, CourseRating);
        if (result > 0) {
            System.out.println(result);
        } else {
            System.out.println("No course found");
        }
    }

    public static int CountCourse(Course[] arr, String CourseName, double CourseRating) {
        int count = 0;
        for (int i = 0; i < 4; i++) {
            if (arr[i].isHaveCertificate() == true && arr[i].getCourseRating() >= CourseRating
                    && arr[i].getMode().equalsIgnoreCase(CourseName)) {
                count++;
            }
        }
        return count;

    }
}

class Course {
    int CourseId;
    String CourseName;
    double CourseRating;
    String Mode;
    boolean HaveCertificate;

    Course(int CourseId,
            String CourseName,
            double CourseRating,
            String Mode,
            boolean HaveCertificate) {
        this.CourseId = CourseId;
        this.CourseName = CourseName;
        this.CourseRating = CourseRating;
        this.Mode = Mode;
        this.HaveCertificate = HaveCertificate;

    }

    public int getCourseId() {
        return CourseId;
    }

    public String getCourseName() {
        return CourseName;
    }

    public double getCourseRating() {
        return CourseRating;
    }

    public String getMode() {
        return Mode;
    }

    public boolean isHaveCertificate() {
        return HaveCertificate;
    }

    public void setCourseId(int CourseId) {
        this.CourseId = CourseId;
    }

    public void setCourseName(String CourseName) {
        this.CourseName = CourseName;
    }

    public void setCourseRating(double CourseRating) {
        this.CourseRating = CourseRating;
    }

    public void setMode(String Mode) {
        this.Mode = Mode;

    }

    public void setHaveCertificate(boolean HaveCertificate) {
        this.HaveCertificate = HaveCertificate;
    }
}