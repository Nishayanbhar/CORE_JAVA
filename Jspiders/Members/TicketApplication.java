/*Ticket Aplication
 1.Book ticket
 2.Cancel ticket
 3.Check Availability
 
 maxTicket=200;
*/
import java.util.Scanner;

class Ticket
{
	static int availableTickets=50;
	static int maximumTickets=200;
	
	void bookTicket(int ticketsToBook)
	{
		if(ticketsToBook<=availableTickets)
		{
			availableTickets=availableTickets-ticketsToBook;
			System.out.println(ticketsToBook +"tickes has been booked");
			checkAvailability();
		}
		else
		{
			System.out.println("sorry !!!" +ticketsToBook +"tickes not availableTickets");
			checkAvailability();
		}
	}
	
	void cancelTicket(int ticketsToCancel)
	{
		if(availableTickets+ticketsToCancel<=200)
		{
			availableTickets=availableTickets+ticketsToCancel;
			System.out.println(ticketsToCancel +"has cancelled successfully");
		}
		else{
			System.out.println("Enter valid input");
		}
	}
	
	void checkAvailability()
	{
		System.out.println("Available Tickets are:" +availableTickets);
	}
}

class TicketApplication
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		Ticket t1=new Ticket();
		System.out.println("1.Book Ticket\n Cancel Ticket\n 3.Check availability\n Enter choice");
		int choice=sc.nextInt();
		
		if(choice==1)
		{
			System.out.println("Enter no of Tickets to book");
			int tickets=sc.nextInt();
			t1.bookTicket(tickets);
		}
		else if(choice==2)
		{
			System.out.println("Enter no of Tickets to cancel");
			int tickets=sc.nextInt();
			t1.cancelTicket(tickets);
		}
		else if(choice==3)
		{
			t1.checkAvailability();
		}
		else
		{
			System.out.println("Invalid Choice");
		}
	}
}