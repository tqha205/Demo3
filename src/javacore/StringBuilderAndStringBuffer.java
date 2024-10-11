package javacore;

public class StringBuilderAndStringBuffer {
    public static void main(String[] args) {
        StringBuilder sb =new StringBuilder();
        sb.append("silasilo");
        sb.append("silasilo");

        System.out.println(sb.toString());
        sb.delete(2,4);
        System.out.println(sb.toString());

    }
}
