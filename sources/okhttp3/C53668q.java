package okhttp3;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.C53559c;
import okio.Buffer;
import okio.BufferedSink;

/* renamed from: okhttp3.q */
public final class C53668q extends C53500ac {

    /* renamed from: a */
    private static final C53678w f133127a = C53678w.m114225a("application/x-www-form-urlencoded");

    /* renamed from: b */
    private final List<String> f133128b;

    /* renamed from: c */
    private final List<String> f133129c;

    /* renamed from: okhttp3.q$a */
    public static final class C53669a {

        /* renamed from: a */
        private final List<String> f133130a;

        /* renamed from: b */
        private final List<String> f133131b;

        /* renamed from: c */
        private final Charset f133132c;

        public C53669a() {
            this(null);
        }

        /* renamed from: a */
        public final C53668q mo111587a() {
            return new C53668q(this.f133130a, this.f133131b);
        }

        private C53669a(Charset charset) {
            this.f133130a = new ArrayList();
            this.f133131b = new ArrayList();
            this.f133132c = null;
        }

        /* renamed from: a */
        public final C53669a mo111586a(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            } else if (str2 != null) {
                this.f133130a.add(C53673t.m114172a(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.f133132c));
                this.f133131b.add(C53673t.m114172a(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.f133132c));
                return this;
            } else {
                throw new NullPointerException("value == null");
            }
        }

        /* renamed from: b */
        public final C53669a mo111588b(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            } else if (str2 != null) {
                this.f133130a.add(C53673t.m114172a(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, this.f133132c));
                this.f133131b.add(C53673t.m114172a(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, this.f133132c));
                return this;
            } else {
                throw new NullPointerException("value == null");
            }
        }
    }

    public final C53678w contentType() {
        return f133127a;
    }

    /* renamed from: a */
    public final int mo111582a() {
        return this.f133128b.size();
    }

    public final long contentLength() {
        return m114139a(null, true);
    }

    public final void writeTo(BufferedSink bufferedSink) throws IOException {
        m114139a(bufferedSink, false);
    }

    /* renamed from: a */
    public final String mo111583a(int i) {
        return (String) this.f133128b.get(i);
    }

    /* renamed from: b */
    public final String mo111584b(int i) {
        return (String) this.f133129c.get(i);
    }

    /* renamed from: c */
    public final String mo111585c(int i) {
        return C53673t.m114173a(mo111584b(i), true);
    }

    C53668q(List<String> list, List<String> list2) {
        this.f133128b = C53559c.m113801a(list);
        this.f133129c = C53559c.m113801a(list2);
    }

    /* renamed from: a */
    private long m114139a(BufferedSink bufferedSink, boolean z) {
        Buffer buffer;
        if (z) {
            buffer = new Buffer();
        } else {
            buffer = bufferedSink.buffer();
        }
        int size = this.f133128b.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                buffer.writeByte(38);
            }
            buffer.writeUtf8((String) this.f133128b.get(i));
            buffer.writeByte(61);
            buffer.writeUtf8((String) this.f133129c.get(i));
        }
        if (!z) {
            return 0;
        }
        long size2 = buffer.size();
        buffer.clear();
        return size2;
    }
}
