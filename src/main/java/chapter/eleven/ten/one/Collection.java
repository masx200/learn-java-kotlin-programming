package chapter.eleven.ten.one;

interface Collection<A> {  //定义泛型集合
    void add(A x);

    Iterator<A> iterator();
}


