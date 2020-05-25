package okio;

import java.io.IOException;
import p2628d.p2639f.p2641b.C52711k;

public abstract class ForwardingSink implements Sink {
    private final Sink delegate;

    /* renamed from: -deprecated_delegate reason: not valid java name */
    public final Sink m114640deprecated_delegate() {
        return this.delegate;
    }

    public final Sink delegate() {
        return this.delegate;
    }

    public void close() throws IOException {
        this.delegate.close();
    }

    public void flush() throws IOException {
        this.delegate.flush();
    }

    public Timeout timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('(');
        sb.append(this.delegate);
        sb.append(')');
        return sb.toString();
    }

    public ForwardingSink(Sink sink) {
        C52711k.m112240b(sink, "delegate");
        this.delegate = sink;
    }

    public void write(Buffer buffer, long j) throws IOException {
        C52711k.m112240b(buffer, "source");
        this.delegate.write(buffer, j);
    }
}
