public class TwoStringObject-1 {
public static void main(String[] args) {
String col1 = "Stephen Edwin King";
String col2 = "Walter Winchell";
String col3 = "Mike Royko";
      
boolean equals1 = col1.equals(col2);
boolean equals2 = col1.equals(col3);

System.out.println("\"" + col1 + "\" equals \"" + col2 + "\"? " + equals1);
System.out.println("\"" + col1 + "\" equals \"" + col3 + "\"? " + equals2);
}
}
