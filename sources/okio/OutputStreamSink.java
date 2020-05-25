package okio;

import java.io.OutputStream;
import p2628d.p2639f.p2641b.C52711k;

final class OutputStreamSink implements Sink {
    private final OutputStream out;
    private final Timeout timeout;

    public final Timeout timeout() {
        return this.timeout;
    }

    public final void close() {
        this.out.close();
    }

    public final void flush() {
        this.out.flush();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("sink(");
        sb.append(this.out);
        sb.append(')');
        return sb.toString();
    }

    public OutputStreamSink(OutputStream outputStream, Timeout timeout2) {
        C52711k.m112240b(outputStream, "out");
        C52711k.m112240b(timeout2, "timeout");
        this.out = outputStream;
        this.timeout = timeout2;
    }

    public final void write(Buffer buffer, long j) {
        C52711k.m112240b(buffer, "source");
        Util.checkOffsetAndCount(buffer.size(), 0, j);
        while (j > 0) {
            this.timeout.throwIfReached();
            Segment segment = buffer.head;
            if (segment == null) {
                C52711k.m112234a();
            }
            int min = (int) Math.min(j, (long) (segment.limit - segment.pos));
            this.out.write(segment.data, segment.pos, min);
            segment.pos += min;
            long j2 = (long) min;
            j -= j2;
            buffer.setSize$jvm(buffer.size() - j2);
            if (segment.pos == segment.limit) {
                buffer.head = segment.pop();
                SegmentPool.recycle(segment);
            }
        }
    }
}
