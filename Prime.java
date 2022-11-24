class Prime{
int prime_Count=0;
public static void main(String[] args){
Prime prime=new Prime();
int no=2;
int prime_Count=prime.num(25);
while(prime_Count<=20){
no=no++;
prime.num(no);
}
System.out.println(prime.prime_Count);
}
int num(int no){
int div=2;
int count=0;
while(div<no/2){
if(no%div==0){
//System.out.println("its not prime");
count=count+1;
}
div=div+1;
}
if(count==0){
System.out.println("it is prime");
prime_Count=prime_Count+1;
}
return prime_Count;
}
}

