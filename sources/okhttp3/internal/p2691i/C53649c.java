package okhttp3.internal.p2691i;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import okio.Buffer;
import okio.Buffer.UnsafeCursor;
import okio.BufferedSource;
import okio.ByteString;

/* renamed from: okhttp3.internal.i.c */
final class C53649c {

    /* renamed from: a */
    final boolean f133047a;

    /* renamed from: b */
    final BufferedSource f133048b;

    /* renamed from: c */
    final C53650a f133049c;

    /* renamed from: d */
    boolean f133050d;

    /* renamed from: e */
    int f133051e;

    /* renamed from: f */
    long f133052f;

    /* renamed from: g */
    boolean f133053g;

    /* renamed from: h */
    boolean f133054h;

    /* renamed from: i */
    final Buffer f133055i = new Buffer();

    /* renamed from: j */
    private final Buffer f133056j = new Buffer();

    /* renamed from: k */
    private final byte[] f133057k;

    /* renamed from: l */
    private final UnsafeCursor f133058l;

    /* renamed from: okhttp3.internal.i.c$a */
    public interface C53650a {
        /* renamed from: a */
        void mo111531a(int i, String str);

        /* renamed from: a */
        void mo111533a(String str) throws IOException;

        /* renamed from: a */
        void mo111536a(ByteString byteString) throws IOException;

        /* renamed from: b */
        void mo111538b(ByteString byteString);

        /* renamed from: c */
        void mo111539c(ByteString byteString);
    }

    /* renamed from: d */
    private void m114094d() throws IOException {
        while (!this.f133050d) {
            mo111545a();
            if (this.f133054h) {
                mo111546b();
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo111547c() throws IOException {
        while (!this.f133050d) {
            if (this.f133052f > 0) {
                this.f133048b.readFully(this.f133055i, this.f133052f);
                if (!this.f133047a) {
                    this.f133055i.readAndWriteUnsafe(this.f133058l);
                    this.f133058l.seek(this.f133055i.size() - this.f133052f);
                    C53648b.m114092a(this.f133058l, this.f133057k);
                    this.f133058l.close();
                }
            }
            if (!this.f133053g) {
                m114094d();
                if (this.f133051e != 0) {
                    StringBuilder sb = new StringBuilder("Expected continuation opcode. Got: ");
                    sb.append(Integer.toHexString(this.f133051e));
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
    public void mo111546b() throws IOException {
        if (this.f133052f > 0) {
            this.f133048b.readFully(this.f133056j, this.f133052f);
            if (!this.f133047a) {
                this.f133056j.readAndWriteUnsafe(this.f133058l);
                this.f133058l.seek(0);
                C53648b.m114092a(this.f133058l, this.f133057k);
                this.f133058l.close();
            }
        }
        switch (this.f133051e) {
            case 8:
                short s = 1005;
                String str = "";
                long size = this.f133056j.size();
                if (size != 1) {
                    if (size != 0) {
                        s = this.f133056j.readShort();
                        str = this.f133056j.readUtf8();
                        String a = C53648b.m114091a(s);
                        if (a != null) {
                            throw new ProtocolException(a);
                        }
                    }
                    this.f133049c.mo111531a(s, str);
                    this.f133050d = true;
                    return;
                }
                throw new ProtocolException("Malformed close payload length of 1.");
            case 9:
                this.f133049c.mo111538b(this.f133056j.readByteString());
                return;
            case 10:
                this.f133049c.mo111539c(this.f133056j.readByteString());
                return;
            default:
                StringBuilder sb = new StringBuilder("Unknown control opcode: ");
                sb.append(Integer.toHexString(this.f133051e));
                throw new ProtocolException(sb.toString());
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo111545a() throws IOException {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        String str;
        if (!this.f133050d) {
            long timeoutNanos = this.f133048b.timeout().timeoutNanos();
            this.f133048b.timeout().clearTimeout();
            try {
                byte readByte = this.f133048b.readByte() & 255;
                this.f133048b.timeout().timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                this.f133051e = readByte & 15;
                boolean z6 = false;
                if ((readByte & 128) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.f133053g = z;
                if ((readByte & 8) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.f133054h = z2;
                if (!this.f133054h || this.f133053g) {
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
                    byte readByte2 = this.f133048b.readByte() & 255;
                    if ((readByte2 & 128) != 0) {
                        z6 = true;
                    }
                    if (z6 == this.f133047a) {
                        if (this.f133047a) {
                            str = "Server-sent frames must not be masked.";
                        } else {
                            str = "Client-sent frames must be masked.";
                        }
                        throw new ProtocolException(str);
                    }
                    this.f133052f = (long) (readByte2 & Byte.MAX_VALUE);
                    if (this.f133052f == 126) {
                        this.f133052f = ((long) this.f133048b.readShort()) & 65535;
                    } else if (this.f133052f == 127) {
                        this.f133052f = this.f133048b.readLong();
                        if (this.f133052f < 0) {
                            StringBuilder sb = new StringBuilder("Frame length 0x");
                            sb.append(Long.toHexString(this.f133052f));
                            sb.append(" > 0x7FFFFFFFFFFFFFFF");
                            throw new ProtocolException(sb.toString());
                        }
                    }
                    if (this.f133054h && this.f133052f > 125) {
                        throw new ProtocolException("Control frame must be less than 125B.");
                    } else if (z6) {
                        this.f133048b.readFully(this.f133057k);
                    }
                } else {
                    throw new ProtocolException("Control frames must be final.");
                }
            } catch (Throwable th) {
                this.f133048b.timeout().timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                throw th;
            }
        } else {
            throw new IOException("closed");
        }
    }

    C53649c(boolean z, BufferedSource bufferedSource, C53650a aVar) {
        byte[] bArr;
        if (bufferedSource != null) {
            this.f133047a = z;
            this.f133048b = bufferedSource;
            this.f133049c = aVar;
            UnsafeCursor unsafeCursor = null;
            if (z) {
                bArr = null;
            } else {
                bArr = new byte[4];
            }
            this.f133057k = bArr;
            if (!z) {
                unsafeCursor = new UnsafeCursor();
            }
            this.f133058l = unsafeCursor;
            return;
        }
        throw new NullPointerException("source == null");
    }
}
