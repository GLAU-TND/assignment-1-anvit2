

        package dataStructures;

        import Node.node;

public class MyLinkedList<T extends  Comparable<T>> {
    private node<T> head;
    private node<T> iter;

    public node<T> getHead() {
        return head;
    }

    public void setHead(node<T> Node) {
        head = Node;
        iter = head;
    }
    public node<T> getIter() {
        return iter;
    }
    public void setIter(node<T> iter) {
        this.iter = iter;
    }
    public void insert(node<T> Node) {
        if (getHead() == null) {
            setHead(Node);
        } else {
            node<T> temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(Node);
        }
    }


    public node<T> delete() {
        if (isEmpty()) {
            System.out.println("Underflow");
            return null;
        }
        node<T> temp = getHead();
        setHead(getHead().getNext());
        return temp;
    }

    public node<T> delete(int i) {
        node<T> deletedNode ;
        node<T> temp = getHead();
        if (isEmpty()) {
            System.out.println("Underflow");
            return temp;
        }
        if (i == 1) {
            deletedNode = getHead();
            setHead(null);
        } else {
            for (int j = 1; j < i - 1; j++) {
                temp = temp.getNext();
            }
            deletedNode = temp.getNext();
            temp.setNext(temp.getNext().getNext());
        }
        return deletedNode;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public node<T> getObject() {

        node<T> temp;

        if (getIter() == null && getHead() == null) {
            System.out.println("List is empty");
            return null;
        } else if (getIter() == null) {
            setIter(getHead());
            return null;
        }
        temp = getIter();
        setIter(getIter().getNext());
        return temp;
    }
    public void sort(){
        node<T> pass1=getHead();
        node<T> pass2=getHead().getNext();

        while(pass1!=null){
            while(pass2!=null){
                if(pass1.getData().compareTo(pass2.getData())>0){
                    T temp = pass1.getData();
                    pass1.setData(pass2.getData());
                    pass2.setData(temp);
                }
                pass2=pass2.getNext();
            }
            pass1=pass1.getNext();
        }
    }
}
