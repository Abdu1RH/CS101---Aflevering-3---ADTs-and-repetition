public class Square implements Comparable<Square> {
    private double width;
    private double height;


    public Square(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public int compareTo (Square ComparingSquaresPerimeter) {
        double thisPerimeter = getPerimeter();
        double otherPerimeter = ComparingSquaresPerimeter.getPerimeter();
        System.out.println(this);
        System.out.println(ComparingSquaresPerimeter);
    if (thisPerimeter > otherPerimeter){
        return -1;
    } else if (thisPerimeter == otherPerimeter) {
        return 0;
    }

    else {
        return 1;
    }

    }
    public double getPerimeter(){
        return this.height * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
