package com.facebook.imagepipeline.p970j;

import com.facebook.common.p921e.C13697a;
import java.io.Closeable;

/* renamed from: com.facebook.imagepipeline.j.c */
public abstract class C14042c implements C14045f, Closeable {
    /* renamed from: a */
    public abstract boolean mo26250a();

    /* renamed from: b */
    public abstract int mo26251b();

    /* renamed from: c */
    public boolean mo26252c() {
        return false;
    }

    public abstract void close();

    /* renamed from: e */
    public C14047h mo26258e() {
        return C14046g.f36711a;
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        if (!mo26250a()) {
            String str = "CloseableImage";
            String str2 = "finalize: %s %x still open.";
            String simpleName = getClass().getSimpleName();
            Integer valueOf = Integer.valueOf(System.identityHashCode(this));
            if (C13697a.f35669a.mo25590b(3)) {
                C13697a.f35669a.mo25588b(str, C13697a.m27670a(str2, simpleName, valueOf));
            }
            try {
                close();
            } finally {
                super.finalize();
            }
        }
    }
}
