package com.google.gson;

import com.google.gson.internal.C18072k;
import com.google.gson.p1078c.C17961c;
import java.io.IOException;
import java.io.StringWriter;

/* renamed from: com.google.gson.l */
public abstract class C18082l {
    /* renamed from: i */
    public final boolean mo35005i() {
        return this instanceof C17980i;
    }

    /* renamed from: j */
    public final boolean mo35006j() {
        return this instanceof C18085o;
    }

    /* renamed from: k */
    public final boolean mo35007k() {
        return this instanceof C18088r;
    }

    /* renamed from: l */
    public final boolean mo35008l() {
        return this instanceof C18084n;
    }

    /* renamed from: b */
    public Number mo34904b() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: c */
    public String mo34905c() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: d */
    public double mo34906d() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: e */
    public float mo34907e() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: f */
    public long mo34909f() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: g */
    public int mo34910g() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: h */
    public boolean mo34911h() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public Boolean mo35012p() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: m */
    public final C18085o mo35009m() {
        if (mo35006j()) {
            return (C18085o) this;
        }
        StringBuilder sb = new StringBuilder("Not a JSON Object: ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: n */
    public final C17980i mo35010n() {
        if (mo35005i()) {
            return (C17980i) this;
        }
        StringBuilder sb = new StringBuilder("Not a JSON Array: ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: o */
    public final C18088r mo35011o() {
        if (mo35007k()) {
            return (C18088r) this;
        }
        StringBuilder sb = new StringBuilder("Not a JSON Primitive: ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            C17961c cVar = new C17961c(stringWriter);
            cVar.f49865a = true;
            C18072k.m44267a(this, cVar);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
