interface Fruit{
public void find();
public void slice();
}
interface Vegetable{
public void earth();
public void farm();
}
interface Groceries{
public void nuts();
public void buy();
}
class Anill implements Fruit,Vegetable,Groceries{
public static void main(String[] args){
Fruit fruit=new Anill();
Vegetable vegetable=new Anill();
Groceries groceries=new Anill();
fruit.find();
fruit.slice();
vegetable.earth();
vegetable.farm();
groceries.nuts();
groceries.buy();
}
public void find(){
 System.out.println("Find");
 }
public void slice(){
 System.out.println("slice");
 }
public void earth(){
System.out.println("earth");
}
public void farm(){
System.out.println("farm");
}
public void nuts(){
System.out.println("nuts");
}
public void buy(){
System.out.println("buy");
}

}

