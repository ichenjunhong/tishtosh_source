package com.bytedance.jedi.arch;

import java.util.Arrays;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52728w;

/* renamed from: com.bytedance.jedi.arch.c */
public final class C11795c<T> extends C11787a<T> {

    /* renamed from: a */
    public final Throwable f31301a;

    public final String toString() {
        StringBuilder sb = new StringBuilder("Fail(error=");
        sb.append(this.f31301a);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{C52728w.m112245a(this.f31301a.getClass()), this.f31301a.getMessage(), this.f31301a.getStackTrace()[0]});
    }

    public C11795c(Throwable th) {
        C52711k.m112240b(th, "error");
        super(null);
        this.f31301a = th;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11795c)) {
            return false;
        }
        Throwable th = ((C11795c) obj).f31301a;
        if (!C52711k.m112239a((Object) C52728w.m112245a(this.f31301a.getClass()), (Object) C52728w.m112245a(th.getClass())) || !C52711k.m112239a((Object) this.f31301a.getMessage(), (Object) th.getMessage()) || !C52711k.m112239a((Object) this.f31301a.getStackTrace()[0], (Object) th.getStackTrace()[0])) {
            return false;
        }
        return true;
    }
}
