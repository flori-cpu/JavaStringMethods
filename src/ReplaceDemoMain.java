public class ReplaceDemoMain {
  public static void main(String[] args) {
    String str1 = "abc cba";

    // all occurrences of 'a' is replaced with 'z'
    System.out.println(str1.replace('a', 'z'));  // Output: "zbz cbz"

    // all occurrences of 'L' is replaced with 'J'
    System.out.println("Lava".replace('L', 'J'));  // Output: "Java"

    // character not in the string
    System.out.println("Hello".replace('4', 'J'));  // Output: "Hello" (no change)

    // all occurrences of "C++" is replaced with "Java"
    System.out.println(str1.replace("C++", "Java"));  // Output: "abc cba" (no change)

    // all occurrences of "aa" is replaced with "zz"
    System.out.println("aa bb aa zz".replace("aa", "zz"));  // Output: "zz bb zz zz"

    // substring not in the string
    System.out.println("Java".replace("C++", "C"));  // Output: "Java" (no change)
  }
}
