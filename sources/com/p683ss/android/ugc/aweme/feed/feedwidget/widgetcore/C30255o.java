package com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore;

import android.os.Handler;
import com.p683ss.android.ugc.aweme.lego.C35883b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.o */
public final class C30255o {

    /* renamed from: a */
    public static final C30255o f79039a = new C30255o();

    /* renamed from: b */
    private static Handler f79040b;

    /* renamed from: c */
    private static boolean f79041c;

    private C30255o() {
    }

    /* renamed from: a */
    public final synchronized void mo60618a() {
        if (!f79041c) {
            f79041c = true;
            f79040b = C35883b.m81030b();
        }
    }

    /* renamed from: a */
    public final C30255o mo60617a(C30256p pVar) {
        if (!f79041c) {
            mo60618a();
        }
        Handler handler = f79040b;
        if (handler == null) {
            C52711k.m112237a("mWorkHandler");
        }
        handler.post(pVar);
        return this;
    }
}
