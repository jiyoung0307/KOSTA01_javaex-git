package chapter06;

public class FinalMethodEx {
  public static void main(String[] args) {

  }
}

class Chess {
  enum ChessPlayer {
    WHITE,BLACK
  }

  /* 바뀌면 안되므로 final로 고정 */
 final ChessPlayer getFirstPlayer() {
    return ChessPlayer.WHITE;
  }
}

class WorldChess extends Chess {

}

