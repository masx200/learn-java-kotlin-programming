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
            private Node ptr = heaD;

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

}
