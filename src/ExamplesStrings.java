public class ExamplesStrings {

    public static void main(String[] args) {
        String a = "abc";
        String b = new String("abc");

        System.out.println(a);
        System.out.println(b);

        System.out.println(a == b);
        System.out.println(a.equals(b));
    }
}
