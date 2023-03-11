package linked_list;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(5);
        list.add(10);
        list.add(15);
        list.add(155);
        list.add(8);

        try {
            list.remove(155);
        }catch (MyException m){
            System.out.println(m.getMessage());
        }

        list.showList();

    }
}
