package com.google.gson.internal.bind;

import com.google.gson.C17980i;
import com.google.gson.C18082l;
import com.google.gson.C18084n;
import com.google.gson.C18085o;
import com.google.gson.C18088r;
import com.google.gson.p1078c.C17958a;
import com.google.gson.p1078c.C17960b;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import com.taobao.android.dexposed.ClassUtils;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: com.google.gson.internal.bind.c */
public final class C18002c extends C17958a {

    /* renamed from: c */
    private static final Reader f50005c = new Reader() {
        public final void close() throws IOException {
            throw new AssertionError();
        }

        public final int read(char[] cArr, int i, int i2) throws IOException {
            throw new AssertionError();
        }
    };

    /* renamed from: d */
    private static final Object f50006d = new Object();

    /* renamed from: e */
    private Object[] f50007e = new Object[32];

    /* renamed from: f */
    private int f50008f;

    /* renamed from: g */
    private String[] f50009g = new String[32];

    /* renamed from: h */
    private int[] f50010h = new int[32];

    public final void close() throws IOException {
        this.f50007e = new Object[]{f50006d};
        this.f50008f = 1;
    }

    /* renamed from: e */
    public final boolean mo34842e() throws IOException {
        C17960b f = mo34843f();
        if (f == C17960b.END_OBJECT || f == C17960b.END_ARRAY) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public Object mo34947g() {
        return this.f50007e[this.f50008f - 1];
    }

    public final String toString() {
        return getClass().getSimpleName();
    }

    /* renamed from: s */
    private Object m44173s() {
        Object[] objArr = this.f50007e;
        int i = this.f50008f - 1;
        this.f50008f = i;
        Object obj = objArr[i];
        this.f50007e[this.f50008f] = null;
        return obj;
    }

    /* renamed from: t */
    private String m44174t() {
        StringBuilder sb = new StringBuilder(" at path ");
        sb.append(mo34852p());
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo34837a() throws IOException {
        mo34945a(C17960b.BEGIN_ARRAY);
        mo34946a((Object) ((C17980i) mo34947g()).iterator());
        this.f50010h[this.f50008f - 1] = 0;
    }

    /* renamed from: b */
    public final void mo34838b() throws IOException {
        mo34945a(C17960b.END_ARRAY);
        m44173s();
        m44173s();
        if (this.f50008f > 0) {
            int[] iArr = this.f50010h;
            int i = this.f50008f - 1;
            iArr[i] = iArr[i] + 1;
        }
    }

    /* renamed from: c */
    public final void mo34839c() throws IOException {
        mo34945a(C17960b.BEGIN_OBJECT);
        mo34946a((Object) ((C18085o) mo34947g()).mo35016a().iterator());
    }

    /* renamed from: d */
    public final void mo34841d() throws IOException {
        mo34945a(C17960b.END_OBJECT);
        m44173s();
        m44173s();
        if (this.f50008f > 0) {
            int[] iArr = this.f50010h;
            int i = this.f50008f - 1;
            iArr[i] = iArr[i] + 1;
        }
    }

    /* renamed from: j */
    public final boolean mo34846j() throws IOException {
        mo34945a(C17960b.BOOLEAN);
        boolean h = ((C18088r) m44173s()).mo34911h();
        if (this.f50008f > 0) {
            int[] iArr = this.f50010h;
            int i = this.f50008f - 1;
            iArr[i] = iArr[i] + 1;
        }
        return h;
    }

    /* renamed from: k */
    public final void mo34847k() throws IOException {
        mo34945a(C17960b.NULL);
        m44173s();
        if (this.f50008f > 0) {
            int[] iArr = this.f50010h;
            int i = this.f50008f - 1;
            iArr[i] = iArr[i] + 1;
        }
    }

    /* renamed from: h */
    public final String mo34844h() throws IOException {
        mo34945a(C17960b.NAME);
        Entry entry = (Entry) ((Iterator) mo34947g()).next();
        String str = (String) entry.getKey();
        this.f50009g[this.f50008f - 1] = str;
        mo34946a(entry.getValue());
        return str;
    }

    /* renamed from: o */
    public final void mo34851o() throws IOException {
        if (mo34843f() == C17960b.NAME) {
            mo34844h();
            this.f50009g[this.f50008f - 2] = TEVideoRecorder.FACE_BEAUTY_NULL;
        } else {
            m44173s();
            if (this.f50008f > 0) {
                this.f50009g[this.f50008f - 1] = TEVideoRecorder.FACE_BEAUTY_NULL;
            }
        }
        if (this.f50008f > 0) {
            int[] iArr = this.f50010h;
            int i = this.f50008f - 1;
            iArr[i] = iArr[i] + 1;
        }
    }

    /* renamed from: i */
    public final String mo34845i() throws IOException {
        C17960b f = mo34843f();
        if (f == C17960b.STRING || f == C17960b.NUMBER) {
            String c = ((C18088r) m44173s()).mo34905c();
            if (this.f50008f > 0) {
                int[] iArr = this.f50010h;
                int i = this.f50008f - 1;
                iArr[i] = iArr[i] + 1;
            }
            return c;
        }
        StringBuilder sb = new StringBuilder("Expected ");
        sb.append(C17960b.STRING);
        sb.append(" but was ");
        sb.append(f);
        sb.append(m44174t());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: l */
    public final double mo34848l() throws IOException {
        C17960b f = mo34843f();
        if (f == C17960b.NUMBER || f == C17960b.STRING) {
            double d = ((C18088r) mo34947g()).mo34906d();
            if (this.f49847a || (!Double.isNaN(d) && !Double.isInfinite(d))) {
                m44173s();
                if (this.f50008f > 0) {
                    int[] iArr = this.f50010h;
                    int i = this.f50008f - 1;
                    iArr[i] = iArr[i] + 1;
                }
                return d;
            }
            StringBuilder sb = new StringBuilder("JSON forbids NaN and infinities: ");
            sb.append(d);
            throw new NumberFormatException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder("Expected ");
        sb2.append(C17960b.NUMBER);
        sb2.append(" but was ");
        sb2.append(f);
        sb2.append(m44174t());
        throw new IllegalStateException(sb2.toString());
    }

    /* renamed from: m */
    public final long mo34849m() throws IOException {
        C17960b f = mo34843f();
        if (f == C17960b.NUMBER || f == C17960b.STRING) {
            long f2 = ((C18088r) mo34947g()).mo34909f();
            m44173s();
            if (this.f50008f > 0) {
                int[] iArr = this.f50010h;
                int i = this.f50008f - 1;
                iArr[i] = iArr[i] + 1;
            }
            return f2;
        }
        StringBuilder sb = new StringBuilder("Expected ");
        sb.append(C17960b.NUMBER);
        sb.append(" but was ");
        sb.append(f);
        sb.append(m44174t());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: n */
    public final int mo34850n() throws IOException {
        C17960b f = mo34843f();
        if (f == C17960b.NUMBER || f == C17960b.STRING) {
            int g = ((C18088r) mo34947g()).mo34910g();
            m44173s();
            if (this.f50008f > 0) {
                int[] iArr = this.f50010h;
                int i = this.f50008f - 1;
                iArr[i] = iArr[i] + 1;
            }
            return g;
        }
        StringBuilder sb = new StringBuilder("Expected ");
        sb.append(C17960b.NUMBER);
        sb.append(" but was ");
        sb.append(f);
        sb.append(m44174t());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: p */
    public final String mo34852p() {
        StringBuilder sb = new StringBuilder(ClassUtils.INNER_CLASS_SEPARATOR);
        int i = 0;
        while (i < this.f50008f) {
            if (this.f50007e[i] instanceof C17980i) {
                i++;
                if (this.f50007e[i] instanceof Iterator) {
                    sb.append('[');
                    sb.append(this.f50010h[i]);
                    sb.append(']');
                }
            } else if (this.f50007e[i] instanceof C18085o) {
                i++;
                if (this.f50007e[i] instanceof Iterator) {
                    sb.append('.');
                    if (this.f50009g[i] != null) {
                        sb.append(this.f50009g[i]);
                    }
                }
            }
            i++;
        }
        return sb.toString();
    }

    /* renamed from: f */
    public final C17960b mo34843f() throws IOException {
        while (this.f50008f != 0) {
            Object g = mo34947g();
            if (g instanceof Iterator) {
                boolean z = this.f50007e[this.f50008f - 2] instanceof C18085o;
                Iterator it = (Iterator) g;
                if (it.hasNext()) {
                    if (z) {
                        return C17960b.NAME;
                    }
                    mo34946a(it.next());
                } else if (z) {
                    return C17960b.END_OBJECT;
                } else {
                    return C17960b.END_ARRAY;
                }
            } else if (g instanceof C18085o) {
                return C17960b.BEGIN_OBJECT;
            } else {
                if (g instanceof C17980i) {
                    return C17960b.BEGIN_ARRAY;
                }
                if (g instanceof C18088r) {
                    C18088r rVar = (C18088r) g;
                    if (rVar.mo35034r()) {
                        return C17960b.STRING;
                    }
                    if (rVar.mo35030a()) {
                        return C17960b.BOOLEAN;
                    }
                    if (rVar.mo35033q()) {
                        return C17960b.NUMBER;
                    }
                    throw new AssertionError();
                } else if (g instanceof C18084n) {
                    return C17960b.NULL;
                } else {
                    if (g == f50006d) {
                        throw new IllegalStateException("JsonReader is closed");
                    }
                    throw new AssertionError();
                }
            }
        }
        return C17960b.END_DOCUMENT;
    }

    public C18002c(C18082l lVar) {
        super(f50005c);
        mo34946a((Object) lVar);
    }

    /* renamed from: a */
    public void mo34945a(C17960b bVar) throws IOException {
        if (mo34843f() != bVar) {
            StringBuilder sb = new StringBuilder("Expected ");
            sb.append(bVar);
            sb.append(" but was ");
            sb.append(mo34843f());
            sb.append(m44174t());
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: a */
    public void mo34946a(Object obj) {
        if (this.f50008f == this.f50007e.length) {
            Object[] objArr = new Object[(this.f50008f * 2)];
            int[] iArr = new int[(this.f50008f * 2)];
            String[] strArr = new String[(this.f50008f * 2)];
            System.arraycopy(this.f50007e, 0, objArr, 0, this.f50008f);
            System.arraycopy(this.f50010h, 0, iArr, 0, this.f50008f);
            System.arraycopy(this.f50009g, 0, strArr, 0, this.f50008f);
            this.f50007e = objArr;
            this.f50010h = iArr;
            this.f50009g = strArr;
        }
        Object[] objArr2 = this.f50007e;
        int i = this.f50008f;
        this.f50008f = i + 1;
        objArr2[i] = obj;
    }
}
