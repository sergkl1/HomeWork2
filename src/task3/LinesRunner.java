package task3;

/**
 * Created by sergey.kliepikov on 3/12/18.
 */
public class LinesRunner {
    public static void main(String[] args) {
        Point a = new Point(3,9);
        Point b = new Point(10,1);

        Point c = new Point(2,5);
        Point d = new Point(4,6);

        Point e = new Point(3,9);
        Point f = new Point(12,1);

        Line line1 = new Line(a,b);
        Line line2 = new Line(c,d);
        Line line3 = new Line(e,f);

        Lines lines = new Lines();
        lines.addLine(line1);
        lines.addLine(line2);
        lines.addLine(line3);

        System.out.println("First line length is " + line1.getLineLength());
        System.out.println("Sum of lines lengths is " + lines.lineLengthSum());
        System.out.println("Longest line is " + lines.longestLine().toString());

    }
}
