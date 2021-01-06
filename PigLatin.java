import java.util.*;
public class PigLatin{
  public static String pigLatinSimple(String s){
    if(s.charAt(0) == 'a' || s.charAt(0) == 'e' || s.charAt(0) == 'i' || s.charAt(0) == 'o' || s.charAt(0) == 'u'){
      return s+"hay";
    }
    else{
      return s.substring(1)+s.charAt(0)+"ay";
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
    if(diagraphs.contains(s.substring(0,2))){
      return s.substring(2)+s.substring(0,2)+"ay";
    }
    else{
      return pigLatinSimple(s);
    }
  }
  //
  // public static String pigLatinBest(String s){
  //
  // }
  public static void main(String[] args) {
    System.out.println(pigLatin(args[0]));
  }
}
