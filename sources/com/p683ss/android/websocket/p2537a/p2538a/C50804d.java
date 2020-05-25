package com.p683ss.android.websocket.p2537a.p2538a;

import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.io.IOException;
import java.util.Random;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Sink;
import okio.Timeout;

/* renamed from: com.ss.android.websocket.a.a.d */
public final class C50804d {

    /* renamed from: e */
    static final /* synthetic */ boolean f127642e = (!C50804d.class.desiredAssertionStatus());

    /* renamed from: a */
    public final BufferedSink f127643a;

    /* renamed from: b */
    public final Buffer f127644b = new Buffer();

    /* renamed from: c */
    final C50806a f127645c;

    /* renamed from: d */
    public boolean f127646d;

    /* renamed from: f */
    private final boolean f127647f;

    /* renamed from: g */
    private final Random f127648g;

    /* renamed from: h */
    private boolean f127649h;

    /* renamed from: i */
    private final byte[] f127650i;

    /* renamed from: j */
    private final byte[] f127651j;

    /* renamed from: com.ss.android.websocket.a.a.d$a */
    final class C50806a implements Sink {

        /* renamed from: a */
        public int f127652a;

        /* renamed from: b */
        public long f127653b;

        /* renamed from: c */
        public boolean f127654c;

        /* renamed from: d */
        public boolean f127655d;

        public final Timeout timeout() {
            return C50804d.this.f127643a.timeout();
        }

        public final void close() throws IOException {
            if (!this.f127655d) {
                synchronized (C50804d.this) {
                    C50804d.this.mo99507a(this.f127652a, C50804d.this.f127644b.size(), this.f127654c, true);
                }
                this.f127655d = true;
                C50804d.this.f127646d = false;
                return;
            }
            throw new IOException("closed");
        }

        public final void flush() throws IOException {
            if (!this.f127655d) {
                synchronized (C50804d.this) {
                    C50804d.this.mo99507a(this.f127652a, C50804d.this.f127644b.size(), this.f127654c, false);
                }
                this.f127654c = false;
                return;
            }
            throw new IOException("closed");
        }

        private C50806a() {
        }

        public final void write(Buffer buffer, long j) throws IOException {
            boolean z;
            if (!this.f127655d) {
                C50804d.this.f127644b.write(buffer, j);
                if (!this.f127654c || this.f127653b == -1 || C50804d.this.f127644b.size() <= this.f127653b - 8192) {
                    z = false;
                } else {
                    z = true;
                }
                long completeSegmentByteCount = C50804d.this.f127644b.completeSegmentByteCount();
                if (completeSegmentByteCount > 0 && !z) {
                    synchronized (C50804d.this) {
                        C50804d.this.mo99507a(this.f127652a, completeSegmentByteCount, this.f127654c, false);
                    }
                    this.f127654c = false;
                    return;
                }
                return;
            }
            throw new IOException("closed");
        }
    }

    /* renamed from: a */
    public final void mo99509a(Buffer buffer) throws IOException {
        synchronized (this) {
            m109944a(9, buffer);
        }
    }

    /* renamed from: b */
    public final void mo99510b(Buffer buffer) throws IOException {
        synchronized (this) {
            m109944a(10, buffer);
        }
    }

    /* renamed from: a */
    public final void mo99508a(int i, String str) throws IOException {
        Buffer buffer;
        if (i == 0 && str == null) {
            buffer = null;
        } else {
            if (i != 0) {
                C50799b.m109935a(i, true);
            }
            Buffer buffer2 = new Buffer();
            buffer2.writeShort(i);
            if (str != null) {
                buffer2.writeUtf8(str);
            }
            buffer = buffer2;
        }
        synchronized (this) {
            m109944a(8, buffer);
            this.f127649h = true;
        }
    }

    /* renamed from: a */
    private void m109944a(int i, Buffer buffer) throws IOException {
        if (!f127642e && !Thread.holdsLock(this)) {
            throw new AssertionError();
        } else if (!this.f127649h) {
            int i2 = 0;
            if (buffer != null) {
                i2 = (int) buffer.size();
                if (((long) i2) > 125) {
                    throw new IllegalArgumentException("Payload size must be less than or equal to 125");
                }
            }
            this.f127643a.writeByte(i | 128);
            if (this.f127647f) {
                this.f127643a.writeByte(i2 | 128);
                this.f127648g.nextBytes(this.f127650i);
                this.f127643a.write(this.f127650i);
                if (buffer != null) {
                    m109945a((BufferedSource) buffer, (long) i2);
                }
            } else {
                this.f127643a.writeByte(i2);
                if (buffer != null) {
                    this.f127643a.writeAll(buffer);
                }
            }
            this.f127643a.emit();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: a */
    private void m109945a(BufferedSource bufferedSource, long j) throws IOException {
        if (f127642e || Thread.holdsLock(this)) {
            long j2 = 0;
            while (j2 < j) {
                int read = bufferedSource.read(this.f127651j, 0, (int) Math.min(j, (long) this.f127651j.length));
                if (read != -1) {
                    long j3 = (long) read;
                    C50799b.m109936a(this.f127651j, j3, this.f127650i, j2);
                    this.f127643a.write(this.f127651j, 0, read);
                    j2 += j3;
                } else {
                    throw new AssertionError();
                }
            }
            return;
        }
        throw new AssertionError();
    }

    public C50804d(boolean z, BufferedSink bufferedSink, Random random) {
        byte[] bArr;
        byte[] bArr2 = null;
        this.f127645c = new C50806a();
        if (bufferedSink == null) {
            throw new NullPointerException("sink == null");
        } else if (random != null) {
            this.f127647f = z;
            this.f127643a = bufferedSink;
            this.f127648g = random;
            if (z) {
                bArr = new byte[4];
            } else {
                bArr = null;
            }
            this.f127650i = bArr;
            if (z) {
                bArr2 = new byte[VideoCacheReadBuffersizeExperiment.DEFAULT];
            }
            this.f127651j = bArr2;
        } else {
            throw new NullPointerException("random == null");
        }
    }

    /* renamed from: a */
    public final void mo99507a(int i, long j, boolean z, boolean z2) throws IOException {
        if (!f127642e && !Thread.holdsLock(this)) {
            throw new AssertionError();
        } else if (!this.f127649h) {
            int i2 = 0;
            if (!z) {
                i = 0;
            }
            if (z2) {
                i |= 128;
            }
            this.f127643a.writeByte(i);
            if (this.f127647f) {
                this.f127648g.nextBytes(this.f127650i);
                i2 = 128;
            }
            if (j <= 125) {
                this.f127643a.writeByte(((int) j) | i2);
            } else if (j <= 65535) {
                this.f127643a.writeByte(i2 | 126);
                this.f127643a.writeShort((int) j);
            } else {
                this.f127643a.writeByte(i2 | 127);
                this.f127643a.writeLong(j);
            }
            if (this.f127647f) {
                this.f127643a.write(this.f127650i);
                m109945a((BufferedSource) this.f127644b, j);
            } else {
                this.f127643a.write(this.f127644b, j);
            }
            this.f127643a.emit();
        } else {
            throw new IOException("closed");
        }
    }
}
