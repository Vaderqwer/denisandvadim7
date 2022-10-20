public class Main {
    public static void main(String[] args) {
        int[] n1 = new int[20];
        for (int n3 = 0; n3 < 20; n3++) {
            n1[n3] = (int) (Math.random() * (100) + 0);
            System.out.println((n3 + 1) + ")" + n1[n3]);
        }
        for (int n2 = 0; n2 < 20; n2++) {
            if (n1[n2] % 2 != 0) {
                System.out.println(n1[n2] + " Нечетное");
            } else
                System.out.println(n1[n2] + " Четное");
        }
    }
}