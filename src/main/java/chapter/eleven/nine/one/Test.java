package chapter.eleven.nine.one;


//代码如下:
public class Test {
    public static void main(String[] args) {
        //Byte 类型的list
        LinkedList xs = new LinkedList();
        xs.add(((byte) 0));
        xs.add((byte) (1));
        Byte x = (Byte) xs.iterator().next();
        //String 类型的list

        LinkedList ys = new LinkedList();
        ys.add("zero");
        ys.add("one");
        String y = (String) ys.iterator().next();
        //String 列表类型的list
        LinkedList zss = new LinkedList();
        zss.add(ys);
        String z = (String) ((LinkedList) zss.iterator().next()).iterator().next();
        //从String 类型的链表中试图提取一个Byte 类型的list 元素
        System.out.println(xs);
        System.out.println(ys);
        System.out.println(zss);

    }
}