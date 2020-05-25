package com.google.gson.internal.bind;

import com.google.gson.C17980i;
import com.google.gson.C18082l;
import com.google.gson.C18084n;
import com.google.gson.C18085o;
import com.google.gson.C18088r;
import com.google.gson.p1078c.C17961c;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.gson.internal.bind.d */
public final class C18004d extends C17961c {

    /* renamed from: d */
    private static final Writer f50011d = new Writer() {
        public final void close() throws IOException {
            throw new AssertionError();
        }

        public final void flush() throws IOException {
            throw new AssertionError();
        }

        public final void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    };

    /* renamed from: e */
    private static final C18088r f50012e = new C18088r("closed");

    /* renamed from: f */
    private final List<C18082l> f50013f = new ArrayList();

    /* renamed from: g */
    private String f50014g;

    /* renamed from: h */
    private C18082l f50015h = C18084n.f50144a;

    public final void flush() throws IOException {
    }

    /* renamed from: f */
    public final C17961c mo34870f() throws IOException {
        m44193a((C18082l) C18084n.f50144a);
        return this;
    }

    /* renamed from: b */
    public final C17961c mo34863b() throws IOException {
        C17980i iVar = new C17980i();
        m44193a((C18082l) iVar);
        this.f50013f.add(iVar);
        return this;
    }

    /* renamed from: d */
    public final C17961c mo34868d() throws IOException {
        C18085o oVar = new C18085o();
        m44193a((C18082l) oVar);
        this.f50013f.add(oVar);
        return this;
    }

    public C18004d() {
        super(f50011d);
    }

    /* renamed from: g */
    private C18082l m44194g() {
        return (C18082l) this.f50013f.get(this.f50013f.size() - 1);
    }

    public final void close() throws IOException {
        if (this.f50013f.isEmpty()) {
            this.f50013f.add(f50012e);
            return;
        }
        throw new IOException("Incomplete document");
    }

    /* renamed from: c */
    public final C17961c mo34865c() throws IOException {
        if (this.f50013f.isEmpty() || this.f50014g != null) {
            throw new IllegalStateException();
        } else if (m44194g() instanceof C17980i) {
            this.f50013f.remove(this.f50013f.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: e */
    public final C17961c mo34869e() throws IOException {
        if (this.f50013f.isEmpty() || this.f50014g != null) {
            throw new IllegalStateException();
        } else if (m44194g() instanceof C18085o) {
            this.f50013f.remove(this.f50013f.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public final C18082l mo34950a() {
        if (this.f50013f.isEmpty()) {
            return this.f50015h;
        }
        StringBuilder sb = new StringBuilder("Expected one JSON element but was ");
        sb.append(this.f50013f);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public final C17961c mo34858a(long j) throws IOException {
        m44193a((C18082l) new C18088r((Number) Long.valueOf(j)));
        return this;
    }

    /* renamed from: a */
    public final C17961c mo34859a(Boolean bool) throws IOException {
        if (bool == null) {
            return mo34870f();
        }
        m44193a((C18082l) new C18088r(bool));
        return this;
    }

    /* renamed from: b */
    public final C17961c mo34864b(String str) throws IOException {
        if (str == null) {
            return mo34870f();
        }
        m44193a((C18082l) new C18088r(str));
        return this;
    }

    /* renamed from: a */
    private void m44193a(C18082l lVar) {
        if (this.f50014g != null) {
            if (!lVar.mo35008l() || this.f49867c) {
                ((C18085o) m44194g()).mo35017a(this.f50014g, lVar);
            }
            this.f50014g = null;
        } else if (this.f50013f.isEmpty()) {
            this.f50015h = lVar;
        } else {
            C18082l g = m44194g();
            if (g instanceof C17980i) {
                ((C17980i) g).mo34903a(lVar);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public final C17961c mo34857a(double d) throws IOException {
        if (this.f49865a || (!Double.isNaN(d) && !Double.isInfinite(d))) {
            m44193a((C18082l) new C18088r((Number) Double.valueOf(d)));
            return this;
        }
        StringBuilder sb = new StringBuilder("JSON forbids NaN and infinities: ");
        sb.append(d);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public final C17961c mo34860a(Number number) throws IOException {
        if (number == null) {
            return mo34870f();
        }
        if (!this.f49865a) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                StringBuilder sb = new StringBuilder("JSON forbids NaN and infinities: ");
                sb.append(number);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        m44193a((C18082l) new C18088r(number));
        return this;
    }

    /* renamed from: a */
    public final C17961c mo34861a(String str) throws IOException {
        if (this.f50013f.isEmpty() || this.f50014g != null) {
            throw new IllegalStateException();
        } else if (m44194g() instanceof C18085o) {
            this.f50014g = str;
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public final C17961c mo34862a(boolean z) throws IOException {
        m44193a((C18082l) new C18088r(Boolean.valueOf(z)));
        return this;
    }
}
