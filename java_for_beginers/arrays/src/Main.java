public class Main {
    public static void main(String []args){

        Queue list = new Queue(5);

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list.deque());
        System.out.println(list.deque());
        System.out.println(list.deque());
        System.out.println(list.deque());
        System.out.println(list.deque());

        CircularQueue li = new CircularQueue(5);
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);

    }
}
