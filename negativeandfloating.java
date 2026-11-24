public class negativeandfloating {
    public static void main(String[] args) {
        int i = -333333334;
        System.out.println(i);
        float a = 0.7f;
        System.out.println(a);
        System.out.printf("%.20f%n", a);
        // the vlaue that stores in the memory is actually given by the printf function
        // in java the concept of the 2's complement are used
        // and for taking the only condition of the invaladation of the -0 comdition
    }
}
