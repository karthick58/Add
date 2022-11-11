package chennai.tambaram;
public class Theatre{
static String name = "Murali"; 
int ticket; 
public Theatre(int ticket)
{
this.ticket = ticket; 
}
public static void main(String[] args)
{
Theatre balcony = new Theatre(200); 
Theatre first_class = new Theatre(100); 
Theatre second_class = new Theatre(50); 
balcony.book_ticket(); 
first_class.book_ticket(); 
}
public void book_ticket()
{
System.out.println("Booking ticket for Rs "+ticket );
}

} 
