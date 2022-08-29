import java.util.Random;

public class MagicBox<T> {
    private static final Random randomizer = new Random();
    private T[] items;

    public MagicBox(int lenghtItems) {

        this.items = (T[]) new Object[lenghtItems];
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                System.out.println("Добавили:" + item);
                return true;
            }
        }
        return false;
    }

    public T pick() {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                throw new RuntimeException("Коробка не заполнена! Осталось заполнить: " + (items.length - 1) + " ячеек.");
            }
        }
        int randomInt = randomizer.nextInt(items.length);
        System.out.println("Коробка заполнена! Случайный элемент из коробки: " + items[randomInt]);
        System.out.println();
        return items[randomInt];
    }
}