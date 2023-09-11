public class Passenger
{
    private int passengerID;
    private String fname;
    private String lname;
    private DBManager manager;


    public Passenger(int pID, String fnm, String lnm)
    {
        manager = new DBManager();
        passengerID = pID;
        fname = fnm;
        lname = lnm;
    }

    public int getPassengerID()
    {
        return passengerID;
    }

    public String getFName()
    {
        return fname;
    }

    public String getLName()
    {
        return lname;
    }

    public void setPassengerID(int pid)
    {
        passengerID = pid;
    }

    public void setFName(String fnam)
    {
        fname = fnam;
    }

    public void setLName(String lnam)
    {
        lname = lnam;
    }
    public void createPassenger()
    {
        String query = "INSERT INTO public.\"Passenger\"(\"passengerID\", \"fname\", \"lname\") VALUES(";
        query += "'" + this.getPassengerID()+ "', '" + this.getFName() + "', '" +  this.getLName() + "')";
        
        manager.alterElements(query);
    }

    public void deletePassanger(int passengerID)
    {
        String query = "DELETE FROM public.\"Passenger\" WHERE \"Passenger\".\"passenger\" = " + passengerID;
        manager.alterElements(query);
    }
}