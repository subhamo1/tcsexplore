package ilp;

import java.rmi.server.RemoteStub;
import java.util.Arrays;
import java.util.Scanner;

public class Solution8 {
    public static void main(String[] args) {
        Course[] arr = new Course[4];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();
            sc.nextLine();
            int e = sc.nextInt();
            sc.nextLine();

            arr[i] = new Course(a, b, c, d, e);
        }
    }

    public static int findAvgOfQuizByAdmin(Course[] arr, String courseAdmin) {
        int count = 0;
        int avgCourse = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i].getcourseAdmin().equalsIgnoreCase(courseAdmin)) {
                avgCourse = avgCourse + arr[i].getquiz();
                count++;

            }
        }
        if (count > 0) {
            return avgCourse / count;
        } else {
            return 0;
        }

    }

    public static Course[] sortCourseByHandsOn(Course[] arr, int handson) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getHandson() < handson) {
                count++;
            }
        }
        if (count == 0) {
            return null;
        }
        Course[] newArr = new Course[count];
        int p = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getHandson() < handson) {
                newArr[p] = arr[i];
                p++;
            }
        }
        Arrays.sort(arr, (a, b) -> (a.getHandson() - b.getHandson()));

        return newArr;

    }
}

class Course {
    int courseId;
    String courseName;
    String courseAdmin;
    int quiz;
    int handson;

    Course(int courseId,
            String courseName,
            String courseAdmin,
            int quiz,
            int handson) {

        this.courseId = courseId;
        this.courseName = courseName;
        this.courseAdmin = courseAdmin;
        this.quiz = quiz;
        this.handson = handson;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getcourseAdmin() {
        return courseAdmin;
    }

    public int getquiz() {
        return quiz;
    }

    public int getHandson() {
        return handson;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseAdmin(String courseAdmin) {
        this.courseAdmin = courseAdmin;
    }

    public void setQuiz(int quiz) {
        this.quiz = quiz;
    }

    public void setHandson(int handson) {
        this.handson = handson;
    }
}
