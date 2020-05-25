package okio;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import p2628d.p2639f.p2641b.C52711k;

public final class InflaterSource implements Source {
    private int bufferBytesHeldByInflater;
    private boolean closed;
    private final Inflater inflater;
    private final BufferedSource source;

    public final Timeout timeout() {
        return this.source.timeout();
    }

    private final void releaseInflatedBytes() {
        if (this.bufferBytesHeldByInflater != 0) {
            int remaining = this.bufferBytesHeldByInflater - this.inflater.getRemaining();
            this.bufferBytesHeldByInflater -= remaining;
            this.source.skip((long) remaining);
        }
    }

    public final void close() throws IOException {
        if (!this.closed) {
            this.inflater.end();
            this.closed = true;
            this.source.close();
        }
    }

    public final boolean refill() throws IOException {
        boolean z;
        if (!this.inflater.needsInput()) {
            return false;
        }
        releaseInflatedBytes();
        if (this.inflater.getRemaining() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalStateException("?".toString());
        } else if (this.source.exhausted()) {
            return true;
        } else {
            Segment segment = this.source.buffer().head;
            if (segment == null) {
                C52711k.m112234a();
            }
            this.bufferBytesHeldByInflater = segment.limit - segment.pos;
            this.inflater.setInput(segment.data, segment.pos, this.bufferBytesHeldByInflater);
            return false;
        }
    }

    public InflaterSource(BufferedSource bufferedSource, Inflater inflater2) {
        C52711k.m112240b(bufferedSource, "source");
        C52711k.m112240b(inflater2, "inflater");
        this.source = bufferedSource;
        this.inflater = inflater2;
    }

    public InflaterSource(Source source2, Inflater inflater2) {
        C52711k.m112240b(source2, "source");
        C52711k.m112240b(inflater2, "inflater");
        this(Okio.buffer(source2), inflater2);
    }

    public final long read(Buffer buffer, long j) throws IOException {
        boolean z;
        Segment writableSegment$jvm;
        C52711k.m112240b(buffer, "sink");
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            StringBuilder sb = new StringBuilder("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString().toString());
        } else if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        } else if (j == 0) {
            return 0;
        } else {
            while (true) {
                boolean refill = refill();
                try {
                    writableSegment$jvm = buffer.writableSegment$jvm(1);
                    int inflate = this.inflater.inflate(writableSegment$jvm.data, writableSegment$jvm.limit, (int) Math.min(j, (long) (8192 - writableSegment$jvm.limit)));
                    if (inflate > 0) {
                        writableSegment$jvm.limit += inflate;
                        long j2 = (long) inflate;
                        buffer.setSize$jvm(buffer.size() + j2);
                        return j2;
                    } else if (this.inflater.finished()) {
                        break;
                    } else if (this.inflater.needsDictionary()) {
                        break;
                    } else if (refill) {
                        throw new EOFException("source exhausted prematurely");
                    }
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            }
            releaseInflatedBytes();
            if (writableSegment$jvm.pos == writableSegment$jvm.limit) {
                buffer.head = writableSegment$jvm.pop();
                SegmentPool.recycle(writableSegment$jvm);
            }
            return -1;
        }
    }
}
