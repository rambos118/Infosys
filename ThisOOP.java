public class ThisOOP {
    private int barCode;
    private String name;
    private int weight, cost;

    ThisOOP(int barCode, String name, int weight, int cost) {
        this.barCode = barCode;
        this.name = name;
        this.weight = weight;
        this.cost = cost;
    }

    public void displayChoco() {
        System.out.println("Barcode:" + barCode);
        System.out.println("Name:" + name);
        System.out.println("Weight:" + weight);
        System.out.println("Cost:" + cost);
    }

    public static void main(String[] args) {
        ThisOOP choco = new ThisOOP(1, "Yash", 56, 300);
        ThisOOP choco1 = new ThisOOP(1, "Yash", 56, 300);
        ThisOOP choco2 = new ThisOOP(1, "Yash", 56, 300);

        choco.displayChoco();
        System.out.println("***************");
        choco1.displayChoco();
        System.out.println("***************");
        choco2.displayChoco();

    }
}
