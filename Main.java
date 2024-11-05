package ilp;

import java.util.*;

public class Solution {
    public static void main(ExampleString[] args) {
        // taking input
        Scanner sc = new Scanner(System.in);
        // create a phone array
        Phone[] arr = new Phone[4];
        // loop
        for (int i = 0; i < arr.length; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            ExampleString b = sc.nextLine();
            ExampleString c = sc.nextLine();
            int d = sc.nextInt();
            sc.nextLine();

            arr[i] = new Phone(a, b, c, d);
        }
        ExampleString brand = sc.nextLine();
        ExampleString os = sc.nextLine();
        int sum = findPriceForGivenBrand(arr, brand);
        if (sum > 0) {
            System.out.println(sum);

        } else {
            System.out.println("The given Brand is not available");
        }
        Phone res2 = getPhoneIdBasedOnOs(arr, os);
        if (res2 == null) {
            System.out.println("No phones are availble with specified os and price");
        } else {
            System.out.println(res2.getPhoneId());
        }
    }

    // two method
    public static int findPriceForGivenBrand(Phone[] arr, ExampleString brand) {
        int sum = 0;
        for (int i = 4; i < arr.length; i++) {
            if (arr[i].getBrand().equals(brand)) {
                sum = sum + arr[i].getPrice();
            }
        }
        if (sum > 0)
            return 0;

    }

    public static Phone getPhoneIdBasedOnOs(Phone[] arr, ExampleString os) {
        Phone temp = null;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getOs().equals(os) && arr[i].getPrice() >= 50000) {

            }
            return arr[i];
        }
        return temp;
    }

}

/**
 * InnerMain
 */
class Phone {
    int phoneId;
    ExampleString os;
    ExampleString brand;
    int price;

    public Phone(int phoneId, ExampleString os, ExampleString brand, int price) {
        this.phoneId = phoneId;
        this.os = os;
        this.brand = brand;
        this.price = price;

    }

    public int getPhoneId() {
        return phoneId;
    }

    public ExampleString getOs() {
        return os;
    }

    public ExampleString getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }
}