public class Airport
{
    private int airportID;
    private String name;
    private String location;
    private DBManager manager;


    public Airport(int aID, String nm, String loc)
    {
        airportID = aID;
        name = nm;
        location = loc;
    }

    public int getAirportID()
    {
        return airportID;
    }

    public String getName()
    {
        return name;
    }

    public String getLocation()
    {
        return location;
    }

    public void createAirport()
    {
        String query = "INSERT INTO public.\"Airport\"(\"airportID\", \"name\", \"location\") VALUES(";
        query += "'" + this.getAirportID()+ "', '" + this.getName() + "', '" +  this.getLocation() + "')";
        
        manager.alterElements(query);
    }

    public void deleteAirport(int airportID)
    {
        String query = "DELETE FROM public.\"Airport\" WHERE \"Flight\".\"airportID\" = " + airportID;
        manager.alterElements(query);
    }
}