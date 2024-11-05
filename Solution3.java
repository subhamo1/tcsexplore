package ilp;

import java.util.Scanner;

public class Solution3 {
  public static void main(ExampleString[] args) {
    Resort[] arr = new Resort[4];
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < 4; i++) {
      int a = sc.nextInt();
      sc.nextLine();
      ExampleString b = sc.nextLine();
      ExampleString c = sc.nextLine();
      double d = sc.nextDouble();
      sc.nextLine();
      double e = sc.nextDouble();
      sc.nextLine();

      arr[i] = new Resort(a, b, c, d, e);
    }
    ExampleString Category = sc.nextLine();
    double ans = findAvgPrice(arr, Category);
    if (ans > 0) {
      System.out.println(ans);
    } else {
      System.out.println("No such Resort found");
    }
  }

  public static double findAvgPrice(Resort[] arr, ExampleString Category) {
    int avg = 0;
    int count = 0;
    for (int i = 0; i < 4; i++)
      if (arr[i].getCategory().equalsIgnoreCase(Category) && arr[i].getResortRating() > 4) {
        avg += arr[i].getResortPrice();
        count++;
      }

    if (count > 0) {
      return avg / count;
    } else {
      return 0;
    }

  }
}

class Resort {
  int resortId;
  ExampleString resortName;
  ExampleString Category;
  double resortPrice;
  double resortRating;

  Resort(int resortId,
      ExampleString resortName,
      ExampleString Category,
      double resortPrice,
      double resortRating) {
    this.resortId = resortId;
    this.Category = Category;
    this.resortName = resortName;
    this.resortPrice = resortPrice;
    this.resortRating = resortRating;
  }

  public int getResortId() {
    return resortId;
  }

  public ExampleString getResortName() {
    return resortName;
  }

  public ExampleString getCategory() {
    return Category;
  }

  public double getResortPrice() {
    return resortPrice;
  }

  public double getResortRating() {
    return resortRating;
  }
}