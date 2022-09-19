// BEGIN
package exercise.geometry;

public class Segment {

    public static double[][] makeSegment(double[] beginPoint, double[] endPoint) {
        double[][] segment = {beginPoint, endPoint};
        return segment;
    }

    public static double[] getBeginPoint(double[][] segment) {
        return segment[0];
    }

    public static double[] getEndPoint(double[][] segment) {
        return segment[1];
    }
}
// END
