package chapter.eleven.ten.one;

//下面再看如何对这个类进行应用。代码如下:
class Test2 {
    public static void main(String[] args) {
        //创建Byte 类型list
        LinkedList<Byte> xs = new LinkedList<>();
        xs.add((byte) 0);
        xs.add((byte) 1);
        Byte x = xs.iterator().next();
        //创建String 类型list
        LinkedList<String> ys = new LinkedList<>();
        ys.add("zero");
        ys.add("one");
        String y = ys.iterator().next();
        //创建String list 类型list
        LinkedList<LinkedList<String>> zss = new LinkedList<>();
        zss.add(ys);
        String z = zss.iterator().next().iterator().next();
        //从一个字符串类型的链表里提取出一个元素,
        //作为Byte 类型处理时,在编译时抛出异常提示
//        Byte w = ys.iterator().next();
        System.out.println(xs);
        System.out.println(ys);
        System.out.println(zss);
    }
}
