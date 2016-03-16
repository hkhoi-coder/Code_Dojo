package misc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 *
 * @author hkhoi
 */
public class QuickIO {

    public final PrintWriter out;
    private final BufferedReader in;
    private StringTokenizer tokenizer;
    private final String delimiter;

    public QuickIO(InputStream inputStream, OutputStream outputStream, String delimiter) {
        in = new BufferedReader(new InputStreamReader(inputStream));
        out = new PrintWriter(outputStream);
        this.delimiter = delimiter;
    }

    public String next() throws IOException {
        try {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                tokenizer = new StringTokenizer(in.readLine(), delimiter);
            }
            return tokenizer.nextToken();
        } catch (NullPointerException e) {
            return null;
        }
    }

    public String nextLine() throws IOException {
        try {
            String line = in.readLine();
            while (line.isEmpty()) {
                line = in.readLine();
            }
            return line;
        } catch (NullPointerException e) {
            return null;
        }
    }

    public int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    public long nextLong() throws IOException {
        return Integer.parseInt(next());
    }

    public float nextFloat() throws IOException {
        return Float.parseFloat(next());
    }

    public double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }
}
