package controltower;

public class Airplane {
	private String callsign;
	private double distance;
	private int bearing;
	private int altitude;
	
	public Airplane()
	{
		this.callsign="AAA01";
		this.distance= 1.0;
		this.bearing=0;
		this.altitude=0;
	}
	
	public Airplane(String cs, double dist, int dir, int alt)
	{
		this.callsign=cs;
		this.distance= Math.abs(dist);
		this.altitude=Math.abs(alt);
		this.bearing=((dir % 360)+360)%360;
	}
	public void move(double dist, int dir)
	{
		double x= distance * Math.cos(Math.toRadians(bearing));
		double y= distance * Math.sin(Math.toRadians(bearing)); //converting the dist and bearing into x y coordinates
		x+= dist * Math.sin(Math.toRadians(dir));    //adds the new positions with the old one 
		y+= dist * Math.cos(Math.toRadians(dir));
		distance= Math.sqrt(Math.pow(x, 2)+ Math.pow(y, 2)); //convert all those x and y coordinate back to distance by using pythagorean theorem
		bearing= (int) Math.round((Math.toDegrees(Math.atan2(x, y))+360)%360);
	}
	public void gainAlt(int altitude)
	{
		this.altitude = altitude +1000;
	}
	public void loseAlt(int altitude)
	{
		if (altitude < 0)
		{
			this.altitude = 0;
		}
		this.altitude= altitude - 1000;
	}
	public int getAlt(Airplane other)
	{
		int difference= this.altitude - other.altitude;
		return Math.abs(difference);
	}
	public double distTo(Airplane other) {
		double x=distance * Math.cos(Math.toRadians(bearing));
		double y= distance * Math.sin(Math.toRadians(bearing));
		double x2= other.distance * Math.cos(Math.toRadians(other.bearing));
		double y2 = other.distance * Math.sin(Math.toRadians(other.bearing));
		double newx = x2 - x;
		double newy = y2 - y;
		return (Math.sqrt(Math.pow(newx, 2)+ Math.pow(newy, 2)));
		
	}
	public String toString()
	{
		return callsign + " - " + distance+ " miles away at " + bearing+ "°, altitude "+ altitude+" feet";
	}

}
