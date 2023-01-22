import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        ArrayList<Figury> figures = new ArrayList<>();
        figures.add(new Figury.Square(2.2));
        figures.add(new Figury.Square(3));
        figures.add(new Figury.Square(7));
        figures.add(new Figury.Rectangle(5, 6));
        figures.add(new Figury.Rectangle(4, 9));
        figures.add(new Figury.Rectangle(3, 6));
        figures.add(new Figury.Circle(6));
        figures.add(new Figury.Circle(12));
        figures.add(new Figury.Circle(8));
        figures.add(new Figury.Circle(7));

        Figury.LargestFigure(figures);
        Figury.LargestPerimeter(figures);
        }
}

