public class Rectangle {
    private double height = 1;
    private double width = 1;

    public Rectangle(){

    }
    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }
    public double getArea(){
        return height * width;
    }
    public double getPerimeter(){
        return 2 * (height + width);
    }
    public void description(){
        System.out.println("The area of the rectangle with width " + width + " and width " + width +
                " is " + getArea() * 10 / 10 + " and the perimeter is " + getPerimeter());
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
