public class Punto
{
    private double x;
    private double y;

    public Punto(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public double CordenadaX()
    {
        return this.x;
    }

    public double CordenadaY()
    {
        return this.y;
    }

    public double Radio()
    {
        return Math.sqrt(Math.pow(this.x,2)+Math.pow(this.y,2));
    }

    public double Angulo()
    {
        return Math.tan(y/x);
    }

    public double Distancia(double x, double y)
    {
        double OtraX = this.x - x;
        double OtraY = this.y - y;

        return Math.sqrt(Math.pow(OtraX,2)+Math.pow(OtraY,2));
    }
}
