package karthick;
class Karthick_Test{
static String name="Karthi";
int age;
Karthick_Test(int age){
this.age=age;
}
public static void main(String[] args){
Karthick_Test first=new Karthick_Test(22);
first.checking();
first.account_Created();
}
void checking(){
System.out.println("name is " + name);
System.out.println("age is " + age);
}
void account_Created(){
System.out.println("created" + age);
}
}
