package chapter.eleven.ten.one;

class Node<A> {
    A elt;
    Node<A> next = null;

    Node(A elt) {
        this.elt = elt;
    }
}
