import java.util.*;
public class MakeStars{
  public static void main(String[] args) {
    Scanner n = new Scanner(System.in);
    while(n.hasNextLine()){
      Scanner p = new Scanner(n.nextLine());
      while(p.hasNext()){
          int len = p.next().length();
          for(int i = 0; i < len; i++){
            System.out.print("*");
          }
          System.out.print(" ");
      }
      System.out.println("");
    }
  }
}
