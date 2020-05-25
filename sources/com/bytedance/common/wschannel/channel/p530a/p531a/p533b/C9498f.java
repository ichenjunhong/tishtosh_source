package com.bytedance.common.wschannel.channel.p530a.p531a.p533b;

import java.io.IOException;
import java.util.Random;
import okio.Buffer;
import okio.Buffer.UnsafeCursor;
import okio.BufferedSink;
import okio.ByteString;
import okio.Sink;
import okio.Timeout;

/* renamed from: com.bytedance.common.wschannel.channel.a.a.b.f */
final class C9498f {

    /* renamed from: a */
    final boolean f25865a;

    /* renamed from: b */
    final Random f25866b;

    /* renamed from: c */
    final BufferedSink f25867c;

    /* renamed from: d */
    final Buffer f25868d;

    /* renamed from: e */
    boolean f25869e;

    /* renamed from: f */
    final Buffer f25870f = new Buffer();

    /* renamed from: g */
    final C9499a f25871g = new C9499a();

    /* renamed from: h */
    boolean f25872h;

    /* renamed from: i */
    private final byte[] f25873i;

    /* renamed from: j */
    private final UnsafeCursor f25874j;

    /* renamed from: com.bytedance.common.wschannel.channel.a.a.b.f$a */
    final class C9499a implements Sink {

        /* renamed from: a */
        int f25875a;

        /* renamed from: b */
        long f25876b;

        /* renamed from: c */
        boolean f25877c;

        /* renamed from: d */
        boolean f25878d;

        public final Timeout timeout() {
            return C9498f.this.f25867c.timeout();
        }

        public final void close() throws IOException {
            if (!this.f25878d) {
                C9498f.this.mo17221a(this.f25875a, C9498f.this.f25870f.size(), this.f25877c, true);
                this.f25878d = true;
                C9498f.this.f25872h = false;
                return;
            }
            throw new IOException("closed");
        }

        public final void flush() throws IOException {
            if (!this.f25878d) {
                C9498f.this.mo17221a(this.f25875a, C9498f.this.f25870f.size(), this.f25877c, false);
                this.f25877c = false;
                return;
            }
            throw new IOException("closed");
        }

        C9499a() {
        }

        public final void write(Buffer buffer, long j) throws IOException {
            boolean z;
            if (!this.f25878d) {
                C9498f.this.f25870f.write(buffer, j);
                if (!this.f25877c || this.f25876b == -1 || C9498f.this.f25870f.size() <= this.f25876b - 8192) {
                    z = false;
                } else {
                    z = true;
                }
                long completeSegmentByteCount = C9498f.this.f25870f.completeSegmentByteCount();
                if (completeSegmentByteCount > 0 && !z) {
                    C9498f.this.mo17221a(this.f25875a, completeSegmentByteCount, this.f25877c, false);
                    this.f25877c = false;
                    return;
                }
                return;
            }
            throw new IOException("closed");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo17222a(int i, ByteString byteString) throws IOException {
        if (!this.f25869e) {
            int size = byteString.size();
            if (((long) size) <= 125) {
                this.f25868d.writeByte(i | 128);
                if (this.f25865a) {
                    this.f25868d.writeByte(size | 128);
                    this.f25866b.nextBytes(this.f25873i);
                    this.f25868d.write(this.f25873i);
                    if (size > 0) {
                        long size2 = this.f25868d.size();
                        this.f25868d.write(byteString);
                        this.f25868d.readAndWriteUnsafe(this.f25874j);
                        this.f25874j.seek(size2);
                        C9495d.m18843a(this.f25874j, this.f25873i);
                        this.f25874j.close();
                    }
                } else {
                    this.f25868d.writeByte(size);
                    this.f25868d.write(byteString);
                }
                this.f25867c.flush();
                return;
            }
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        throw new IOException("closed");
    }

    C9498f(boolean z, BufferedSink bufferedSink, Random random) {
        byte[] bArr;
        if (bufferedSink == null) {
            throw new NullPointerException("sink == null");
        } else if (random != null) {
            this.f25865a = z;
            this.f25867c = bufferedSink;
            this.f25868d = bufferedSink.buffer();
            this.f25866b = random;
            UnsafeCursor unsafeCursor = null;
            if (z) {
                bArr = new byte[4];
            } else {
                bArr = null;
            }
            this.f25873i = bArr;
            if (z) {
                unsafeCursor = new UnsafeCursor();
            }
            this.f25874j = unsafeCursor;
        } else {
            throw new NullPointerException("random == null");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo17221a(int i, long j, boolean z, boolean z2) throws IOException {
        if (!this.f25869e) {
            int i2 = 0;
            if (!z) {
                i = 0;
            }
            if (z2) {
                i |= 128;
            }
            this.f25868d.writeByte(i);
            if (this.f25865a) {
                i2 = 128;
            }
            if (j <= 125) {
                this.f25868d.writeByte(((int) j) | i2);
            } else if (j <= 65535) {
                this.f25868d.writeByte(i2 | 126);
                this.f25868d.writeShort((int) j);
            } else {
                this.f25868d.writeByte(i2 | 127);
                this.f25868d.writeLong(j);
            }
            if (this.f25865a) {
                this.f25866b.nextBytes(this.f25873i);
                this.f25868d.write(this.f25873i);
                if (j > 0) {
                    long size = this.f25868d.size();
                    this.f25868d.write(this.f25870f, j);
                    this.f25868d.readAndWriteUnsafe(this.f25874j);
                    this.f25874j.seek(size);
                    C9495d.m18843a(this.f25874j, this.f25873i);
                    this.f25874j.close();
                }
            } else {
                this.f25868d.write(this.f25870f, j);
            }
            this.f25867c.emit();
            return;
        }
        throw new IOException("closed");
    }
}
