import java.util.*;
public class MakeStars{
  public static void main(String[] args) {
    Scanner n = new Scanner(System.in);
    while(n.hasNextLine()){
      Scanner p = new Scanner(n.nextLine());
      while(p.hasNext()){
        System.out.print(p.next());
        System.out.print(" ");
      }
      System.out.println("");
    }
  }
}
