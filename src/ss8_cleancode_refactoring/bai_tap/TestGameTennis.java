package ss8_cleancode_refactoring.bai_tap;

public class TestGameTennis {
    public static void main(String[] args) {
        String score = GameTennis.getScore("Nadal","Novac",4,6);
        System.out.println(score);

        String score1 = GameTennis.getScore("Nadal", "Roger",5,3);
        System.out.println(score1);
    }
}
