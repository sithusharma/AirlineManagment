import java.util.Scanner;

public class TrackFlight {
    private DBManager manager;
    private Flight flight;
    private boolean done;

    public TrackFlight()
    {
        manager = new DBManager();
    }
    
    public static void print(String message) 
    {
        System.out.println(message);
    }

    public void start()
    {
        Scanner scan = new Scanner(System.in);
        while (!done)
        {
            print("");
            print("");
            print("Please type the flight ID of the flight you would like to track");
            int fID = scan.nextInt();
            String query = "SELECT * FROM public.\"Flight\" WHERE \"Flight\".\"flightID\" = " + fID;
            manager.getElements(query, 'f');
            flight = manager.returnFlight();
            if (flight != null)
            {
                print(flight.toString());
                print("");
                print("Flight ID: " + flight.getFlightID());
                print("");
                print("");
                print("");
                print("Here is the information on the flight you have booked!");
                done = true;
            }

            
            
        }
        

    }
}
