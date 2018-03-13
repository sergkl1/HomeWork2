package task3;

import java.util.ArrayList;

/**
 * Created by sergey.kliepikov on 3/12/18.
 */
public class Lines {
    private ArrayList<Line> lines = new ArrayList<>();

    public void addLine(Line line) {
        lines.add(line);
    }

    public double lineLengthSum() {
        if (lines.isEmpty()) throw new IllegalStateException("No lines");
        double lineLengthSum = 0;
        for (Line line : lines) {
            lineLengthSum += line.getLineLength();
        }
        return lineLengthSum;
    }

    public Line longestLine() {
        if (lines.isEmpty()) throw new IllegalStateException("No lines");
        Line longestLine = lines.get(0);
        for (Line line : lines) {
            if (line.getLineLength() > longestLine.getLineLength())
                longestLine = line;
        }
        return longestLine;
    }

    @Override
    public String toString() {
        return "Lines{" +
                "lines=" + lines +
                '}';
    }
}
