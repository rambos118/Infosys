public class Rectangle{
    private int length;
    private int breadth;
    public int getLength(){
        return length;    
    }
    public void setLength(int length){
        this.length = length;
    }

    public int getbreadth(){
        return length;    
    }
    public void setBreadth(int breadth){
        this.breadth = breadth;
    }


    public float calculatePerimeter(){
        return 2*(length*breadth);
    }

    public static void main(String[] args){
        Rectangle r = new Rectangle();
        r.setLength(5);
        r.setBreadth(3);
        r.calculatePerimeter();

        System.out.println("Calculate perimeter:"+ r.calculatePerimeter());
        System.out.println("Rectangles Length is " + r.length + " and breadth is " + r.breadth);
    }

}