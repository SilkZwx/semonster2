package semonster2;

public class Monster {
  private String name;
  private int rare;

  Monster(int nameNum, int rareNum) {
    this.name = this.summonsMonster(nameNum);
    this.rare = rareNum;
  }

  String summonsMonster(int x) {
    String monsters[] = { "スライム", "サハギン", "ドラゴン", "デュラハン", "シーサーペント" };
    return monsters[x];
  }

  @Override
  public String toString() {
    return this.name + ":レア度[" + this.rare + "]\n";
  }
}
