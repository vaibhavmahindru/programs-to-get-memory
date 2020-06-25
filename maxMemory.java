public class maxMemory {
    public static void main(String a[]) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("max memory: " + runtime.maxMemory() / 1024);
    }
}
/*
 * A program in java to get the maximum amount of memory (sandbox limit) for a
 * Java application.
 */