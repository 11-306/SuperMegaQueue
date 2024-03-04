public class Main {

    public static void main(String[] args){

        MyQueue<String> queue = new MyQueue<>();
        queue.add("Арбуз");
        queue.add("Яблоко");
        String item  = queue.get();
        System.out.println(item);
        item  = queue.get();
        System.out.println(item);
    }
}
