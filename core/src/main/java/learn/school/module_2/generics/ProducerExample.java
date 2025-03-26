package learn.school.module_2.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class RedCircle extends Circle {
    @Override
    public void draw() {
        System.out.println("Drawing a red circle");
    }
}

class GreenCircle extends Circle {
    @Override
    public void draw() {
        System.out.println("Drawing a green circle");
    }
}

public class ProducerExample {

    public static void drawShapes(List<? extends Shape> shapes) {
        for (Shape shape : shapes) {
            shape.draw();
        }

         //Problem:
//        for (Shape shape : shapes) {
//            shapes.add(new GreenCircle());
//        }
    }

    public static void main(String[] args) {
        List<Circle> circles = new ArrayList<>();
        circles.add(new Circle());
        circles.add(new Circle());

        List<RedCircle> redCircles = new ArrayList<>();
        redCircles.add(new RedCircle());

        drawShapes(circles);
        drawShapes(redCircles);

    }

}