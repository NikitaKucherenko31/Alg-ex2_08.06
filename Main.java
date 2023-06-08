public class Main {
    public static void main(String[] args) {
        String str = "i love VSUET";
        String[] voc = {"a", "o", "e", "y", "i"};
        for (int i = 0; i < voc.length; i++)
            if (str.contains(voc[i])) {
                System.out.println(str.replace(voc[i], ""));
            }
    }
}