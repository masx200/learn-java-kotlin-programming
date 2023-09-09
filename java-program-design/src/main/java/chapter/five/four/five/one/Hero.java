package chapter.five.four.five.one;

class Hero extends ActionCharacter implements CanFight, CanFly, CanSwim {

    @Override
    public void fly() {
        System.out.println("flying");
    }

    @Override
    public void swim() {
        System.out.println("swimming");
    }
}
