package com.p683ss.android.websocket.p2537a.p2538a;

import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import okhttp3.C53506ae;
import okio.Buffer;
import okio.BufferedSource;
import okio.Source;
import okio.Timeout;

/* renamed from: com.ss.android.websocket.a.a.c */
public final class C50800c {

    /* renamed from: a */
    public final BufferedSource f127624a;

    /* renamed from: b */
    final C50802a f127625b;

    /* renamed from: c */
    final Source f127626c = new C50803b();

    /* renamed from: d */
    public boolean f127627d;

    /* renamed from: e */
    public boolean f127628e;

    /* renamed from: f */
    public int f127629f;

    /* renamed from: g */
    public long f127630g;

    /* renamed from: h */
    public long f127631h;

    /* renamed from: i */
    public boolean f127632i;

    /* renamed from: j */
    boolean f127633j;

    /* renamed from: k */
    public boolean f127634k;

    /* renamed from: l */
    public final byte[] f127635l = new byte[4];

    /* renamed from: m */
    public final byte[] f127636m = new byte[VideoCacheReadBuffersizeExperiment.DEFAULT];

    /* renamed from: n */
    private final boolean f127637n;

    /* renamed from: com.ss.android.websocket.a.a.c$a */
    public interface C50802a {
        /* renamed from: a */
        void mo99499a(int i, String str);

        /* renamed from: a */
        void mo99500a(C53506ae aeVar) throws IOException;

        /* renamed from: a */
        void mo99501a(Buffer buffer);

        /* renamed from: b */
        void mo99502b(Buffer buffer);
    }

    /* renamed from: com.ss.android.websocket.a.a.c$b */
    final class C50803b implements Source {
        public final Timeout timeout() {
            return C50800c.this.f127624a.timeout();
        }

        public final void close() throws IOException {
            if (!C50800c.this.f127628e) {
                C50800c.this.f127628e = true;
                if (!C50800c.this.f127627d) {
                    C50800c.this.f127624a.skip(C50800c.this.f127630g - C50800c.this.f127631h);
                    while (!C50800c.this.f127632i) {
                        C50800c.this.mo99506c();
                        C50800c.this.f127624a.skip(C50800c.this.f127630g);
                    }
                }
            }
        }

        private C50803b() {
        }

        public final long read(Buffer buffer, long j) throws IOException {
            long j2;
            if (C50800c.this.f127627d) {
                throw new IOException("closed");
            } else if (!C50800c.this.f127628e) {
                if (C50800c.this.f127631h == C50800c.this.f127630g) {
                    if (C50800c.this.f127632i) {
                        return -1;
                    }
                    C50800c.this.mo99506c();
                    if (C50800c.this.f127629f != 0) {
                        StringBuilder sb = new StringBuilder("Expected continuation opcode. Got: ");
                        sb.append(Integer.toHexString(C50800c.this.f127629f));
                        throw new ProtocolException(sb.toString());
                    } else if (C50800c.this.f127632i && C50800c.this.f127630g == 0) {
                        return -1;
                    }
                }
                long min = Math.min(j, C50800c.this.f127630g - C50800c.this.f127631h);
                if (C50800c.this.f127634k) {
                    j2 = (long) C50800c.this.f127624a.read(C50800c.this.f127636m, 0, (int) Math.min(min, (long) C50800c.this.f127636m.length));
                    if (j2 != -1) {
                        C50799b.m109936a(C50800c.this.f127636m, j2, C50800c.this.f127635l, C50800c.this.f127631h);
                        buffer.write(C50800c.this.f127636m, 0, (int) j2);
                    } else {
                        throw new EOFException();
                    }
                } else {
                    j2 = C50800c.this.f127624a.read(buffer, min);
                    if (j2 == -1) {
                        throw new EOFException();
                    }
                }
                C50800c.this.f127631h += j2;
                return j2;
            } else {
                throw new IllegalStateException("closed");
            }
        }
    }

