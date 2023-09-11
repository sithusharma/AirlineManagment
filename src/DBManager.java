import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;


public class DBManager{
    private final String url = "jdbc:postgresql://localhost/AirlineManagment";
    private final String user = "postgres";
    private final String password = "12345";
    private Flight flight;
    private Booking booking;
    private Airport airport;
    private Passenger passenger;

    /**
     * Connect to the PostgreSQL database
     *
     * @return a Connection object
     */
    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            //System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return conn;
    }

    public DBManager()
    {
        flight = null;
        airport = null;
        booking = null;
        passenger = null;
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DBManager data = new DBManager();
        data.connect();
        
    }

    public void alterElements(String query)
    {
        try
        {
            Statement stmt = connect().createStatement();
            stmt.executeUpdate(query);
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public void getElements(String query, char type)
    {
        int flightID = 0;
        int flightNum = 0;
        String company = "";
        String departCity = "";
        String arriveCity = "";
        Date departDate = null;
        Date arriveDate = null;
        Time departTime = null;
        Time arriveTime = null;
        

        int airportID = 0;
        String name = "";
        String location = "";

        int passengerID = 0;
        String fname = "";
        String lname = "";

        boolean status = false;
        int bookingID = 0;


         try
        {
            Connection con = connect();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next())
            {
                if (type == 'f')
                {
                    flightID = rs.getInt(1); 
                    flightNum = rs.getInt(2);
                    company = rs.getString(3);
                    departCity = rs.getString(4);
                    arriveCity = rs.getString(5);
                    departDate = rs.getDate(6);
                    arriveDate = rs.getDate(7);
                    departTime = rs.getTime(8);
                    arriveTime = rs.getTime(9);

                    flight = new Flight(flightID, flightNum, company, departCity, arriveCity, departDate, arriveDate, departTime, arriveTime);
                    

                    
                }
                else if (type == 'a')
                {
                    airportID = rs.getInt(1);
                    name = rs.getString(2);
                    location = rs.getString(3);

                    airport = new Airport(airportID, name, location);
                    
                }
                else if( type == 'p')
                {
                    passengerID = rs.getInt(1);
                    fname = rs.getString(2);
                    lname = rs.getString(3);

                    passenger = new Passenger(passengerID, fname, lname);
                    
                }
                else if (type == 'b')
                {
                    bookingID = rs.getInt(1);
                    status = rs.getBoolean(2);
                    passengerID = rs.getInt(3);
                    flightID = rs.getInt(4);

                    booking = new Booking(bookingID, status, passengerID, flightID);
                    
                }
            }
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public Flight returnFlight()
    {
        return flight;
    }

    public Airport returnAirport()
    {
        return airport;
    }

    public Booking returnBooking()
    {
        return booking;
    }

    public Passenger returnPassenger()
    {
        return passenger;
    }


    

   
}

