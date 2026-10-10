package week03.geometry;

public class Main {
    public static void main(String[] args) {

        Point p1 = new Point(1, 2);
        Point p2 = new Point(4, 6);
        Point p3 = new Point(p1);

        System.out.println("Point 1: " + p1.getX() + ", " + p1.getY());
        System.out.println("Point 2: " + p2.getX() + ", " + p2.getY());

        System.out.println("Distance: " + p1.distance(p2));
        System.out.println("Copy equals original: " + p1.equals(p3));

        p3.setX(5);
        p3.setY(7);
        p3.translate(1, 1);

        System.out.println("Moved point: " + p3.getX() + ", " + p3.getY());

        Segment s1 = new Segment(p1, p2);
        Segment s2 = new Segment(4, 6, 1, 2);

        System.out.println("Segment length: " + s1.length());
        System.out.println("Segment slope: " + s1.getSlope());
        System.out.println("Segment intercept: " + s1.getIntercept());
        System.out.println("Segments equal: " + s1.equals(s2));

        Point testPoint = new Point(2.5f, 4);

        System.out.println("On line: " + s1.isOnLine(testPoint));
        System.out.println("On segment: " + s1.isOnSegment(testPoint));

        s1.translate(2, 3);

        System.out.println("New P1 X: " + s1.getP1().getX());
        System.out.println("New P1 Y: " + s1.getP1().getY());
    }
}
// exercise2 //
