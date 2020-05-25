package com.twitter.sdk.android.core;

import android.content.Context;
import com.twitter.sdk.android.core.C52070d.C52071a;
import com.twitter.sdk.android.core.internal.C52120m;
import com.twitter.sdk.android.core.internal.C52136q;
import com.twitter.sdk.android.core.internal.C52137r;
import com.twitter.sdk.android.core.internal.oauth.OAuth2Service;
import com.twitter.sdk.android.core.internal.p2618b.C52107c;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.twitter.sdk.android.core.r */
public class C52225r {

    /* renamed from: a */
    static volatile C52225r f130048a;

    /* renamed from: b */
    public C52189k<C52231v> f130049b;

    /* renamed from: c */
    C52189k<C52070d> f130050c;

    /* renamed from: d */
    C52120m<C52231v> f130051d;

    /* renamed from: e */
    public final TwitterAuthConfig f130052e;

    /* renamed from: f */
    final Context f130053f;

    /* renamed from: g */
    private final ConcurrentHashMap<C52188j, C52191m> f130054g;

    /* renamed from: h */
    private volatile C52191m f130055h;

    /* renamed from: i */
    private volatile C52072e f130056i;

    /* renamed from: b */
    public static String m111639b() {
        return "3.2.0.11";
    }

    /* renamed from: c */
    public final C52072e mo108950c() {
        if (this.f130056i == null) {
            m111640d();
        }
        return this.f130056i;
    }

    /* renamed from: d */
    private synchronized void m111640d() {
        if (this.f130056i == null) {
            this.f130056i = new C52072e(new OAuth2Service(this, new C52136q()), this.f130050c);
        }
    }

    /* renamed from: a */
    public static C52225r m111638a() {
        if (f130048a == null) {
            synchronized (C52225r.class) {
                if (f130048a == null) {
                    f130048a = new C52225r(C52190l.m111617a().f129907e);
                    C52190l.m111617a().f129906d.execute(C52226s.f130057a);
                }
            }
        }
        return f130048a;
    }

    private C52225r(TwitterAuthConfig twitterAuthConfig) {
        this(twitterAuthConfig, new ConcurrentHashMap(), null);
    }

    /* renamed from: a */
    public final C52191m mo108949a(C52231v vVar) {
        if (!this.f130054g.containsKey(vVar)) {
            this.f130054g.putIfAbsent(vVar, new C52191m(vVar));
        }
        return (C52191m) this.f130054g.get(vVar);
    }

    private C52225r(TwitterAuthConfig twitterAuthConfig, ConcurrentHashMap<C52188j, C52191m> concurrentHashMap, C52191m mVar) {
        this.f130052e = twitterAuthConfig;
        this.f130054g = concurrentHashMap;
        this.f130055h = null;
        this.f130053f = C52190l.m111617a().mo108920a("com.twitter.sdk.android:twitter-core");
        this.f130049b = new C52076h(new C52107c(this.f130053f, "session_store"), new C52232a(), "active_twittersession", "twittersession");
        this.f130050c = new C52076h(new C52107c(this.f130053f, "session_store"), new C52071a(), "active_guestsession", "guestsession");
        this.f130051d = new C52120m<>(this.f130049b, C52190l.m111617a().f129906d, new C52137r());
    }
}
