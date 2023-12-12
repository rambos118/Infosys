class PlayerRating {
    int playerPosition;
    String playerName;
    double averageRating;

    public PlayerRating(int playerPosition, String playerName) {
        this.playerPosition = playerPosition;
        this.playerName = playerName;
    }

    public void calculateAverageRating(double criticOneRating, double criticTwoRating) {
        averageRating = (criticOneRating + criticTwoRating) / 2.0;
    }

    public void calculateAverageRating(double criticOneRating, double criticTwoRating, double criticThreeRating) {
        averageRating = (criticOneRating + criticTwoRating + criticThreeRating) / 3.0;
    }

    public char determineCategory() {
        if (averageRating >= 8.0) {
            return 'A';
        } else if (averageRating >= 4.0) {
            return 'B';
        } else {
            return 'C';
        }
    }

    public void displayPlayerDetails() {
        System.out.println("the player name is " + playerName);
        System.out.println("the player position is " + playerPosition);
        System.out.println("the average rating is " + averageRating);
        System.out.println("the category is " + determineCategory());
    }
}


public class MethodOverload {
    
    public static void main(String[] args) {
        PlayerRating player1 = new PlayerRating(1, "Beckham");
        player1.calculateAverageRating(9, 9.9);
        player1.displayPlayerDetails();

        System.out.println(); 

        
        PlayerRating player2 = new PlayerRating(1, "Oscar");
        player2.calculateAverageRating(1, 1, 1);
        player2.displayPlayerDetails();
    }

}
