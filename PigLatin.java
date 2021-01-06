public class PigLatin{
  public static String pigLatinSimple(String s){
    if(s.charAt(0) == 'a' || s.charAt(0) == 'e' || s.charAt(0) == 'i' || s.charAt(0) == 'o' || s.charAt(0) == 'u'){
      return s+"hay";
    }
    else{
      return s.substring(1)+s.charAt(0)+"ay";
    }
  }

  // public static String pigLatin(String s){
  //
  // }
  //
  // public static String pigLatinBest(String s){
  //
  // }
  public static void main(String[] args) {
    System.out.println(pigLatinSimple(args[0]));
  }
}
