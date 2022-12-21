public class Main {
    public static void main(String[] args) {
        String s1 = "tup tuup tuuup tuuuup";
        //System.out.println(s1.replaceAll("u{2,3}","x"));
        String s2 = (s1.replaceAll("uuu", "XXX"));
        String s2_1 = (s2.replaceAll("uu", "XX"));
        System.out.println(s2_1);

    }
}
