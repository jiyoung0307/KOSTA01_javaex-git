package challenge08.InterfaceEx;

import chapter05.Direction;

public interface Delicious extends Edible,Sweetable {
}

interface Edible {
  void eat();
}

interface Sweetable {
  void sweet();
}