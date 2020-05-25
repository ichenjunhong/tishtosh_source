package com.google.p1057b.p1059b;

import com.google.p1057b.p1058a.C17432q;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.b.b.i */
final class C17510i {

    /* renamed from: a */
    private static final C17432q<C17509h> f49161a;

    /* renamed from: com.google.b.b.i$a */
    static final class C17513a extends AtomicLong implements C17509h {
        private C17513a() {
        }

        /* renamed from: a */
        public final void mo33927a() {
            getAndIncrement();
        }

        /* renamed from: a */
        public final void mo33928a(long j) {
            getAndAdd(j);
        }
    }

    /* renamed from: a */
    public static C17509h m43016a() {
        return (C17509h) f49161a.get();
    }

    static {
        C17432q<C17509h> qVar;
        try {
            new C17514j();
            qVar = new C17432q<C17509h>() {
                public final /* synthetic */ Object get() {
                    return new C17514j();
                }
            };
        } catch (Throwable unused) {
            qVar = new C17432q<C17509h>() {
                public final /* synthetic */ Object get() {
                    return new C17513a();
                }
            };
        }
        f49161a = qVar;
    }
}
