//15.Wall Area
//Write a class with the name Wall. The class needs two fields (instance variables) with name width
//and height of type double.
package homeworkweek7;

public class Wall {


    double width;
    double height;


    public Wall() {
        this.width = height;
        this.height = width;
    }

    public Wall(double width, double height){
        if(width > 0 && height < 0){
            this.width = width;
            this.height = 0;
        }else if(width < 0 && height > 0){
            this.width = 0.0;
            this.height = height;
        }else if(width < 0 && height < 0){
            this.width = 0.0;
            this.height = 0.0;
        }else{
            this.width = width;
            this.height = height;
        }
    }


    public static void main(String[] args) {
        Wall w1 = new Wall(100, -25);
        Wall w = new Wall();
        w.getWidth();
        w.getHeight();
        w.setWidth(10);
        w.setHeight(20);
        w.getArea();

        System.out.println("area= " + (w1.width * w1.height));

        System.out.println();
        System.out.println("width= " + w.getWidth());
        System.out.println();
        System.out.println("height= " + w.getHeight());
        System.out.println();
        System.out.println("area= " + w.getArea());

    }

    public void setWidth(double width){
        if(width < 0){
            this.width = 0;
        }else{
            this.width = width;
        }
    }

    public double getWidth(){
        return width;
    }

    public void setHeight(double height){
        if(height < 0){
            this.height = 0;
        }else{
            this.height = height;
        }
    }

    public double getHeight(){
        return height;
    }
    public double getArea(){
        return this.width * this.height;
    }

}