public class ChocoTester {
    private int barCode;
    private String name;
    private int weight, cost;

    ChocoTester(int BarCode, String Name, int Weight, int Cost) {
        barCode = BarCode;
        name = Name;
        weight = Weight;
        cost = Cost;
    }

    public void displayChoco() {
        System.out.println("Barcode:" + barCode);
        System.out.println("Name:" + name);
        System.out.println("Weight:" + weight);
        System.out.println("Cost:" + cost);
    }

    public static void main(String[] args) {
        ChocoTester choco = new ChocoTester(1, "Yash", 56, 300);
        ChocoTester choco1 = new ChocoTester(1, "Yash", 56, 300);
        ChocoTester choco2 = new ChocoTester(1, "Yash", 56, 300);

        choco.displayChoco();
        System.out.println("***************");
        choco1.displayChoco();
        System.out.println("***************");
        choco2.displayChoco();

    }
}
