package StringsANDarrays;

public class reverseString {
    public static void main(String[] args) {

        String str = "MOM";
        System.out.println(str);
        String newStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            newStr += str.charAt(i);
        }
        System.out.println(newStr);

        if (str.equals(newStr)) {
            System.out.println(newStr + " :: is Plandrome String");
        } else {
            System.out.println(newStr + " :: is Not a Plandrome String");

        }
    }
}
