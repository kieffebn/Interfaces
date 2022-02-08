import java.awt.*;
import java.util.ArrayList;


public class BigRectangleFilter{

    public interface Predicate {
        boolean accept(Rect r);
    }

    static class Rect {
        public Rectangle myRect;
        public int Perimeter;
        public Rect(Rectangle myRect) {
            this.myRect = myRect;
            this.Perimeter = myRect.x + myRect.y + myRect.width + myRect.height;
        }
    }

    public static void main(String args[]) {
        ArrayList<Rectangle> myRects = BigRectangleLister.MakeRects();
        Predicate predicateForLength = (e) -> e.Perimeter > 10;

        System.out.println("Rectangles with perimeters higher than 10: ");

        for (Rectangle candidate : myRects) {
            Rect newRect= new Rect(candidate);
            if (predicateForLength.accept(newRect)) {
                System.out.println(newRect.Perimeter);
            }
        }


    }

}


