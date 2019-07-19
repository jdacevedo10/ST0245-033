import java.time.Year;

public class Date
{
    private int day, mon, year;

    public Date(int day, int mon, int year) {
        this.day = day;
        this.mon = mon;
        this.year = year;
    }

    public int day()
    {
        return this.day;
    }

    public int mon()
    {
        return  this.mon;
    }

    public int year()
    {
        return this.mon;
    }

    public int Comparar(Date otra)
    {
        if(this.year < otra.year)
        {
        return -1;
        }

        if (this.year > otra.year)
        {
            return 1;
        }

        if(this.mon < otra.mon)
        {
            return -1;
        }

        if (this.mon > otra.mon)
        {
            return 1;
        }

        if(this.day < otra.day)
        {
            return -1;
        }

        if (this.day > otra.day)
        {
            return 1;
        }

        return 0;
    }

    public String toString()
    {
        return day+" / "+mon+" / "+ year;
    }
}
