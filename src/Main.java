public class Main {
    public static void main(String[] args) {
        Shape shapeTriangle = ShapeFactory.getShape(ShapeEnum.TRIANGLE);
        Shape shapeCircle = ShapeFactory.getShape(ShapeEnum.CIRCLE);
        Shape shapeSquare = ShapeFactory.getShape(ShapeEnum.SQUARE);

        System.out.println("Draw: " + shapeTriangle.draw());
        System.out.println("Draw: " + shapeCircle.draw());
        System.out.println("Draw: " + shapeSquare.draw());
    }
}
