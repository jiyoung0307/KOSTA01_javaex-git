package classExample;

class Animal {
  void 숨쉰다() {
    System.out.println("숨쉰다");
  }

  void 먹는다() {
    System.out.println("먹는다");
  }

  void 움직인다() {
    System.out.println("움직인다");
  }
}

class Bird extends Animal {
  void 날아간다() {
    System.out.println("날아간다");
  }
}

class Tiger extends Animal {
  void 달린다() {
    System.out.println("달린다");
  }
}