
public class SPR {

    public static void main(String[] args) {
        System.out.println(rps("paper", "scissors"));
    }

    public static String rps(String p1, String p2) {
        String rules = "scissorspaperrockscissors";
        if (rules.contains(p1 + p2)) {
            return "Player 1 won!";
        } else {
            return "Player 2 won!";
        }
    }
}

