package com.bytedance.common.wschannel.channel.p530a.p531a.p533b;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import okio.Buffer;
import okio.Buffer.UnsafeCursor;
import okio.BufferedSource;
import okio.ByteString;

/* renamed from: com.bytedance.common.wschannel.channel.a.a.b.e */
final class C9496e {

    /* renamed from: a */
    final long f25852a;

    /* renamed from: b */
    final boolean f25853b;

    /* renamed from: c */
    final BufferedSource f25854c;

    /* renamed from: d */
    final C9497a f25855d;

    /* renamed from: e */
    boolean f25856e;

    /* renamed from: f */
    int f25857f;

    /* renamed from: g */
    long f25858g;

    /* renamed from: h */
    boolean f25859h;

    /* renamed from: i */
    boolean f25860i;

    /* renamed from: j */
    final Buffer f25861j = new Buffer();

    /* renamed from: k */
    private final Buffer f25862k = new Buffer();

    /* renamed from: l */
    private final byte[] f25863l;

    /* renamed from: m */
    private final UnsafeCursor f25864m;

    /* renamed from: com.bytedance.common.wschannel.channel.a.a.b.e$a */
    public interface C9497a {
        /* renamed from: a */
        void mo17196a(int i, String str);

        /* renamed from: a */
        void mo17198a(String str) throws IOException;

        /* renamed from: a */
        void mo17200a(ByteString byteString) throws IOException;

        /* renamed from: b */
        void mo17202b(ByteString byteString);

        /* renamed from: c */
        void mo17207c(ByteString byteString);
    }

    /* renamed from: d */
    private void m18845d() throws IOException {
        while (!this.f25856e) {
            mo17217a();
            if (this.f25858g <= this.f25852a) {
                if (!this.f25860i) {
                    break;
                }
                mo17219b();
            } else {
                mo17218a(this.f25858g);
                return;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo17220c() throws IOException {
        while (!this.f25856e) {
            if (this.f25858g > 0) {
                this.f25854c.readFully(this.f25861j, this.f25858g);
                if (!this.f25853b) {
                    this.f25861j.readAndWriteUnsafe(this.f25864m);
                    this.f25864m.seek(this.f25861j.size() - this.f25858g);
                    C9495d.m18843a(this.f25864m, this.f25863l);
                    this.f25864m.close();
                }
            }
            if (!this.f25859h) {
                m18845d();
                if (this.f25857f != 0) {
                    StringBuilder sb = new StringBuilder("Expected continuation opcode. Got: ");
                    sb.append(Integer.toHexString(this.f25857f));
                    throw new ProtocolException(sb.toString());
                }
            } else {
                return;
            }
        }
        throw new IOException("closed");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo17219b() throws IOException {
        if (this.f25858g > 0) {
            this.f25854c.readFully(this.f25862k, this.f25858g);
            if (!this.f25853b) {
                this.f25862k.readAndWriteUnsafe(this.f25864m);
                this.f25864m.seek(0);
                C9495d.m18843a(this.f25864m, this.f25863l);
                this.f25864m.close();
            }
        }
        if (this.f25857f == 9) {
            this.f25855d.mo17202b(this.f25862k.readByteString());
        } else if (this.f25857f == 10) {
            this.f25855d.mo17207c(this.f25862k.readByteString());
        } else if (this.f25857f == 8) {
            short s = 1005;
            String str = "";
            long size = this.f25862k.size();
            if (size != 1) {
                if (size != 0) {
                    s = this.f25862k.readShort();
                    str = this.f25862k.readUtf8();
                    String a = C9495d.m18842a(s);
                    if (a != null) {
                        throw new ProtocolException(a);
                    }
                }
                this.f25855d.mo17196a(s, str);
                this.f25856e = true;
                return;
            }
            throw new ProtocolException("Malformed close payload length of 1.");
        } else {
            StringBuilder sb = new StringBuilder("Unknown control opcode: ");
            sb.append(Integer.toHexString(this.f25857f));
            throw new ProtocolException(sb.toString());
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo17217a() throws IOException {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        String str;
        if (!this.f25856e) {
            long timeoutNanos = this.f25854c.timeout().timeoutNanos();
            this.f25854c.timeout().clearTimeout();
            try {
                byte readByte = this.f25854c.readByte() & 255;
                this.f25854c.timeout().timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                this.f25857f = readByte & 15;
                boolean z6 = false;
                if ((readByte & 128) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.f25859h = z;
                if ((readByte & 8) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.f25860i = z2;
                if (!this.f25860i || this.f25859h) {
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
                    byte readByte2 = this.f25854c.readByte() & 255;
                    if ((readByte2 & 128) != 0) {
                        z6 = true;
                    }
                    if (z6 == this.f25853b) {
                        if (this.f25853b) {
                            str = "Server-sent frames must not be masked.";
                        } else {
                            str = "Client-sent frames must be masked.";
                        }
                        throw new ProtocolException(str);
                    }
                    this.f25858g = (long) (readByte2 & Byte.MAX_VALUE);
                    if (this.f25858g == 126) {
                        this.f25858g = ((long) this.f25854c.readShort()) & 65535;
                    } else if (this.f25858g == 127) {
                        this.f25858g = this.f25854c.readLong();
                        if (this.f25858g < 0) {
                            StringBuilder sb = new StringBuilder("Frame length 0x");
                            sb.append(Long.toHexString(this.f25858g));
                            sb.append(" > 0x7FFFFFFFFFFFFFFF");
                            throw new ProtocolException(sb.toString());
                        }
                    }
                    if (this.f25860i && this.f25858g > 125) {
                        throw new ProtocolException("Control frame must be less than 125B.");
                    } else if (z6) {
                        this.f25854c.readFully(this.f25863l);
                    }
                } else {
                    throw new ProtocolException("Control frames must be final.");
                }
            } catch (Throwable th) {
                this.f25854c.timeout().timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                throw th;
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo17218a(long j) {
        try {
            this.f25854c.skip(j);
        } catch (Exception unused) {
        }
    }

    C9496e(boolean z, BufferedSource bufferedSource, C9497a aVar, long j) {
        byte[] bArr;
        if (bufferedSource != null) {
            this.f25853b = z;
            this.f25854c = bufferedSource;
            this.f25855d = aVar;
            this.f25852a = j;
            UnsafeCursor unsafeCursor = null;
            if (z) {
                bArr = null;
            } else {
                bArr = new byte[4];
            }
            this.f25863l = bArr;
            if (!z) {
                unsafeCursor = new UnsafeCursor();
            }
            this.f25864m = unsafeCursor;
            return;
        }
        throw new NullPointerException("source == null");
    }
}
