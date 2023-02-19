import java.util.ArrayList;
import java.util.Collections;

public class ExerciseD {
    public static void main(String[] args) {
        Square square1 = new Square(5, 6);
        //System.out.println(square1.getPerimeter());
        Square square2 = new Square(4, 2);
        //System.out.println(square2.getPerimeter());

        double square1Perimeter = square1.getPerimeter();
        //System.out.println(square1Perimeter);
        double square2Perimeter = square2.getPerimeter();
        //System.out.println(square2Perimeter);
        System.out.println(square1.compareTo(square2));

        Square square3 = new Square(8, 2);
        //System.out.println(square3.getPerimeter());
        double square3Perimeter = square3.getPerimeter();
        System.out.println(square3Perimeter);

        ArrayList allSquares = new ArrayList<>();
        allSquares.add(square1);
        allSquares.add(square2);
        allSquares.add(square3);

        System.out.println(allSquares);

        Collections.sort(allSquares);

        System.out.println(allSquares);


        ArrayList allSquaresPerimeter = new ArrayList<>();
        allSquaresPerimeter.add(square1Perimeter);
        allSquaresPerimeter.add(square2Perimeter);
        allSquaresPerimeter.add(square3Perimeter);

        System.out.println(allSquaresPerimeter);

        Collections.sort(allSquaresPerimeter);

        System.out.println(allSquaresPerimeter);
    }
}
