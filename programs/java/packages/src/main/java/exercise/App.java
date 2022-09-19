// BEGIN
package exercise;

import exercise.geometry.Point;
import exercise.geometry.Segment;

class App {
    public static double[] getMidpointOfSegment(double[][] segment) {
        double[] beginPoint = Segment.getBeginPoint(segment);
        double[] endPoint = Segment.getEndPoint(segment);
        double x = (Point.getX(beginPoint) + Point.getX(endPoint)) / 2;
        double y = (Point.getY(beginPoint) + Point.getY(endPoint)) / 2;
        return Point.makePoint(x, y);
    }

    public static double[][] reverse(double[][] segment) {
        double[] beginPoint = Segment.getBeginPoint(segment);
        double[] endPoint = Segment.getEndPoint(segment);
        double[] newEndPoint = Point.makePoint(
            Point.getX(beginPoint), Point.getY(beginPoint)
        );
        double[] newBeginPoint = Point.makePoint(
            Point.getX(endPoint), Point.getY(endPoint)
        );
        return Segment.makeSegment(newBeginPoint, newEndPoint);
    }

    public static boolean isBelongToOneQuadrant(double[][] segment) {
        double[] beginPoint = Segment.getBeginPoint(segment);
        double[] endPoint = Segment.getEndPoint(segment);
        double x1 = Point.getX(beginPoint);
        double y1 = Point.getY(beginPoint);

        double x2 = Point.getX(endPoint);
        double y2 = Point.getY(endPoint);

        return Math.signum(x1) == Math.signum(x2) && Math.signum(y1) == Math.signum(y2);
    }
}
// END
