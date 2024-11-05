package ilp;

import java.util.Scanner;

public class Solution6 {
    public static void main(String[] args) {
        Hotel[] arr = new Hotel[4];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();
            sc.nextLine();
            String e = sc.nextLine();
            double f = sc.nextDouble();
            sc.nextLine();

            arr[i] = new Hotel(a, b, c, d, e, f);
        }

        String month = sc.nextLine();
        String wifioption = sc.nextLine();
        int TNum = noOfRoomsBookedInGivenMonth(arr, month);
        if (TNum > 0) {
            System.out.println(TNum);
        } else {
            System.out.println("No rooms booked in the given month");
        }
        Hotel resultHotel = searchHotelByWifiOption(arr, wifioption);
        if (resultHotel != null) {
            System.out.println(resultHotel.getHotelId());
        } else {
            System.out.println("No such option available");
        }

    }

    public static int noOfRoomsBookedInGivenMonth(Hotel[] arr, String month) {
        int toNum = 0;
        for (int i = 0; i < 4; i++)

        {
            String dateOfBooking = arr[i].getDateOfBooking();
            String bookingMonth = dateOfBooking.substring(3, 6);
            if (bookingMonth.equalsIgnoreCase(month)) {
                toNum = toNum + arr[i].getNoOfRoomsBooked();
            }

        }
        return toNum;
    }

    public static Hotel searchHotelByWifiOption(Hotel[] arr, String wifioption) {
        Hotel highest = null;
        Hotel secodHighest = null;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getWifiFacility().equalsIgnoreCase(wifioption)) {
                if (highest == null || arr[i].getTotalBill() > highest.getTotalBill()) {
                    secodHighest = highest;
                    highest = arr[i];
                } else if (secodHighest == null || arr[i].getTotalBill() > secodHighest.getHotelId()) {
                    secodHighest = arr[i];
                }
            }
        }
        return secodHighest;

    }
}

class Hotel {
    int hotelId;
    String hotelName;
    String dateOfBooking = "25-10-2024";
    int noOfRoomsBooked;
    String wifiFacility;

    double totalBill;

    Hotel(int hotelId,
            String hotelName,
            String dateOfBooking,
            int noOfRoomsBooked,
            String wifiFacility,
            double totalBill) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.dateOfBooking = dateOfBooking;
        this.noOfRoomsBooked = noOfRoomsBooked;
        this.wifiFacility = wifiFacility;
        this.totalBill = totalBill;

    }

    public int getHotelId() {
        return hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public String getDateOfBooking() {
        return dateOfBooking;
    }

    public int getNoOfRoomsBooked() {
        return noOfRoomsBooked;
    }

    public String getWifiFacility() {
        return wifiFacility;
    }

    public double getTotalBill() {
        return totalBill;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public void setDateOfBooking(String dateOfBooking) {
        this.dateOfBooking = dateOfBooking;

    }

    public void setNoOfRoomsBooked(int noOfRoomsBooked) {
        this.noOfRoomsBooked = noOfRoomsBooked;
    }

    public void setWifiFacility(String wifiFacility) {
        this.wifiFacility = wifiFacility;
    }

    public void setTotalBill(double totalBill) {
        this.totalBill = totalBill;
    }
}
