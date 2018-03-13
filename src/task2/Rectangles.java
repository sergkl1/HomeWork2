package task2;

import java.util.ArrayList;

/**
 * Created by sergey.kliepikov on 3/8/18.
 */
public class Rectangles {
    private final ArrayList<Rectangle> rectangles = new ArrayList<>();

    public void addRectangle(Rectangle rectangle){
        rectangles.add(rectangle);
    }

    public int getSumOfAreas(){
        if (rectangles.isEmpty()) throw new IllegalStateException("No rectangles");
        int sumOfAreas = 0;
        for (Rectangle rectangle : rectangles) {
            sumOfAreas += rectangle.getArea();
        }
       return sumOfAreas;
    }
}
