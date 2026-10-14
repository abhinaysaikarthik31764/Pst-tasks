import java.util.Scanner;

abstract class Vehicle {
    abstract int calculateFare(int distance);
}

class Bike extends Vehicle {
    int calculateFare(int distance) { return distance * 5; }
}
class Auto extends Vehicle {
    int calculateFare(int distance) { return distance * 12; }
}
class Cab extends Vehicle {
    int calculateFare(int distance) { return distance * 12; }
}

public class RideSharingPlatformSimulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            int distance = sc.nextInt();
            try {
                if (distance <= 0) throw new IllegalArgumentException("Invalid distance");
                Vehicle vehicle;
                switch (type.toLowerCase()) {
                    case "bike": vehicle = new Bike(); break;
                    case "auto": vehicle = new Auto(); break;
                    case "cab": vehicle = new Cab(); break;
                    default: throw new IllegalArgumentException("Invalid Ride");
                }
                System.out.println(vehicle.calculateFare(distance));
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        sc.close();
    }
}
