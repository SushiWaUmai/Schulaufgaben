public class Main {
    public static void main(String[] args) {
        BetterList<String> list = new BetterList<>();

        list.append("a");
        list.append("c");
        list.append("b");

        list.insert(0, "d");
        list.insert(1, "e");
        list.insert(2, "f");
        list.insert(2, "4");
        list.insert(2, "x");
        list.insert(2, "j");

        System.out.println(list);

        list.bogoSort((a, b) -> a.compareTo(b) <= 0);

        System.out.println(list);
    }
}
