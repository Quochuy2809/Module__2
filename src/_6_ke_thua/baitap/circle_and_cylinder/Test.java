package _6_ke_thua.baitap.circle_and_cylinder;

public class Test {
    public static void main(String[] args) {
        Circle circle= new Circle();
        System.out.println(circle);
        System.out.println("Area of cyliner: "+ circle.getArea());

        Cylinder cylinder= new Cylinder(3, "red", 9);
        System.out.println(cylinder);
        System.out.println("Volume of cyliner: "+ cylinder.getVolume());
    }
}
