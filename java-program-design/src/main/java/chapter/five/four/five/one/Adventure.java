package chapter.five.four.five.one;

class Adventure {
    public static void main(String[] args) {
        var h = new Hero();
        t(h);
        u(h);
        v(h);
        w(h);


    }

    private static void t(CanFight h) {
        h.fight();
    }

    private static void w(ActionCharacter h) {
        h.fight();

    }

    private static void v(CanFly h) {
        h.fly();
    }

    private static void u(CanSwim h) {
        h.swim();
    }
}
