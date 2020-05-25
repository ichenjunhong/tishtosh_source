package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.internal.p1042c.C16478e;

/* renamed from: com.google.android.gms.common.api.internal.h */
public final class C15336h<L> {

    /* renamed from: a */
    volatile L f39615a;

    /* renamed from: b */
    public final C15337a<L> f39616b;

    /* renamed from: c */
    private final C15339c f39617c;

    /* renamed from: com.google.android.gms.common.api.internal.h$a */
    public static final class C15337a<L> {

        /* renamed from: a */
        private final L f39618a;

        /* renamed from: b */
        private final String f39619b;

        public C15337a(L l, String str) {
            this.f39618a = l;
            this.f39619b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C15337a)) {
                return false;
            }
            C15337a aVar = (C15337a) obj;
            return this.f39618a == aVar.f39618a && this.f39619b.equals(aVar.f39619b);
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f39618a) * 31) + this.f39619b.hashCode();
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.h$b */
    public interface C15338b<L> {
        /* renamed from: a */
        void mo28288a(L l);
    }

    /* renamed from: com.google.android.gms.common.api.internal.h$c */
    final class C15339c extends C16478e {
        public C15339c(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            boolean z = true;
            if (message.what != 1) {
                z = false;
            }
            C15464q.m32133b(z);
            C15338b bVar = (C15338b) message.obj;
            L l = C15336h.this.f39615a;
            if (l != null) {
                try {
                    bVar.mo28288a(l);
                } catch (RuntimeException e) {
                    throw e;
                }
            }
        }
    }

    public C15336h(Looper looper, L l, String str) {
        this.f39617c = new C15339c(looper);
        this.f39615a = C15464q.m32124a(l, (Object) "Listener must not be null");
        this.f39616b = new C15337a<>(l, C15464q.m32125a(str));
    }

    /* renamed from: a */
    public final void mo28285a(C15338b<? super L> bVar) {
        C15464q.m32124a(bVar, (Object) "Notifier must not be null");
        this.f39617c.sendMessage(this.f39617c.obtainMessage(1, bVar));
    }

    /* renamed from: a */
    public final void mo28284a() {
        this.f39615a = null;
    }
}
