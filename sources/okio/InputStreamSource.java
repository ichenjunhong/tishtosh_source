package okio;

import java.io.IOException;
import java.io.InputStream;
import p2628d.p2639f.p2641b.C52711k;

final class InputStreamSource implements Source {
    private final InputStream input;
    private final Timeout timeout;

    public final Timeout timeout() {
        return this.timeout;
    }

    public final void close() {
        this.input.close();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source(");
        sb.append(this.input);
        sb.append(')');
        return sb.toString();
    }

    public InputStreamSource(InputStream inputStream, Timeout timeout2) {
        C52711k.m112240b(inputStream, "input");
        C52711k.m112240b(timeout2, "timeout");
        this.input = inputStream;
        this.timeout = timeout2;
    }

    public final long read(Buffer buffer, long j) {
        boolean z;
        C52711k.m112240b(buffer, "sink");
        if (j == 0) {
            return 0;
        }
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            try {
                this.timeout.throwIfReached();
                Segment writableSegment$jvm = buffer.writableSegment$jvm(1);
                int read = this.input.read(writableSegment$jvm.data, writableSegment$jvm.limit, (int) Math.min(j, (long) (8192 - writableSegment$jvm.limit)));
                if (read == -1) {
                    return -1;
                }
                writableSegment$jvm.limit += read;
                long j2 = (long) read;
                buffer.setSize$jvm(buffer.size() + j2);
                return j2;
            } catch (AssertionError e) {
                if (Okio.isAndroidGetsocknameError(e)) {
                    throw new IOException(e);
                }
                throw e;
            }
        } else {
            StringBuilder sb = new StringBuilder("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString().toString());
        }
    }
}
