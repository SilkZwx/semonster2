package semonster2;

public class Monster {
    private String name;
    private int rare;

    String summonsMonster(int x){
        String monsters[] = {"スライム","サハギン","ドラゴン","デュラハン","シーサーペント"};
        return monsters[x];
    }

    @Override
    public String toString() {
        return "デュラハン:レア度[0]\n";
    }
}