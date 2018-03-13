package task2;

/**
 * Created by sergey.kliepikov on 3/8/18.
 */
public class RectangleRunner {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(3,4);
        Rectangle r2 = new Rectangle(5,5);
        Rectangle r3 = new Rectangle(6,7);

        Rectangles rectangles = new Rectangles();

        rectangles.addRectangle(r1);
        rectangles.addRectangle(r2);
        rectangles.addRectangle(r3);


        System.out.println("First rectangle perimeter is " + r1.getPerimeter());
        System.out.println("Second rectangle area is " + r2.getArea());
        System.out.println("Sum of all the rectangles areas is " + rectangles.getSumOfAreas());
    }
}
