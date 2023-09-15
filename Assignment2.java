import java.util.Scanner;
public class Quiz
{
public static void main(String[] args)
{ Scanner input = new Scanner(System.in);
System.out.println("Enter Zero To Red");
System.out.println("Enter One to Yellow");
System.out.println("Enter Two to Green");
int x;
x = input.nextInt();
switch(x)
{
case 0:
System.out.println("You need To Stop ");
break;
case 1:
System.out.println("You need to Wait");
break;

Sri Eshwar College of Engineering

case 2:
System.out.println("You Can Go");
break;
default:
System.out.println("Invalid Input");
}
input.close();
}
}