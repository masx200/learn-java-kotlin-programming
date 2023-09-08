package chapter.eleven.nine.one;


//代码如下:
class Test {
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
        try {
            Byte w = (Byte) ys.iterator().next();  //run-time exception
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }

    }
}