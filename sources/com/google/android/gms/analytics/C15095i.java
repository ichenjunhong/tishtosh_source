package com.google.android.gms.analytics;

import android.os.Build.VERSION;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.util.C15514e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.analytics.i */
public final class C15095i {

    /* renamed from: a */
    public final C15097k f38957a;

    /* renamed from: b */
    public boolean f38958b;

    /* renamed from: c */
    public long f38959c;

    /* renamed from: d */
    public long f38960d;

    /* renamed from: e */
    public boolean f38961e;

    /* renamed from: f */
    final Map<Class<? extends C15096j>, C15096j> f38962f;

    /* renamed from: g */
    public final List<C15104o> f38963g;

    /* renamed from: h */
    private final C15514e f38964h;

    /* renamed from: i */
    private long f38965i;

    /* renamed from: j */
    private long f38966j;

    /* renamed from: k */
    private long f38967k;

    /* renamed from: a */
    public final C15095i mo27836a() {
        return new C15095i(this);
    }

    /* renamed from: a */
    public final void mo27838a(C15096j jVar) {
        C15464q.m32123a(jVar);
        Class cls = jVar.getClass();
        if (cls.getSuperclass() == C15096j.class) {
            jVar.mo27841a(mo27839b(cls));
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public final <T extends C15096j> T mo27837a(Class<T> cls) {
        return (C15096j) this.f38962f.get(cls);
    }

    /* renamed from: b */
    public final <T extends C15096j> T mo27839b(Class<T> cls) {
        T t = (C15096j) this.f38962f.get(cls);
        if (t != null) {
            return t;
        }
        T c = m31252c(cls);
        this.f38962f.put(cls, c);
        return c;
    }

    /* renamed from: b */
    public final void mo27840b() {
        C15098l lVar = this.f38957a.f38969g;
        if (this.f38961e) {
            throw new IllegalStateException("Measurement prototype can't be submitted");
        } else if (!this.f38958b) {
            C15095i a = mo27836a();
            a.f38965i = a.f38964h.mo28524b();
            if (a.f38960d != 0) {
                a.f38959c = a.f38960d;
            } else {
                a.f38959c = a.f38964h.mo28523a();
            }
            a.f38958b = true;
            lVar.f38974c.execute(new C15102m(lVar, a));
        } else {
            throw new IllegalStateException("Measurement can only be submitted once");
        }
    }

    C15095i(C15097k kVar, C15514e eVar) {
        C15464q.m32123a(kVar);
        C15464q.m32123a(eVar);
        this.f38957a = kVar;
        this.f38964h = eVar;
        this.f38966j = 1800000;
        this.f38967k = 3024000000L;
        this.f38962f = new HashMap();
        this.f38963g = new ArrayList();
    }

    private C15095i(C15095i iVar) {
        this.f38957a = iVar.f38957a;
        this.f38964h = iVar.f38964h;
        this.f38959c = iVar.f38959c;
        this.f38960d = iVar.f38960d;
        this.f38965i = iVar.f38965i;
        this.f38966j = iVar.f38966j;
        this.f38967k = iVar.f38967k;
        this.f38963g = new ArrayList(iVar.f38963g);
        this.f38962f = new HashMap(iVar.f38962f.size());
        for (Entry entry : iVar.f38962f.entrySet()) {
            C15096j c = m31252c((Class) entry.getKey());
            ((C15096j) entry.getValue()).mo27841a(c);
            this.f38962f.put((Class) entry.getKey(), c);
        }
    }

    /* renamed from: c */
    private static <T extends C15096j> T m31252c(Class<T> cls) {
        try {
            return (C15096j) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            if (e instanceof InstantiationException) {
                throw new IllegalArgumentException("dataType doesn't have default constructor", e);
            } else if (e instanceof IllegalAccessException) {
                throw new IllegalArgumentException("dataType default constructor is not accessible", e);
            } else if (VERSION.SDK_INT < 19 || !(e instanceof ReflectiveOperationException)) {
                throw new RuntimeException(e);
            } else {
                throw new IllegalArgumentException("Linkage exception", e);
            }
        }
    }
}
