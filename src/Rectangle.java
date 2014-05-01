public class Rectangle {
    private final int width;
    private final int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public boolean equals(Object other) {
        Rectangle rectangleObj = (Rectangle) other;
        return (rectangleObj.width == this.width && rectangleObj.height == this.height);
    }

    public int calculateAreaOfRectangle() {
        return width * height;
    }

}
