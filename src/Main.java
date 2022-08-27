public class Main {
    public static void main(String[] args) {
        MagicBox<String> box = new MagicBox<>(2);
        box.add("один");
        box.add("два");
        box.add("три");
        box.add("четыре");
        box.add("пять");
        box.pick();

        MagicBox<Integer> box1 = new MagicBox<>(6);
        box1.add(13);
        box1.add(8);
        box1.add(25);
        box1.add(10);
        box1.add(97);
        box1.add(15);
        box1.add(2);
        box1.pick();
    }
}