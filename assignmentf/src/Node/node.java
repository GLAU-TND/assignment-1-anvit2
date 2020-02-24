package Node;

//Generic Node class
public class node<T> {
    private T data;         //Data of node
    private node<T> next;   //Self referential data

    //Getter for data
    public T getData() {
        return data;
    }

    //Setter for data
    public void setData(T data) {
        this.data = data;
    }

    //Getter for self referential data
    public node<T> getNext() {
        return next;
    }

    //Setter for self referential data
    public void setNext(node<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}