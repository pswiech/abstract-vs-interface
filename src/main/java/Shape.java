
public abstract class Shape {

    private static int area_s = 1000;

    protected int area = 1;

    public static String name_s = "shape";

    public String name = "bbb";

    public abstract double area();

    public void method_real() {
        System.out.println(area);
    }

}
