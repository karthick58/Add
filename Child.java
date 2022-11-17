class Child extends Parent
{
Child()
{
System.out.println("Child Constructor ");
} 
Child(int num)
{
super(num);
System.out.println("Child Single Args Constructor ");
} 
public static void main(String[] args)
{
Child child=new Child();
Child child2=new Child(10);
child.get_GoodJob();
child.grow();
child.study();
}
void get_GoodJob(){
System.out.println("on the way");
}
void study(){
super.study();
System.out.println("Study Abroad"); 
} 
}
