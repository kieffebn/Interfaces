import java.awt.*;
import java.util.ArrayList;

public class BigRectangleLister {
        public static ArrayList<Rectangle> MakeRects() {
            ArrayList<Rectangle> rectangles = new ArrayList<>();
            rectangles.add(new Rectangle(1, 2, 3, 4)); //Perimeter of 10
            rectangles.add(new Rectangle(5, 5, 5, 5)); //Perimeter of 20
            rectangles.add(new Rectangle(3, 2, 1, 3)); //Perimeter of 9
            rectangles.add(new Rectangle(5, 3, 5, 1)); //Perimeter of 14
            rectangles.add(new Rectangle(2, 2, 2, 1)); //Perimeter of 7
            rectangles.add(new Rectangle(3, 1, 3, 1)); //Perimeter of 8
            rectangles.add(new Rectangle(3, 5, 9, 3)); //Perimeter of 20
            rectangles.add(new Rectangle(1, 1, 1, 3)); //Perimeter of 6
            rectangles.add(new Rectangle(3, 1, 1, 1)); //Perimeter of 6
            rectangles.add(new Rectangle(1, 2, 3, 5)); //Perimeter of 11
            return rectangles;
        }

}
