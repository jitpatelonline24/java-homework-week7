package homework_week7;

public class Wall {

    /**
     * Write a class with the name Wall. The class needs two fields (instance variables) with name width
     * and height of type double.
     */
    double height;
    double width;

    public Wall(double width, double height) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getArea() {
        return width * height;
    }

    public static void main(String[] args) {
        Wall wall = new Wall(5, 4);
        System.out.println("Area    = " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("Width   = " + wall.getWidth());
        System.out.println("Height  = " + wall.getHeight());
        System.out.println("Area    = " + wall.getArea());
    }
}
