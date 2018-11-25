package labtest_4;

import java.util.Scanner;
import java.math.*;

public class RopeProp 
{	
	RopeProp(double m)
	{
		mass = m;
	}
	
	double getVelocity()
	{
		for(int i = velocities.length - 1; i >= 0; i--)
		{
			double res = (Math.pow(velocities[i], 2) * mass) / length;
			if(res < maxTension)
				return velocities[i];
		}
		return -1;
	}
	//v = T / (2*r*m)
		
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in); 
		double mass = in.nextDouble();
		RopeProp rp = new RopeProp(mass);
		System.out.println(rp.getVelocity());

	}
	
	private double mass;
	private double maxTension = 60;
	private double velocities[] = {1, 10, 20, 40};
	private double length = 3;
}
