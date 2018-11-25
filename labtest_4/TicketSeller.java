package labtest_4;
import java.util.Scanner;

public class TicketSeller {
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int ticketCount = in.nextInt();
		TicketSeller ts = new TicketSeller(ticketCount);
		int res = ts.getTotalBuyers();
		System.out.println("Total Buyers " + res);
	} 
	
	public int getTotalBuyers()
	{
		System.out.println("Tickets available " + maxTickets);
		totalBuyers = (int) Math.ceil(maxTickets /(double) tickets); 
		
		return totalBuyers;
	}
	
	public TicketSeller(int ticks)
	{
		tickets = ticks;
	}
	
	private int maxTickets = 100;
	private int tickets;
	private int totalBuyers;
}
