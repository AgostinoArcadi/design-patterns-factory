public enum ShapeEnum {
    SQUARE("Square"),
    TRIANGLE("Triangle"),
    CIRCLE("Circle");

    private final String shape;

    ShapeEnum(String shape) {
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }
}
