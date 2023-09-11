import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class CreateBooking 
{
    private static final String[] listOfCities = {"New York", "Chicago", "San Francisco", "Houston", "Boston", "Seattle", "Denver", "Las Vegas", "Honolulu", "Dallas", "Miami", "Los Angeles", "Orlando", "Phoenix"};
    private DBManager manager;
    private Booking book;
    private Passenger pass;
    private boolean arriveCityCorrect;
    private boolean departCityCorrect;
    private boolean flightSelected;
    private String arrivalCity;
    private String departCity;
    private Scanner scan;

    public CreateBooking()
    {
        init();
    }

    public void init()
    {
        manager = new DBManager();
        pass = new Passenger(0, departCity, arrivalCity);
        book = new Booking(0, false, 0, 0);
        arriveCityCorrect = false;
        departCityCorrect = false;
        flightSelected = false;
    }

    public static void print(String message) 
    {
        System.out.println(message);
    }

    public static void printCities()
    {
        int index = 1;
        print("");
        for (String city: listOfCities)
        {
            print(index + ": " + city);
            index++;
        }
    }

    public boolean contains(String[] arr, String match)
    {
        for (String a : arr)
        {
            if (a.equals(match))      
                return true;
        }
        return false;
    }
    

    public void start()
    {
        init();
        scan = new Scanner(System.in);
        printCities();

        
            while (!arriveCityCorrect)
            {
                print("Please enter the city you would like to arrive from");
                int acity = scan.nextInt();
                if (acity < 15 && acity > 0)
                {
                    arriveCityCorrect = true;
                    arrivalCity = listOfCities[acity - 1];
                }
                else
                {
                    print("You entered an incorrect city. Please try again!");
                }
            } 

            while (!departCityCorrect)
            {
                print("Please enter the city you would like to depart from");
                int dcity = scan.nextInt();
                if (dcity < 15 && dcity > 0)
                {
                    departCityCorrect = true;
                    departCity = listOfCities[dcity - 1];
                }
                else
                {
                    print("You entered an incorrect city. Please try again!");
                }
            } 


        

        

        displayFlights();
    }




    public void displayFlights()
    {
        String query = "SELECT * FROM public.\"Flight\" WHERE \"Flight\".\"departCity\" = '" + departCity + "' AND \"Flight\".\"arriveCity\" = '" + arrivalCity + "'";
        manager.getElements(query, 'f');
        Flight flight = manager.returnFlight();
        print(flight.toString());
        print("");
        print("");
        print("This is an available flight for your choice");
            
        while (!flightSelected)
        {
            print("Would you like to continue with this flight? (Y/N)");
            String result  = scan.next();

            if (result.equals("Y"))
            {
                getPersonalInfo(flight);
                flightSelected = true;
            }
            else if (result.equals("N"))
            {
                flightSelected = true;
            }
            else
            {
                print("Please type Y for Yes or N for No");
                print("");
                print("");
            }

        }
        
    }


    public void getPersonalInfo(Flight flight)
    {
        print("Please enter your first name: ");
        String fname = scan.next();
        print("Please enter your last name: ");
        String lname = scan.next();

        int bookingID = generateRandomNumber();
        int passengerID = generateRandomNumber();

        pass.setFName(fname);
        pass.setLName(lname);
        pass.setPassengerID(passengerID);
        pass.createPassenger();

        book.setBookingID(bookingID);
        book.setFlightID(flight.getFlightID());
        book.setStatus(true);
        book.setPassengerID(passengerID);
        book.createBooking();
        
        print("");
        print("");
        print("Passenger ID: " + pass.getPassengerID());
        print("Name: " + fname + " " + lname);
        print("Flight Information: " + flight.getCompany() + " | Flight " + flight.getFlightNum());
        print("Departure Date and Time: " + flight.getDepartDate() + " " + flight.getDepartTime());
        print("Arrival Date and Time: " + flight.getArriveDate() + " " + flight.getArriveTime());    
        print("");
        print("");
        print("Congratulations on your Booking! Your Booking number is " + bookingID);
        print("Your flight ID is " + flight.getFlightID());
        print("Use the flight ID to track your flight");
        print("Use the booking ID to cancel your booking if you are no longer interested");
        print("Thank you for booking with us!");
    }

    private static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(100000) + 1;
    }

}

    
        
    

