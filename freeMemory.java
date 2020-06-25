public class freeMemory {
    public static void main(String a[]) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("free memory: " + runtime.freeMemory() / 1024);
    }

}

/** a program in java to check the memory being used by a java application */