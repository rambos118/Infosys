// public class Account {
//   private double balance = 500.00;
//   public double  getBalance(int accountId) {
//     // logic here
//     return balance;
//   }
//   public static void main(String[] args) {
//     Account accnt = new Account();
//     double value = accnt.getBalance(123456);
//     System.out.println("The balance is: " + value);
//   }
// }

class Account {
  public static void main(String[] args) {
    System.out.println(args.length);    // length of the array
    System.out.println(args[0]);
    System.out.println(args[1]);
  }
}