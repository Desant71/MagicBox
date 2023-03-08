import java.util.Random;

public class MagicBox<T> {
    T[] items;

    public MagicBox(int size) {
        items = (T[]) new Object[size];
    }

    public boolean add(T object) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = object;
                return true;
            }
        }
        return false;
    }

    public T pick() {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                throw new RuntimeException(String.format("В коробке осталось место. Осталось заполнить %s элементов", items.length - i));
            }
        }
        Random random = new Random();
        int randomInt = random.nextInt(items.length);
        return items[randomInt];
    }
}

