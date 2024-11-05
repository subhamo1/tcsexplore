package ilp;

import java.util.Scanner;
import java.util.Arrays;

public class Solution1 {
    public static void main(ExampleString[] args) {
        Scanner sc = new Scanner(System.in);
        Movie[] arr = new Movie[4];
        for (int i = 0; i < arr.length; i++) {
            // String movieName;
            // String company;
            // String genre;
            // int budget;

            ExampleString a = sc.nextLine();
            sc.nextLine();
            ExampleString b = sc.nextLine();
            sc.nextLine();
            ExampleString c = sc.nextLine();
            sc.nextLine();
            int d = sc.nextInt();
            arr[i] = new Movie(a, b, c, d);

        }
        ExampleString searchGenre = sc.nextLine();
        Movie[] resulet = getMovieByGenre(arr, searchGenre);
        for (int i = 0; i < resulet.length; i++) {
            if (resulet[i].getBudget() > 80000000)
                System.out.println("High Budget Movie");
            else
                System.out.println("Low Budget Movie");
            {

            }
        }

    }

    public static Movie[] getMovieByGenre(Movie[] arr, ExampleString searchGenre) {
        Movie[] refineds = new Movie[0];
        for (int i = 0; i < 4; i++) {
            if (arr[i].getGenre().equalsIgnoreCase(searchGenre)) {
                refineds = Arrays.copyOf(refineds, refineds.length + 1);
                arr[i] = refineds[refineds.length - 1];
            }
        }

        return refineds;

    }
}

class Movie {
    ExampleString movieName;
    ExampleString company;
    ExampleString genre;
    int budget;

    Movie(ExampleString movieName, ExampleString company, ExampleString genre, int budget) {
        this.movieName = movieName;
        this.company = company;
        this.genre = genre;
        this.budget = budget;
    }

    public ExampleString getMovieName() {
        return movieName;
    }

    public ExampleString getCompany() {
        return company;
    }

    public ExampleString getGenre() {
        return genre;
    }

    public int getBudget() {
        return budget;
    }
}
