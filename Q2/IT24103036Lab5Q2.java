import java.util.Scanner;
public class IT24103036Lab5Q2{
public static void main (String[]args){

 Scanner input=new Scanner(System.in);

System.out.print("Enter the number of new members introduced :");
int members=input.nextInt();
 
  if(members >= 5){
    System.out.println("Headphone");
}
  else{

 switch(members){
  
  case 0 :
     System.out.println("No prize");
     break;
 
  case 1 :
     System.out.println("pen");
     break;

  case 3 :
     System.out.println("Bag");
     break;

  case 4 :
     System.out.println("Travelling Chair");
     break;

  default :
     System.out.println("Input nust be a number 0 or greater");
    }
   }
  } 
 }
























