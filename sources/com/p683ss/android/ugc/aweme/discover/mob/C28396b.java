package com.p683ss.android.ugc.aweme.discover.mob;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.C29988ad;
import com.p683ss.android.ugc.aweme.feed.C30578o;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.p1382aq.C23229c;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.b */
public final class C28396b {
    /* renamed from: a */
    public static void m67408a(String str, String str2, String str3, String str4, int i, LogPbBean logPbBean) {
        C28398d dVar = new C28398d(str, str2, str3, str4, i, logPbBean);
        C0013i.m18a((Callable<TResult>) dVar, (Executor) C26890h.m65003a());
    }

    /* renamed from: a */
    public static void m67407a(String str, String str2, String str3, int i, String str4, LogPbBean logPbBean) {
        C28408m mVar = new C28408m(str, str2, str3, str4, i, logPbBean);
        C0013i.m18a((Callable<TResult>) mVar, (Executor) C26890h.m65003a());
    }

    /* renamed from: a */
    public static void m67410a(String str, String str2, String str3, String str4, long j, int i, LogPbBean logPbBean) {
        C28414s sVar = new C28414s(str, str2, str3, str4, j, i, logPbBean);
        C0013i.m18a((Callable<TResult>) sVar, (Executor) C26890h.m65003a());
    }

    /* renamed from: a */
    public static void m67409a(String str, String str2, String str3, String str4, int i, String str5, LogPbBean logPbBean) {
        C28399e eVar = new C28399e(str, str2, str3, str4, str5, i, logPbBean);
        C0013i.m18a((Callable<TResult>) eVar, (Executor) C26890h.m65003a());
    }

    /* renamed from: a */
    public static void m67411a(String str, String str2, String str3, String str4, String str5, int i, LogPbBean logPbBean) {
        C28400f fVar = new C28400f(str, str2, str3, str4, str5, i, logPbBean);
        C0013i.m18a((Callable<TResult>) fVar, (Executor) C26890h.m65003a());
    }

    /* renamed from: a */
    public static void m67406a(String str, int i, String str2) {
        C0013i.m18a((Callable<TResult>) new C28410o<TResult>(str, i, str2), (Executor) C26890h.m65003a());
    }

    /* renamed from: a */
    public static void m67402a() {
        C30578o.m71566a(C29988ad.DISCOVER);
    }

    /* renamed from: a */
    public static void m67403a(String str, int i) {
        C0013i.m18a((Callable<TResult>) new C28405j<TResult>(str, i), (Executor) C26890h.m65003a());
    }

    /* renamed from: a */
    static final /* synthetic */ Object m67398a(String str, String str2) throws Exception {
        if (TextUtils.equals("homepage_hot", str)) {
            C26890h.m65011a("enter_discovery_page", C23089d.m56640a().mo47829a("previous_page", str).mo47829a("enter_method", str2).mo47829a("group_id", C23229c.m57040a()).mo47829a("author_id", C23229c.m57041b()).f61491a);
        } else {
            C26890h.m65011a("enter_discovery_page", C23089d.m56640a().mo47829a("previous_page", str).mo47829a("enter_method", str2).f61491a);
        }
        return null;
    }

    /* renamed from: b */
    public static void m67419b(String str, int i, int i2) {
        C0013i.m18a((Callable<TResult>) new C28409n<TResult>(i, i2, str), (Executor) C26890h.m65003a());
    }

    /* renamed from: a */
    public static void m67404a(String str, int i, int i2) {
        String str2;
        if (i == 0) {
            str2 = "slide";
        } else if (i == 1) {
            str2 = "click";
        } else {
            str2 = "show";
        }
        C0013i.m18a((Callable<TResult>) new C28418w<TResult>(str, str2, i2), (Executor) C26890h.m65003a());
    }

    /* renamed from: a */
    static final /* synthetic */ Object m67397a(int i, int i2, String str) throws Exception {
        C23089d a = C23089d.m56640a().mo47829a("enter_from", "discovery_tab").mo47826a("order", i);
        switch (i2) {
            case 0:
                a.mo47829a("tag_id", str);
                break;
            case 1:
                a.mo47829a("music_id", str);
                break;
            case 2:
                a.mo47829a("to_user_id", str);
                break;
            case 3:
                a.mo47829a("prop_id", str);
                break;
        }
        C26890h.m65012a("cell_show", C23198ae.m56851a(a.f61491a));
        return null;
    }

    /* renamed from: a */
    public static void m67405a(String str, int i, LogPbBean logPbBean) {
        C0013i.m18a((Callable<TResult>) new C28415t<TResult>(str, i, logPbBean), (Executor) C26890h.m65003a());
    }
}
