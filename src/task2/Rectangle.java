package task2;

/**
 * Created by sergey.kliepikov on 3/8/18.
 */
public class Rectangle {
    private int height;
    private int width;

    Rectangle(int height, int width){
        this.height = height;
        this.width = width;
    }

    public int getPerimeter(){
        return 2*height + 2*width;
    }
    public int getArea(){
        return height * width;
    }
}
