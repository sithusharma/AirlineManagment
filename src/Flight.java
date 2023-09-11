
import java.sql.Date;
import java.sql.Time;

public class Flight{
    private int flightID;
    private int flightNum;
    private String company;
    private String departCity;
    private String arriveCity;
    private Date departDate;
    private Date arriveDate;
    private Time departTime;
    private Time arriveTime;
    DBManager manager;

   
    
    public Flight(int id, int num, String comp, String dcity, String acity, Date ddate, Date adate, Time dtime, Time atime)
    {
        flightID = id;
        flightNum = num;
        company = comp;
        departCity = dcity;
        arriveCity = acity;
        departDate = ddate;
        arriveDate = adate;
        departTime = dtime;
        arriveTime = atime;
        manager = new DBManager();
    }

    public int getFlightID()
    {
        return flightID;
    }

    public int getFlightNum()
    {
        return flightNum;
    }

    public String getCompany()
    {
        return company;
    }

    public String getDepartCity()
    {
        return departCity;
    }

    public String getArriveCity()
    {
        return arriveCity;
    }

    public Date getDepartDate()
    {
        return departDate;
    }

    public Date getArriveDate()
    {
        return arriveDate;
    }

    public Time getDepartTime()
    {
        return departTime;
    }

    public Time getArriveTime()
    {
        return arriveTime;
    }



    public void setFlightID(int fid)
    {
        flightID = fid;
    }

    public void setFlightNum(int num)
    {
        flightNum = num;
    }

    public void setCompany(String comp)
    {
        company = comp;
    }

    public void setDepartCity(String dcity)
    {
        departCity = dcity;
    }

    public void setArriveCity(String acity)
    {
        arriveCity = acity;
    }

    public void setDepartDate(Date ddate)
    {
        departDate = ddate;
    }

    public void setArriveDate(Date adate)
    {
        arriveDate = adate;
    }

    public void setDepartTime(Time dtime)
    {
        departTime = dtime;
    }

    public void setArriveTime(Time atime)
    {
        arriveTime = atime;
    }


    public void createFlight()
    {
        String query = "INSERT INTO public.\"Flight\"(\"flightID\", \"flightNum\", \"company\", \"departCity\", \"arriveCity\", \"departDate\", \"arriveDate\", \"departTime\", \"arriveTime\") VALUES(";
        query += "'" + this.getFlightID()+ "', '" + this.getFlightNum() + "', '" +  this.getCompany()  + "', '" +  this.getDepartCity() + "', '" +  this.getArriveCity() 
             + "', '" + this.getDepartDate() + "', '" + this.getArriveDate() + "', '" + this.getDepartTime() + "', '" + this.getArriveTime() + "')";
        
        manager.alterElements(query);
    }

    public void deleteFlight(int flightID)
    {
        String query = "DELETE FROM public.\"Flight\" WHERE \"Flight\".\"flightID\" = " + flightID;
        manager.alterElements(query);
    }

    public void listOfFlights(String depCity, String arrCity)
    {
        String query = "SELECT * FROM public.\"Flight\" WHERE \"Flight\".\"arriveCity\" =" + arrCity + " AND \"Flight\".\"departCity\" = " + depCity;

    }

    public String toString()
    {
        String result = this.getCompany() + " " + this.getDepartCity() + " to " + this.getArriveCity();
        result += " from " + this.getDepartDate() + " - " + this.getArriveDate();
        result += " " + this.getDepartTime() + " - " + this.getArriveTime();


        return result;
    }

}