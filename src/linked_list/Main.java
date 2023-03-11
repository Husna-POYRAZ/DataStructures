package linked_list;

import exception.MyException;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        System.out.println("Dizi boş : " + list.isEmty());
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(155);
        list.add(8);
        list.showList();

        try {
            System.out.println(list.get(3));
            list.remove(3);
            list.add(0, 0);
            list.add(3, 39);
            list.add(6, 1);
            list.add(10,100);
        }catch (MyException m){
            System.out.println(m.getMessage());
        }
        list.showList();
        System.out.println(list.contains(10));
        System.out.println("Dizi boş : " + list.isEmty());
        System.out.println("Dizide 5. elemanın indexi = " + list.lastIndexOf(5));
    }
}