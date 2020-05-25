package p2666g;

import java.io.IOException;
import okhttp3.C53498ab;
import okhttp3.C53498ab.C53499a;
import okhttp3.C53500ac;
import okhttp3.C53668q.C53669a;
import okhttp3.C53671s;
import okhttp3.C53673t;
import okhttp3.C53673t.C53674a;
import okhttp3.C53678w;
import okhttp3.C53679x;
import okhttp3.C53679x.C53680a;
import okio.Buffer;
import okio.BufferedSink;

/* renamed from: g.l */
final class C53131l {

    /* renamed from: d */
    private static final char[] f131622d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    String f131623a;

    /* renamed from: b */
    C53680a f131624b;

    /* renamed from: c */
    public C53500ac f131625c;

    /* renamed from: e */
    private final String f131626e;

    /* renamed from: f */
    private final C53673t f131627f;

    /* renamed from: g */
    private C53674a f131628g;

    /* renamed from: h */
    private final C53499a f131629h = new C53499a();

    /* renamed from: i */
    private C53678w f131630i;

    /* renamed from: j */
    private final boolean f131631j;

    /* renamed from: k */
    private C53669a f131632k;

    /* renamed from: g.l$a */
    static class C53132a extends C53500ac {

        /* renamed from: a */
        private final C53500ac f131633a;

        /* renamed from: b */
        private final C53678w f131634b;

        public final C53678w contentType() {
            return this.f131634b;
        }

        public final long contentLength() throws IOException {
            return this.f131633a.contentLength();
        }

        public final void writeTo(BufferedSink bufferedSink) throws IOException {
            this.f131633a.writeTo(bufferedSink);
        }

        C53132a(C53500ac acVar, C53678w wVar) {
            this.f131633a = acVar;
            this.f131634b = wVar;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C53498ab mo110639a() {
        C53673t tVar;
        C53674a aVar = this.f131628g;
        if (aVar != null) {
            tVar = aVar.mo111632b();
        } else {
            tVar = this.f131627f.mo111615d(this.f131623a);
            if (tVar == null) {
                StringBuilder sb = new StringBuilder("Malformed URL. Base: ");
                sb.append(this.f131627f);
                sb.append(", Relative: ");
                sb.append(this.f131623a);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        C53500ac acVar = this.f131625c;
        if (acVar == null) {
            if (this.f131632k != null) {
                acVar = this.f131632k.mo111587a();
            } else if (this.f131624b != null) {
                acVar = this.f131624b.mo111650a();
            } else if (this.f131631j) {
                acVar = C53500ac.create((C53678w) null, new byte[0]);
            }
        }
        C53678w wVar = this.f131630i;
        if (wVar != null) {
            if (acVar != null) {
                acVar = new C53132a(acVar, wVar);
            } else {
                this.f131629h.mo111271b("Content-Type", wVar.toString());
            }
        }
        return this.f131629h.mo111268a(tVar).mo111264a(this.f131626e, acVar).mo111272c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo110642a(C53671s sVar, C53500ac acVar) {
        this.f131624b.mo111647a(sVar, acVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo110640a(String str, String str2) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            C53678w a = C53678w.m114225a(str2);
            if (a != null) {
                this.f131630i = a;
                return;
            }
            StringBuilder sb = new StringBuilder("Malformed content type: ");
            sb.append(str2);
            throw new IllegalArgumentException(sb.toString());
        }
        this.f131629h.mo111271b(str, str2);
    }

    /* renamed from: a */
    static String m112922a(String str, boolean z) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                Buffer buffer = new Buffer();
                buffer.writeUtf8(str, 0, i);
                Buffer buffer2 = null;
                while (i < length) {
                    int codePointAt2 = str.codePointAt(i);
                    if (!z || !(codePointAt2 == 9 || codePointAt2 == 10 || codePointAt2 == 12 || codePointAt2 == 13)) {
                        if (codePointAt2 < 32 || codePointAt2 >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt2) != -1 || (!z && (codePointAt2 == 47 || codePointAt2 == 37))) {
                            if (buffer2 == null) {
                                buffer2 = new Buffer();
                            }
                            buffer2.writeUtf8CodePoint(codePointAt2);
                            while (!buffer2.exhausted()) {
                                byte readByte = buffer2.readByte() & 255;
                                buffer.writeByte(37);
                                buffer.writeByte((int) f131622d[(readByte >> 4) & 15]);
                                buffer.writeByte((int) f131622d[readByte & 15]);
                            }
                        } else {
                            buffer.writeUtf8CodePoint(codePointAt2);
                        }
                    }
                    i += Character.charCount(codePointAt2);
                }
                return buffer.readUtf8();
            }
            i += Character.charCount(codePointAt);
        }
        return str;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo110643b(String str, String str2, boolean z) {
        if (z) {
            this.f131632k.mo111588b(str, str2);
        } else {
            this.f131632k.mo111586a(str, str2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo110641a(String str, String str2, boolean z) {
        if (this.f131623a != null) {
            this.f131628g = this.f131627f.mo111617e(this.f131623a);
            if (this.f131628g != null) {
                this.f131623a = null;
            } else {
                StringBuilder sb = new StringBuilder("Malformed URL. Base: ");
                sb.append(this.f131627f);
                sb.append(", Relative: ");
                sb.append(this.f131623a);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        if (z) {
            this.f131628g.mo111631b(str, str2);
        } else {
            this.f131628g.mo111629a(str, str2);
        }
    }

    C53131l(String str, C53673t tVar, String str2, C53671s sVar, C53678w wVar, boolean z, boolean z2, boolean z3) {
        this.f131626e = str;
        this.f131627f = tVar;
        this.f131623a = str2;
        this.f131630i = wVar;
        this.f131631j = z;
        if (sVar != null) {
            this.f131629h.mo111267a(sVar);
        }
        if (z2) {
            this.f131632k = new C53669a();
            return;
        }
        if (z3) {
            this.f131624b = new C53680a();
            this.f131624b.mo111648a(C53679x.f133173e);
        }
    }
}
