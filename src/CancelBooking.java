import java.util.Scanner;

public class CancelBooking 
{
    private DBManager manager;
    private Booking book;

    public CancelBooking()
    {
        book = new Booking(0, false, 0, 0);
        manager = new DBManager();
    }

    public static void print(String message) 
    {
        System.out.println(message);
    }

    public void start()
    {
        Scanner scan = new Scanner(System.in);
            print("");
            print("");
            print("Please type the Booking ID of the booking you would like to cancel");
            int bID = scan.nextInt();
            book.deleteBooking(bID);
            print("Your Booking has been deleted!");
        
    }
}
