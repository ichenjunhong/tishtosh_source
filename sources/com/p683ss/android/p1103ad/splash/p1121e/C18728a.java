package com.p683ss.android.p1103ad.splash.p1121e;

import android.os.Handler;
import android.os.Looper;
import com.p683ss.android.p1103ad.splash.C18773t;
import com.p683ss.android.p1103ad.splash.core.C18642g;
import com.p683ss.android.p1103ad.splash.p1123g.C18744j;
import com.p683ss.android.p1103ad.splash.p1123g.C18747l;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ad.splash.e.a */
public class C18728a {

    /* renamed from: a */
    private static volatile C18728a f51803a;

    private C18728a() {
    }

    /* renamed from: a */
    public static C18728a m45652a() {
        if (f51803a == null) {
            synchronized (C18728a.class) {
                if (f51803a == null) {
                    f51803a = new C18728a();
                }
            }
        }
        return f51803a;
    }

    /* renamed from: a */
    public final void mo38338a(final boolean z) {
        if (C18642g.m45250w() != null) {
            long aa = C18642g.m45211aa();
            if (aa <= 0) {
                aa = 2000;
            }
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                public final void run() {
                    C18642g.m45247t().submit(new Callable<C18773t>() {
                        public final /* synthetic */ Object call() throws Exception {
                            if (C18642g.m45250w() != null) {
                                String a = C18744j.m45709a(z);
                                if (!C18747l.m45742a(a)) {
                                    return C18642g.m45250w().mo38383b(a);
                                }
                            }
                            return null;
                        }
                    });
                }
            }, aa);
        }
    }
}
