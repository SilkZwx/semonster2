package semonster2;

import java.util.ArrayList;
import java.util.LinkedList;

public class Player {
  String name;// Player name
  ArrayList<Monster> monsterDeck = new ArrayList<>();
  LinkedList<Integer> randomNumberList;// randomな0~4の数値を必要な数保存しておく

  Player(LinkedList<Integer> randomNumberList, String playerName) {
    this.randomNumberList = randomNumberList;
    this.name = playerName;
  }
}
