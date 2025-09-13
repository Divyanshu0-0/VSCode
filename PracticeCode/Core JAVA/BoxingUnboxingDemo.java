public class BoxingUnboxingDemo {
    public static void main(String[] args) {
        // Boxing: primitive int to Integer object
        int primitiveInt = 50;
        Integer boxedInt = Integer.valueOf(primitiveInt);  // explicit boxing
        System.out.println("Boxed Integer object: " + boxedInt);

        // Auto-boxing (automatic boxing by Java)
        Integer autoBoxedInt = primitiveInt;
        System.out.println("Auto-boxed Integer object: " + autoBoxedInt);

        // Unboxing: Integer object to primitive int
        int unboxedInt = boxedInt.intValue();  // explicit unboxing
        System.out.println("Unboxed primitive int: " + unboxedInt);

        // Auto-unboxing (automatic unboxing by Java)
        int autoUnboxedInt = autoBoxedInt;
        System.out.println("Auto-unboxed primitive int: " + autoUnboxedInt);

        // Similarly with other wrapper classes
        Double boxedDouble = 25.5;     // auto-boxing
        double unboxedDouble = boxedDouble;  // auto-unboxing
        System.out.println("Boxed Double: " + boxedDouble);
        System.out.println("Unboxed double: " + unboxedDouble);
    }
}
