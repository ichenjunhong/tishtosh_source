package okio;

import com.C2240a;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import p2628d.p2639f.p2641b.C52711k;

public final class GzipSource implements Source {
    private final CRC32 crc = new CRC32();
    private final Inflater inflater = new Inflater(true);
    private final InflaterSource inflaterSource = new InflaterSource((BufferedSource) this.source, this.inflater);
    private byte section;
    private final RealBufferedSource source;

    public final void close() throws IOException {
        this.inflaterSource.close();
    }

    public final Timeout timeout() {
        return this.source.timeout();
    }

    private final void consumeTrailer() throws IOException {
        checkEqual("CRC", this.source.readIntLe(), (int) this.crc.getValue());
        checkEqual("ISIZE", this.source.readIntLe(), (int) this.inflater.getBytesWritten());
    }

    private final void consumeHeader() throws IOException {
        boolean z;
        boolean z2;
        boolean z3;
        this.source.require(10);
        byte b = this.source.buffer().getByte(3);
        boolean z4 = true;
        if (((b >> 1) & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            updateCrc(this.source.buffer(), 0, 10);
        }
        checkEqual("ID1ID2", 8075, this.source.readShort());
        this.source.skip(8);
        if (((b >> 2) & 1) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            this.source.require(2);
            if (z) {
                updateCrc(this.source.buffer(), 0, 2);
            }
            long readShortLe = (long) this.source.buffer().readShortLe();
            this.source.require(readShortLe);
            if (z) {
                updateCrc(this.source.buffer(), 0, readShortLe);
            }
            this.source.skip(readShortLe);
        }
        if (((b >> 3) & 1) == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            long indexOf = this.source.indexOf(0);
            if (indexOf != -1) {
                if (z) {
                    updateCrc(this.source.buffer(), 0, indexOf + 1);
                }
                this.source.skip(indexOf + 1);
            } else {
                throw new EOFException();
            }
        }
        if (((b >> 4) & 1) != 1) {
            z4 = false;
        }
        if (z4) {
            long indexOf2 = this.source.indexOf(0);
            if (indexOf2 != -1) {
                if (z) {
                    updateCrc(this.source.buffer(), 0, indexOf2 + 1);
                }
                this.source.skip(indexOf2 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (z) {
            checkEqual("FHCRC", this.source.readShortLe(), (short) ((int) this.crc.getValue()));
            this.crc.reset();
        }
    }

    public GzipSource(Source source2) {
        C52711k.m112240b(source2, "source");
        this.source = new RealBufferedSource(source2);
    }

    public final long read(Buffer buffer, long j) throws IOException {
        boolean z;
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
        } else if (j == 0) {
            return 0;
        } else {
            if (this.section == 0) {
                consumeHeader();
                this.section = 1;
            }
            if (this.section == 1) {
                long size = buffer.size();
                long read = this.inflaterSource.read(buffer, j);
                if (read != -1) {
                    updateCrc(buffer, size, read);
                    return read;
                }
                this.section = 2;
            }
            if (this.section == 2) {
                consumeTrailer();
                this.section = 3;
                if (!this.source.exhausted()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }

    private final void checkEqual(String str, int i, int i2) {
        if (i2 != i) {
            Object[] objArr = {str, Integer.valueOf(i2), Integer.valueOf(i)};
            String a = C2240a.m6772a("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(objArr, 3));
            C52711k.m112236a((Object) a, "java.lang.String.format(this, *args)");
            throw new IOException(a);
        }
    }

    private final void updateCrc(Buffer buffer, long j, long j2) {
        Segment segment = buffer.head;
        if (segment == null) {
            C52711k.m112234a();
        }
        while (j >= ((long) (segment.limit - segment.pos))) {
            j -= (long) (segment.limit - segment.pos);
            segment = segment.next;
            if (segment == null) {
                C52711k.m112234a();
            }
        }
        while (j2 > 0) {
            int i = (int) (((long) segment.pos) + j);
            int min = (int) Math.min((long) (segment.limit - i), j2);
            this.crc.update(segment.data, i, min);
            j2 -= (long) min;
            segment = segment.next;
            if (segment == null) {
                C52711k.m112234a();
            }
            j = 0;
        }
    }
}
