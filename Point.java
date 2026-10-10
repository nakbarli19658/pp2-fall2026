package week03.geometry;

class Point {
    private float x;
    private float y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void translate(float dX, float dY) {
        x = x + dX;
        y = y + dY;
    }

    public float distance(Point p) {
        float dx = x - p.x;
        float dy = y - p.y;
        return (float) Math.sqrt(dx * dx + dy * dy);
    }

    public boolean equals(Point p) {
        if (p == null) {
            return false;
        }
        return x == p.x && y == p.y;
    }
}
