package okhttp3.internal.p2691i;

import java.io.IOException;
import java.util.Random;
import okio.Buffer;
import okio.Buffer.UnsafeCursor;
import okio.BufferedSink;
import okio.ByteString;
import okio.Sink;
import okio.Timeout;

/* renamed from: okhttp3.internal.i.d */
final class C53651d {

    /* renamed from: a */
    final boolean f133059a;

    /* renamed from: b */
    final Random f133060b;

    /* renamed from: c */
    final BufferedSink f133061c;

    /* renamed from: d */
    final Buffer f133062d;

    /* renamed from: e */
    boolean f133063e;

    /* renamed from: f */
    final Buffer f133064f = new Buffer();

    /* renamed from: g */
    final C53652a f133065g = new C53652a();

    /* renamed from: h */
    boolean f133066h;

    /* renamed from: i */
    private final byte[] f133067i;

    /* renamed from: j */
    private final UnsafeCursor f133068j;

    /* renamed from: okhttp3.internal.i.d$a */
    final class C53652a implements Sink {

        /* renamed from: a */
        int f133069a;

        /* renamed from: b */
        long f133070b;

        /* renamed from: c */
        boolean f133071c;

        /* renamed from: d */
        boolean f133072d;

        public final Timeout timeout() {
            return C53651d.this.f133061c.timeout();
        }

        public final void close() throws IOException {
            if (!this.f133072d) {
                C53651d.this.mo111548a(this.f133069a, C53651d.this.f133064f.size(), this.f133071c, true);
                this.f133072d = true;
                C53651d.this.f133066h = false;
                return;
            }
            throw new IOException("closed");
        }

        public final void flush() throws IOException {
            if (!this.f133072d) {
                C53651d.this.mo111548a(this.f133069a, C53651d.this.f133064f.size(), this.f133071c, false);
                this.f133071c = false;
                return;
            }
            throw new IOException("closed");
        }

        C53652a() {
        }

        public final void write(Buffer buffer, long j) throws IOException {
            boolean z;
            if (!this.f133072d) {
                C53651d.this.f133064f.write(buffer, j);
                if (!this.f133071c || this.f133070b == -1 || C53651d.this.f133064f.size() <= this.f133070b - 8192) {
                    z = false;
                } else {
                    z = true;
                }
                long completeSegmentByteCount = C53651d.this.f133064f.completeSegmentByteCount();
                if (completeSegmentByteCount > 0 && !z) {
                    C53651d.this.mo111548a(this.f133069a, completeSegmentByteCount, this.f133071c, false);
                    this.f133071c = false;
                    return;
                }
                return;
            }
            throw new IOException("closed");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo111549a(int i, ByteString byteString) throws IOException {
        if (!this.f133063e) {
            int size = byteString.size();
            if (((long) size) <= 125) {
                this.f133062d.writeByte(i | 128);
                if (this.f133059a) {
                    this.f133062d.writeByte(size | 128);
                    this.f133060b.nextBytes(this.f133067i);
                    this.f133062d.write(this.f133067i);
                    if (size > 0) {
                        long size2 = this.f133062d.size();
                        this.f133062d.write(byteString);
                        this.f133062d.readAndWriteUnsafe(this.f133068j);
                        this.f133068j.seek(size2);
                        C53648b.m114092a(this.f133068j, this.f133067i);
                        this.f133068j.close();
                    }
                } else {
                    this.f133062d.writeByte(size);
                    this.f133062d.write(byteString);
                }
                this.f133061c.flush();
                return;
            }
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        throw new IOException("closed");
    }

    C53651d(boolean z, BufferedSink bufferedSink, Random random) {
        byte[] bArr;
        if (bufferedSink == null) {
            throw new NullPointerException("sink == null");
        } else if (random != null) {
            this.f133059a = z;
            this.f133061c = bufferedSink;
            this.f133062d = bufferedSink.buffer();
            this.f133060b = random;
            UnsafeCursor unsafeCursor = null;
            if (z) {
                bArr = new byte[4];
            } else {
                bArr = null;
            }
            this.f133067i = bArr;
            if (z) {
                unsafeCursor = new UnsafeCursor();
            }
            this.f133068j = unsafeCursor;
        } else {
            throw new NullPointerException("random == null");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo111548a(int i, long j, boolean z, boolean z2) throws IOException {
        if (!this.f133063e) {
            int i2 = 0;
            if (!z) {
                i = 0;
            }
            if (z2) {
                i |= 128;
            }
            this.f133062d.writeByte(i);
            if (this.f133059a) {
                i2 = 128;
            }
            if (j <= 125) {
                this.f133062d.writeByte(((int) j) | i2);
            } else if (j <= 65535) {
                this.f133062d.writeByte(i2 | 126);
                this.f133062d.writeShort((int) j);
            } else {
                this.f133062d.writeByte(i2 | 127);
                this.f133062d.writeLong(j);
            }
            if (this.f133059a) {
                this.f133060b.nextBytes(this.f133067i);
                this.f133062d.write(this.f133067i);
                if (j > 0) {
                    long size = this.f133062d.size();
                    this.f133062d.write(this.f133064f, j);
                    this.f133062d.readAndWriteUnsafe(this.f133068j);
                    this.f133068j.seek(size);
                    C53648b.m114092a(this.f133068j, this.f133067i);
                    this.f133068j.close();
                }
            } else {
                this.f133062d.write(this.f133064f, j);
            }
            this.f133061c.emit();
            return;
        }
        throw new IOException("closed");
    }
}
