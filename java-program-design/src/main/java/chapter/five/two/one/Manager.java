package chapter.five.two.one;

class Manager extends Employee {
    private double bonus;

    public Manager(String n, double s, int year, int month, int day) {
        super(n, s, year, month, day);
        bonus = 0;
    }

    public void setBonus(double b) {
        bonus = b;
    }

    public boolean equals(Object otherObject) {    //对于Employee 的方法覆盖
        if (!super.equals(otherObject))
            return false;
        Manager other = (Manager) otherObject;
        return bonus == other.bonus;
    }

    public int hashCode() {     //对于Employee 的方法覆盖
        return super.hashCode() + 17 * new Double(bonus).hashCode();
    }

    public String toString() {  //对于Employee 的方法覆盖
        return super.toString() + " [bonus = " + bonus + " ]";
    }
}
