import java.util.Scanner;
class Switch {
public void show() {
Scanner s = new Scanner(System.in);
System.out.println("Enter day :");
int day = s.nextInt();

switch(day) {
case 1:
System.out.println("It's me...MONDAY");
break;
case 2:
System.out.println("It's me...TUESDAY");
break;
case 3:
System.out.println("It's me...WEDNESDAY");
break;
case 4:
System.out.println("It's me...THURSDAY");
break;
case 5:
System.out.println("It's me...FRIDAY");
break;
case 6:
System.out.println("It's me...SATURDAY");
break;
case 7:
System.out.println("It's me...SUNDAY");
break;
default :
System.out.println("It's incorrect");
}
}
public static void main(String args[]) {
Switch g = new Switch();
g.show();
}
}