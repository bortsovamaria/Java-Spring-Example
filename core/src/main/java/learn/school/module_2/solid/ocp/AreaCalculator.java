package learn.school.module_2.solid.ocp;

// Плохо: Класс не закрыт для модификации
class Rectangle {
    double width, height;
}
class Circle {
    double radius;
}
class AreaCalculator {
    double calculateRectangleArea(Rectangle rectangle) {
        return rectangle.width * rectangle.height;
    }

    double calculateCircleArea(Circle circle) {
        return Math.PI * circle.radius * circle.radius;
    }
}

// Хорошо: Использование абстракции
//interface Shape {
//    double calculateArea();
//}
//
//class Rectangle implements Shape {
//    double width, height;
//
//    @Override
//    public double calculateArea() {
//        return width * height;
//    }
//}
//
//class Circle implements Shape {
//    double radius;
//
//    @Override
//    public double calculateArea() {
//        return Math.PI * radius * radius;
//    }
//}
//
//class AreaCalculator {
//    public double calculateArea(Shape shape) {
//        return shape.calculateArea();
//    }
//}