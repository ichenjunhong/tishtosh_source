package okio;

import java.io.IOException;
import p2628d.p2639f.p2641b.C52711k;

public abstract class ForwardingSource implements Source {
    private final Source delegate;

    /* renamed from: -deprecated_delegate reason: not valid java name */
    public final Source m114641deprecated_delegate() {
        return this.delegate;
    }

    public final Source delegate() {
        return this.delegate;
    }

    public void close() throws IOException {
        this.delegate.close();
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

    public ForwardingSource(Source source) {
        C52711k.m112240b(source, "delegate");
        this.delegate = source;
    }

    public long read(Buffer buffer, long j) throws IOException {
        C52711k.m112240b(buffer, "sink");
        return this.delegate.read(buffer, j);
    }
}
