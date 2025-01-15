package entities;

public class Retangle implements Shape {
    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Retangle(double width, double height) {
        super();
        this.width = width;
        this.height = height;
    }

    public Retangle(){
        
    }

    @Override
    public double area(){
        return width * height;
    }

    
}
