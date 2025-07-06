package specialclass;

//StringBuffer is Thread safe whereas StringBuilder is Not thread safe. Rest all are same.
public class StringBufferClass {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Mourya");

        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append(" Dasgupta");
        System.out.println(sb);

        String name = sb.toString();
        System.out.println(name);

        System.out.println(sb.charAt(4));

        sb.setCharAt(0,'S');
        System.out.println(sb);

        System.out.println(sb.compareTo(new StringBuffer("Mourya")));
        System.out.println(sb.isEmpty());
        System.out.println(sb.indexOf("a"));
    }
}
