public class PrimitiveMemoryBenchmark {

    private static final int ITERATIONS = 50_000_000;

    public static void main(String[] args) {
        benchmarkByte();
        benchmarkShort();
        benchmarkInt();
        benchmarkLong();
        benchmarkFloat();
        benchmarkDouble();
        benchmarkChar();
        benchmarkBoolean();
    }

    private static void benchmarkByte() {
        byte value = 1;
        long start = System.nanoTime();
        byte sum = 0;
        for (int i = 0; i < ITERATIONS; i++) {
            sum += value;
        }
        long end = System.nanoTime();
        printResult("byte", sum, end - start, Byte.BYTES);
    }

    private static void benchmarkShort() {
        short value = 1;
        long start = System.nanoTime();
        short sum = 0;
        for (int i = 0; i < ITERATIONS; i++) {
            sum += value;
        }
        long end = System.nanoTime();
        printResult("short", sum, end - start, Short.BYTES);
    }

    private static void benchmarkInt() {
        int value = 1;
        long start = System.nanoTime();
        int sum = 0;
        for (int i = 0; i < ITERATIONS; i++) {
            sum += value;
        }
        long end = System.nanoTime();
        printResult("int", sum, end - start, Integer.BYTES);
    }

    private static void benchmarkLong() {
        long value = 1L;
        long start = System.nanoTime();
        long sum = 0;
        for (int i = 0; i < ITERATIONS; i++) {
            sum += value;
        }
        long end = System.nanoTime();
        printResult("long", sum, end - start, Long.BYTES);
    }

    private static void benchmarkFloat() {
        float value = 1.0f;
        long start = System.nanoTime();
        float sum = 0;
        for (int i = 0; i < ITERATIONS; i++) {
            sum += value;
        }
        long end = System.nanoTime();
        printResult("float", sum, end - start, Float.BYTES);
    }

    private static void benchmarkDouble() {
        double value = 1.0;
        long start = System.nanoTime();
        double sum = 0;
        for (int i = 0; i < ITERATIONS; i++) {
            sum += value;
        }
        long end = System.nanoTime();
        printResult("double", sum, end - start, Double.BYTES);
    }

    private static void benchmarkChar() {
        char value = 'A';
        long start = System.nanoTime();
        char sum = 0;
        for (int i = 0; i < ITERATIONS; i++) {
            sum += value;
        }
        long end = System.nanoTime();
        printResult("char", (int) sum, end - start, Character.BYTES);
    }

    private static void benchmarkBoolean() {
        boolean value = true;
        long start = System.nanoTime();
        boolean result = false;
        for (int i = 0; i < ITERATIONS; i++) {
            result ^= value;
        }
        long end = System.nanoTime();
        printResult("boolean", result ? 1 : 0, end - start, 1); // JVM stores boolean as 1 byte
    }

    private static void printResult(String type, Object sum, long nanos, int bytes) {
        double ms = nanos / 1_000_000.0;
        System.out.printf("%-8s | Size: %d bytes | Time: %.3f ms | Final Value: %s%n",
                type, bytes, ms, sum);
    }
}
