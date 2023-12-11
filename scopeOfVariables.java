public class scopeOfVariables {
  int i = 34;  
  static int z; 
  static {
    z = 10;
    System.out.println("inside static block: " + z);
  }
  void test() {
    int k = 200;  
    System.out.println("local variable: " + (k + i));
  }
  public static void main(String[] args) {
    scopeOfVariables obj = new scopeOfVariables();
    obj.test();
    System.out.println(obj.i);
  }
}