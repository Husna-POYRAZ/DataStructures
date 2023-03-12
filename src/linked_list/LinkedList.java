package linked_list;

import exception.MyException;

import java.util.Collection;

public class LinkedList<T> {
    public class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

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

    public void add(int index, T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            if (index != 0)
                throw new MyException("Dizi boş olduğu için sadece 0. index e ekleme yapabilirsin.");
            else {
                head = newNode;
            }
        } else {
            Node<T> temp = head;
            int counter = 0;
            if (index == counter) {
                head = newNode;
                head.next = temp;

            } else {
                while (temp != null && index - 1 != counter) {
                    temp = temp.next;
                    counter++;
                }
                if (index == counter + 1) {
                    newNode.next = temp.next;
                    temp.next = newNode;
                } else
                    throw new MyException("Dizinin boyutundan büyük bir index girdiniz.");

            }

        }

    }

    public boolean addAll(LinkedList<T> data) {
        Node<T> temp = head;
        if (head == null) {
            head = data.head;
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = data.head;
        return  true;
    }

    public boolean contains(T data) {
        Node<T> temp = head;
        while (temp != null) {
            if (temp.data == data)
                return true;
            temp = temp.next;
        }
        return false;
    }

    public boolean isEmty() {
        if (head == null)
            return true;
        return false;
    }

    public int lastIndexOf(T data) {
        int counter = 0;
        Node<T> temp = head;
        while (temp != null) {
            if (temp.data == data)
                return counter;
            temp = temp.next;
            counter++;
        }
        return -1;
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


    public void showList() {
        Node<T> temp = head;
        if (temp == null) {
            System.out.println("Liste Boş");
        } else {
            System.out.print("[ ");
            while (temp != null) {
                System.out.print(temp.data);
                temp = temp.next;
                if (temp != null)
                    System.out.print(" , ");
            }
            System.out.println("]");
        }
    }

}