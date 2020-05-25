package com.bytedance.android.p173d.p174a.p175a;

import com.bytedance.android.p173d.p174a.p175a.C2890d.C2892b;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;

/* renamed from: com.bytedance.android.d.a.a.g */
public final class C2895g {

    /* renamed from: a */
    public int f8557a = -1;

    /* renamed from: b */
    private C2892b f8558b;

    /* renamed from: c */
    private long f8559c;

    /* renamed from: d */
    private long f8560d = Long.MAX_VALUE;

    /* renamed from: e */
    private int f8561e;

    /* renamed from: f */
    private int f8562f = 2;

    /* renamed from: g */
    private int f8563g = -1;

    /* renamed from: h */
    private long f8564h = -1;

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final byte[] mo7518c() throws IOException {
        return this.f8558b.mo7509b(m8219j());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final String mo7519d() throws IOException {
        return this.f8558b.mo7510c(m8219j());
    }

    /* renamed from: j */
    private long m8219j() throws IOException {
        if (this.f8562f == 2) {
            long j = this.f8560d - this.f8559c;
            this.f8562f = 6;
            this.f8559c = this.f8560d;
            this.f8560d = this.f8564h;
            this.f8564h = -1;
            return j;
        }
        StringBuilder sb = new StringBuilder("Expected LENGTH_DELIMITED but was ");
        sb.append(this.f8562f);
        throw new ProtocolException(sb.toString());
    }

    /* renamed from: a */
    public final long mo7514a() throws IOException {
        if (this.f8562f == 2) {
            int i = this.f8561e + 1;
            this.f8561e = i;
            if (i <= 65) {
                long j = this.f8564h;
                this.f8564h = -1;
                this.f8562f = 6;
                return j;
            }
            throw new IOException("Wire recursion limit exceeded");
        }
        throw new IllegalStateException("Unexpected call to beginMessage()");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final int mo7520e() throws IOException {
        if (this.f8562f == 0 || this.f8562f == 2) {
            int i = m8218i();
            m8217b(0);
            return i;
        }
        StringBuilder sb = new StringBuilder("Expected VARINT or LENGTH_DELIMITED but was ");
        sb.append(this.f8562f);
        throw new ProtocolException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final int mo7522g() throws IOException {
        if (this.f8562f == 5 || this.f8562f == 2) {
            this.f8559c += 4;
            int c = this.f8558b.mo7512c();
            m8217b(5);
            return c;
        }
        StringBuilder sb = new StringBuilder("Expected FIXED32 or LENGTH_DELIMITED but was ");
        sb.append(this.f8562f);
        throw new ProtocolException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final long mo7523h() throws IOException {
        if (this.f8562f == 1 || this.f8562f == 2) {
            this.f8559c += 8;
            long d = this.f8558b.mo7513d();
            m8217b(1);
            return d;
        }
        StringBuilder sb = new StringBuilder("Expected FIXED64 or LENGTH_DELIMITED but was ");
        sb.append(this.f8562f);
        throw new ProtocolException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final long mo7521f() throws IOException {
        if (this.f8562f == 0 || this.f8562f == 2) {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                this.f8559c++;
                byte b = this.f8558b.mo7508b();
                j |= ((long) (b & Byte.MAX_VALUE)) << i;
                if ((b & 128) == 0) {
                    m8217b(0);
                    return j;
                }
            }
            throw new ProtocolException("WireInput encountered a malformed varint");
        }
        StringBuilder sb = new StringBuilder("Expected VARINT or LENGTH_DELIMITED but was ");
        sb.append(this.f8562f);
        throw new ProtocolException(sb.toString());
    }

    /* renamed from: i */
    private int m8218i() throws IOException {
        byte b;
        this.f8559c++;
        byte b2 = this.f8558b.mo7508b();
        if (b2 >= 0) {
            return b2;
        }
        byte b3 = b2 & Byte.MAX_VALUE;
        this.f8559c++;
        byte b4 = this.f8558b.mo7508b();
        if (b4 >= 0) {
            b = b3 | (b4 << 7);
        } else {
            byte b5 = b3 | ((b4 & Byte.MAX_VALUE) << 7);
            this.f8559c++;
            byte b6 = this.f8558b.mo7508b();
            if (b6 >= 0) {
                b = b5 | (b6 << 14);
            } else {
                byte b7 = b5 | ((b6 & Byte.MAX_VALUE) << 14);
                this.f8559c++;
                byte b8 = this.f8558b.mo7508b();
                if (b8 >= 0) {
                    b = b7 | (b8 << 21);
                } else {
                    byte b9 = b7 | ((b8 & Byte.MAX_VALUE) << 21);
                    this.f8559c++;
                    byte b10 = this.f8558b.mo7508b();
                    b = b9 | (b10 << 28);
                    if (b10 < 0) {
                        for (int i = 0; i < 5; i++) {
                            this.f8559c++;
                            if (this.f8558b.mo7508b() >= 0) {
                                return b;
                            }
                        }
                        throw new ProtocolException("Malformed VARINT");
                    }
                }
            }
        }
        return b;
    }

    /* renamed from: b */
    public final int mo7517b() throws IOException {
        if (this.f8562f == 7) {
            this.f8562f = 2;
            return this.f8563g;
        } else if (this.f8562f == 6) {
            while (this.f8559c < this.f8560d && this.f8558b.mo7507a()) {
                int i = m8218i();
                if (i != 0) {
                    this.f8563g = i >> 3;
                    int i2 = i & 7;
                    switch (i2) {
                        case 0:
                            this.f8557a = 0;
                            this.f8562f = 0;
                            return this.f8563g;
                        case 1:
                            this.f8557a = 1;
                            this.f8562f = 1;
                            return this.f8563g;
                        case 2:
                            this.f8557a = 2;
                            this.f8562f = 2;
                            int i3 = m8218i();
                            if (i3 < 0) {
                                StringBuilder sb = new StringBuilder("Negative length: ");
                                sb.append(i3);
                                throw new ProtocolException(sb.toString());
                            } else if (this.f8564h == -1) {
                                this.f8564h = this.f8560d;
                                this.f8560d = this.f8559c + ((long) i3);
                                if (this.f8560d <= this.f8564h) {
                                    return this.f8563g;
                                }
                                throw new EOFException();
                            } else {
                                throw new IllegalStateException();
                            }
                        case 3:
                            m8216a(this.f8563g);
                        case 4:
                            throw new ProtocolException("Unexpected end group");
                        case 5:
                            this.f8557a = 5;
                            this.f8562f = 5;
                            return this.f8563g;
                        default:
                            StringBuilder sb2 = new StringBuilder("Unexpected field encoding: ");
                            sb2.append(i2);
                            throw new ProtocolException(sb2.toString());
                    }
                } else {
                    throw new ProtocolException("Unexpected tag 0");
                }
            }
            return -1;
        } else {
            throw new IllegalStateException("Unexpected call to nextTag()");
        }
    }

    /* renamed from: a */
    public final C2895g mo7515a(C2892b bVar) {
        this.f8558b = bVar;
        this.f8559c = 0;
        this.f8560d = Long.MAX_VALUE;
        this.f8561e = 0;
        this.f8562f = 2;
        this.f8563g = -1;
        this.f8564h = -1;
        this.f8557a = -1;
        return this;
    }

    /* renamed from: b */
    private void m8217b(int i) throws IOException {
        if (this.f8562f == i) {
            this.f8562f = 6;
        } else if (this.f8559c > this.f8560d) {
            StringBuilder sb = new StringBuilder("Expected to end at ");
            sb.append(this.f8560d);
            sb.append(" but was ");
            sb.append(this.f8559c);
            throw new IOException(sb.toString());
        } else if (this.f8559c == this.f8560d) {
            this.f8560d = this.f8564h;
            this.f8564h = -1;
            this.f8562f = 6;
        } else {
            this.f8562f = 7;
        }
    }

    /* renamed from: a */
    public final void mo7516a(long j) throws IOException {
        if (this.f8562f == 6) {
            int i = this.f8561e - 1;
            this.f8561e = i;
            if (i < 0 || this.f8564h != -1) {
                throw new IllegalStateException("No corresponding call to beginMessage()");
            } else if (this.f8559c == this.f8560d || this.f8561e == 0) {
                this.f8560d = j;
            } else {
                StringBuilder sb = new StringBuilder("Expected to end at ");
                sb.append(this.f8560d);
                sb.append(" but was ");
                sb.append(this.f8559c);
                throw new IOException(sb.toString());
            }
        } else {
            throw new IllegalStateException("Unexpected call to endMessage()");
        }
    }

    /* renamed from: a */
    private void m8216a(int i) throws IOException {
        while (this.f8559c < this.f8560d && this.f8558b.mo7507a()) {
            int i2 = m8218i();
            if (i2 != 0) {
                int i3 = i2 >> 3;
                int i4 = i2 & 7;
                switch (i4) {
                    case 0:
                        this.f8562f = 0;
                        mo7521f();
                        break;
                    case 1:
                        this.f8562f = 1;
                        mo7523h();
                        break;
                    case 2:
                        long i5 = (long) m8218i();
                        this.f8559c += i5;
                        this.f8558b.mo7506a(i5);
                        break;
                    case 3:
                        m8216a(i3);
                        break;
                    case 4:
                        if (i3 != i) {
                            throw new ProtocolException("Unexpected end group");
                        }
                        return;
                    case 5:
                        this.f8562f = 5;
                        mo7522g();
                        break;
                    default:
                        StringBuilder sb = new StringBuilder("Unexpected field encoding: ");
                        sb.append(i4);
                        throw new ProtocolException(sb.toString());
                }
            } else {
                throw new ProtocolException("Unexpected tag 0");
            }
        }
        throw new EOFException();
    }
}
