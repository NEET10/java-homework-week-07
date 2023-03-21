package javaprogramsweek7;

public class Program7_15_Wall {
    double width; double height;

    public static void main(String[] args) {                        //main method
        Program7_15_Wall wall = new Program7_15_Wall(5,4);
        System.out.println("area = "+ wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width = "+ wall.getWidth());
        System.out.println("height = "+ wall.getHeight());
        System.out.println("area = "+ wall.getArea());
    }
   public Program7_15_Wall(){                  //constructor (same name as class name) with no args

   }
    public Program7_15_Wall(double width, double height){   //constructor (must have same name as class name) with args
       if (width > 0 && height < 0){
           this. width = width;
           this. height = 0;
       } else if (width < 0 && height > 0) {
           this. height = height;
           this. width = 0;
       } else if (width < 0 && height < 0) {
           this. width = 0;
           this. height = 0;
       }else{
           this.width = width;
           this. height = height;
       }
    }
    public  double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public void setWidth(double width) {
        if (width < 0) {                                //if else syntax
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
public double getArea(){
        return this.width * this.height;
}
    }