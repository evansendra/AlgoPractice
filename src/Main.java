import sorts.BogoSort;

public class Main {

    public static void main(String[] args) {
        try {
            BogoSort.sort(new int[]{72, 63, -112, 0, 53, 48, 71, 23});
        } catch (StackOverflowError e) {
            System.out.println("====== Oops ran out of memory ======");
        }
    }

}
