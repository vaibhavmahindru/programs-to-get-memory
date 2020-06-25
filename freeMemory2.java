
public class freeMemory2 {
    public static void main(String a[]) {
        Runtime runtime = Runtime.getRuntime();
        long maxMemory = runtime.maxMemory();
        long allocatedMemory = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();
        System.out.println("free memory: " + freeMemory / 1024);
        System.out.println("allocated memory: " + allocatedMemory / 1024);
        System.out.println("max memory: " + maxMemory / 1024);
        System.out.println("total free memory: " + (freeMemory + (maxMemory - allocatedMemory)) / 1024);
    }

}

/** a program in java to compute the free memory that your application */