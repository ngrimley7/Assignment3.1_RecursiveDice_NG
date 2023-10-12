/**
 * The RecDieRollerDriver class demonstrates the usage of the RecDieRoller class
 * to simulate rolling a die and calculates the mean number of times it takes to
 * roll a specific value.
 */
public class RecDieRollerDriver {

    /**
     * The main method initializes a RecDieRoller object, performs 1000 rolls,
     * and calculates the mean number of times it takes to roll a 2.
     *
     * @param args The command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        RecDieRoller dieRoll = new RecDieRoller();

        // Array to store the number of rolls for each iteration
        int[] numOfRolls = new int[1000];

        int sumOfRolls = 0;

        // Perform 1000 rolls and record the number of rolls for each iteration
        for (int i = 0; i < 1000; i++) {
            numOfRolls[i] = dieRoll.roll();
            System.out.println("Number of Rolls: " + numOfRolls[i]);

            sumOfRolls += numOfRolls[i];
        }

        // Calculate the mean number of times to roll a 2
        int mean = sumOfRolls / 1000;
        System.out.println("Mean number of times to roll a 2: " + mean);
    }
}
