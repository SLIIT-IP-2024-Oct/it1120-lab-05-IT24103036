import java.util.Scanner;
public class IT24103036Lab5Q3{
public static void main(String[]args){
Scanner input=new Scanner(System.in);
 
final double perday=48000.0;
final int days3to4= 10;
final int days5more= 20;

System.out.print("Enter start date (1 - 31):");
int start=input.nextInt();

System.out.print("Enter End date (1 - 31):");
int end=input.nextInt();

if(start<1 || start>31 || end<1 || end>31){
System.out.println("Error: Days must be between 1 and 31");
return;
}
 
 if(start>end){
System.out.println("Error: Start Day must be less than End Date");
return;
}

int reserved= end-start;
 int discount=0;
if(reserved >=3 && reserved<=4){
  discount= days3to4;
}
else if(reserved >=5){
 discount= days5more;
}

double tot=perday*reserved;

double discountamount=tot * discount/100;

double totamount= tot-discountamount;

System.out.println("Room Charge per Day: Rs. "+perday+"/=");
System.out.println("number of Days Reserved: "+reserved);
System.out.println("Total amount to be paid: "+totamount);
}
}













































