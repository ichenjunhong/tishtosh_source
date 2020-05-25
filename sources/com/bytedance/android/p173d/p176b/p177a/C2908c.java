package com.bytedance.android.p173d.p176b.p177a;

import com.bytedance.android.p173d.p176b.C2911c;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;

/* renamed from: com.bytedance.android.d.b.a.c */
public final class C2908c {

    /* renamed from: a */
    public C2911c f8578a;

    /* renamed from: b */
    public long f8579b;

    /* renamed from: c */
    public long f8580c = Long.MAX_VALUE;

    /* renamed from: d */
    public int f8581d;

    /* renamed from: e */
    public int f8582e = 2;

    /* renamed from: f */
    public int f8583f = -1;

    /* renamed from: g */
    public long f8584g = -1;

    /* renamed from: c */
    public final String mo7538c() throws IOException {
        return this.f8578a.mo7550b(mo7543h());
    }

    public C2908c() {
    }

    /* renamed from: a */
    public final long mo7536a() throws IOException {
        if (this.f8582e == 2) {
            int i = this.f8581d + 1;
            this.f8581d = i;
            if (i <= 65) {
                long j = this.f8584g;
                this.f8584g = -1;
                this.f8582e = 6;
                return j;
            }
            throw new IOException("Wire recursion limit exceeded");
        }
        throw new IllegalStateException("Unexpected call to beginMessage()");
    }

    /* renamed from: d */
    public final int mo7539d() throws IOException {
        if (this.f8582e == 0 || this.f8582e == 2) {
            int i = m8275i();
            m8274b(0);
            return i;
        }
        StringBuilder sb = new StringBuilder("Expected VARINT or LENGTH_DELIMITED but was ");
        sb.append(this.f8582e);
        throw new ProtocolException(sb.toString());
    }

    /* renamed from: f */
    public final int mo7541f() throws IOException {
        if (this.f8582e == 5 || this.f8582e == 2) {
            this.f8579b += 4;
            int c = this.f8578a.mo7551c();
            m8274b(5);
            return c;
        }
        StringBuilder sb = new StringBuilder("Expected FIXED32 or LENGTH_DELIMITED but was ");
        sb.append(this.f8582e);
        throw new ProtocolException(sb.toString());
    }

    /* renamed from: g */
    public final long mo7542g() throws IOException {
        if (this.f8582e == 1 || this.f8582e == 2) {
            this.f8579b += 8;
            long d = this.f8578a.mo7552d();
            m8274b(1);
            return d;
        }
        StringBuilder sb = new StringBuilder("Expected FIXED64 or LENGTH_DELIMITED but was ");
        sb.append(this.f8582e);
        throw new ProtocolException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public long mo7543h() throws IOException {
        if (this.f8582e == 2) {
            long j = this.f8580c - this.f8579b;
            this.f8582e = 6;
            this.f8579b = this.f8580c;
            this.f8580c = this.f8584g;
            this.f8584g = -1;
            return j;
        }
        StringBuilder sb = new StringBuilder("Expected LENGTH_DELIMITED but was ");
        sb.append(this.f8582e);
        throw new ProtocolException(sb.toString());
    }

    /* renamed from: e */
    public final long mo7540e() throws IOException {
        if (this.f8582e == 0 || this.f8582e == 2) {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                this.f8579b++;
                byte b = this.f8578a.mo7549b();
                j |= ((long) (b & Byte.MAX_VALUE)) << i;
                if ((b & 128) == 0) {
                    m8274b(0);
                    return j;
                }
            }
            throw new ProtocolException("WireInput encountered a malformed varint");
        }
        StringBuilder sb = new StringBuilder("Expected VARINT or LENGTH_DELIMITED but was ");
        sb.append(this.f8582e);
        throw new ProtocolException(sb.toString());
    }

