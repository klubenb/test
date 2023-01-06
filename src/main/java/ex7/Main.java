package ex7;

public class Main {
    public static void main(String[] args) {
        LimitingRectangle r = new LimitingRectangle(new int[][] {{-1, -2}, {3, 4}});
        System.out.println(r.getWidth() + " "  + r.getHeight());
        System.out.println(r.getBorders());
    }
}
