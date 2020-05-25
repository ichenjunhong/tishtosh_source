package com.p683ss.android.ugc.aweme.emoji.p1682c.p1683a;

import com.p683ss.android.ugc.aweme.emoji.p1687f.C29366a;
import com.p683ss.android.ugc.aweme.emoji.utils.C29474d;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.emoji.c.a.b */
public final class C29299b {

    /* renamed from: a */
    public static final C29299b f76681a = new C29299b();

    /* renamed from: com.ss.android.ugc.aweme.emoji.c.a.b$a */
    static final class C29300a<V> implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ C29366a f76682a;

        C29300a(C29366a aVar) {
            this.f76682a = aVar;
        }

        public final /* synthetic */ Object call() {
            C29474d.m69546a().mo59571a(this.f76682a);
            return null;
        }
    }

    private C29299b() {
    }

    /* renamed from: a */
    public static final void m69093a(C29366a aVar) {
        C52711k.m112240b(aVar, "emoji");
        C0013i.m18a((Callable<TResult>) new C29300a<TResult>(aVar), (Executor) C0013i.f24a);
    }
}
