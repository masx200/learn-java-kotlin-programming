package chapter.five.one.one.one;

class Car {
    private String carName;
    private boolean sale;

    public Car(String c1, boolean isSale) {
        carName = c1;
        sale = isSale;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String c1) {
        carName = c1;
    }

    public Boolean getSale() {
        return sale;
    }

    public void setSale(boolean isSale) {
        sale = isSale;
    }

    public String toString() {                   //覆盖toString()方法
        if (sale) return (carName + "已卖出");
        else return (carName + "未卖出");
    }

    public boolean equals(Object obj) {         //覆盖equals()方法
        if (!(obj instanceof Car)) return false;    //参见注1 说明
        Car c = (Car) obj;
        return (carName.equals(c.getCarName()) && (sale == c.getSale()));
    }
}
