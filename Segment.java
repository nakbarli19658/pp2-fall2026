package week03.geometry;

class Segment {
    private Point p1;
    private Point p2;

    public Segment(Point p1, Point p2) {
        this.p1 = new Point(p1);
        this.p2 = new Point(p2);
    }

    public Segment(float x1, float y1, float x2, float y2) {
        p1 = new Point(x1, y1);
        p2 = new Point(x2, y2);
    }

    public Point getP1() {
        return new Point(p1);
    }

    public void setP1(Point p1) {
        this.p1 = new Point(p1);
    }

    public Point getP2() {
        return new Point(p2);
    }

    public void setP2(Point p2) {
        this.p2 = new Point(p2);
    }

    public void translate(float dX, float dY) {
        p1.translate(dX, dY);
        p2.translate(dX, dY);
    }

    public float length() {
        return p1.distance(p2);
    }

    public boolean equals(Segment s) {
        if (s == null) {
            return false;
        }

        return (p1.equals(s.p1) && p2.equals(s.p2))
            || (p1.equals(s.p2) && p2.equals(s.p1));
    }

    public float getSlope() {
        float dx = p2.getX() - p1.getX();
        float dy = p2.getY() - p1.getY();

        if (dx == 0) {
            return Float.POSITIVE_INFINITY;
        }

        return dy / dx;
    }

    public float getIntercept() {
        if (p1.getX() == p2.getX()) {
            return Float.NaN;
        }

        return p1.getY() - getSlope() * p1.getX();
    }

    public boolean isOnLine(Point p) {
        if (p1.equals(p2)) {
            return p1.equals(p);
        }

        float dx1 = p2.getX() - p1.getX();
        float dy1 = p2.getY() - p1.getY();
        float dx2 = p.getX() - p1.getX();
        float dy2 = p.getY() - p1.getY();

        return Math.abs(dx1 * dy2 - dy1 * dx2) < 0.0001f;
    }

    public boolean isOnSegment(Point p) {
        if (!isOnLine(p)) {
            return false;
        }

        return p.getX() >= Math.min(p1.getX(), p2.getX())
            && p.getX() <= Math.max(p1.getX(), p2.getX())
            && p.getY() >= Math.min(p1.getY(), p2.getY())
            && p.getY() <= Math.max(p1.getY(), p2.getY());
    }
}
