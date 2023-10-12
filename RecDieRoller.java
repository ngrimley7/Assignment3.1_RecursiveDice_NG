/**
 * The RecDieRoller class represents a die roller that simulates the rolling of a six-sided die
 * until a 2 is obtained. It records the number of rolls required for each simulation.
 */
public class RecDieRoller {

    /**
     * The current value of the rolled die.
     */
    public int die;

    /**
     * The number of rolls required to get a 2.
     */
    public int rolls;

    /**
     * Simulates the rolling of a die until a 2 is obtained.
     *
     * @return The number of rolls required to get a 2.
     */
    public int roll() {
        // Reset rolls and die to initial values
        rolls = 0;
        die = 0;

        // Roll the die until a 2 is obtained
        while (die != 2) {
            // Generate a random number between 1 and 6 to simulate a die roll
            die = (int) (Math.random() * 6) + 1;
            // Increment the rolls counter
            rolls++;

            // Print the current roll for debugging or analysis
            System.out.println("Roll " + rolls + ": " + die);
        }

        return rolls;
    }
}
