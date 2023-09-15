import java.util.Scanner;
public class Animal
{
String sound(String x)
{
if(x.equals("Bird")) {
String sound = "KA KA";
return sound;
}
if(x.equals("Cat"))
{ String sound = "Mew Mew";
return sound;
}
else
{
String sound = "You can only give cat and animals";
return sound;
}
}
}

Sri Eshwar College of Engineering

public class Quiz
{
public static void main(String[] args)
{
String animal;
Scanner input = new Scanner(System.in);
animal = input.nextLine();
Animal sou = new Animal();

String Sound = sou.sound(animal);
System.out.println("This animals sounds like "+ Sound);
input.close();
}
}