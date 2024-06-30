package stone_paper;

public class Grammar {

    public String[] arr = {"STONE","PAPER","SCISSOR"};

    public void result(int input) {
        int computerChoice = computerChoice();
        System.out.println("computer choose "+arr[computerChoice]);

        if (arr[input].equals(arr[computerChoice])) {
            System.out.println("DRAW");
            return;
        } else if (
                arr[input].equals(arr[0]) && arr[computerChoice].equals(arr[2]) ||
                arr[input].equals(arr[1]) && arr[computerChoice].equals(arr[0]) ||
                arr[input].equals(arr[2]) && arr[computerChoice].equals(arr[1])
        ) {
            System.out.println("You WON!!");
            return;
        } else {
            System.out.println("Computer won");
            return;
        }

    }


    /**
     * Generates a random choice for the computer.
     *
     * @return An integer representing the computer's choice: 0, 1, or 2.
     */
    private int computerChoice() {
        double choice = Math.random() * 3;
        return (int) choice;
    }

}
