package com.twitter.sdk.android.core;

import android.content.Context;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.common.applog.TeaAgent;
import com.p683ss.android.ugc.aweme.buildconfigdiff.C24095a;
import com.p683ss.android.ugc.aweme.share.C42229q;
import com.p683ss.android.ugc.aweme.share.C42230r;
import com.twitter.sdk.android.core.C52221p.C52223a;
import com.twitter.sdk.android.core.internal.C52094a;
import com.twitter.sdk.android.core.internal.C52114g;
import com.twitter.sdk.android.core.internal.C52116i;
import com.twitter.sdk.android.core.internal.C52119l;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.twitter.sdk.android.core.l */
public final class C52190l {

    /* renamed from: a */
    static final C52075g f129903a = new C52069c();

    /* renamed from: b */
    static volatile C52190l f129904b;

    /* renamed from: c */
    public final C52119l f129905c = new C52119l(this.f129909g);

    /* renamed from: d */
    public final ExecutorService f129906d;

    /* renamed from: e */
    public final TwitterAuthConfig f129907e;

    /* renamed from: f */
    public final C52094a f129908f = new C52094a(this.f129909g);

    /* renamed from: g */
    private final Context f129909g;

    /* renamed from: h */
    private final C52075g f129910h;

    /* renamed from: i */
    private final boolean f129911i;

    /* renamed from: b */
    public static boolean m111620b() {
        if (f129904b == null) {
            return false;
        }
        return f129904b.f129911i;
    }

    /* renamed from: c */
    public static C52075g m111621c() {
        if (f129904b == null) {
            return f129903a;
        }
        return f129904b.f129910h;
    }

    /* renamed from: a */
    public static C52190l m111617a() {
        try {
            C42229q qVar = new C42229q(C24095a.m58950g(), C24095a.m58951h(), C24095a.m58952i(), "tiktok", TeaAgent.getInstallId());
            Context a = C11010c.m22280a();
            C52711k.m112240b(a, "context");
            C52711k.m112240b(qVar, "mobKey");
            C42230r.f106763a = qVar;
            m111618a(new C52223a(a).mo108939a(new TwitterAuthConfig(qVar.f106758a, qVar.f106759b)).mo108940a());
            if (f129904b != null) {
                return f129904b;
            }
            throw new IllegalStateException("Must initialize Twitter before using getInstance()");
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m111618a(C52221p pVar) {
        m111619b(pVar);
    }

    /* renamed from: b */
    private static synchronized C52190l m111619b(C52221p pVar) {
        synchronized (C52190l.class) {
            if (f129904b == null) {
                C52190l lVar = new C52190l(pVar);
                f129904b = lVar;
                return lVar;
            }
            C52190l lVar2 = f129904b;
            return lVar2;
        }
    }

    /* renamed from: a */
    public final Context mo108920a(String str) {
        Context context = this.f129909g;
        StringBuilder sb = new StringBuilder(".TwitterKit");
        sb.append(File.separator);
        sb.append(str);
        return new C52224q(context, str, sb.toString());
    }

    private C52190l(C52221p pVar) {
        this.f129909g = pVar.f130036a;
        if (pVar.f130038c == null) {
            this.f129907e = new TwitterAuthConfig(C52114g.m111462a(this.f129909g, "com.twitter.sdk.android.CONSUMER_KEY", ""), C52114g.m111462a(this.f129909g, "com.twitter.sdk.android.CONSUMER_SECRET", ""));
        } else {
            this.f129907e = pVar.f130038c;
        }
        if (pVar.f130039d == null) {
            String str = "twitter-worker";
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(C52116i.f129721a, C52116i.f129722b, 1, TimeUnit.SECONDS, new LinkedBlockingQueue(), C52116i.m111474a(str));
            C52116i.m111475a(str, threadPoolExecutor);
            this.f129906d = threadPoolExecutor;
        } else {
            this.f129906d = pVar.f130039d;
        }
        if (pVar.f130037b == null) {
            this.f129910h = f129903a;
        } else {
            this.f129910h = pVar.f130037b;
        }
        if (pVar.f130040e == null) {
            this.f129911i = false;
        } else {
            this.f129911i = pVar.f130040e.booleanValue();
        }
    }
}
