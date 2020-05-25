package okio;

import p2628d.p2639f.p2641b.C52711k;

final class BlackholeSink implements Sink {
    public final void close() {
    }

    public final void flush() {
    }

    public final Timeout timeout() {
        return Timeout.NONE;
    }

    public final void write(Buffer buffer, long j) {
        C52711k.m112240b(buffer, "source");
        buffer.skip(j);
    }
}
