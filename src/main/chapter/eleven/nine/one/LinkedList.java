package chapter.eleven.nine.one;

//对接口Collection 的实现
class LinkedList implements Collection {
    protected Node heaD = null, tail = null;

    public LinkedList() {
    }

    public void add(Object elt) {
        if (heaD == null) {
            heaD = new Node(elt);
            tail = heaD;
        } else {
            tail.next = new Node(elt);
            tail = tail.next;
        }
    }

    public Iterator iterator() {
        return new Iterator() {
            protected Node ptr = heaD;

            public boolean hasNext() {
                return ptr != null;
            }

            public Object next() {
                if (ptr != null) {
                    Object elt = ptr.elt;
                    ptr = ptr.next;
                    return elt;
                } else throw new NoSuchElementException();
            }
        };
    }

    protected class Node {  //含有一系列节点的链表,节点中的数据类型是Object
        Object elt;
        Node next = null;

        Node(Object elt) {
            this.elt = elt;
        }
    }
}
