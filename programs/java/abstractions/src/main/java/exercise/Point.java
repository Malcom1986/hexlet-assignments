package exercise;

class Point {
    // BEGIN
    public static int[] makePoint(int x, int y) {
        int[] point = {x, y};
        return point;
    }

    public static int getX(int[] point) {
        return point[0];
    }

    public static int getY(int[] point) {
        return point[1];
    }

    public static String pointToString(int[] point) {
        return String.format("(%d, %d)", getX(point), getY(point));
    }

    public static int getQuadrant(int[] point) {
        int x = getX(point);
        int y = getY(point);
        if (x > 0 && y > 0) {
            return 1;
        }
        if (x < 0 && y > 0) {
            return 2;
        }
        if (x < 0 && y < 0) {
            return 3;
        }
        if (x > 0 && y < 0) {
            return 4;
        }
        return 0;
    }

    public static int[] getSymmetricalPointByX(int[] point) {
        return makePoint(getX(point), -getY(point));
    }

    public static double calculateDistance(int[] point1, int[] point2) {
        int deltaX = getX(point2) - getX(point1);
        int deltaY = getY(point2) - getY(point1);

        return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
    }
    // END
}
