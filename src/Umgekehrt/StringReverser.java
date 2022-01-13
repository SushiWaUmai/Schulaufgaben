public class StringReverser {
    private String umkehren;

    public StringReverser(String _umkehren) {
        umkehren = _umkehren;
    }

    public String reverseSentence() {
        // kehr die Zeichenfolge fuer jedes wort um

        String[] words = umkehren.split(" ");
        String[] revserd = new String[words.length];

        for (int i = 0; i < words.length; i++) {
            revserd[i] = reverseString(words[i]);
        }

        String result = String.join(" ", revserd);

        // zeige die Zeichenfolge an
        System.out.println(umkehren);
        System.out.println(result);

        return result;
    }

    public String reverseString() {
        String reversed = reverseString(umkehren);

        // gib die Zeichenfolge aus
        System.out.println(umkehren);
        System.out.println(reversed);

        if (umkehren.equals(reversed)) {
            System.out.println("Das ist ein Palindrom");
        } else {
            System.out.println("Das ist kein Palindrom");
        }

        return reversed;
    }

    public static String reverseString(String toReverse) {
        String reversed = new StringBuilder(toReverse).reverse().toString();
        return reversed;
    }
}