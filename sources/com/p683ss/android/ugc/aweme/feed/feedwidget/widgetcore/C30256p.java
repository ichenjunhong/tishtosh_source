package com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.lego.C35883b;
import java.util.concurrent.Callable;
import p001a.C0013i;
import p2628d.C52860x;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.p */
public final class C30256p implements Runnable {

    /* renamed from: a */
    public boolean f79042a;

    /* renamed from: b */
    public Runnable f79043b;

    /* renamed from: com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.p$a */
    static final class C30257a<V> implements Callable<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C30256p f79044a;

        C30257a(C30256p pVar) {
            this.f79044a = pVar;
        }

        public final /* synthetic */ Object call() {
            this.f79044a.f79043b.run();
            return C52860x.f131107a;
        }
    }

    public final void run() {
        if (this.f79042a) {
            this.f79043b.run();
            C35883b.m81031c().mo74568a(C11010c.m22280a());
            return;
        }
        C0013i.m18a((Callable<TResult>) new C30257a<TResult>(this), C0013i.f25b);
    }

    public C30256p(boolean z, Runnable runnable) {
        C52711k.m112240b(runnable, "runnable");
        this.f79042a = z;
        this.f79043b = runnable;
    }
}
