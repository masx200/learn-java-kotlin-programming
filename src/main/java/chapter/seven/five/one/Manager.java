package chapter.seven.five.one;

class Manager extends Employee { //子类继承了父类的可串行化机制
    private Employee secretary;

    public Manager(String n, double s, int year, int month, int day) {
        super(n, s, year, month, day);
        secretary = null;
    }

    public void setSecretary(Employee s) {
        secretary = s;
    }

    public String toString() {
        return super.toString() + " [秘书= " + secretary + " ]";
    }
}
