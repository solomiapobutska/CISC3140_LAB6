import java.util.Date;
public class HelloWorld
{
  public static void main (String [] args)
  {
    System.out.println("Hello World!");
    SimpleDateFormat f = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss z");
    System.out.println(f.format(new Date()));
  }
}
