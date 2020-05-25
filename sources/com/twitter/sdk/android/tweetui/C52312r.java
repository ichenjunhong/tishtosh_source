package com.twitter.sdk.android.tweetui;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.squareup.p1094a.C18396v;
import com.twitter.sdk.android.core.C52072e;
import com.twitter.sdk.android.core.C52189k;
import com.twitter.sdk.android.core.C52190l;
import com.twitter.sdk.android.core.C52225r;
import com.twitter.sdk.android.core.C52231v;
import com.twitter.sdk.android.core.internal.scribe.C52143a;
import com.twitter.sdk.android.core.internal.scribe.C52144aa;
import com.twitter.sdk.android.core.internal.scribe.C52158e;
import java.util.List;

/* renamed from: com.twitter.sdk.android.tweetui.r */
public class C52312r {

    /* renamed from: a */
    static volatile C52312r f130267a;

    /* renamed from: b */
    C52189k<C52231v> f130268b;

    /* renamed from: c */
    C52072e f130269c;

    /* renamed from: d */
    C52143a f130270d;

    /* renamed from: e */
    Context f130271e = C52190l.m111617a().mo108920a(m111748b());

    /* renamed from: f */
    public C52307o f130272f;

    /* renamed from: g */
    public C18396v f130273g;

    /* renamed from: b */
    private static String m111748b() {
        return "com.twitter.sdk.android:tweet-ui";
    }

    /* renamed from: a */
    public static C52312r m111747a() {
        if (f130267a == null) {
            synchronized (C52312r.class) {
                if (f130267a == null) {
                    f130267a = new C52312r();
                }
            }
        }
        return f130267a;
    }

    C52312r() {
        C52225r a = C52225r.m111638a();
        this.f130268b = a.f130049b;
        this.f130269c = a.mo108950c();
        this.f130272f = new C52307o(new Handler(Looper.getMainLooper()), a.f130049b);
        this.f130273g = C18396v.m44672a(C52190l.m111617a().mo108920a(m111748b()));
        C52143a aVar = new C52143a(this.f130271e, this.f130268b, this.f130269c, C52190l.m111617a().f129905c, C52143a.m111517a("TweetUi", "3.2.0.11"));
        this.f130270d = aVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo109123a(C52158e... eVarArr) {
        if (this.f130270d != null) {
            for (int i = 0; i <= 0; i++) {
                C52158e eVar = eVarArr[0];
                this.f130270d.mo108852a(eVar);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo109122a(C52158e eVar, List<C52144aa> list) {
        if (this.f130270d != null) {
            this.f130270d.mo108851a(eVar, list);
        }
    }
}
