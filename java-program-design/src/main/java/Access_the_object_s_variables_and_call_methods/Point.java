package Access_the_object_s_variables_and_call_methods;

class Point {                //定义类Point
    int x, y;                  //定义成员变量

    Point() {                  //定义无参数构造方法
        x = 0;
        y = 0;
    }

    Point(int x, int y) {        //定义带参数构造方法
        this.x = x;
        this.y = y;
    }

    void move(int x1, int y1) {   //定义move 方法
        x = x1;
        y = y1;
    }
}
