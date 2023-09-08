package chapter.eleven.ten.one;

class LinkedList<A> implements Collection<A> {
    protected Node<A> heaD = null, tail = null;


    public LinkedList() {
    }

    @Override
    public String toString() {
        Iterator<A> it = iterator();
        if (!it.hasNext()) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (; ; ) {
            A e = it.next();
            sb.append(e == this ? "(this Collection)" : e);
            if (!it.hasNext()) {
                return sb.append(']').toString();
            }
            sb.append(',').append(' ');
        }

    }

    public void add(A elt) {
        if (heaD == null) {
            heaD = new Node<>(elt);
            tail = heaD;
        } else {
            tail.next = new Node<>(elt);
            tail = tail.next;
        }
    }

    public Iterator<A> iterator() {
        return new Iterator<A>() {
            private Node<A> ptr = heaD;

            public boolean hasNext() {
                return ptr != null;
            }

            public A next() {
                if (ptr != null) {
                    A elt = ptr.elt;
                    ptr = ptr.next;
                    return elt;
                } else throw new NoSuchElementException();
            }
        };
    }

}
