public class ShapeFactory {
    public static Shape getShape(ShapeEnum shapeEnum) {
        return switch (shapeEnum) {
            case SQUARE -> new Square();
            case TRIANGLE -> new Triangle();
            case CIRCLE -> new Circle();
        };
    }
}
