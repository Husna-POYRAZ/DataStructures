package linked_list;

public class LinkedList<T> {

    private Node<T> head;

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public T get(int index) {
        if (head == null) {
            throw new MyException("Dizi Boş");
        }
        Node<T> temp = head;
        int counter = 0;
        while (temp != null && counter < index) {
            temp = temp.next;
            counter++;
        }
        if (temp == null) {
            throw new MyException("Geçersiz indeks");
        }
        return temp.data;
    }


    public void remove(int index) {
        if (head == null) {
            throw new MyException("Dizi Boş");
        }
        if (index == 0) {
            head = head.next;
            return;
        }
        Node<T> temp = head;
        int counter = 0;
        while (temp != null && counter < index - 1) {
            temp = temp.next;
            counter++;
        }
        if (temp == null || temp.next == null) {
            throw new MyException("Geçersiz indeks");
        }
        temp.next = temp.next.next;
    }


    public void remove(T data) {
        if (head == null) {
            throw new MyException("Dizi Boş");
        }
        if (head.data.equals(data)) {
            head = head.next;
            return;
        }
        Node<T> temp = head;
        while (temp.next != null) {
            if (temp.next.data.equals(data)) {
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }

    public int size() {
        int count = 0;
        Node<T> temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }


    public void showList(){
        Node<T> temp = head;
        if(temp == null){
            System.out.println("Liste Boş");
        }
        else{
            System.out.print("[ ");
            while(temp != null){
                System.out.print(temp.data + " , ");
                temp = temp.next;
            }
            System.out.println("]");
        }
    }

}
