public class SimpleGeneric<T> {
    private T input;

    public SimpleGeneric(T input) {
        this.input = input;
    }

    public void showObjectType() {
        System.out.println("Object Type is " + input.getClass().getName());
    }

    public static void main(String[] args) {
        // Example usage with String
        SimpleGeneric<String> genClassString = new SimpleGeneric<>("Input");
        genClassString.showObjectType();

        // Example usage with Integer
        SimpleGeneric<Integer> genClassInteger = new SimpleGeneric<>(123);
        genClassInteger.showObjectType();
    }
}
