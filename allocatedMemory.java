public class allocatedMemory {
    public static void main(String a[]) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("allocated memory: " + runtime.totalMemory() / 1024);
    }

}

/*
 * Aprogram in java to check the allocated memory by JVM for a java application
 */