    /* renamed from: i */
    private int m8275i() throws IOException {
        byte b;
        this.f8579b++;
        byte b2 = this.f8578a.mo7549b();
        if (b2 >= 0) {
            return b2;
        }
        byte b3 = b2 & Byte.MAX_VALUE;
        this.f8579b++;
        byte b4 = this.f8578a.mo7549b();
        if (b4 >= 0) {
            b = b3 | (b4 << 7);
        } else {
            byte b5 = b3 | ((b4 & Byte.MAX_VALUE) << 7);
            this.f8579b++;
            byte b6 = this.f8578a.mo7549b();
            if (b6 >= 0) {
                b = b5 | (b6 << 14);
            } else {
                byte b7 = b5 | ((b6 & Byte.MAX_VALUE) << 14);
                this.f8579b++;
                byte b8 = this.f8578a.mo7549b();
                if (b8 >= 0) {
                    b = b7 | (b8 << 21);
                } else {
                    byte b9 = b7 | ((b8 & Byte.MAX_VALUE) << 21);
                    this.f8579b++;
                    byte b10 = this.f8578a.mo7549b();
                    b = b9 | (b10 << 28);
                    if (b10 < 0) {
                        for (int i = 0; i < 5; i++) {
                            this.f8579b++;
                            if (this.f8578a.mo7549b() >= 0) {
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
    public final int mo7537b() throws IOException {
        if (this.f8582e == 7) {
            this.f8582e = 2;
            return this.f8583f;
        } else if (this.f8582e == 6) {
            while (this.f8579b < this.f8580c && !this.f8578a.mo7547a()) {
                int i = m8275i();
                if (i != 0) {
                    this.f8583f = i >> 3;
                    int i2 = i & 7;
                    switch (i2) {
                        case 0:
                            this.f8582e = 0;
                            return this.f8583f;
                        case 1:
                            this.f8582e = 1;
                            return this.f8583f;
                        case 2:
                            this.f8582e = 2;
                            int i3 = m8275i();
                            if (i3 < 0) {
                                StringBuilder sb = new StringBuilder("Negative length: ");
                                sb.append(i3);
                                throw new ProtocolException(sb.toString());
                            } else if (this.f8584g == -1) {
                                this.f8584g = this.f8580c;
                                this.f8580c = this.f8579b + ((long) i3);
                                if (this.f8580c <= this.f8584g) {
                                    return this.f8583f;
                                }
                                throw new EOFException();
                            } else {
                                throw new IllegalStateException();
                            }
                        case 3:
                            m8273a(this.f8583f);
                        case 4:
                            throw new ProtocolException("Unexpected end group");
                        case 5:
                            this.f8582e = 5;
                            return this.f8583f;
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

    public C2908c(C2911c cVar) {
        this.f8578a = cVar;
    }

    /* renamed from: b */
    private void m8274b(int i) throws IOException {
        if (this.f8582e == i) {
            this.f8582e = 6;
        } else if (this.f8579b > this.f8580c) {
            StringBuilder sb = new StringBuilder("Expected to end at ");
            sb.append(this.f8580c);
            sb.append(" but was ");
            sb.append(this.f8579b);
            throw new IOException(sb.toString());
        } else if (this.f8579b == this.f8580c) {
            this.f8580c = this.f8584g;
            this.f8584g = -1;
            this.f8582e = 6;
        } else {
            this.f8582e = 7;
        }
    }

    /* renamed from: a */
    private void m8273a(int i) throws IOException {
        while (this.f8579b < this.f8580c && !this.f8578a.mo7547a()) {
            int i2 = m8275i();
            if (i2 != 0) {
                int i3 = i2 >> 3;
                int i4 = i2 & 7;
                switch (i4) {
                    case 0:
                        this.f8582e = 0;
                        mo7540e();
                        break;
                    case 1:
                        this.f8582e = 1;
                        mo7542g();
                        break;
                    case 2:
                        long i5 = (long) m8275i();
                        this.f8579b += i5;
                        C2911c cVar = this.f8578a;
                        cVar.f8588a.position((int) (((long) cVar.f8588a.position()) + i5));
                        break;
                    case 3:
                        m8273a(i3);
                        break;
                    case 4:
                        if (i3 != i) {
                            throw new ProtocolException("Unexpected end group");
                        }
                        return;
                    case 5:
                        this.f8582e = 5;
                        mo7541f();
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
