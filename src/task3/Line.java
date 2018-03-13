package task3;

/**
 * Created by sergey.kliepikov on 3/12/18.
 */
public class Line {
    private Point initPoint;
    private Point finalPoint;

    public Line(Point initPoint, Point finalPoint) {
        this.initPoint = initPoint;
        this.finalPoint = finalPoint;
    }

    public double getLineLength() {
        double lliheLength = Math.sqrt(((finalPoint.getX() - initPoint.getX())*(finalPoint.getX() - initPoint.getX())) + ((finalPoint.getY() - initPoint.getY()) * (finalPoint.getY() - initPoint.getY())));
        return lliheLength;
    }

    @Override
    public String toString() {
        return "Line{" +
                "initPoint=" + initPoint +
                ", finalPoint=" + finalPoint +
                '}';
    }
}
