import java.util.Scanner;

public class FrontEnd {
    private Scanner scanner;
    private TrackFlight track;
    private CreateBooking create;
    private CancelBooking cancel;

    
    public FrontEnd() {
        scanner = new Scanner(System.in);
        create = new CreateBooking();
        cancel = new CancelBooking();
        track = new TrackFlight();
    }


    public void start() {
        System.out.println("Welcome to the Airline Management System!");
        int secondChoice = 0;
        int choice = 0;
        boolean exit = false;
        while (!exit) {
            displayMainMenu();
            try
            {
                choice = scanner.nextInt();
                secondChoice = choice;
            }
            catch (Exception e)
            {
                secondChoice = scanner.nextInt();
            }
            choice = secondChoice;
            
            switch (choice) {
                case 1:
                    handleBookingMenu();
                    break;
                case 2:
                    handleTrackMenu();
                    break;
                case 3:
                    handleCancelMenu();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Please type it again");
            }
        }
        System.out.println("Thank you for using the Airline Management System!");
    }

    private void displayMainMenu() {
        System.out.println("\nMain Menu:");
        System.out.println("1. Book a Flight");
        System.out.println("2. Track a Flight");
        System.out.println("3. Cancel a Booking");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    

    private void handleBookingMenu() 
    {
        create.start();
    }

    private void handleCancelMenu() 
    {
        cancel.start();
    }

    private void handleTrackMenu()
    {
        track.start();
    }

    public static void main(String[] args) {
        FrontEnd front = new FrontEnd();
        front.start();
    }
}
