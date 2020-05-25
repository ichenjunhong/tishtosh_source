package okio;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import p2628d.p2639f.p2641b.C52711k;

public final class GzipSink implements Sink {
    private boolean closed;
    private final CRC32 crc = new CRC32();
    private final Deflater deflater = new Deflater(-1, true);
    private final DeflaterSink deflaterSink = new DeflaterSink((BufferedSink) this.sink, this.deflater);
    private final RealBufferedSink sink;

    /* renamed from: -deprecated_deflater reason: not valid java name */
    public final Deflater m114642deprecated_deflater() {
        return this.deflater;
    }

    public final Deflater deflater() {
        return this.deflater;
    }

    public final void flush() throws IOException {
        this.deflaterSink.flush();
    }

    public final Timeout timeout() {
        return this.sink.timeout();
    }

    private final void writeFooter() {
        this.sink.writeIntLe((int) this.crc.getValue());
        this.sink.writeIntLe((int) this.deflater.getBytesRead());
    }

    public final void close() throws IOException {
        if (!this.closed) {
            Throwable th = null;
            try {
                this.deflaterSink.finishDeflate$jvm();
                writeFooter();
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

    public GzipSink(Sink sink2) {
        C52711k.m112240b(sink2, "sink");
        this.sink = new RealBufferedSink(sink2);
        Buffer buffer = this.sink.buffer();
        buffer.writeShort(8075);
        buffer.writeByte(8);
        buffer.writeByte(0);
        buffer.writeInt(0);
        buffer.writeByte(0);
        buffer.writeByte(0);
    }

    private final void updateCrc(Buffer buffer, long j) {
        Segment segment = buffer.head;
        if (segment == null) {
            C52711k.m112234a();
        }
        while (j > 0) {
            int min = (int) Math.min(j, (long) (segment.limit - segment.pos));
            this.crc.update(segment.data, segment.pos, min);
            j -= (long) min;
            segment = segment.next;
            if (segment == null) {
                C52711k.m112234a();
            }
        }
    }

    public final void write(Buffer buffer, long j) throws IOException {
        boolean z;
        C52711k.m112240b(buffer, "source");
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            StringBuilder sb = new StringBuilder("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString().toString());
        } else if (j != 0) {
            updateCrc(buffer, j);
            this.deflaterSink.write(buffer, j);
        }
    }
}