    /* renamed from: c */
    public final void mo99506c() throws IOException {
        while (!this.f127627d) {
            mo99504a();
            if (this.f127633j) {
                mo99505b();
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo99504a() throws IOException {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (!this.f127627d) {
            byte readByte = this.f127624a.readByte() & 255;
            this.f127629f = readByte & 15;
            boolean z6 = false;
            if ((readByte & 128) != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f127632i = z;
            if ((readByte & 8) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f127633j = z2;
            if (!this.f127633j || this.f127632i) {
                if ((readByte & 64) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if ((readByte & 32) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if ((readByte & 16) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z3 || z4 || z5) {
                    throw new ProtocolException("Reserved flags are unsupported.");
                }
                byte readByte2 = this.f127624a.readByte() & 255;
                if ((readByte2 & 128) != 0) {
                    z6 = true;
                }
                this.f127634k = z6;
                if (this.f127634k != this.f127637n) {
                    this.f127630g = (long) (readByte2 & Byte.MAX_VALUE);
                    if (this.f127630g == 126) {
                        this.f127630g = ((long) this.f127624a.readShort()) & 65535;
                    } else if (this.f127630g == 127) {
                        this.f127630g = this.f127624a.readLong();
                        if (this.f127630g < 0) {
                            StringBuilder sb = new StringBuilder("Frame length 0x");
                            sb.append(Long.toHexString(this.f127630g));
                            sb.append(" > 0x7FFFFFFFFFFFFFFF");
                            throw new ProtocolException(sb.toString());
                        }
                    }
                    this.f127631h = 0;
                    if (this.f127633j && this.f127630g > 125) {
                        throw new ProtocolException("Control frame must be less than 125B.");
                    } else if (this.f127634k) {
                        this.f127624a.readFully(this.f127635l);
                    }
                } else {
                    throw new ProtocolException("Client-sent frames must be masked. Server sent must not.");
                }
            } else {
                throw new ProtocolException("Control frames must be final.");
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo99505b() throws IOException {
        Buffer buffer;
        if (this.f127631h < this.f127630g) {
            buffer = new Buffer();
            if (this.f127637n) {
                this.f127624a.readFully(buffer, this.f127630g);
            } else {
                while (this.f127631h < this.f127630g) {
                    int read = this.f127624a.read(this.f127636m, 0, (int) Math.min(this.f127630g - this.f127631h, (long) this.f127636m.length));
                    if (read != -1) {
                        long j = (long) read;
                        C50799b.m109936a(this.f127636m, j, this.f127635l, this.f127631h);
                        buffer.write(this.f127636m, 0, read);
                        this.f127631h += j;
                    } else {
                        throw new EOFException();
                    }
                }
            }
        } else {
            buffer = null;
        }
        switch (this.f127629f) {
            case 8:
                short s = 1000;
                String str = "";
                if (buffer != null) {
                    long size = buffer.size();
                    if (size == 1) {
                        throw new ProtocolException("Malformed close payload length of 1.");
                    } else if (size != 0) {
                        s = buffer.readShort();
                        C50799b.m109935a(s, false);
                        str = buffer.readUtf8();
                    }
                }
                this.f127625b.mo99499a(s, str);
                this.f127627d = true;
                return;
            case 9:
                this.f127625b.mo99501a(buffer);
                return;
            case 10:
                this.f127625b.mo99502b(buffer);
                return;
            default:
                StringBuilder sb = new StringBuilder("Unknown control opcode: ");
                sb.append(Integer.toHexString(this.f127629f));
                throw new ProtocolException(sb.toString());
        }
    }

    public C50800c(boolean z, BufferedSource bufferedSource, C50802a aVar) {
        if (bufferedSource != null) {
            this.f127637n = z;
            this.f127624a = bufferedSource;
            this.f127625b = aVar;
            return;
        }
        throw new NullPointerException("source == null");
    }
}
