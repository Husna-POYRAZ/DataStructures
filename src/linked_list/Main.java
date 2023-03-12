package linked_list;

import exception.MyException;

import java.util.Collection;

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
        System.out.println("-----------------");

        LinkedList<Integer> list2 = new LinkedList<>();
        // use add() method to add elements in list2
        list2.add(25);
        list2.add(30);
        list2.add(31);
        list2.add(35);


        System.out.println(list.addAll(list2));
        list.showList();

    }
}