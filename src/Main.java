public class Main {
    // global variables declaration
    static int customerID;
    static int callsMade;
    static int callsMinutes;
    static int customerBill;

    // constants declaration
    final static int CALLS = 100;
    final static int MINUTES = 500;
    final static double BASIC_SERVICE = 30.0;
    final static double PREMIUM = 20.0;

    public static void housekeeping() {
        // Output "Phone payment calculator"
        System.out.println("Phone payment calculator");

        // Input customerId, callsMade, and callMinutes
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter customer ID: ");
        customerID = scanner.nextInt();

        System.out.print("Enter number of calls made: ");
        callsMade = scanner.nextInt();

        System.out.print("Enter total call minutes: ");
        callsMinutes = scanner.nextInt();
    }

    public static void detailLoop() {
        // To be implemented
    }

    public static void finish() {
        // To be implemented
    }

    public static void main(String[] args) {
        housekeeping();
        detailLoop();
        finish();
    }
}
