class PhoenixMall{

static String address = "velachery"; // Common for all Objects
String movie_name; //non-static
int movie_time;
boolean subtitle; 
PhoenixMall(String s,int i,boolean b){

}
public static void main(String[] args)
{
PhoenixMall screen1 = new PhoenixMall("PS1", 10, true);
PhoenixMall screen2 = new PhoenixMall("Prince", 11, false); 
PhoenixMall screen3 = new PhoenixMall("Sardar", 1130, false); 
System.out.println(screen1.movie_name); 
System.out.println(PhoenixMall.address); 
System.out.println(address); 

}

} 
