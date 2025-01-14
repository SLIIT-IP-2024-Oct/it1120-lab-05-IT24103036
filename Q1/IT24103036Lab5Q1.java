import java.util.Scanner;
public class IT24103036Lab5Q1{
public static void main(String[]args){

Scanner input=new Scanner(System.in);
System.out.print("Enter the frist integer: ");
 int num1= input.nextInt();
System.out.print("Enter the second integer: ");
 int num2=input.nextInt();
System.out.print("Enter the third integer: ");
  int num3=input.nextInt();

 System.out.println(); 

System.out.println("user entered numbers are : "+num1+ " " +num2+" " +num3);

 if(num1<num2)
  if(num1<num3){
System.out.println("The Smallest number is:" +num1);
}

if(num2<num1)
 if(num2<num3){
System.out.println("The Smallest number is:" +num2);

}
 
 else{
System.out.println("The Smallest number is:" +num3);
  }
 



 if(num1>num2)
  if(num1>num3){
System.out.print("The Largest number is:" +num1);
}

if(num2>num1)
 if(num2>num3){
System.out.print("The Largest number is:" +num2);

}
 
 else{
System.out.print("The Largest number is:" +num3);
  }
 }
}

















