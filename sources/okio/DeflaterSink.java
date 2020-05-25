package okio;

import java.io.IOException;
import java.util.zip.Deflater;
import p2628d.p2639f.p2641b.C52711k;

public final class DeflaterSink implements Sink {
    private boolean closed;
    private final Deflater deflater;
    private final BufferedSink sink;

    public final Timeout timeout() {
        return this.sink.timeout();
    }

    public final void finishDeflate$jvm() {
        this.deflater.finish();
        deflate(false);
    }

    public final void flush() throws IOException {
        deflate(true);
        this.sink.flush();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeflaterSink(");
        sb.append(this.sink);
        sb.append(')');
        return sb.toString();
    }

    public final void close() throws IOException {
        if (!this.closed) {
            Throwable th = null;
            try {
                finishDeflate$jvm();
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.deflater.end();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            try {
                this.sink.close();
            } catch (Throwable th4) {
                if (th == null) {
                    th = th4;
                }
            }
            this.closed = true;
            if (th != null) {
                throw th;
            }
        }
    }

    private final void deflate(boolean z) {
        Segment writableSegment$jvm;
        int i;
        Buffer buffer = this.sink.buffer();
        while (true) {
            writableSegment$jvm = buffer.writableSegment$jvm(1);
            if (z) {
                i = this.deflater.deflate(writableSegment$jvm.data, writableSegment$jvm.limit, 8192 - writableSegment$jvm.limit, 2);
            } else {
                i = this.deflater.deflate(writableSegment$jvm.data, writableSegment$jvm.limit, 8192 - writableSegment$jvm.limit);
            }
            if (i > 0) {
                writableSegment$jvm.limit += i;
                buffer.setSize$jvm(buffer.size() + ((long) i));
                this.sink.emitCompleteSegments();
            } else if (this.deflater.needsInput()) {
                break;
            }
        }
        if (writableSegment$jvm.pos == writableSegment$jvm.limit) {
            buffer.head = writableSegment$jvm.pop();
            SegmentPool.recycle(writableSegment$jvm);
        }
    }

    public DeflaterSink(BufferedSink bufferedSink, Deflater deflater2) {
        C52711k.m112240b(bufferedSink, "sink");
        C52711k.m112240b(deflater2, "deflater");
        this.sink = bufferedSink;
        this.deflater = deflater2;
    }

    public DeflaterSink(Sink sink2, Deflater deflater2) {
        C52711k.m112240b(sink2, "sink");
        C52711k.m112240b(deflater2, "deflater");
        this(Okio.buffer(sink2), deflater2);
    }

    public final void write(Buffer buffer, long j) throws IOException {
        C52711k.m112240b(buffer, "source");
        Util.checkOffsetAndCount(buffer.size(), 0, j);
        while (j > 0) {
            Segment segment = buffer.head;
            if (segment == null) {
                C52711k.m112234a();
            }
            int min = (int) Math.min(j, (long) (segment.limit - segment.pos));
            this.deflater.setInput(segment.data, segment.pos, min);
            deflate(false);
            long j2 = (long) min;
            buffer.setSize$jvm(buffer.size() - j2);
            segment.pos += min;
            if (segment.pos == segment.limit) {
                buffer.head = segment.pop();
                SegmentPool.recycle(segment);
            }
            j -= j2;
        }
    }
}
