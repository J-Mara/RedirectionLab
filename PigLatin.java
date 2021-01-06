import java.util.*;
public class PigLatin{
  public static String pigLatinSimple(String s){
    if(s.charAt(0) == 'a' || s.charAt(0) == 'e' || s.charAt(0) == 'i' || s.charAt(0) == 'o' || s.charAt(0) == 'u'){
      return (s+"hay").toLowerCase();
    }
    else{
      return (s.substring(1)+s.charAt(0)+"ay").toLowerCase();
    }
  }

  public static String pigLatin(String s){
    if(s.length()<2){
      return pigLatinSimple(s);
    }
    ArrayList<String> diagraphs = new ArrayList<>(Arrays.asList("bl", "br", "ch", "ck", "cl", "cr",
    "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl",
    "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp",
    "st", "sw", "th", "tr", "tw", "wh", "wr"));
    if(diagraphs.contains(s.substring(0,2).toLowerCase())){
      return (s.substring(2)+s.substring(0,2)+"ay").toLowerCase();
    }
    else{
      return pigLatinSimple(s);
    }
  }

  public static String pigLatinBest(String s){
    if(!Character.isLetter(s.charAt(0))){
      return s.toLowerCase();
    }
    else{
      if(s.length() < 2){
        return pigLatinSimple(s);
      }
      else{
      if(!Character.isLetter(s.charAt(s.length()-1))){
        return pigLatin(s.substring(0,(s.length()-1)))+s.charAt(s.length()-1);
      }
      else{
        return pigLatin(s);
      }
    }
    }
  }
  public static void main(String[] args) {
      Scanner n = new Scanner(System.in);
      while(n.hasNextLine()){
        Scanner p = new Scanner(n.nextLine());
        while(p.hasNext()){
            System.out.print(pigLatinBest(p.next()));
            System.out.print(" ");
        }
        System.out.println("");
      }
    }
}
