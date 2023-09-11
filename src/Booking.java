public class Booking
{
    private int bookingID;
    private boolean status;
    private int passengerID;
    private int flightID;
    private DBManager manager;

    public Booking(int bID, boolean stat, int pID, int fID)
    {
        manager = new DBManager();
        bookingID = bID;
        status = stat;
        passengerID = pID;
        flightID = fID;
    }

    public int getBookingID()
    {
        return bookingID;
    }

    public boolean getStatus()
    {
        return status;
    }

    public int getPassengerID()
    {
        return passengerID;
    }

    public int getFlightID()
    {
        return flightID;
    }

    public void setBookingID(int bid)
    {
        bookingID = bid;
    }

    public void setStatus(boolean stat)
    {
        status = stat;
    }

    public void setPassengerID(int pid)
    {
        passengerID = pid;
    }

    public void setFlightID(int fid)
    {
        flightID = fid;
    }

    public void createBooking()
    {
        String query = "INSERT INTO public.\"Booking\"(\"bookingID\", \"status\", \"passengerID\", \"flightID\") VALUES(";
        query += "'" + this.getBookingID()+ "', '" + this.getStatus() + "', '" +  this.getPassengerID()  + "', '" +  this.getFlightID() + "')";
        
        manager.alterElements(query);
    }

    public void deleteBooking(int bookingID)
    {
        String query = "DELETE FROM public.\"Booking\" WHERE \"Booking\".\"bookingID\" = " + bookingID;
        manager.alterElements(query);
    }

    
}