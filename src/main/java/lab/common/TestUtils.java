package lab.common;

import lombok.Cleanup;
import lombok.SneakyThrows;
import lombok.val;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public interface TestUtils {

    String LINE_SEPARATOR =
            System.getProperty("line.separator");

    @SneakyThrows
    static String fromSystemOut(Runnable task) {

        PrintStream realOut = System.out;

        val out = new ByteArrayOutputStream();
        @Cleanup val printStream = new PrintStream(out);

        System.setOut(printStream);
        task.run();
        System.setOut(realOut);

        return new String(out.toByteArray());
    }

    static String fromSystemOutPrintln(Runnable task) {
        String out = fromSystemOut(task);
        return out.endsWith(LINE_SEPARATOR) ?
                out.substring(0, out.length() - LINE_SEPARATOR.length()) :
                out;
    }
}
