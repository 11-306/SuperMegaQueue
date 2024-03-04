
public class MyQueue<E> implements IMyCollection<E> {
    private MyLinkedList<E> queue;

    public MyQueue() {
        queue = new MyLinkedList<E>();
    }

    @Override
    public boolean add(E e) {
        return queue.add(e);
    }

    @Override
    public void clear() {
        queue.clear();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public boolean remove(E e) {
        return queue.remove(e);
    }

    @Override
    public E get(int index) {
        if (index >= 0 && index < queue.size()) {
            return queue.get(index);
        } else {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + queue.size());
        }
    }

    public E get() {
        if (this.isEmpty() == false) {
            E item = queue.get(0);
            queue.remove(item);
            return item;
        }
        else throw new IndexOutOfBoundsException("Список пустой.");
    }

    @Override
    public int size() {
        return queue.size();
    }
}